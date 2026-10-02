#!/usr/bin/env python3

import argparse
import csv
from pathlib import Path


REQUIRED_COLUMNS = [
    "project",
    "bug_id",
    "status",
    "bug_report",
    "fixed_revision",
    "trigger_test",
    "modified_source",
]


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--dataset", required=True)
    args = parser.parse_args()

    dataset = args.dataset

    metadata = Path(
        "automation/datasets"
    ) / dataset / "bugs.csv"

    config = Path(
        "automation/config"
    ) / f"{dataset}.env"

    if not metadata.is_file():
        print(f"[FAILED] Missing metadata: {metadata}")
        return 1

    if not config.is_file():
        print(f"[FAILED] Missing config: {config}")
        return 1

    with metadata.open(
        newline="",
        encoding="utf-8"
    ) as f:
        reader = csv.DictReader(f)
        rows = list(reader)

        missing_columns = [
            col
            for col in REQUIRED_COLUMNS
            if col not in reader.fieldnames
        ]

    if missing_columns:
        print(
            "[FAILED] Missing columns: "
            + ", ".join(missing_columns)
        )
        return 1

    if not rows:
        print("[FAILED] Dataset has no bugs.")
        return 1

    ids = [row["bug_id"] for row in rows]

    if len(ids) != len(set(ids)):
        print("[FAILED] Duplicate bug IDs.")
        return 1

    invalid = []

    for row in rows:
        if row["status"] != "READY":
            invalid.append(
                f'{row["bug_id"]}: status={row["status"]}'
            )

    if invalid:
        print("[FAILED] Invalid rows:")
        for item in invalid[:20]:
            print(" ", item)
        return 1

    print("============================================================")
    print("DATASET CONTRACT: PASS")
    print("============================================================")
    print("Dataset :", dataset)
    print("Bugs    :", len(rows))
    print("Config  :", config)
    print("Metadata:", metadata)

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
