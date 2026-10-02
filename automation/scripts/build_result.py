#!/usr/bin/env python3

import argparse
import csv
import json
from pathlib import Path


def load_json(path):
    path = Path(path)

    if not path.is_file():
        return {}

    return json.loads(
        path.read_text(
            encoding="utf-8"
        )
    )


def main():
    parser = argparse.ArgumentParser()

    parser.add_argument(
        "--project",
        required=True
    )

    parser.add_argument(
        "--bug",
        required=True
    )

    parser.add_argument(
        "--method",
        required=True,
        choices=[
            "ChatGPT",
            "Gemini",
            "SA",
            "BPSO"
        ]
    )

    parser.add_argument(
        "--root",
        required=True
    )

    args = parser.parse_args()

    root = Path(args.root)

    execution = load_json(
        root / "execution_result.json"
    )

    buggy = execution.get(
        "buggy",
        {}
    )

    fixed = execution.get(
        "fixed",
        {}
    )

    classification = execution.get(
        "classification",
        {}
    )

    timing = execution.get(
        "timing",
        {}
    )

    generation = load_json(
        root / "generation_result.json"
    )

    buggy_coverage = load_json(
        root / "buggy_coverage" /
        "coverage_result.json"
    )

    fixed_coverage = load_json(
        root / "fixed_coverage" /
        "coverage_result.json"
    )

    row = {
        "project": args.project,
        "bug_id": args.bug,
        "method": args.method,

        "buggy_status":
            classification.get(
                "buggy_status",
                "NOT_RUN"
            ),

        "fixed_status":
            classification.get(
                "fixed_status",
                "NOT_RUN"
            ),

        "defect_detected":
            classification.get(
                "defect_detected",
                False
            ),

        "fdr_percent":
            generation.get(
                "fdr_percent",
                ""
            ),

        "generation_seconds":
            generation.get(
                "generation_seconds",
                ""
            ),

        "buggy_compile_seconds":
            timing.get(
                "buggy_compile_seconds",
                ""
            ),

        "buggy_execution_seconds":
            timing.get(
                "buggy_execution_seconds",
                ""
            ),

        "fixed_compile_seconds":
            timing.get(
                "fixed_compile_seconds",
                ""
            ),

        "fixed_execution_seconds":
            timing.get(
                "fixed_execution_seconds",
                ""
            ),

        "buggy_line_coverage":
            buggy_coverage.get(
                "metrics",
                {}
            ).get(
                "line_percent",
                ""
            ),

        "fixed_line_coverage":
            fixed_coverage.get(
                "metrics",
                {}
            ).get(
                "line_percent",
                ""
            ),

        "buggy_condition_coverage":
            buggy_coverage.get(
                "metrics",
                {}
            ).get(
                "condition_percent",
                ""
            ),

        "fixed_condition_coverage":
            fixed_coverage.get(
                "metrics",
                {}
            ).get(
                "condition_percent",
                ""
            ),

        "coverage_seconds":
            (
                buggy_coverage.get(
                    "time_seconds",
                    0
                )
                +
                fixed_coverage.get(
                    "time_seconds",
                    0
                )
            ),

        "total_seconds":
            timing.get(
                "total_seconds",
                ""
            )
    }

    output = root / "result.csv"

    with output.open(
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

    print(output)


if __name__ == "__main__":
    main()
