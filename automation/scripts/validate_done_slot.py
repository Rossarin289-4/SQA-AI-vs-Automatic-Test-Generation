#!/usr/bin/env python3

import argparse
import json
from pathlib import Path


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--artifact-dir", required=True)
    parser.add_argument("--method", required=True)
    args = parser.parse_args()

    artifact = Path(args.artifact_dir)

    status_file = artifact / "status"
    experiment = artifact / "experiment.json"
    result = artifact / "result.csv"

    if not status_file.is_file():
        print("INVALID: missing status")
        return 1

    status = status_file.read_text(
        encoding="utf-8"
    ).strip()

    if status != "DONE":
        print(f"INVALID: status={status}")
        return 1

    if not experiment.is_file():
        print("INVALID: missing experiment.json")
        return 1

    if not result.is_file():
        print("INVALID: missing result.csv")
        return 1

    try:
        data = json.loads(
            experiment.read_text(encoding="utf-8")
        )
    except Exception as exc:
        print(f"INVALID: experiment.json: {exc}")
        return 1

    if not isinstance(data, dict):
        print("INVALID: experiment.json is not an object")
        return 1

    required = [
        "project",
        "bug_id",
        "method",
        "status",
        "statistics",
        "coverage",
        "timing",
    ]

    missing = [
        key for key in required
        if key not in data
    ]

    if missing:
        print(
            "INVALID: experiment.json missing: "
            + ", ".join(missing)
        )
        return 1

    if data.get("status") != "DONE":
        print(
            "INVALID: experiment.json status="
            + str(data.get("status"))
        )
        return 1

    statistics = data.get("statistics", {})

    required_stats = [
        "evaluated_tests",
        "detected_tests",
        "fdr_percent",
    ]

    missing_stats = [
        key for key in required_stats
        if key not in statistics
    ]

    if missing_stats:
        print(
            "INVALID: missing statistics: "
            + ", ".join(missing_stats)
        )
        return 1

    print("VALID DONE")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
