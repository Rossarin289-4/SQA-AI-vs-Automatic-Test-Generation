import csv
import os
import re
import subprocess

PROJECT_ROOT = "/mnt/c/Users/User/SQA-AI-vs-Automatic-Test-Generation"
D4J = os.path.expanduser("~/defects4j/framework/bin/defects4j")

RESULT_DIR = os.path.join(PROJECT_ROOT, "Time", "ChatGPT", "Result")
CSV_FILE = os.path.join(RESULT_DIR, "summary.csv")

BUGS = list(range(1, 21)) + list(range(22, 28))


def find_test_file(bug):
    test_dir = os.path.join(
        PROJECT_ROOT, "Time", "ChatGPT", "TestCode", f"Time-{bug}"
    )

    if not os.path.isdir(test_dir):
        return None

    java_files = [f for f in os.listdir(test_dir) if f.endswith(".java")]

    if not java_files:
        return None

    return os.path.join(test_dir, java_files[0])


def get_test_class_and_method(java_file):
    with open(java_file, "r", encoding="utf-8") as f:
        content = f.read()

    class_match = re.search(
        r"\bpublic\s+class\s+([A-Za-z0-9_]+)", content
    )

    method_match = re.search(
        r"\bpublic\s+void\s+([A-Za-z0-9_]+)\s*\(", content
    )

    if not class_match or not method_match:
        return None, None

    return class_match.group(1), method_match.group(1)


def run_test(bug, version, test_file, class_name, method_name):
    work_dir = f"/tmp/Time-{bug}{version}"

    destination = os.path.join(
        work_dir,
        "src/test/java/org/joda/time"
    )

    os.makedirs(destination, exist_ok=True)

    subprocess.run(
        ["cp", test_file, os.path.join(destination, os.path.basename(test_file))],
        check=True
    )

    command = [
        D4J,
        "test",
        "-w",
        work_dir,
        "-t",
        f"org.joda.time.{class_name}::{method_name}"
    ]

    result = subprocess.run(
        command,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True
    )

    output = result.stdout

    if "compile.tests" in output and "FAIL" in output:
        return "ERROR"

    if "Failing tests: 0" in output:
        return "PASS"

    if "Failing tests:" in output:
        return "FAIL"

    return "ERROR"


def classify_result(buggy, fixed):
    if buggy == "FAIL" and fixed == "PASS":
        return "DETECTED"

    if buggy in ("PASS", "FAIL") and fixed in ("PASS", "FAIL"):
        return "NOT_DETECTED"

    return "ERROR"


def main():
    os.makedirs(RESULT_DIR, exist_ok=True)

    rows = []

    for bug in BUGS:
        print("=" * 70)
        print(f"Time-{bug}")

        test_file = find_test_file(bug)

        if not test_file:
            print("  Test: MISSING")

            rows.append({
                "bug": f"Time-{bug}",
                "test_class": "",
                "test_method": "",
                "buggy": "MISSING",
                "fixed": "",
                "result": "MISSING"
            })

            continue

        class_name, method_name = get_test_class_and_method(test_file)

        if not class_name or not method_name:
            print("  Test: INVALID")

            rows.append({
                "bug": f"Time-{bug}",
                "test_class": "",
                "test_method": "",
                "buggy": "ERROR",
                "fixed": "",
                "result": "ERROR"
            })

            continue

        print(f"  Test: {class_name}::{method_name}")

        buggy = run_test(
            bug, "b", test_file, class_name, method_name
        )

        print(f"  Time-{bug}b: {buggy}")

        if buggy == "ERROR":
            fixed = ""
            final_result = "ERROR"
        else:
            fixed = run_test(
                bug, "f", test_file, class_name, method_name
            )

            print(f"  Time-{bug}f: {fixed}")

            final_result = classify_result(buggy, fixed)

        print(f"  RESULT: {final_result}")

        rows.append({
            "bug": f"Time-{bug}",
            "test_class": class_name,
            "test_method": method_name,
            "buggy": buggy,
            "fixed": fixed,
            "result": final_result
        })

    with open(CSV_FILE, "w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(
            f,
            fieldnames=[
                "bug",
                "test_class",
                "test_method",
                "buggy",
                "fixed",
                "result"
            ]
        )

        writer.writeheader()
        writer.writerows(rows)

    print()
    print("=" * 70)
    print("DONE")
    print(f"Result: {CSV_FILE}")


if __name__ == "__main__":
    main()
