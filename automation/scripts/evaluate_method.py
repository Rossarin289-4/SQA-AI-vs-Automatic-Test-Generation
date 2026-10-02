#!/usr/bin/env python3

import argparse
import csv
import json
import os
import shutil
import subprocess
import sys
import time
from pathlib import Path


METHODS = ("ChatGPT", "Gemini", "SA", "BPSO")


def run_command(cmd, output_file=None):
    start = time.perf_counter()

    proc = subprocess.run(
        cmd,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True
    )

    elapsed = time.perf_counter() - start

    output = proc.stdout or ""

    if output_file:
        Path(output_file).parent.mkdir(
            parents=True,
            exist_ok=True
        )

        Path(output_file).write_text(
            output,
            encoding="utf-8"
        )

    return proc.returncode, output, elapsed


def load_json(path):
    with open(path, encoding="utf-8") as f:
        return json.load(f)


def write_json(path, data):
    Path(path).parent.mkdir(
        parents=True,
        exist_ok=True
    )

    Path(path).write_text(
        json.dumps(
            data,
            indent=2,
            ensure_ascii=False
        ),
        encoding="utf-8"
    )


def copy_generated_test(source, destination):
    destination.parent.mkdir(
        parents=True,
        exist_ok=True
    )

    shutil.copy2(
        source,
        destination
    )


def write_execution_file(path, data):
    stats = data["statistics"]

    lines = [
        "GENERATED TEST SUITE EXECUTION",
        "==============================",
        "",
        f"Total tests     : {stats['total_tests']}",
        f"Evaluated tests : {stats['evaluated_tests']}",
        f"Detected tests  : {stats['detected_tests']}",
        f"FDR             : {stats['fdr_percent']:.4f}%",
        "",
    ]

    for item in data.get("tests", []):
        lines.extend([
            item["selector"],
            f"  BUGGY : {item['buggy']['status']}",
            f"  FIXED : {item['fixed']['status']}",
            f"  Evaluated : {item['evaluated']}",
            f"  Detected  : {item['detected']}",
            ""
        ])

    Path(path).write_text(
        "\n".join(lines),
        encoding="utf-8"
    )


def write_coverage_file(path, coverage):
    metrics = coverage["metrics"]

    Path(path).parent.mkdir(
        parents=True,
        exist_ok=True
    )

    with open(path, "w", encoding="utf-8") as f:
        f.write("metric,value\n")
        f.write(
            f"line_coverage,{metrics['line_coverage']:.4f}\n"
        )
        f.write(
            f"branch_coverage,{metrics['branch_coverage']:.4f}\n"
        )


def main():
    parser = argparse.ArgumentParser()

    parser.add_argument("--project", required=True)
    parser.add_argument("--bug", required=True)
    parser.add_argument("--method", required=True)

    parser.add_argument("--buggy", required=True)
    parser.add_argument("--fixed", required=True)

    parser.add_argument("--generated-test", required=True)
    parser.add_argument("--destination", required=True)

    parser.add_argument("--artifact-dir", required=True)

    parser.add_argument(
        "--generation-seconds",
        type=float,
        default=None
    )

    parser.add_argument(
        "--keep-workspaces",
        action="store_true"
    )

    args = parser.parse_args()

    if args.method not in METHODS:
        raise SystemExit(
            f"ERROR: unsupported method: {args.method}"
        )

    generated_test = Path(
        args.generated_test
    ).resolve()

    artifact_dir = Path(
        args.artifact_dir
    ).resolve()

    artifact_dir.mkdir(
        parents=True,
        exist_ok=True
    )

    if not generated_test.is_file():
        raise SystemExit(
            f"ERROR: generated test not found: {generated_test}"
        )

    destination = args.destination

    suite_output = artifact_dir / "execution"

    coverage_buggy_output = (
        artifact_dir / "Buggy" / "coverage"
    )

    coverage_fixed_output = (
        artifact_dir / "Fixed" / "coverage"
    )

    artifact_dir.joinpath("Buggy").mkdir(
        parents=True,
        exist_ok=True
    )

    artifact_dir.joinpath("Fixed").mkdir(
        parents=True,
        exist_ok=True
    )

    total_start = time.perf_counter()

    # ---------------------------------------------------------
    # 1. Execute generated suite
    # ---------------------------------------------------------

    suite_cmd = [
        sys.executable,
        str(
            Path(__file__).resolve().parent
            / "run_test_suite.py"
        ),
        "--buggy",
        args.buggy,
        "--fixed",
        args.fixed,
        "--generated-test",
        str(generated_test),
        "--destination",
        destination,
        "--output",
        str(suite_output),
        "--keep-workspaces"
    ]

    suite_rc, suite_stdout, suite_time = run_command(
        suite_cmd,
        artifact_dir / "suite_runner.log"
    )

    suite_result_path = (
        suite_output / "execution_result.json"
    )

    if not suite_result_path.is_file():
        result = {
            "project": args.project,
            "bug_id": str(args.bug),
            "method": args.method,
            "status": "FAILED",
            "error": "run_test_suite.py did not produce execution_result.json"
        }

        write_json(
            artifact_dir / "experiment.json",
            result
        )

        Path(
            artifact_dir / "status"
        ).write_text(
            "FAILED\n",
            encoding="utf-8"
        )

        return 1

    suite_result = load_json(
        suite_result_path
    )

    write_execution_file(
        artifact_dir / "Buggy" / "execution.txt",
        suite_result
    )

    write_execution_file(
        artifact_dir / "Fixed" / "execution.txt",
        suite_result
    )

    eval_ws = suite_result.get(
        "evaluation_workspaces",
        {}
    )

    buggy_eval = eval_ws.get("buggy")
    fixed_eval = eval_ws.get("fixed")

    if not buggy_eval or not fixed_eval:
        raise SystemExit(
            "ERROR: evaluation workspace paths missing."
        )

    # ---------------------------------------------------------
    # 2. Coverage BUGGY
    # ---------------------------------------------------------

    coverage_buggy_cmd = [
        sys.executable,
        str(
            Path(__file__).resolve().parent
            / "run_suite_coverage.py"
        ),
        "--workspace",
        buggy_eval,
        "--generated-test",
        str(generated_test),
        "--destination",
        destination,
        "--project",
        args.project,
        "--bug",
        str(args.bug),
        "--version",
        "b",
        "--output",
        str(coverage_buggy_output)
    ]

    rc_b, out_b, time_b = run_command(
        coverage_buggy_cmd,
        artifact_dir / "Buggy" / "coverage.log"
    )

    coverage_buggy_result_path = (
        coverage_buggy_output / "coverage_result.json"
    )

    # ---------------------------------------------------------
    # 3. Coverage FIXED
    # ---------------------------------------------------------

    coverage_fixed_cmd = [
        sys.executable,
        str(
            Path(__file__).resolve().parent
            / "run_suite_coverage.py"
        ),
        "--workspace",
        fixed_eval,
        "--generated-test",
        str(generated_test),
        "--destination",
        destination,
        "--project",
        args.project,
        "--bug",
        str(args.bug),
        "--version",
        "f",
        "--output",
        str(coverage_fixed_output)
    ]

    rc_f, out_f, time_f = run_command(
        coverage_fixed_cmd,
        artifact_dir / "Fixed" / "coverage.log"
    )

    coverage_fixed_result_path = (
        coverage_fixed_output / "coverage_result.json"
    )

    coverage_buggy = None
    coverage_fixed = None

    if coverage_buggy_result_path.is_file():
        coverage_buggy = load_json(
            coverage_buggy_result_path
        )

        write_coverage_file(
            artifact_dir / "Buggy" / "coverage.csv",
            coverage_buggy
        )

    if coverage_fixed_result_path.is_file():
        coverage_fixed = load_json(
            coverage_fixed_result_path
        )

        write_coverage_file(
            artifact_dir / "Fixed" / "coverage.csv",
            coverage_fixed
        )

    # ---------------------------------------------------------
    # 4. Timing
    # ---------------------------------------------------------

    generation_seconds = args.generation_seconds

    generation_file = (
        artifact_dir / "generation_seconds.txt"
    )

    if generation_seconds is None and generation_file.is_file():
        try:
            generation_seconds = float(
                generation_file.read_text().strip()
            )
        except ValueError:
            generation_seconds = None

    # ---------------------------------------------------------
    # 5. Build normalized result
    # ---------------------------------------------------------

    stats = suite_result.get(
        "statistics",
        {}
    )

    buggy_stats = stats.get(
        "buggy_pass",
        0
    )

    buggy_fail = stats.get(
        "buggy_fail",
        0
    )

    buggy_error = stats.get(
        "buggy_error",
        0
    )

    fixed_pass = stats.get(
        "fixed_pass",
        0
    )

    fixed_fail = stats.get(
        "fixed_fail",
        0
    )

    fixed_error = stats.get(
        "fixed_error",
        0
    )

    evaluation_status = "DONE"

    if suite_rc != 0:
        evaluation_status = "FAILED"

    if rc_b != 0 or rc_f != 0:
        evaluation_status = "FAILED"

    total_seconds = (
        time.perf_counter()
        - total_start
    )

    result = {
        "project": args.project,
        "bug_id": str(args.bug),
        "method": args.method,
        "generated_test": str(generated_test),
        "destination": destination,
        "status": evaluation_status,

        "statistics": {
            "total_tests": stats.get("total_tests", 0),
            "evaluated_tests": stats.get("evaluated_tests", 0),
            "detected_tests": stats.get("detected_tests", 0),
            "fdr_percent": stats.get("fdr_percent", 0.0),
            "buggy_pass": buggy_stats,
            "buggy_fail": buggy_fail,
            "buggy_error": buggy_error,
            "fixed_pass": fixed_pass,
            "fixed_fail": fixed_fail,
            "fixed_error": fixed_error
        },

        "coverage": {
            "buggy": coverage_buggy,
            "fixed": coverage_fixed
        },

        "timing": {
            "generation_seconds": generation_seconds,
            "suite_runner_seconds": suite_time,
            "compile_buggy_seconds": suite_result.get(
                "timing",
                {}
            ).get(
                "buggy_compile_seconds"
            ),
            "compile_fixed_seconds": suite_result.get(
                "timing",
                {}
            ).get(
                "fixed_compile_seconds"
            ),
            "execution_buggy_seconds": suite_result.get(
                "timing",
                {}
            ).get(
                "buggy_execution_seconds"
            ),
            "execution_fixed_seconds": suite_result.get(
                "timing",
                {}
            ).get(
                "fixed_execution_seconds"
            ),
            "coverage_buggy_seconds": (
                coverage_buggy.get(
                    "coverage_time_seconds"
                )
                if coverage_buggy
                else None
            ),
            "coverage_fixed_seconds": (
                coverage_fixed.get(
                    "coverage_time_seconds"
                )
                if coverage_fixed
                else None
            ),
            "total_time_seconds": total_seconds
        },

        "evaluation_workspaces": eval_ws
    }

    write_json(
        artifact_dir / "experiment.json",
        result
    )

    # ---------------------------------------------------------
    # 6. Flat result.csv
    # ---------------------------------------------------------

    def cov(data, key):
        if not data:
            return ""
        return data.get(
            "metrics",
            {}
        ).get(
            key,
            ""
        )

    row = {
        "project": args.project,
        "bug_id": args.bug,
        "method": args.method,
        "status": evaluation_status,

        "total_tests": stats.get("total_tests", 0),
        "evaluated_tests": stats.get("evaluated_tests", 0),
        "detected_tests": stats.get("detected_tests", 0),
        "fdr_percent": stats.get("fdr_percent", 0.0),

        "buggy_pass": buggy_stats,
        "buggy_fail": buggy_fail,
        "buggy_error": buggy_error,

        "fixed_pass": fixed_pass,
        "fixed_fail": fixed_fail,
        "fixed_error": fixed_error,

        "buggy_line_coverage": cov(
            coverage_buggy,
            "line_coverage"
        ),
        "buggy_branch_coverage": cov(
            coverage_buggy,
            "branch_coverage"
        ),

        "fixed_line_coverage": cov(
            coverage_fixed,
            "line_coverage"
        ),
        "fixed_branch_coverage": cov(
            coverage_fixed,
            "branch_coverage"
        ),

        "generation_seconds": generation_seconds,

        "compile_buggy_seconds":
            suite_result.get(
                "timing",
                {}
            ).get(
                "buggy_compile_seconds"
            ),

        "compile_fixed_seconds":
            suite_result.get(
                "timing",
                {}
            ).get(
                "fixed_compile_seconds"
            ),

        "execution_buggy_seconds":
            suite_result.get(
                "timing",
                {}
            ).get(
                "buggy_execution_seconds"
            ),

        "execution_fixed_seconds":
            suite_result.get(
                "timing",
                {}
            ).get(
                "fixed_execution_seconds"
            ),

        "coverage_buggy_seconds":
            coverage_buggy.get(
                "coverage_time_seconds"
            )
            if coverage_buggy
            else "",

        "coverage_fixed_seconds":
            coverage_fixed.get(
                "coverage_time_seconds"
            )
            if coverage_fixed
            else "",

        "total_time_seconds":
            total_seconds
    }

    with open(
        artifact_dir / "result.csv",
        "w",
        newline="",
        encoding="utf-8"
    ) as f:
        writer = csv.DictWriter(
            f,
            fieldnames=list(row.keys())
        )

        writer.writeheader()
        writer.writerow(row)

    # ---------------------------------------------------------
    # 7. status
    # ---------------------------------------------------------

    Path(
        artifact_dir / "status"
    ).write_text(
        evaluation_status + "\n",
        encoding="utf-8"
    )

    # ---------------------------------------------------------
    # 8. Cleanup evaluation workspaces
    # ---------------------------------------------------------

    if not args.keep_workspaces:
        for workspace in (
            buggy_eval,
            fixed_eval
        ):
            if workspace:
                shutil.rmtree(
                    workspace,
                    ignore_errors=True
                )

        parent_candidates = set()

        if buggy_eval:
            parent_candidates.add(
                str(Path(buggy_eval).parent)
            )

        if fixed_eval:
            parent_candidates.add(
                str(Path(fixed_eval).parent)
            )

        for parent in parent_candidates:
            try:
                if Path(parent).exists():
                    shutil.rmtree(
                        parent,
                        ignore_errors=True
                    )
            except Exception:
                pass

    print(
        json.dumps(
            result,
            indent=2,
            ensure_ascii=False
        )
    )

    return 0 if evaluation_status == "DONE" else 1


if __name__ == "__main__":
    raise SystemExit(main())
