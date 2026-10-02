#!/usr/bin/env python3

import argparse
from pathlib import Path


METHODS = (
    "ChatGPT",
    "Gemini",
    "SA",
    "BPSO",
)


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("--dataset", required=True)
    parser.add_argument("--bug", required=True)
    args = parser.parse_args()

    root = Path("automation/runs") / args.dataset
    bug_root = root / f"Bug-{args.bug}"

    incomplete = []

    for method in METHODS:
        artifact = bug_root / method
        status_file = artifact / "status"

        if not status_file.is_file():
            incomplete.append(
                f"{method}: missing status"
            )
            continue

        status = status_file.read_text(
            encoding="utf-8"
        ).strip()

        if status != "DONE":
            incomplete.append(
                f"{method}: {status}"
            )

    if incomplete:
        print("INCOMPLETE")
        for item in incomplete:
            print(f"  {item}")
        return 1

    print("COMPLETE")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
