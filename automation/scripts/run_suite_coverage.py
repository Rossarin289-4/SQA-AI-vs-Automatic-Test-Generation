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


ROOT = Path("/Users/fangfang/Documents/SQA_Project_2026")
D4J = Path(
    "/Users/fangfang/Documents/SQA_Project/defects4j/framework/bin/defects4j"
)


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

    return process.returncode, process.stdout, elapsed


def parse_summary(summary_file):
    with open(summary_file, newline="", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        row = next(reader)

    lines_total = int(row["LinesTotal"])
    lines_covered = int(row["LinesCovered"])
    conditions_total = int(row["ConditionsTotal"])
    conditions_covered = int(row["ConditionsCovered"])

    line_coverage = (
        lines_covered / lines_total * 100.0
        if lines_total
        else 0.0
    )

    branch_coverage = (
        conditions_covered / conditions_total * 100.0
        if conditions_total
        else 0.0
    )

    return {
        "LinesTotal": lines_total,
        "LinesCovered": lines_covered,
        "ConditionsTotal": conditions_total,
        "ConditionsCovered": conditions_covered,
        "line_coverage": line_coverage,
        "branch_coverage": branch_coverage
    }


def main():
    parser = argparse.ArgumentParser()

    parser.add_argument("--workspace", required=True)
    parser.add_argument("--generated-test", required=True)
    parser.add_argument("--destination", required=True)
    parser.add_argument("--project", required=True)
    parser.add_argument("--bug", required=True)
    parser.add_argument("--version", required=True)
    parser.add_argument("--output", required=True)
    parser.add_argument("--keep-archive", action="store_true")

    args = parser.parse_args()

    workspace = Path(args.workspace).resolve()
    generated_test = Path(args.generated_test).resolve()
    output = Path(args.output).resolve()

    output.mkdir(
        parents=True,
        exist_ok=True
    )

    if not workspace.is_dir():
        raise SystemExit(
            f"ERROR: workspace not found: {workspace}"
        )

    if not generated_test.is_file():
        raise SystemExit(
            f"ERROR: generated test not found: {generated_test}"
        )

    temp_root = Path(
        tempfile.mkdtemp(
            prefix="d4j_cov_suite_",
            dir=str(ROOT / "automation/runs")
        )
    )

    try:
        archive_name = (
            f"{args.project}-{args.bug}{args.version}"
            f"-generated.1.tar.bz2"
        )

        archive = temp_root / archive_name

        archive_root = temp_root / "archive_root"

        source_destination = (
            archive_root / args.destination
        )

        source_destination.parent.mkdir(
            parents=True,
            exist_ok=True
        )

        shutil.copy2(
            generated_test,
            source_destination
        )

        with tarfile.open(
            archive,
            "w:bz2"
        ) as tar:
            tar.add(
                source_destination,
                arcname=args.destination
            )

        return_code, output_text, elapsed = run_command(
            [
                str(D4J),
                "coverage",
                "-w",
                str(workspace),
                "-s",
                str(archive)
            ],
            workspace
        )

        log_file = output / "coverage.log"

        with open(
            log_file,
            "w",
            encoding="utf-8"
        ) as f:
            f.write(output_text)

        summary_file = workspace / "summary.csv"

        result = {
            "workspace": str(workspace),
            "generated_test": str(generated_test),
            "destination": args.destination,
            "archive": str(archive),
            "command_return_code": return_code,
            "coverage_time_seconds": elapsed
        }

        if summary_file.is_file() and return_code in (0, 2):
            metrics = parse_summary(
                summary_file
            )

            result["status"] = "PASS"
            result["metrics"] = metrics

        elif not summary_file.is_file():
            result["status"] = "ERROR"
            result["error"] = (
                "Defects4J coverage completed without summary.csv."
            )

        else:
            result["status"] = "ERROR"
            result["error"] = (
                "defects4j coverage returned a fatal non-zero exit code "
                f"({return_code}) and summary.csv was not usable."
            )

            with open(
                output / "coverage.csv",
                "w",
                encoding="utf-8",
                newline=""
            ) as f:
                writer = csv.writer(f)

                writer.writerow(
                    ["metric", "value"]
                )

                writer.writerow(
                    [
                        "line_coverage",
                        f"{metrics['line_coverage']:.4f}"
                    ]
                )

                writer.writerow(
                    [
                        "branch_coverage",
                        f"{metrics['branch_coverage']:.4f}"
                    ]
                )

            shutil.copy2(
                summary_file,
                output / "summary.csv"
            )

        result["total_time_seconds"] = elapsed

        with open(
            output / "coverage_result.json",
            "w",
            encoding="utf-8"
        ) as f:
            json.dump(
                result,
                f,
                indent=2,
                ensure_ascii=False
            )

        print(
            json.dumps(
                result,
                indent=2,
                ensure_ascii=False
            )
        )

        return (
            0
            if result["status"] == "PASS"
            else 2
        )

    finally:
        if not args.keep_archive:
            shutil.rmtree(
                temp_root,
                ignore_errors=True
            )


if __name__ == "__main__":
    raise SystemExit(main())
