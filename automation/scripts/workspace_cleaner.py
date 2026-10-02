#!/usr/bin/env python3

import argparse
import shutil
import subprocess
import sys
from pathlib import Path


CLEANUP_ITEMS = [
    "target",
    "all_tests",
    "failing_tests",
]


def remove_path(path: Path):
    if not path.exists():
        return False

    if path.is_dir() and not path.is_symlink():
        shutil.rmtree(path)
    else:
        path.unlink()

    return True


def clean_workspace(workspace: Path):
    if not workspace.is_dir():
        raise FileNotFoundError(
            f"Workspace does not exist: {workspace}"
        )

    removed = []

    # Defects4J / Maven generated artifacts
    for name in CLEANUP_ITEMS:
        target = workspace / name

        if remove_path(target):
            removed.append(str(target))

    # Generated JUnit test files are handled explicitly by the executor.
    # This cleaner intentionally does NOT delete source/test files,
    # because user/project source files must never be removed blindly.

    return removed


def git_status(workspace: Path):
    result = subprocess.run(
        ["git", "status", "--short"],
        cwd=str(workspace),
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )

    return result.stdout.strip()


def main():
    parser = argparse.ArgumentParser(
        description="Clean Defects4J temporary artifacts from a workspace."
    )

    parser.add_argument(
        "--workspace",
        required=True,
        help="Defects4J workspace to clean.",
    )

    parser.add_argument(
        "--strict",
        action="store_true",
        help="Return error if git status is still dirty after cleanup.",
    )

    args = parser.parse_args()

    workspace = Path(args.workspace).resolve()

    print("=" * 64)
    print("WORKSPACE CLEANER")
    print("=" * 64)
    print(f"workspace : {workspace}")

    removed = clean_workspace(workspace)

    print()
    print("Removed:")
    if removed:
        for item in removed:
            print(f"  - {item}")
    else:
        print("  (nothing)")

    clean_status = git_status(workspace)

    print()
    print("Git status:")
    if clean_status:
        print(clean_status)
    else:
        print("  CLEAN")

    if args.strict and clean_status:
        print()
        print("ERROR: Workspace is still dirty.")
        sys.exit(1)

    print()
    print("OK: Workspace cleanup complete.")


if __name__ == "__main__":
    main()
