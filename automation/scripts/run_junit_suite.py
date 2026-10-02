#!/usr/bin/env python3

import argparse
import json
import re
import shutil
import subprocess
import sys
import tempfile
import time
from pathlib import Path


PROJECT_ROOT = Path("/Users/fangfang/Documents/SQA_Project_2026")


def run_command(command, cwd, log_file):
    start = time.perf_counter()

    process = subprocess.run(
        command,
        cwd=str(cwd),
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True
    )

    elapsed = time.perf_counter() - start

    log_file.parent.mkdir(parents=True, exist_ok=True)
    log_file.write_text(process.stdout, encoding="utf-8")

    return {
        "command": command,
        "return_code": process.returncode,
        "elapsed_seconds": elapsed,
        "output": process.stdout
    }


def classify_test_output(output):
    if re.search(r"Failing tests:\s*[1-9][0-9]*", output, re.I):
        return "FAIL"

    if re.search(r"Failing tests:\s*0", output, re.I):
        return "PASS"

    if re.search(r"Tests run:\s*[0-9]+", output, re.I):
        failures = re.search(r"Failures:\s*([0-9]+)", output, re.I)
        errors = re.search(r"Errors:\s*([0-9]+)", output, re.I)

        if failures and errors:
            if failures.group(1) == "0" and errors.group(1) == "0":
                return "PASS"
            return "FAIL"

    if re.search(r"BUILD FAILURE", output, re.I):
        return "ERROR"

    if re.search(r"COMPILATION ERROR", output, re.I):
        return "ERROR"

    if re.search(r"Compilation failure", output, re.I):
        return "ERROR"

    return "ERROR"


def copy_workspace(source, destination):
    source = Path(source)
    destination = Path(destination)

    if not source.is_dir():
        raise FileNotFoundError(
            f"Source workspace does not exist: {source}"
        )

    if destination.exists():
        shutil.rmtree(destination)

    shutil.copytree(
        source,
        destination,
        ignore=shutil.ignore_patterns(
            "target",
            "all_tests",
            "failing_tests",
            ".idea",
            ".DS_Store"
        )
    )


def copy_test_file(generated_test, workspace, destination_relative):
    source = Path(generated_test)

    if not source.is_file():
        raise FileNotFoundError(
            f"Generated test not found: {source}"
        )

    destination = Path(workspace) / destination_relative

    destination.parent.mkdir(
        parents=True,
        exist_ok=True
    )

    shutil.copy2(
        source,
        destination
    )

    return destination


def execute_workspace(
    workspace,
    test_selector,
    compile_log,
    test_log
):
    compile_result = run_command(
        ["defects4j", "compile"],
        workspace,
        compile_log
    )

    compile_ok = compile_result["return_code"] == 0

    if not compile_ok:
        return {
            "compile": {
                "status": "ERROR",
                "time_seconds": compile_result["elapsed_seconds"]
            },
            "test": {
                "status": "NOT_RUN",
                "time_seconds": 0.0
            }
        }

    test_result = run_command(
        [
            "defects4j",
            "test",
            "-t",
            test_selector
        ],
        workspace,
        test_log
    )

    test_status = classify_test_output(
        test_result["output"]
    )

    return {
        "compile": {
            "status": "PASS",
            "time_seconds": compile_result["elapsed_seconds"]
        },
        "test": {
            "status": test_status,
            "time_seconds": test_result["elapsed_seconds"]
        }
    }


def main():
    parser = argparse.ArgumentParser(
        description=(
            "Execute one generated JUnit suite on isolated "
            "Defects4J BUGGY and FIXED workspaces."
        )
    )

    parser.add_argument(
        "--buggy",
        required=True
    )

    parser.add_argument(
        "--fixed",
        required=True
    )

    parser.add_argument(
        "--test",
        required=True
    )

    parser.add_argument(
        "--generated-test",
        required=True
    )

    parser.add_argument(
        "--destination",
        required=True
    )

    parser.add_argument(
        "--output",
        required=True
    )

    parser.add_argument(
        "--keep-workspaces",
        action="store_true"
    )

    args = parser.parse_args()

    buggy_source = Path(args.buggy)
    fixed_source = Path(args.fixed)
    generated_test = Path(args.generated_test)
    output_root = Path(args.output)

    output_root.mkdir(
        parents=True,
        exist_ok=True
    )

    result = {
        "test_selector": args.test,
        "generated_test": str(generated_test),
        "destination": args.destination,
        "source_workspaces": {
            "buggy": str(buggy_source),
            "fixed": str(fixed_source)
        }
    }

    total_start = time.perf_counter()

    temp_root = Path(
        tempfile.mkdtemp(
            prefix="d4j_eval_",
            dir=str(PROJECT_ROOT / "workspaces")
        )
    )

    buggy_eval = temp_root / "buggy"
    fixed_eval = temp_root / "fixed"

    result["evaluation_workspaces"] = {
        "buggy": str(buggy_eval),
        "fixed": str(fixed_eval)
    }

    try:
        copy_workspace(
            buggy_source,
            buggy_eval
        )

        copy_workspace(
            fixed_source,
            fixed_eval
        )

        buggy_test = copy_test_file(
            generated_test,
            buggy_eval,
            Path("src/test/java") / args.destination
        )

        buggy_result = execute_workspace(
            buggy_eval,
            args.test,
            output_root / "buggy_compile.log",
            output_root / "buggy.log"
        )

        fixed_test = copy_test_file(
            generated_test,
            fixed_eval,
            Path("src/test/java") / args.destination
        )

        fixed_result = execute_workspace(
            fixed_eval,
            args.test,
            output_root / "fixed_compile.log",
            output_root / "fixed.log"
        )

        buggy_status = buggy_result["test"]["status"]
        fixed_status = fixed_result["test"]["status"]

        defect_detected = (
            buggy_status == "FAIL"
            and fixed_status == "PASS"
        )

        total_time = (
            time.perf_counter()
            - total_start
        )

        result["buggy"] = buggy_result
        result["fixed"] = fixed_result

        result["classification"] = {
            "buggy_status": buggy_status,
            "fixed_status": fixed_status,
            "defect_detected": defect_detected
        }

        result["timing"] = {
            "buggy_compile_seconds":
                buggy_result["compile"]["time_seconds"],

            "buggy_execution_seconds":
                buggy_result["test"]["time_seconds"],

            "fixed_compile_seconds":
                fixed_result["compile"]["time_seconds"],

            "fixed_execution_seconds":
                fixed_result["test"]["time_seconds"],

            "total_seconds":
                total_time
        }

        result["test_files"] = {
            "buggy": str(buggy_test),
            "fixed": str(fixed_test)
        }

        result["status"] = "PASS"

    except Exception as exc:
        result["status"] = "ERROR"
        result["error"] = str(exc)

        result["timing"] = {
            "total_seconds":
                time.perf_counter() - total_start
        }

    finally:
        if not args.keep_workspaces:
            shutil.rmtree(
                temp_root,
                ignore_errors=True
            )

    result_file = (
        output_root / "execution_result.json"
    )

    result_file.write_text(
        json.dumps(
            result,
            indent=2
        ),
        encoding="utf-8"
    )

    print(
        json.dumps(
            result,
            indent=2
        )
    )

    if result["status"] == "ERROR":
        return 2

    if (
        result.get("buggy", {})
        .get("test", {})
        .get("status") == "ERROR"
    ):
        return 2

    if (
        result.get("fixed", {})
        .get("test", {})
        .get("status") == "ERROR"
    ):
        return 2

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
