#!/usr/bin/env python3

import argparse
import csv
import json
from pathlib import Path


METHODS = [
    "ChatGPT",
    "Gemini",
    "SA",
    "BPSO"
]


FIELDS = [
    "project",
    "bug_id",
    "method",
    "status",
    "bug_report",
    "trigger_test",

    "total_tests",
    "evaluated_tests",
    "detected_tests",
    "fdr_percent",

    "buggy_pass",
    "buggy_fail",
    "buggy_error",

    "fixed_pass",
    "fixed_fail",
    "fixed_error",

    "buggy_line_coverage",
    "buggy_branch_coverage",

    "fixed_line_coverage",
    "fixed_branch_coverage",

    "generation_seconds",

    "compile_buggy_seconds",
    "compile_fixed_seconds",

    "execution_buggy_seconds",
    "execution_fixed_seconds",

    "coverage_buggy_seconds",
    "coverage_fixed_seconds",

    "total_time_seconds",
]


def empty_result(row, method):
    return {
        "project": row["project"],
        "bug_id": row["bug_id"],
        "method": method,
        "status": "PENDING",
        "bug_report": row.get(
            "bug_report",
            ""
        ),
        "trigger_test": row.get(
            "trigger_test",
            ""
        )
    }


def main():
    parser = argparse.ArgumentParser()

    parser.add_argument(
        "--project",
        required=True
    )

    parser.add_argument(
        "--metadata",
        required=True
    )

    parser.add_argument(
        "--output",
        required=True
    )

    args = parser.parse_args()

    metadata = Path(
        args.metadata
    ).resolve()

    output = Path(
        args.output
    ).resolve()

    # Experiment artifacts are stored under:
    # automation/runs/<PROJECT>/Bug-<BUG>/<METHOD>/
    # while the aggregated master CSV is stored under:
    # automation/state/
    result_root = output.parent.parent / "runs" / args.project

    with open(
        metadata,
        newline="",
        encoding="utf-8"
    ) as f:
        rows = list(
            csv.DictReader(f)
        )

    normalized = []

    for row in rows:
        if row.get("status") != "READY":
            continue

        bug = row["bug_id"]

        for method in METHODS:
            base = empty_result(
                row,
                method
            )

            artifact = (
                result_root
                / f"Bug-{bug}"
                / method
            )

            status_path = artifact / "status"

            if status_path.is_file():
                status = status_path.read_text(
                    encoding="utf-8"
                ).strip()

                if status:
                    base["status"] = status

            experiment = (
                artifact
                / "experiment.json"
            )

            if experiment.is_file():
                try:
                    with open(
                        experiment,
                        encoding="utf-8"
                    ) as f:
                        data = json.load(f)

                    stats = data.get(
                        "statistics",
                        {}
                    )

                    timing = data.get(
                        "timing",
                        {}
                    )

                    coverage = data.get(
                        "coverage",
                        {}
                    )

                    buggy_cov = coverage.get(
                        "buggy"
                    ) or {}

                    fixed_cov = coverage.get(
                        "fixed"
                    ) or {}

                    buggy_metrics = buggy_cov.get(
                        "metrics",
                        {}
                    )

                    fixed_metrics = fixed_cov.get(
                        "metrics",
                        {}
                    )

                    base.update({
                        "status": data.get(
                            "status",
                            base["status"]
                        ),

                        "total_tests": stats.get(
                            "total_tests",
                            ""
                        ),

                        "evaluated_tests": stats.get(
                            "evaluated_tests",
                            ""
                        ),

                        "detected_tests": stats.get(
                            "detected_tests",
                            ""
                        ),

                        "fdr_percent": stats.get(
                            "fdr_percent",
                            ""
                        ),

                        "buggy_pass": stats.get(
                            "buggy_pass",
                            ""
                        ),

                        "buggy_fail": stats.get(
                            "buggy_fail",
                            ""
                        ),

                        "buggy_error": stats.get(
                            "buggy_error",
                            ""
                        ),

                        "fixed_pass": stats.get(
                            "fixed_pass",
                            ""
                        ),

                        "fixed_fail": stats.get(
                            "fixed_fail",
                            ""
                        ),

                        "fixed_error": stats.get(
                            "fixed_error",
                            ""
                        ),

                        "buggy_line_coverage":
                            buggy_metrics.get(
                                "line_coverage",
                                ""
                            ),

                        "buggy_branch_coverage":
                            buggy_metrics.get(
                                "branch_coverage",
                                ""
                            ),

                        "fixed_line_coverage":
                            fixed_metrics.get(
                                "line_coverage",
                                ""
                            ),

                        "fixed_branch_coverage":
                            fixed_metrics.get(
                                "branch_coverage",
                                ""
                            ),

                        "generation_seconds":
                            timing.get(
                                "generation_seconds",
                                ""
                            ),

                        "compile_buggy_seconds":
                            timing.get(
                                "compile_buggy_seconds",
                                ""
                            ),

                        "compile_fixed_seconds":
                            timing.get(
                                "compile_fixed_seconds",
                                ""
                            ),

                        "execution_buggy_seconds":
                            timing.get(
                                "execution_buggy_seconds",
                                ""
                            ),

                        "execution_fixed_seconds":
                            timing.get(
                                "execution_fixed_seconds",
                                ""
                            ),

                        "coverage_buggy_seconds":
                            timing.get(
                                "coverage_buggy_seconds",
                                ""
                            ),

                        "coverage_fixed_seconds":
                            timing.get(
                                "coverage_fixed_seconds",
                                ""
                            ),

                        "total_time_seconds":
                            timing.get(
                                "total_time_seconds",
                                ""
                            ),
                    })

                except Exception as exc:
                    base["status"] = "FAILED"

                    (
                        artifact / "aggregate_error.txt"
                    ).write_text(
                        repr(exc) + "\n",
                        encoding="utf-8"
                    )

            normalized.append(base)

    output.parent.mkdir(
        parents=True,
        exist_ok=True
    )

    with open(
        output,
        "w",
        newline="",
        encoding="utf-8"
    ) as f:
        writer = csv.DictWriter(
            f,
            fieldnames=FIELDS
        )

        writer.writeheader()

        for row in normalized:
            writer.writerow({
                field: row.get(
                    field,
                    ""
                )
                for field in FIELDS
            })

    print(
        f"OK: aggregate written to {output}"
    )

    print(
        f"Rows: {len(normalized)}"
    )


if __name__ == "__main__":
    main()
