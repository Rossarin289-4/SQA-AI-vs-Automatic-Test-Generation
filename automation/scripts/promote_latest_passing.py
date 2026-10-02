#!/usr/bin/env python3

"""
Promote the latest PASSING generated-test attempt to the canonical artifact.

Policy:
    1. Never delete old attempts.
    2. Attempts remain available for reproducibility.
    3. Only a validated passing attempt may become canonical.
    4. The newest passing attempt wins.
    5. Existing canonical artifact is not replaced by a failed attempt.

Expected attempt layout:

attempts/
    attempt-001/
        generated_test.java
        raw_output.txt
        validation.json
    attempt-002/
        generated_test.java
        raw_output.txt
        validation.json

Canonical output:

generated_test.java
raw_output.txt

validation.json must contain:

{
    "status": "PASS"
}

This script is intentionally conservative.
"""

from __future__ import annotations

import argparse
import json
import shutil
from pathlib import Path


def load_json(path: Path):
    try:
        with path.open(encoding="utf-8") as f:
            return json.load(f)
    except Exception:
        return None


def is_passing(attempt: Path) -> bool:
    validation = attempt / "validation.json"

    if not validation.exists():
        return False

    data = load_json(validation)

    if not isinstance(data, dict):
        return False

    return str(data.get("status", "")).upper() == "PASS"


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--attempts", required=True)
    parser.add_argument("--canonical", required=True)
    args = parser.parse_args()

    attempts = Path(args.attempts).resolve()
    canonical = Path(args.canonical).resolve()

    if not attempts.exists():
        print("[INFO] No attempts directory:", attempts)
        return 0

    passing = []

    for p in attempts.iterdir():
        if not p.is_dir():
            continue

        if not is_passing(p):
            continue

        generated = p / "generated_test.java"

        if not generated.exists():
            continue

        passing.append(p)

    if not passing:
        print("[NO PASSING ATTEMPT]")
        return 2

    passing.sort(
        key=lambda p: p.stat().st_mtime,
        reverse=True
    )

    latest = passing[0]

    canonical.mkdir(parents=True, exist_ok=True)

    generated_src = latest / "generated_test.java"
    generated_dst = canonical / "generated_test.java"

    shutil.copy2(generated_src, generated_dst)

    raw_src = latest / "raw_output.txt"
    raw_dst = canonical / "raw_output.txt"

    if raw_src.exists():
        shutil.copy2(raw_src, raw_dst)

    validation_src = latest / "validation.json"
    validation_dst = canonical / "validation.json"

    if validation_src.exists():
        shutil.copy2(validation_src, validation_dst)

    manifest = {
        "canonical_status": "PASS",
        "selected_attempt": str(latest),
        "policy": "latest_passing_attempt",
    }

    with (canonical / "canonical.json").open(
        "w",
        encoding="utf-8"
    ) as f:
        json.dump(manifest, f, indent=2)

    print("[PASS] Latest passing attempt promoted.")
    print("attempt =", latest)
    print("canonical =", canonical)

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
