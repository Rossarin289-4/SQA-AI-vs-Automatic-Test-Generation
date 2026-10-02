#!/usr/bin/env python3

import argparse
import shutil
import subprocess
from pathlib import Path


ROOT = Path(
    "/Users/fangfang/Documents/SQA_Project_2026"
).resolve()

METHODS = [
    "ChatGPT",
    "Gemini",
    "SA",
    "BPSO",
]


def run_command(command):
    return subprocess.run(
        command,
        cwd=str(ROOT),
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )


def check_bug_complete(dataset, bug):
    checker = ROOT / "automation/scripts/check_bug_complete.py"

    result = run_command([
        "python3",
        str(checker),
        "--dataset",
        dataset,
        "--bug",
        str(bug),
    ])

    print(result.stdout)

    return result.returncode == 0


def validate_all_done_slots(dataset, bug):
    validator = ROOT / "automation/scripts/validate_done_slot.py"

    print("=" * 64)
    print("VALIDATING ALL DONE SLOTS")
    print("=" * 64)

    all_valid = True

    for method in METHODS:
        artifact_dir = (
            ROOT
            / "automation/runs"
            / dataset
            / f"Bug-{bug}"
            / method
        )

        print()
        print(f"[CHECK] {dataset} Bug-{bug} {method}")

        result = run_command([
            "python3",
            str(validator),
            "--artifact-dir",
            str(artifact_dir),
            "--method",
            method,
        ])

        print(result.stdout)

        if result.returncode != 0:
            print(
                f"[STOP] Invalid DONE artifact: {method}"
            )
            all_valid = False

    return all_valid


def safe_workspace_path(dataset, bug, version):
    workspace = (
        ROOT
        / "workspaces"
        / f"{dataset}-{bug}-{version}"
    ).resolve()

    workspaces_root = (
        ROOT / "workspaces"
    ).resolve()

    if workspaces_root not in workspace.parents:
        raise RuntimeError(
            f"Unsafe workspace path: {workspace}"
        )

    expected_name = f"{dataset}-{bug}-{version}"

    if workspace.name != expected_name:
        raise RuntimeError(
            f"Unexpected workspace name: {workspace.name}"
        )

    return workspace


def main():
    parser = argparse.ArgumentParser(
        description=(
            "Safely clean completed Defects4J bug workspaces."
        )
    )

    parser.add_argument(
        "--dataset",
        required=True,
    )

    parser.add_argument(
        "--bug",
        required=True,
    )

    parser.add_argument(
        "--dry-run",
        action="store_true",
        help="Show what would be deleted without deleting.",
    )

    args = parser.parse_args()

    dataset = args.dataset
    bug = args.bug

    print("=" * 64)
    print("SAFE COMPLETED BUG CLEANUP")
    print("=" * 64)
    print(f"Dataset : {dataset}")
    print(f"Bug     : {bug}")
    print(f"Dry run : {args.dry_run}")

    print()
    print("STEP 1 — Checking four-method completion...")

    if not check_bug_complete(dataset, bug):
        print()
        print("[STOP] Bug is not COMPLETE.")
        print("[STOP] No workspace will be deleted.")
        return 1

    print()
    print("STEP 2 — Validating every DONE artifact...")

    if not validate_all_done_slots(dataset, bug):
        print()
        print("[STOP] One or more DONE artifacts are invalid.")
        print("[STOP] No workspace will be deleted.")
        return 1

    workspaces = [
        safe_workspace_path(
            dataset,
            bug,
            "buggy",
        ),
        safe_workspace_path(
            dataset,
            bug,
            "fixed",
        ),
    ]

    print()
    print("STEP 3 — Workspace candidates:")

    existing = []

    for workspace in workspaces:
        if workspace.is_dir():
            print(f"  - {workspace}")
            existing.append(workspace)
        else:
            print(f"  - {workspace} [not found]")

    if not existing:
        print()
        print("Nothing to clean.")
        return 0

    print()

    if args.dry_run:
        print("[DRY-RUN] No files were deleted.")
        return 0

    print("STEP 4 — Deleting ONLY completed bug workspaces...")

    for workspace in existing:
        print(f"  Removing: {workspace}")
        shutil.rmtree(workspace)

    print()
    print("[PASS] Completed bug cleanup finished.")
    print()
    print("Result artifacts were NOT deleted.")
    print(
        "Results remain at: "
        f"{ROOT}/automation/runs/{dataset}/Bug-{bug}"
    )

    return 0


if __name__ == "__main__":
    main()
