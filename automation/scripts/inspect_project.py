#!/usr/bin/env python3

import csv
import re
import subprocess
import sys
from pathlib import Path


ROOT = Path.home() / "Documents" / "SQA_Project"
PROJECTS_DIR = ROOT / "projects"
RESULTS_DIR = ROOT / "automation" / "results"


def run_command(command):
    result = subprocess.run(
        command,
        text=True,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT
    )

    return result.returncode, result.stdout

def get_project_bug_count(project):
    code, output = run_command(
        ["defects4j", "info", "-p", project]
    )

    if code != 0:
        raise RuntimeError(output)

    patterns = [
        r"Number of bugs:\s*(\d+)",
        r"Active bugs:\s*(\d+)",
        r"Number of active bugs:\s*(\d+)"
    ]

    for pattern in patterns:
        match = re.search(
            pattern,
            output,
            re.IGNORECASE
        )

        if match:
            return int(match.group(1))

    raise RuntimeError(
        f"Cannot determine active bug count for {project}\n"
        f"defects4j output:\n{output}"
    )


def get_bug_info(project, bug):
    code, output = run_command(
        [
            "defects4j",
            "info",
            "-p",
            project,
            "-b",
            str(bug)
        ]
    )

    if code != 0:
        raise RuntimeError(
            f"Cannot read {project}-{bug}\n{output}"
        )

    return output


def extract_value(info, labels):
    for label in labels:
        pattern = rf"^\s*{re.escape(label)}\s*:\s*(.+?)\s*$"

        match = re.search(
            pattern,
            info,
            re.MULTILINE | re.IGNORECASE
        )

        if match:
            return match.group(1).strip()

    return "UNKNOWN"


def extract_modified_sources(info):
    sources = []

    in_section = False

    for line in info.splitlines():
        stripped = line.strip()

        if stripped.lower() == "list of modified sources:":
            in_section = True
            continue

        if in_section:
            if not stripped:
                continue

            if stripped.startswith("- "):
                source = stripped[2:].strip()

                if source:
                    sources.append(source)

                continue

            # Reached the next section.
            if not stripped.startswith("- "):
                break

    return sources


def extract_trigger_tests(info):
    tests = []

    in_section = False

    for line in info.splitlines():
        stripped = line.strip()

        if stripped.lower() == "root cause in triggering tests:":
            in_section = True
            continue

        if stripped.lower() == "list of modified sources:":
            break

        if not in_section:
            continue

        if stripped.startswith("- "):
            test_line = stripped[2:].strip()

            # Remove the failure message after "-->"
            test_name = test_line.split("-->")[0].strip()

            if test_name:
                tests.append(test_name)

    return tests

def source_exists(workspace, source):
    source = source.strip()

    # Defects4J reports Java sources using fully-qualified
    # class names without the .java extension.
    relative_path = Path(*source.split(".")).with_suffix(".java")

    # Check the expected source layout directly.
    direct_path = workspace / relative_path
    if direct_path.exists():
        return True

    # Chart and some other Defects4J projects keep sources
    # under directories such as source/, src/, or src/main/java/.
    for source_root in [
        workspace / "source",
        workspace / "src",
        workspace / "src" / "main" / "java",
        workspace
    ]:
        candidate = source_root / relative_path
        if candidate.exists():
            return True

    # Final fallback: search by Java filename.
    filename = relative_path.name

    return any(
        candidate.name == filename
        for candidate in workspace.rglob(filename)
    )


def count_java_files(workspace):
    if not workspace.exists():
        return 0

    return len(
        list(workspace.rglob("*.java"))
    )


def inspect_bug(project, bug):
    bug_root = (
        PROJECTS_DIR /
        project /
        f"Bug-{bug}"
    )

    buggy = bug_root / "Buggy"
    fixed = bug_root / "Fixed"
    diff_file = bug_root / "diff.txt"

    info = get_bug_info(
        project,
        bug
    )

    bug_report = extract_value(
        info,
        [
            "Bug Report id",
            "Bug report",
            "Report"
        ]
    )

    fixed_revision = extract_value(
        info,
        [
            "Revision ID (fixed version)",
            "Revision",
            "Fixed Revision",
            "Fixed revision"
        ]
    )

    modified_sources = extract_modified_sources(info)
    trigger_tests = extract_trigger_tests(info)

    buggy_exists = buggy.exists()
    fixed_exists = fixed.exists()

    source_status = "PASS"

    if not modified_sources:
        source_status = "NO_MODIFIED_SOURCE"

    for source in modified_sources:
        if not source_exists(buggy, source):
            source_status = "MISSING_BUGGY_SOURCE"

        if not source_exists(fixed, source):
            source_status = "MISSING_FIXED_SOURCE"

    diff_status = "PASS" if diff_file.exists() else "MISSING_DIFF"

    validation = "VALID"

    if not buggy_exists or not fixed_exists:
        validation = "INVALID"

    if source_status != "PASS":
        validation = "INVALID"

    if diff_status != "PASS":
        validation = "INVALID"

    return {
        "project": project,
        "bug": bug,
        "bug_report": bug_report,
        "fixed_revision": fixed_revision,
        "modified_sources": len(modified_sources),
        "modified_source_list": ";".join(modified_sources),
        "trigger_tests": len(trigger_tests),
        "trigger_test_list": ";".join(trigger_tests),
        "buggy_exists": "PASS" if buggy_exists else "FAIL",
        "fixed_exists": "PASS" if fixed_exists else "FAIL",
        "buggy_java_files": count_java_files(buggy),
        "fixed_java_files": count_java_files(fixed),
        "diff": diff_status,
        "source_status": source_status,
        "validation": validation
    }


def write_csv(project, rows):
    result_dir = RESULTS_DIR / project

    result_dir.mkdir(
        parents=True,
        exist_ok=True
    )

    output_file = (
        result_dir /
        "bug_inspection.csv"
    )

    fieldnames = [
        "project",
        "bug",
        "bug_report",
        "fixed_revision",
        "modified_sources",
        "modified_source_list",
        "trigger_tests",
        "trigger_test_list",
        "buggy_exists",
        "fixed_exists",
        "buggy_java_files",
        "fixed_java_files",
        "diff",
        "source_status",
        "validation"
    ]

    with output_file.open(
        "w",
        newline="",
        encoding="utf-8"
    ) as file:

        writer = csv.DictWriter(
            file,
            fieldnames=fieldnames
        )

        writer.writeheader()

        for row in rows:
            writer.writerow(row)

    return output_file


def write_markdown(project, rows):
    result_dir = RESULTS_DIR / project

    result_dir.mkdir(
        parents=True,
        exist_ok=True
    )

    output_file = (
        result_dir /
        "bug_inspection.md"
    )

    valid_count = sum(
        1
        for row in rows
        if row["validation"] == "VALID"
    )

    lines = [
        f"# {project} Ground Truth Inspection",
        "",
        f"- Total bugs inspected: {len(rows)}",
        f"- Valid bugs: {valid_count}/{len(rows)}",
        "",
        "| Bug | Modified Sources | Trigger Tests | Buggy | Fixed | Diff | Validation |",
        "|---:|---:|---:|---|---|---|---|"
    ]

    for row in rows:
        lines.append(
            f"| {row['bug']} "
            f"| {row['modified_sources']} "
            f"| {row['trigger_tests']} "
            f"| {row['buggy_exists']} "
            f"| {row['fixed_exists']} "
            f"| {row['diff']} "
            f"| {row['validation']} |"
        )

    output_file.write_text(
        "\n".join(lines) + "\n",
        encoding="utf-8"
    )

    return output_file


def parse_arguments():
    if len(sys.argv) not in (2, 4):
        print(
            "Usage:\n"
            "  python3 automation/scripts/inspect_project.py <Project>\n"
            "  python3 automation/scripts/inspect_project.py "
            "<Project> <StartBug> <EndBug>\n\n"
            "Examples:\n"
            "  python3 automation/scripts/inspect_project.py Chart\n"
            "  python3 automation/scripts/inspect_project.py Chart 1 26"
        )
        sys.exit(1)

    project = sys.argv[1]

    if len(sys.argv) == 2:
        start_bug = 1
        end_bug = get_project_bug_count(project)
    else:
        start_bug = int(sys.argv[2])
        end_bug = int(sys.argv[3])

    return project, start_bug, end_bug


def main():
    project, start_bug, end_bug = parse_arguments()

    print("=" * 70)
    print("GROUND TRUTH INSPECTION")
    print("=" * 70)
    print(f"Project : {project}")
    print(f"Range   : {start_bug}-{end_bug}")
    print("=" * 70)

    rows = []

    for bug in range(start_bug, end_bug + 1):
        print()
        print(
            f"[{bug}] Inspecting "
            f"{project}-{bug}"
        )

        try:
            row = inspect_bug(
                project,
                bug
            )

            rows.append(row)

            print(
                f"     Modified sources : "
                f"{row['modified_sources']}"
            )

            print(
                f"     Trigger tests    : "
                f"{row['trigger_tests']}"
            )

            print(
                f"     Buggy workspace  : "
                f"{row['buggy_exists']}"
            )

            print(
                f"     Fixed workspace  : "
                f"{row['fixed_exists']}"
            )

            print(
                f"     Validation       : "
                f"{row['validation']}"
            )

        except Exception as exc:
            print("     ERROR")
            print(f"     {exc}")

            rows.append({
                "project": project,
                "bug": bug,
                "bug_report": "ERROR",
                "fixed_revision": "ERROR",
                "modified_sources": 0,
                "modified_source_list": "",
                "trigger_tests": 0,
                "trigger_test_list": "",
                "buggy_exists": "FAIL",
                "fixed_exists": "FAIL",
                "buggy_java_files": 0,
                "fixed_java_files": 0,
                "diff": "ERROR",
                "source_status": "ERROR",
                "validation": "INVALID"
            })

    csv_file = write_csv(
        project,
        rows
    )

    md_file = write_markdown(
        project,
        rows
    )

    valid_count = sum(
        1
        for row in rows
        if row["validation"] == "VALID"
    )

    print()
    print("=" * 70)
    print("INSPECTION COMPLETE")
    print("=" * 70)
    print(
        f"Valid bugs : {valid_count}/{len(rows)}"
    )
    print()
    print(f"CSV : {csv_file}")
    print(f"MD  : {md_file}")


if __name__ == "__main__":
    main()
