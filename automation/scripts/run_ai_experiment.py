#!/usr/bin/env python3

import json
import os
import re
import shutil
import subprocess
import sys
import tempfile
import time
from datetime import datetime
from pathlib import Path


ROOT = Path.home() / "Documents" / "SQA_Project"

PROJECTS_DIR = ROOT / "projects"
AUTOMATION_DIR = ROOT / "automation"

JAVA_HOME = "/opt/homebrew/opt/openjdk@11/libexec/openjdk.jdk/Contents/Home"

ENV = os.environ.copy()
ENV["JAVA_HOME"] = JAVA_HOME
ENV["PATH"] = (
    "/opt/homebrew/bin:"
    "/opt/homebrew/sbin:"
    "/opt/homebrew/opt/openjdk@11/bin:"
    + ENV.get("PATH", "")
)
ENV["PERL5LIB"] = (
    str(Path.home() / "perl5" / "lib" / "perl5")
    + ":"
    + ENV.get("PERL5LIB", "")
)


def print_header(title):
    print()
    print("=" * 70)
    print(title)
    print("=" * 70)


def run_command(command, cwd):
    start = time.time()

    process = subprocess.run(
        command,
        cwd=str(cwd),
        env=ENV,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True
    )

    elapsed = time.time() - start

    return {
        "returncode": process.returncode,
        "output": process.stdout,
        "duration_seconds": round(elapsed, 3)
    }


def find_test_files(project, bug, method):
    test_dir = (
        ROOT
        / project
        / method
        / "TestCode"
    )

    if not test_dir.exists():
        raise RuntimeError(
            f"TestCode directory does not exist:\n{test_dir}"
        )

    candidates = []

    for file in sorted(test_dir.glob("*.java")):
        name = file.stem

        if (
            f"{project}{bug}" in name
            or f"{project}-{bug}" in name
        ):
            candidates.append(file)

    if not candidates:
        raise RuntimeError(
            f"No TestCode found for {project}-{bug} in:\n"
            f"{test_dir}"
        )

    return candidates


def get_package(java_file):
    text = java_file.read_text(encoding="utf-8")

    match = re.search(
        r"^\s*package\s+([A-Za-z0-9_.]+)\s*;",
        text,
        re.MULTILINE
    )

    if not match:
        raise RuntimeError(
            f"Cannot determine package from:\n{java_file}"
        )

    return match.group(1)


def get_test_methods(java_file):
    text = java_file.read_text(encoding="utf-8")

    pattern = re.compile(
        r"@Test(?:\s*\([^)]*\))?"
        r"\s*"
        r"(?:public\s+|protected\s+|private\s+)?"
        r"(?:static\s+)?"
        r"(?:final\s+)?"
        r"void\s+"
        r"([A-Za-z_][A-Za-z0-9_]*)"
        r"\s*\(",
        re.MULTILINE
    )

    methods = pattern.findall(text)

    # Remove duplicates while preserving order.
    result = []

    for method in methods:
        if method not in result:
            result.append(method)

    return result


def copy_workspace(source, destination):
    shutil.copytree(
        source,
        destination,
        symlinks=True
    )


def copy_test_to_workspace(test_file, workspace):
    package = get_package(test_file)

    package_dir = workspace / "tests" / Path(
        package.replace(".", "/")
    )

    package_dir.mkdir(
        parents=True,
        exist_ok=True
    )

    destination = package_dir / test_file.name

    shutil.copy2(
        test_file,
        destination
    )

    return package, destination


def parse_failing_tests(output):
    match = re.search(
        r"Failing tests:\s*(\d+)",
        output,
        re.IGNORECASE
    )

    if match:
        return int(match.group(1))

    return None


def execute_test(workspace, full_class, method):
    command = [
        "defects4j",
        "test",
        "-t",
        f"{full_class}::{method}"
    ]

    result = run_command(
        command,
        workspace
    )

    failing_tests = parse_failing_tests(
        result["output"]
    )

    if failing_tests is not None:
        status = "PASS" if failing_tests == 0 else "FAIL"
    else:
        status = (
            "PASS"
            if result["returncode"] == 0
            else "FAIL"
        )

    return {
        "method": method,
        "status": status,
        "failing_tests": failing_tests,
        "returncode": result["returncode"],
        "duration_seconds": result["duration_seconds"],
        "output": result["output"]
    }


def compile_workspace(workspace):
    result = run_command(
        ["defects4j", "compile"],
        workspace
    )

    status = (
        "PASS"
        if result["returncode"] == 0
        else "FAIL"
    )

    return {
        "status": status,
        "returncode": result["returncode"],
        "duration_seconds": result["duration_seconds"],
        "output": result["output"]
    }


def write_execution_file(
    path,
    project,
    bug,
    method,
    version,
    test_file,
    package,
    full_class,
    compile_result,
    test_results,
    total_duration
):
    
    lines = []

    lines.append("=" * 70)
    lines.append("AI TEST EXECUTION")
    lines.append("=" * 70)
    lines.append(f"Project       : {project}")
    lines.append(f"Bug           : {bug}")
    lines.append(f"Method        : {method}")
    lines.append(f"Version       : {version}")
    lines.append(f"Test file     : {test_file}")
    lines.append(f"Test class    : {full_class}")
    lines.append(
        f"Total duration: {total_duration:.3f} seconds"
    )
    lines.append("")

    lines.append("-" * 70)
    lines.append("COMPILE")
    lines.append("-" * 70)

    lines.append(
        f"Status        : {compile_result['status']}"
    )

    lines.append(
        f"Duration      : "
        f"{compile_result['duration_seconds']:.3f} seconds"
    )

    lines.append("")
    lines.append(
        compile_result["output"]
    )

    lines.append("")
    lines.append("-" * 70)
    lines.append("TEST RESULTS")
    lines.append("-" * 70)

    for result in test_results:
        lines.append(
            f"Test          : {result['method']}"
        )
        lines.append(
            f"Status        : {result['status']}"
        )
        lines.append(
            f"Failing tests : "
            f"{result['failing_tests']}"
        )
        lines.append(
            f"Duration      : "
            f"{result['duration_seconds']:.3f} seconds"
        )
        lines.append(
            f"Return code   : {result['returncode']}"
        )

        lines.append("")
        lines.append("Output:")
        lines.append(result["output"])
        lines.append("")
        lines.append("-" * 70)

    path.write_text(
        "\n".join(lines),
        encoding="utf-8"
    )


def calculate_metrics(buggy_results, fixed_results):
    fixed_by_method = {
        result["method"]: result
        for result in fixed_results
    }

    defect_detecting = 0

    for buggy in buggy_results:
        fixed = fixed_by_method.get(
            buggy["method"]
        )

        if fixed is None:
            continue

        if (
            buggy["status"] == "FAIL"
            and fixed["status"] == "PASS"
        ):
            defect_detecting += 1

    total_tests = len(buggy_results)

    fdr = (
        defect_detecting / total_tests * 100
        if total_tests > 0
        else 0.0
    )

    buggy_fail = sum(
        1
        for result in buggy_results
        if result["status"] == "FAIL"
    )

    buggy_pass = sum(
        1
        for result in buggy_results
        if result["status"] == "PASS"
    )

    fixed_fail = sum(
        1
        for result in fixed_results
        if result["status"] == "FAIL"
    )

    fixed_pass = sum(
        1
        for result in fixed_results
        if result["status"] == "PASS"
    )

    return {
        "total_tests": total_tests,
        "buggy_fail": buggy_fail,
        "buggy_pass": buggy_pass,
        "fixed_fail": fixed_fail,
        "fixed_pass": fixed_pass,
        "defect_detecting_tests": defect_detecting,
        "fdr_percent": round(fdr, 2)
    }


def main():
    if len(sys.argv) != 4:
        print(
            "Usage:\n"
            "  python3 automation/scripts/"
            "run_ai_experiment.py "
            "<project> <bug> <method>\n"
        )
        print(
            "Example:\n"
            "  python3 automation/scripts/"
            "run_ai_experiment.py "
            "Chart 1 ChatGPT"
        )
        sys.exit(1)

    project = sys.argv[1]
    bug = int(sys.argv[2])
    method = sys.argv[3]

    ground_truth_root = (
        PROJECTS_DIR
        / project
        / f"Bug-{bug}"
    )

    buggy_source = ground_truth_root / "Buggy"
    fixed_source = ground_truth_root / "Fixed"

    if not buggy_source.exists():
        raise RuntimeError(
            f"Buggy ground truth workspace missing:\n"
            f"{buggy_source}"
        )

    if not fixed_source.exists():
        raise RuntimeError(
            f"Fixed ground truth workspace missing:\n"
            f"{fixed_source}"
        )

    test_files = find_test_files(
        project,
        bug,
        method
    )

    if len(test_files) != 1:
        print(
            "ERROR: Expected exactly one TestCode "
            "file for this pilot."
        )

        for file in test_files:
            print(f"  {file}")

        sys.exit(1)

    test_file = test_files[0]

    package = get_package(test_file)

    test_class = test_file.stem

    full_class = f"{package}.{test_class}"

    test_methods = get_test_methods(
        test_file
    )

    if not test_methods:
        raise RuntimeError(
            f"No @Test methods found in:\n"
            f"{test_file}"
        )

    result_root = (
        ROOT
        / project
        / method
        / "Result"
        / f"Bug-{bug}"
    )

    buggy_result_dir = (
        result_root / "Buggy"
    )

    fixed_result_dir = (
        result_root / "Fixed"
    )

    buggy_result_dir.mkdir(
        parents=True,
        exist_ok=True
    )

    fixed_result_dir.mkdir(
        parents=True,
        exist_ok=True
    )

    print_header(
        f"AI EXPERIMENT: {project}-{bug} / {method}"
    )

    print(f"Test file       : {test_file}")
    print(f"Test class      : {full_class}")
    print(f"Test methods    : {len(test_methods)}")

    for method_name in test_methods:
        print(f"  - {method_name}")

    print()
    print(
        "Ground Truth:"
    )
    print(
        f"  Buggy : {buggy_source}"
    )
    print(
        f"  Fixed : {fixed_source}"
    )

    temp_root = Path(
        tempfile.mkdtemp(
            prefix=(
                f"sqa_{project}_"
                f"Bug-{bug}_"
                f"{method}_"
            ),
            dir=str(
                AUTOMATION_DIR / "state"
            )
        )
    )

    temp_buggy = temp_root / "Buggy"
    temp_fixed = temp_root / "Fixed"

    print()
    print(f"Temporary workspace: {temp_root}")

    experiment_start = time.time()

    try:
        print()
        print("[1/6] Copying clean Buggy workspace...")

        copy_workspace(
            buggy_source,
            temp_buggy
        )

        print(
            "      OK - Ground Truth Buggy "
            "was not modified."
        )

        print()
        print("[2/6] Copying clean Fixed workspace...")

        copy_workspace(
            fixed_source,
            temp_fixed
        )

        print(
            "      OK - Ground Truth Fixed "
            "was not modified."
        )

        print()
        print("[3/6] Injecting generated test into temporary workspaces...")

        copy_test_to_workspace(
            test_file,
            temp_buggy
        )

        copy_test_to_workspace(
            test_file,
            temp_fixed
        )

        print("      OK")

        print()
        print("[4/6] Compiling Buggy...")

        buggy_compile = compile_workspace(
            temp_buggy
        )

        print(
            f"      {buggy_compile['status']}"
        )

        print()
        print("[5/6] Compiling Fixed...")

        fixed_compile = compile_workspace(
            temp_fixed
        )

        print(
            f"      {fixed_compile['status']}"
        )

        print()
        print("[6/6] Executing generated tests...")

        buggy_results = []
        fixed_results = []

        if buggy_compile["status"] == "PASS":

            for method_name in test_methods:
                print(
                    f"      Buggy :: "
                    f"{method_name}"
                )

                result = execute_test(
                    temp_buggy,
                    full_class,
                    method_name
                )

                buggy_results.append(result)

                print(
                    f"         {result['status']}"
                )

        else:
            for method_name in test_methods:
                buggy_results.append({
                    "method": method_name,
                    "status": "NOT_RUN",
                    "failing_tests": None,
                    "returncode": None,
                    "duration_seconds": 0,
                    "output": (
                        "Skipped because "
                        "Buggy compilation failed."
                    )
                })

        if fixed_compile["status"] == "PASS":

            for method_name in test_methods:
                print(
                    f"      Fixed :: "
                    f"{method_name}"
                )

                result = execute_test(
                    temp_fixed,
                    full_class,
                    method_name
                )

                fixed_results.append(result)

                print(
                    f"         {result['status']}"
                )

        else:
            for method_name in test_methods:
                fixed_results.append({
                    "method": method_name,
                    "status": "NOT_RUN",
                    "failing_tests": None,
                    "returncode": None,
                    "duration_seconds": 0,
                    "output": (
                        "Skipped because "
                        "Fixed compilation failed."
                    )
                })

        buggy_test_duration = round(
            sum(
                result["duration_seconds"]
                for result in buggy_results
            ),
            3
        )


        fixed_test_duration = round(
            sum(
                result["duration_seconds"]
                for result in fixed_results
            ),
            3
        )

        buggy_total_duration = round(
            buggy_compile["duration_seconds"]
            + buggy_test_duration,
            3
        )

        fixed_total_duration = round(
            fixed_compile["duration_seconds"]
            + fixed_test_duration,
            3
        )

        experiment_total_duration = round(
            time.time() - experiment_start,
            3
        )
        
        buggy_execution = (
            buggy_result_dir
            / "execution.txt"
        )

        fixed_execution = (
            fixed_result_dir
            / "execution.txt"
        )

        write_execution_file(
            buggy_execution,
            project,
            bug,
            method,
            "Buggy",
            test_file,
            package,
            full_class,
            buggy_compile,
            buggy_results,
            buggy_total_duration
        )

        write_execution_file(
            fixed_execution,
            project,
            bug,
            method,
            "Fixed",
            test_file,
            package,
            full_class,
            fixed_compile,
            fixed_results,
            fixed_total_duration
        )

        metrics = calculate_metrics(
            buggy_results,
            fixed_results
        )

        experiment = {
            "project": project,
            "bug": bug,
            "method": method,
            "test_file": str(test_file),
            "test_class": full_class,
            "test_methods": test_methods,
            "buggy_compile": buggy_compile["status"],
            "fixed_compile": fixed_compile["status"],
            "buggy_results": buggy_results,
            "fixed_results": fixed_results,
            "metrics": metrics,
            "timing": {
                "buggy_compile_seconds": buggy_compile[
                    "duration_seconds"
                ],
                "buggy_test_seconds": buggy_test_duration,
                "buggy_total_seconds": buggy_total_duration,

                "fixed_compile_seconds": fixed_compile[
                    "duration_seconds"
                ],
                "fixed_test_seconds": fixed_test_duration,
                "fixed_total_seconds": fixed_total_duration,

                "experiment_total_seconds": experiment_total_duration
            },
            "generated_at": datetime.now().isoformat()
        }

        experiment_file = (
            result_root
            / "experiment.json"
        )

        experiment_file.write_text(
            json.dumps(
                experiment,
                indent=2,
                ensure_ascii=False
            ),
            encoding="utf-8"
        )

        print_header("EXPERIMENT SUMMARY")

        print(
            f"Total tests             : "
            f"{metrics['total_tests']}"
        )

        print(
            f"Buggy FAIL              : "
            f"{metrics['buggy_fail']}"
        )

        print(
            f"Buggy PASS              : "
            f"{metrics['buggy_pass']}"
        )

        print(
            f"Fixed FAIL              : "
            f"{metrics['fixed_fail']}"
        )

        print(
            f"Fixed PASS              : "
            f"{metrics['fixed_pass']}"
        )

        print(
            f"Defect-detecting tests  : "
            f"{metrics['defect_detecting_tests']}"
        )

        print(
            f"FDR                     : "
            f"{metrics['fdr_percent']:.2f}%"
        )

        print()
        print(
            f"Result directory:"
        )
        print(
            f"  {result_root}"
        )

        print()
        print(
            "Ground Truth workspaces "
            "were not used for test injection."
        )

    finally:
        print()
        print("Cleaning temporary workspace...")

        shutil.rmtree(
            temp_root,
            ignore_errors=True
        )

        print("Temporary workspace removed.")


if __name__ == "__main__":
    main()
