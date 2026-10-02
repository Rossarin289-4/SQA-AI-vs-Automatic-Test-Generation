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
                    ) or {}

                    execution = data.get(
                        "execution",
                        {}
                    ) or {}

                    timing = data.get(
                        "timing",
                        {}
                    ) or {}

                    coverage = data.get(
                        "coverage",
                        {}
                    ) or {}

                    buggy_cov = coverage.get(
                        "buggy"
                    ) or {}

                    fixed_cov = coverage.get(
                        "fixed"
                    ) or {}

                    buggy_metrics = buggy_cov.get(
                        "metrics",
                        {}
                    ) or {}

                    fixed_metrics = fixed_cov.get(
                        "metrics",
                        {}
                    ) or {}

                    def first_value(*values):
                        for value in values:
                            if value is not None and value != "":
                                return value
                        return ""

                    def metric(metrics, container, *names):
                        for name in names:
                            if name in metrics and metrics[name] not in (None, ""):
                                return metrics[name]
                        for name in names:
                            if name in container and container[name] not in (None, ""):
                                return container[name]
                        return ""

                    total_tests = first_value(
                        stats.get("total_tests"),
                        data.get("total_tests")
                    )

                    evaluated_tests = first_value(
                        stats.get("evaluated_tests"),
                        data.get("evaluated_tests")
                    )

                    if evaluated_tests == "" and total_tests != "":
                        evaluated_tests = total_tests

                    detected_tests = first_value(
                        stats.get("detected_tests"),
                        data.get("detected_tests")
                    )

                    fdr_percent = first_value(
                        stats.get("fdr_percent"),
                        data.get("fdr_percent")
                    )

                    buggy_pass = first_value(
                        stats.get("buggy_pass"),
                        data.get("buggy_pass"),
                        execution.get("buggy_pass")
                    )

                    buggy_fail = first_value(
                        stats.get("buggy_fail"),
                        data.get("buggy_fail"),
                        execution.get("buggy_fail")
                    )

                    buggy_error = first_value(
                        stats.get("buggy_error"),
                        data.get("buggy_error"),
                        execution.get("buggy_error")
                    )

                    fixed_pass = first_value(
                        stats.get("fixed_pass"),
                        data.get("fixed_pass"),
                        execution.get("fixed_pass")
                    )

                    fixed_fail = first_value(
                        stats.get("fixed_fail"),
                        data.get("fixed_fail"),
                        execution.get("fixed_fail")
                    )

                    fixed_error = first_value(
                        stats.get("fixed_error"),
                        data.get("fixed_error"),
                        execution.get("fixed_error")
                    )

                    buggy_line_coverage = first_value(
                        metric(
                            buggy_metrics,
                            buggy_cov,
                            "line_coverage",
                            "line_coverage_percent",
                            "line_percent"
                        ),
                        data.get("buggy_line_coverage")
                    )

                    buggy_branch_coverage = first_value(
                        metric(
                            buggy_metrics,
                            buggy_cov,
                            "branch_coverage",
                            "condition_coverage_percent",
                            "condition_percent",
                            "branch_coverage_percent"
                        ),
                        data.get("buggy_branch_coverage")
                    )

                    fixed_line_coverage = first_value(
                        metric(
                            fixed_metrics,
                            fixed_cov,
                            "line_coverage",
                            "line_coverage_percent",
                            "line_percent"
                        ),
                        data.get("fixed_line_coverage")
                    )

                    fixed_branch_coverage = first_value(
                        metric(
                            fixed_metrics,
                            fixed_cov,
                            "branch_coverage",
                            "condition_coverage_percent",
                            "condition_percent",
                            "branch_coverage_percent"
                        ),
                        data.get("fixed_branch_coverage")
                    )

                    generation_seconds = first_value(
                        timing.get("generation_seconds"),
                        data.get("generation_seconds")
                    )

                    compile_buggy_seconds = first_value(
                        timing.get("compile_buggy_seconds"),
                        data.get("compile_buggy_seconds")
                    )

                    compile_fixed_seconds = first_value(
                        timing.get("compile_fixed_seconds"),
                        data.get("compile_fixed_seconds")
                    )

                    execution_buggy_seconds = first_value(
                        timing.get("execution_buggy_seconds"),
                        data.get("execution_buggy_seconds"),
                        execution.get("buggy_seconds")
                    )

                    execution_fixed_seconds = first_value(
                        timing.get("execution_fixed_seconds"),
                        data.get("execution_fixed_seconds"),
                        execution.get("fixed_seconds")
                    )

                    coverage_buggy_seconds = first_value(
                        timing.get("coverage_buggy_seconds"),
                        data.get("coverage_buggy_seconds")
                    )

                    coverage_fixed_seconds = first_value(
                        timing.get("coverage_fixed_seconds"),
                        data.get("coverage_fixed_seconds")
                    )

                    total_time_seconds = first_value(
                        timing.get("total_time_seconds"),
                        data.get("total_time_seconds")
                    )

                    base.update({
                        "status": data.get(
                            "status",
                            base["status"]
                        ),

                        "total_tests": total_tests,

                        "evaluated_tests": evaluated_tests,

                        "detected_tests": detected_tests,

                        "fdr_percent": fdr_percent,

                        "buggy_pass": buggy_pass,

                        "buggy_fail": buggy_fail,

                        "buggy_error": buggy_error,

                        "fixed_pass": fixed_pass,

                        "fixed_fail": fixed_fail,

                        "fixed_error": fixed_error,

                        "buggy_line_coverage":
                            buggy_line_coverage,

                        "buggy_branch_coverage":
                            buggy_branch_coverage,

                        "fixed_line_coverage":
                            fixed_line_coverage,

                        "fixed_branch_coverage":
                            fixed_branch_coverage,

                        "generation_seconds":
                            generation_seconds,

                        "compile_buggy_seconds":
                            compile_buggy_seconds,

                        "compile_fixed_seconds":
                            compile_fixed_seconds,

                        "execution_buggy_seconds":
                            execution_buggy_seconds,

                        "execution_fixed_seconds":
                            execution_fixed_seconds,

                        "coverage_buggy_seconds":
                            coverage_buggy_seconds,

                        "coverage_fixed_seconds":
                            coverage_fixed_seconds,

                        "total_time_seconds":
                            total_time_seconds,
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
