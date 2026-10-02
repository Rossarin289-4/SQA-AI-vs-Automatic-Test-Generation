#!/usr/bin/env python3

import argparse
import json
import re
import shutil
import subprocess
import tempfile
import time
from pathlib import Path


ROOT = Path("/Users/fangfang/Documents/SQA_Project_2026")
D4J = Path("/Users/fangfang/Documents/SQA_Project/defects4j/framework/bin/defects4j")


def run_command(command, cwd):
    start = time.perf_counter()

    process = subprocess.run(
        command,
        cwd=cwd,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True
    )

    elapsed = time.perf_counter() - start

    return {
        "return_code": process.returncode,
        "time_seconds": elapsed,
        "output": process.stdout
    }


def parse_failing_tests(output):
    match = re.search(
        r"Failing tests:\s*(\d+)",
        output
    )

    if match:
        return int(match.group(1))

    return None


def classify_test(result):
    output = result["output"]
    return_code = result["return_code"]

    failing = parse_failing_tests(output)

    # Defects4J can return shell code 0 even when tests fail.
    # Therefore Failing tests: N is the authoritative classification.
    if failing is not None:
        if failing == 0:
            return "PASS"

        return "FAIL"

    if result["return_code"] != 0:
        return "ERROR"

    return "ERROR"


def extract_test_class(source):
    package_match = re.search(
        r"^\s*package\s+([A-Za-z0-9_.]+)\s*;",
        source,
        re.MULTILINE
    )

    class_match = re.search(
        r"\bpublic\s+class\s+([A-Za-z0-9_$]+)",
        source
    )

    if class_match is None:
        class_match = re.search(
            r"\bclass\s+([A-Za-z0-9_$]+)",
            source
        )

    if class_match is None:
        raise RuntimeError("Cannot determine test class name.")

    class_name = class_match.group(1)

    if package_match:
        return package_match.group(1) + "." + class_name

    return class_name


def extract_test_methods(source):
    lines = source.splitlines()

    methods = []

    pending_test = False
    ignored = False

    method_pattern = re.compile(
        r"\b(?:public\s+)?void\s+([A-Za-z0-9_$]+)\s*\("
    )

    for i, line in enumerate(lines):

        stripped = line.strip()

        if stripped.startswith("@Ignore"):
            ignored = True
            continue

        if stripped.startswith("@Test"):
            pending_test = True
            continue

        if pending_test:
            match = method_pattern.search(stripped)

            if match:
                if not ignored:
                    methods.append(match.group(1))

                pending_test = False
                ignored = False
                continue

        # If another annotation appears, keep waiting.
        if stripped.startswith("@"):
            continue

        # If we reach ordinary code before a method, reset.
        if stripped and not stripped.startswith("//"):
            pending_test = False
            ignored = False

    return methods


def write_execution_txt(result, output_file):
    stats = result["statistics"]

    with open(output_file, "w", encoding="utf-8") as f:
        f.write("GENERATED TEST SUITE EXECUTION\n")
        f.write("==============================\n\n")

        f.write(f"Total tests     : {stats['total_tests']}\n")
        f.write(f"Evaluated tests : {stats['evaluated_tests']}\n")
        f.write(f"Detected tests  : {stats['detected_tests']}\n")
        f.write(f"FDR             : {stats['fdr_percent']:.4f}%\n\n")

        for test in result["tests"]:
            f.write(test["selector"] + "\n")
            f.write(f"  BUGGY : {test['buggy']['status']}\n")
            f.write(f"  FIXED : {test['fixed']['status']}\n")
            f.write(f"  Evaluated : {test['evaluated']}\n")
            f.write(f"  Detected  : {test['detected']}\n\n")


def main():
    parser = argparse.ArgumentParser()

    parser.add_argument("--buggy", required=True)
    parser.add_argument("--fixed", required=True)
    parser.add_argument("--generated-test", required=True)
    parser.add_argument("--destination", required=True)
    parser.add_argument("--output", required=True)
    parser.add_argument("--keep-workspaces", action="store_true")

    args = parser.parse_args()

    buggy_source = Path(args.buggy).resolve()
    fixed_source = Path(args.fixed).resolve()

    generated_test = Path(args.generated_test).resolve()
    output = Path(args.output).resolve()

    output.mkdir(parents=True, exist_ok=True)

    if not generated_test.is_file():
        raise SystemExit(
            f"ERROR: generated test does not exist: {generated_test}"
        )

    source_text = generated_test.read_text(
        encoding="utf-8"
    )

    test_class = extract_test_class(source_text)
    method_names = extract_test_methods(source_text)

    if not method_names:
        raise SystemExit(
            "ERROR: no JUnit @Test methods found in generated test."
        )

    temp_root = Path(
        tempfile.mkdtemp(
            prefix="d4j_suite_eval_",
            dir=str(ROOT / "workspaces")
        )
    )

    buggy = temp_root / "buggy"
    fixed = temp_root / "fixed"

    try:
        shutil.copytree(buggy_source, buggy)
        shutil.copytree(fixed_source, fixed)

        buggy_test = buggy / "src/test/java" / args.destination
        fixed_test = fixed / "src/test/java" / args.destination

        buggy_test.parent.mkdir(
            parents=True,
            exist_ok=True
        )

        fixed_test.parent.mkdir(
            parents=True,
            exist_ok=True
        )

        shutil.copy2(
            generated_test,
            buggy_test
        )

        shutil.copy2(
            generated_test,
            fixed_test
        )

        buggy_compile = run_command(
            [str(D4J), "compile"],
            buggy
        )

        fixed_compile = run_command(
            [str(D4J), "compile"],
            fixed
        )

        tests = []

        for method in method_names:

            selector = f"{test_class}::{method}"

            buggy_result = run_command(
                [
                    str(D4J),
                    "test",
                    "-t",
                    selector
                ],
                buggy
            )

            fixed_result = run_command(
                [
                    str(D4J),
                    "test",
                    "-t",
                    selector
                ],
                fixed
            )

            buggy_status = (
                "COMPILE_ERROR"
                if buggy_compile["return_code"] != 0
                else classify_test(buggy_result)
            )

            fixed_status = (
                "COMPILE_ERROR"
                if fixed_compile["return_code"] != 0
                else classify_test(fixed_result)
            )

            # FDR definition:
            # test must execute successfully enough to obtain
            # a meaningful PASS/FAIL result on both versions.
            evaluated = (
                buggy_status in {"PASS", "FAIL"}
                and
                fixed_status in {"PASS", "FAIL"}
            )

            detected = (
                evaluated
                and
                buggy_status == "FAIL"
                and
                fixed_status == "PASS"
            )

            tests.append({
                "selector": selector,
                "buggy": {
                    "status": buggy_status,
                    "return_code": buggy_result["return_code"],
                    "time_seconds": buggy_result["time_seconds"],
                    "output": buggy_result["output"]
                },
                "fixed": {
                    "status": fixed_status,
                    "return_code": fixed_result["return_code"],
                    "time_seconds": fixed_result["time_seconds"],
                    "output": fixed_result["output"]
                },
                "evaluated": evaluated,
                "detected": detected
            })

        evaluated_count = sum(
            1 for t in tests if t["evaluated"]
        )

        detected_count = sum(
            1 for t in tests if t["detected"]
        )

        fdr = (
            detected_count / evaluated_count * 100.0
            if evaluated_count
            else 0.0
        )

        result = {
            "generated_test": str(generated_test),
            "destination": args.destination,
            "test_class": test_class,
            "test_methods": [
                t["selector"] for t in tests
            ],
            "test_count": len(tests),

            "buggy_compile": {
                "status": (
                    "PASS"
                    if buggy_compile["return_code"] == 0
                    else "ERROR"
                ),
                "return_code": buggy_compile["return_code"],
                "time_seconds": buggy_compile["time_seconds"]
            },

            "fixed_compile": {
                "status": (
                    "PASS"
                    if fixed_compile["return_code"] == 0
                    else "ERROR"
                ),
                "return_code": fixed_compile["return_code"],
                "time_seconds": fixed_compile["time_seconds"]
            },

            "statistics": {
                "total_tests": len(tests),
                "evaluated_tests": evaluated_count,
                "detected_tests": detected_count,
                "fdr_percent": fdr,

                "buggy_pass": sum(
                    1 for t in tests
                    if t["buggy"]["status"] == "PASS"
                ),
                "buggy_fail": sum(
                    1 for t in tests
                    if t["buggy"]["status"] == "FAIL"
                ),
                "buggy_error": sum(
                    1 for t in tests
                    if t["buggy"]["status"]
                    not in {"PASS", "FAIL"}
                ),

                "fixed_pass": sum(
                    1 for t in tests
                    if t["fixed"]["status"] == "PASS"
                ),
                "fixed_fail": sum(
                    1 for t in tests
                    if t["fixed"]["status"] == "FAIL"
                ),
                "fixed_error": sum(
                    1 for t in tests
                    if t["fixed"]["status"]
                    not in {"PASS", "FAIL"}
                )
            },

            "tests": tests,

            "evaluation_workspaces": {
                "buggy": str(buggy),
                "fixed": str(fixed)
            },

            "timing": {
                "buggy_compile_seconds":
                    buggy_compile["time_seconds"],

                "fixed_compile_seconds":
                    fixed_compile["time_seconds"],

                "buggy_execution_seconds":
                    sum(
                        t["buggy"]["time_seconds"]
                        for t in tests
                    ),

                "fixed_execution_seconds":
                    sum(
                        t["fixed"]["time_seconds"]
                        for t in tests
                    )
            },

            "status": "PASS"
        }

        result["timing"]["total_seconds"] = (
            result["timing"]["buggy_compile_seconds"]
            + result["timing"]["fixed_compile_seconds"]
            + result["timing"]["buggy_execution_seconds"]
            + result["timing"]["fixed_execution_seconds"]
        )

        with open(
            output / "execution_result.json",
            "w",
            encoding="utf-8"
        ) as f:
            json.dump(
                result,
                f,
                indent=2,
                ensure_ascii=False
            )

        write_execution_txt(
            result,
            output / "execution.txt"
        )

        with open(
            output / "buggy.log",
            "w",
            encoding="utf-8"
        ) as f:
            for t in tests:
                f.write(
                    f"===== {t['selector']} =====\n"
                )
                f.write(t["buggy"]["output"])
                f.write("\n")

        with open(
            output / "fixed.log",
            "w",
            encoding="utf-8"
        ) as f:
            for t in tests:
                f.write(
                    f"===== {t['selector']} =====\n"
                )
                f.write(t["fixed"]["output"])
                f.write("\n")

        with open(
            output / "buggy_compile.log",
            "w",
            encoding="utf-8"
        ) as f:
            f.write(buggy_compile["output"])

        with open(
            output / "fixed_compile.log",
            "w",
            encoding="utf-8"
        ) as f:
            f.write(fixed_compile["output"])

        print(
            json.dumps(
                result,
                indent=2,
                ensure_ascii=False
            )
        )

        return 0

    finally:
        if not args.keep_workspaces:
            shutil.rmtree(
                temp_root,
                ignore_errors=True
            )


if __name__ == "__main__":
    raise SystemExit(main())
