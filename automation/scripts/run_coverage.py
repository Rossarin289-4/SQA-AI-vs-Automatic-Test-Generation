#!/usr/bin/env python3

import argparse
import csv
import json
import shutil
import subprocess
import tarfile
import tempfile
import time
from pathlib import Path


D4J = Path(
    "/Users/fangfang/Documents/SQA_Project/defects4j/framework/bin/defects4j"
)


def run_command(command, cwd=None):
    start = time.perf_counter()

    process = subprocess.run(
        command,
        cwd=cwd,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True
    )

    elapsed = time.perf_counter() - start

    return process.returncode, process.stdout, elapsed


def parse_summary(summary_file):
    if not summary_file.exists():
        raise RuntimeError(
            f"Defects4J summary.csv not found: {summary_file}"
        )

    with summary_file.open(newline="") as f:
        reader = csv.DictReader(f)
        rows = list(reader)

    if not rows:
        raise RuntimeError(
            f"Defects4J summary.csv is empty: {summary_file}"
        )

    row = rows[0]

    required = [
        "LinesTotal",
        "LinesCovered",
        "ConditionsTotal",
        "ConditionsCovered"
    ]

    for key in required:
        if key not in row:
            raise RuntimeError(
                f"Missing {key} in {summary_file}"
            )

    lines_total = int(row["LinesTotal"])
    lines_covered = int(row["LinesCovered"])
    conditions_total = int(row["ConditionsTotal"])
    conditions_covered = int(row["ConditionsCovered"])

    line_coverage = (
        lines_covered / lines_total * 100
        if lines_total else 0.0
    )

    branch_coverage = (
        conditions_covered / conditions_total * 100
        if conditions_total else 0.0
    )

    return {
        "LinesTotal": lines_total,
        "LinesCovered": lines_covered,
        "ConditionsTotal": conditions_total,
        "ConditionsCovered": conditions_covered,
        "line_coverage": line_coverage,
        "branch_coverage": branch_coverage
    }


def create_suite_archive(
    suite_source,
    project,
    version,
    method,
    output_dir
):
    suite_source = Path(suite_source).resolve()
    output_dir = Path(output_dir).resolve()

    if not suite_source.exists():
        raise RuntimeError(
            f"Suite source does not exist: {suite_source}"
        )

    java_files = list(suite_source.rglob("*.java"))

    if not java_files:
        raise RuntimeError(
            f"No .java files found under suite source: {suite_source}"
        )

    output_dir.mkdir(parents=True, exist_ok=True)

    archive_name = (
        f"{project}-{version}-{method}.1.tar.bz2"
    )

    archive_path = output_dir / archive_name

    with tarfile.open(archive_path, "w:bz2") as tar:
        for java_file in java_files:
            relative = java_file.relative_to(suite_source)
            tar.add(
                java_file,
                arcname=str(relative)
            )

    return archive_path


def write_coverage_csv(output_dir, metrics):
    output_dir.mkdir(parents=True, exist_ok=True)

    coverage_csv = output_dir / "coverage.csv"

    with coverage_csv.open("w", newline="") as f:
        writer = csv.writer(f)
        writer.writerow(["metric", "value"])
        writer.writerow([
            "line_coverage",
            f"{metrics['line_coverage']:.4f}"
        ])
        writer.writerow([
            "branch_coverage",
            f"{metrics['branch_coverage']:.4f}"
        ])

    return coverage_csv


def main():
    parser = argparse.ArgumentParser()

    parser.add_argument(
        "--workspace",
        required=True
    )

    parser.add_argument(
        "--output",
        required=True
    )

    parser.add_argument(
        "--suite-source",
        default=None,
        help="Directory containing generated JUnit source files"
    )

    parser.add_argument(
        "--project",
        default="Lang"
    )

    parser.add_argument(
        "--version",
        required=False
    )

    parser.add_argument(
        "--method",
        default="generated"
    )

    parser.add_argument(
        "--test",
        default=None
    )

    args = parser.parse_args()

    workspace = Path(args.workspace).resolve()
    output_dir = Path(args.output).resolve()

    output_dir.mkdir(
        parents=True,
        exist_ok=True
    )

    if not workspace.exists():
        print(
            json.dumps(
                {
                    "status": "ERROR",
                    "error": f"Workspace does not exist: {workspace}"
                },
                indent=2
            )
        )
        return 2

    if not D4J.exists():
        print(
            json.dumps(
                {
                    "status": "ERROR",
                    "error": f"Defects4J not found: {D4J}"
                },
                indent=2
            )
        )
        return 2

    total_start = time.perf_counter()

    command = None
    archive_path = None

    try:
        if args.suite_source:
            if not args.version:
                raise RuntimeError(
                    "--version is required with --suite-source"
                )

            archive_path = create_suite_archive(
                args.suite_source,
                args.project,
                args.version,
                args.method,
                output_dir
            )

            command = [
                str(D4J),
                "coverage",
                "-w",
                str(workspace),
                "-s",
                str(archive_path)
            ]

        elif args.test:
            command = [
                str(D4J),
                "coverage",
                "-w",
                str(workspace),
                "-t",
                args.test
            ]

        else:
            raise RuntimeError(
                "Specify either --suite-source or --test"
            )

        return_code, output, coverage_time = run_command(
            command
        )

        log_file = output_dir / "coverage.log"
        log_file.write_text(output)

        summary_file = workspace / "summary.csv"

        if return_code != 0:
            result = {
                "workspace": str(workspace),
                "command": command,
                "command_return_code": return_code,
                "coverage_time_seconds": coverage_time,
                "status": "ERROR",
                "error": "Defects4J coverage command failed"
            }

            (output_dir / "coverage_result.json").write_text(
                json.dumps(
                    result,
                    indent=2
                )
            )

            return 2

        metrics = parse_summary(summary_file)

        shutil.copy2(
            summary_file,
            output_dir / "defects4j_summary.csv"
        )

        coverage_csv = write_coverage_csv(
            output_dir,
            metrics
        )

        total_time = time.perf_counter() - total_start

        result = {
            "workspace": str(workspace),
            "command": command,
            "archive": str(archive_path) if archive_path else None,
            "command_return_code": return_code,
            "coverage_time_seconds": coverage_time,
            "status": "PASS",
            "metrics": metrics,
            "coverage_csv": str(coverage_csv),
            "total_time_seconds": total_time
        }

        (output_dir / "coverage_result.json").write_text(
            json.dumps(
                result,
                indent=2
            )
        )

        print(
            json.dumps(
                result,
                indent=2
            )
        )

        return 0

    except Exception as exc:
        total_time = time.perf_counter() - total_start

        result = {
            "workspace": str(workspace),
            "command": command,
            "archive": str(archive_path) if archive_path else None,
            "status": "ERROR",
            "error": str(exc),
            "total_time_seconds": total_time
        }

        (output_dir / "coverage_result.json").write_text(
            json.dumps(
                result,
                indent=2
            )
        )

        print(
            json.dumps(
                result,
                indent=2
            )
        )

        return 2


if __name__ == "__main__":
    raise SystemExit(main())
