#!/usr/bin/env python3

import csv
import os
import sys
from collections import defaultdict


ROOT = os.path.expanduser("~/Documents/SQA_Project")


if len(sys.argv) != 2:
    print("Usage:")
    print(f"{sys.argv[0]} <project>")
    sys.exit(1)


PROJECT = sys.argv[1]

INPUT_FILE = os.path.join(
    ROOT,
    "automation",
    "results",
    PROJECT,
    "execution_results.csv"
)

OUTPUT_DIR = os.path.join(
    ROOT,
    "automation",
    "results",
    PROJECT
)

SUMMARY_FILE = os.path.join(
    OUTPUT_DIR,
    "summary.csv"
)

README_FILE = os.path.join(
    OUTPUT_DIR,
    "README.md"
)

PROJECT_CONFIG = os.path.join(
    ROOT,
    "automation",
    "config",
    "projects.csv"
)


# ------------------------------------------------------------
# Check input
# ------------------------------------------------------------

if not os.path.isfile(INPUT_FILE):
    print(f"ERROR: Execution result file not found:")
    print(INPUT_FILE)
    sys.exit(1)


# ------------------------------------------------------------
# Read expected bug count
# ------------------------------------------------------------

expected_bugs = None

with open(PROJECT_CONFIG, newline="", encoding="utf-8") as f:
    reader = csv.DictReader(f)

    for row in reader:
        if row["project"] == PROJECT:
            expected_bugs = int(row["total_bugs"])
            break

if expected_bugs is None:
    print(f"ERROR: Project '{PROJECT}' not found in projects.csv")
    sys.exit(1)


# ------------------------------------------------------------
# Read execution results
# ------------------------------------------------------------

rows = []

with open(INPUT_FILE, newline="", encoding="utf-8") as f:
    reader = csv.DictReader(f)

    for row in reader:
        rows.append(row)


if not rows:
    print("ERROR: execution_results.csv is empty.")
    sys.exit(1)


# ------------------------------------------------------------
# Group test results
# ------------------------------------------------------------

tests = defaultdict(dict)

for row in rows:

    key = (
        row["bug"],
        row["method"],
        row["test_method"]
    )

    tests[key][row["environment"]] = row["status"]


# ------------------------------------------------------------
# Calculate defect detection
# ------------------------------------------------------------

bug_stats = defaultdict(
    lambda: defaultdict(
        lambda: {
            "total": 0,
            "detected": 0
        }
    )
)


for (bug, method, test_method), environments in tests.items():

    if "buggy" not in environments:
        continue

    if "fixed" not in environments:
        continue

    bug_stats[bug][method]["total"] += 1

    if (
        environments["buggy"] == "FAIL"
        and environments["fixed"] == "PASS"
    ):
        bug_stats[bug][method]["detected"] += 1


# ------------------------------------------------------------
# Determine completed bugs
# ------------------------------------------------------------

methods = ["ChatGPT", "Gemini"]

recorded_bugs = set()

for bug in bug_stats:

    complete = True

    for method in methods:

        if bug_stats[bug][method]["total"] == 0:
            complete = False

    if complete:
        recorded_bugs.add(bug)


# ------------------------------------------------------------
# Write summary.csv
# ------------------------------------------------------------

with open(
    SUMMARY_FILE,
    "w",
    newline="",
    encoding="utf-8"
) as f:

    writer = csv.writer(f)

    writer.writerow([
        "project",
        "bug",
        "method",
        "total_tests",
        "defect_detecting_tests",
        "fdr_percent",
        "status"
    ])

    for bug in sorted(
        bug_stats,
        key=lambda x: int(x)
    ):

        for method in methods:

            total = bug_stats[bug][method]["total"]
            detected = bug_stats[bug][method]["detected"]

            if total > 0:
                fdr = detected / total * 100
                status = "COMPLETED"
            else:
                fdr = 0
                status = "SKIPPED"

            writer.writerow([
                PROJECT,
                bug,
                method,
                total,
                detected,
                f"{fdr:.2f}",
                status
            ])


# ------------------------------------------------------------
# Project-level statistics
# ------------------------------------------------------------

method_summary = {}

for method in methods:

    total_tests = 0
    detected_tests = 0
    tested_bugs = set()

    for bug in bug_stats:

        total = bug_stats[bug][method]["total"]
        detected = bug_stats[bug][method]["detected"]

        if total > 0:
            tested_bugs.add(bug)
            total_tests += total
            detected_tests += detected

    if total_tests > 0:
        fdr = detected_tests / total_tests * 100
    else:
        fdr = 0

    method_summary[method] = {
        "tested_bugs": len(tested_bugs),
        "total_tests": total_tests,
        "detected_tests": detected_tests,
        "fdr": fdr
    }


# ------------------------------------------------------------
# Project status
# ------------------------------------------------------------

if len(recorded_bugs) == expected_bugs:
    project_status = "COMPLETED"
else:
    project_status = "PARTIAL"


# ------------------------------------------------------------
# Write README.md
# ------------------------------------------------------------

with open(
    README_FILE,
    "w",
    encoding="utf-8"
) as f:

    f.write(f"# {PROJECT} AI Test Execution Summary\n\n")

    f.write("## Project Status\n\n")
    f.write(f"- Project: {PROJECT}\n")
    f.write(f"- Expected bugs: {expected_bugs}\n")
    f.write(f"- Recorded bugs: {len(recorded_bugs)}\n")
    f.write(f"- Status: {project_status}\n\n")

    f.write("## Defect Detection Criterion\n\n")
    f.write(
        "A generated test is classified as defect-detecting when "
        "the test FAILS on the buggy version and PASSES on the fixed version.\n\n"
    )

    f.write("## Method Summary\n\n")

    f.write(
        "| Method | Tested Bugs | Total Tests | "
        "Defect-Detecting Tests | FDR |\n"
    )

    f.write(
        "|---|---:|---:|---:|---:|\n"
    )

    for method in methods:

        data = method_summary[method]

        f.write(
            f"| {method} | "
            f"{data['tested_bugs']} | "
            f"{data['total_tests']} | "
            f"{data['detected_tests']} | "
            f"{data['fdr']:.2f}% |\n"
        )

    f.write("\n")

    f.write("## Bug-Level Results\n\n")

    f.write(
        "| Bug | Method | Total Tests | "
        "Defect-Detecting Tests | FDR | Status |\n"
    )

    f.write(
        "|---|---|---:|---:|---:|---|\n"
    )

    for bug in sorted(
        bug_stats,
        key=lambda x: int(x)
    ):

        for method in methods:

            total = bug_stats[bug][method]["total"]
            detected = bug_stats[bug][method]["detected"]

            if total > 0:
                fdr = detected / total * 100
                status = "COMPLETED"
            else:
                fdr = 0
                status = "SKIPPED"

            f.write(
                f"| {PROJECT}-{bug} | "
                f"{method} | "
                f"{total} | "
                f"{detected} | "
                f"{fdr:.2f}% | "
                f"{status} |\n"
            )

    f.write("\n")

    f.write("## Notes\n\n")
    f.write(
        "FDR is calculated within the generated test suite evaluated "
        "for each method. It does not represent the overall defect "
        "detection capability of the method beyond the tested cases.\n"
    )


# ------------------------------------------------------------
# Console output
# ------------------------------------------------------------

print("============================================================")
print("FDR Calculation")
print(f"Project       : {PROJECT}")
print(f"Status        : {project_status}")
print(f"Expected bugs : {expected_bugs}")
print(f"Recorded bugs : {len(recorded_bugs)}")
print("============================================================")
print("")

print("Method summary:")

for method in methods:

    data = method_summary[method]

    print(
        f"  {method}: "
        f"{data['tested_bugs']}/{expected_bugs} bugs, "
        f"{data['total_tests']} tests, "
        f"{data['detected_tests']} defect-detecting, "
        f"FDR={data['fdr']:.2f}%"
    )

print("")
print(f"Summary file : {SUMMARY_FILE}")
print(f"README file  : {README_FILE}")