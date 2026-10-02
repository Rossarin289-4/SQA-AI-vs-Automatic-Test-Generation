#!/usr/bin/env python3

import argparse
import shutil
from pathlib import Path


def main():
    parser = argparse.ArgumentParser(
        description="Normalize a generated test artifact into the experiment contract."
    )

    parser.add_argument("--source", required=True,
                        help="Source generated JUnit test file")
    parser.add_argument("--output", required=True,
                        help="Destination generated_test.java")

    args = parser.parse_args()

    source = Path(args.source).resolve()
    output = Path(args.output).resolve()

    if not source.is_file():
        raise SystemExit(f"ERROR: source artifact not found: {source}")

    output.parent.mkdir(parents=True, exist_ok=True)

    shutil.copy2(source, output)

    print("ARTIFACT_NORMALIZED")
    print(f"source={source}")
    print(f"output={output}")


if __name__ == "__main__":
    main()
