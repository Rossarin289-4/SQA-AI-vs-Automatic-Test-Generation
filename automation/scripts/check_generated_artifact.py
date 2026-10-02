#!/usr/bin/env python3

import argparse
import re
import sys
from pathlib import Path


def main():
    parser = argparse.ArgumentParser()

    parser.add_argument("--artifact-dir", required=True)
    parser.add_argument("--method", required=True,
                        choices=["ChatGPT", "Gemini", "SA", "BPSO"])

    args = parser.parse_args()

    root = Path(
        args.artifact_dir
    ).resolve()

    if args.method in ("ChatGPT", "Gemini"):
        required = [
            "prompt.txt",
            "raw_output.txt",
            "generated_test.java"
        ]
    else:
        required = [
            "generated_test.java"
        ]

    errors = []

    for name in required:
        path = root / name

        if not path.is_file():
            errors.append(
                f"missing: {name}"
            )
            continue

        if path.stat().st_size == 0:
            errors.append(
                f"empty: {name}"
            )

    generated = root / "generated_test.java"

    if generated.is_file():
        text = generated.read_text(
            encoding="utf-8"
        )

        if "@Test" not in text:
            errors.append(
                "generated_test.java contains no @Test"
            )

        if "package " not in text:
            errors.append(
                "generated_test.java has no package declaration"
            )

        if "import org.junit.Test" not in text:
            errors.append(
                "generated_test.java does not import JUnit Test"
            )

    if errors:
        print("ARTIFACT_INVALID")

        for error in errors:
            print(" -", error)

        return 1

    print("ARTIFACT_READY")

    return 0


if __name__ == "__main__":
    raise SystemExit(main())
