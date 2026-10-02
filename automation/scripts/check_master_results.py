#!/usr/bin/env python3

import csv
import sys
from pathlib import Path


METHODS = [
    "ChatGPT",
    "Gemini",
    "SA",
    "BPSO",
]

EXPECTED_FIELDS = [
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

ALLOWED_STATUSES = {
    "PENDING",
    "PENDING_ARTIFACT",
    "PENDING_GENERATOR",
    "GENERATING",
    "COMPILED",
    "EXECUTING_BUGGY",
    "EXECUTING_FIXED",
    "EVALUATING",
    "DONE",
    "FAILED",
}


def load_csv(path):
    with open(path, newline="", encoding="utf-8") as f:
        return list(csv.DictReader(f))


def load_metadata(path):
    with open(path, newline="", encoding="utf-8") as f:
        return list(csv.DictReader(f))


def slot(project, bug_id, method):
    return (
        str(project),
        str(bug_id),
        str(method),
    )


def main():
    if len(sys.argv) != 3:
        print(
            "Usage: check_master_results.py "
            "<metadata.csv> <master_results.csv>"
        )
        return 2

    metadata_path = Path(sys.argv[1]).resolve()
    master_path = Path(sys.argv[2]).resolve()

    issues = 0

    print("============================================================")
    print("MASTER RESULTS CHECK")
    print("============================================================")

    # ---------------------------------------------------------
    # Metadata
    # ---------------------------------------------------------

    if not metadata_path.is_file():
        print(f"[FAIL] Missing metadata: {metadata_path}")
        return 1

    metadata = load_metadata(metadata_path)

    ready_rows = [
        row
        for row in metadata
        if row.get("status") == "READY"
    ]

    print(f"[PASS] Metadata rows: {len(ready_rows)}")

    if len(ready_rows) != 61:
        print(
            f"[FAIL] Expected 61 READY metadata rows, "
            f"found {len(ready_rows)}"
        )
        issues += 1

    metadata_slots = set()

    for row in ready_rows:
        bug_id = row.get("bug_id", "").strip()

        if not bug_id:
            print("[FAIL] Metadata contains empty bug_id")
            issues += 1
            continue

        for method in METHODS:
            metadata_slots.add(
                slot("Lang", bug_id, method)
            )

    # ---------------------------------------------------------
    # Master CSV existence
    # ---------------------------------------------------------

    if not master_path.is_file():
        print(f"[FAIL] Missing master CSV: {master_path}")
        return 1

    rows = load_csv(master_path)

    print(f"[PASS] {master_path}")

    # ---------------------------------------------------------
    # Header
    # ---------------------------------------------------------

    actual_fields = list(rows[0].keys()) if rows else []

    if actual_fields == EXPECTED_FIELDS:
        print("[PASS] Master CSV header")
    else:
        print("[FAIL] Master CSV header")
        print("Expected:", EXPECTED_FIELDS)
        print("Actual  :", actual_fields)
        issues += 1

    # ---------------------------------------------------------
    # Row count
    # ---------------------------------------------------------

    expected_count = len(metadata_slots)
    actual_count = len(rows)

    print(
        f"Expected rows: {expected_count}"
    )
    print(
        f"Actual rows:   {actual_count}"
    )

    if actual_count == expected_count:
        print("[PASS] Row count")
    else:
        print("[FAIL] Row count")
        issues += 1

    # ---------------------------------------------------------
    # Validate each row
    # ---------------------------------------------------------

    actual_slots = []
    invalid_rows = []

    for index, row in enumerate(rows, 1):
        project = row.get("project", "").strip()
        bug_id = row.get("bug_id", "").strip()
        method = row.get("method", "").strip()
        status = row.get("status", "").strip()

        current = slot(
            project,
            bug_id,
            method
        )

        actual_slots.append(current)

        if not project:
            invalid_rows.append(
                (index, "empty project")
            )

        if not bug_id:
            invalid_rows.append(
                (index, "empty bug_id")
            )

        if not method:
            invalid_rows.append(
                (index, "empty method")
            )
        elif method not in METHODS:
            invalid_rows.append(
                (index, f"unknown method={method}")
            )

        if not status:
            invalid_rows.append(
                (index, "empty status")
            )
        elif status not in ALLOWED_STATUSES:
            invalid_rows.append(
                (index, f"unknown status={status}")
            )

    if invalid_rows:
        print("[FAIL] Invalid master rows")

        for index, reason in invalid_rows[:20]:
            print(
                f"       row {index}: {reason}"
            )

        if len(invalid_rows) > 20:
            print(
                f"       ... {len(invalid_rows) - 20} more"
            )

        issues += 1
    else:
        print("[PASS] Row field validation")

    # ---------------------------------------------------------
    # Duplicate slots
    # ---------------------------------------------------------

    duplicate_slots = set()

    seen = set()

    for current in actual_slots:
        if current in seen:
            duplicate_slots.add(current)
        else:
            seen.add(current)

    if duplicate_slots:
        print("[FAIL] Duplicate experiment slots:")

        for current in sorted(
            duplicate_slots,
            key=lambda x: (
                x[0],
                int(x[1]) if x[1].isdigit() else 999999,
                x[2],
            ),
        ):
            print("      ", current)

        issues += 1
    else:
        print("[PASS] No duplicate experiment slots")

    # ---------------------------------------------------------
    # Missing / unexpected slots
    # ---------------------------------------------------------

    actual_slot_set = set(actual_slots)

    missing = metadata_slots - actual_slot_set
    unexpected = actual_slot_set - metadata_slots

    if missing:
        print("[FAIL] Missing experiment slots:")

        for current in sorted(
            missing,
            key=lambda x: (
                x[0],
                int(x[1]) if x[1].isdigit() else 999999,
                x[2],
            ),
        ):
            print("      ", current)

        issues += 1
    else:
        print("[PASS] All expected experiment slots present")

    if unexpected:
        print("[FAIL] Unexpected experiment slots:")

        for current in sorted(
            unexpected,
            key=lambda x: (
                x[0],
                int(x[1]) if x[1].isdigit() else 999999,
                x[2],
            ),
        ):
            print("      ", current)

        issues += 1
    else:
        print("[PASS] No unexpected experiment slots")

    # ---------------------------------------------------------
    # Status summary
    # ---------------------------------------------------------

    status_counts = {}

    for row in rows:
        status = row.get("status", "").strip()

        status_counts[status] = (
            status_counts.get(status, 0) + 1
        )

    print()
    print("----- STATUS -----")

    if status_counts:
        for status in sorted(status_counts):
            print(
                f"{status}: {status_counts[status]}"
            )
    else:
        print("No rows")

    # ---------------------------------------------------------
    # DONE validation
    # ---------------------------------------------------------

    done_invalid = []

    for index, row in enumerate(rows, 2):
        status = row.get("status", "").strip()

        if status != "DONE":
            continue

        required_numeric = [
            "total_tests",
            "evaluated_tests",
            "detected_tests",
            "fdr_percent",
            "buggy_line_coverage",
            "buggy_branch_coverage",
            "fixed_line_coverage",
            "fixed_branch_coverage",
            "total_time_seconds",
        ]

        for field in required_numeric:
            value = row.get(field, "").strip()

            if value == "":
                done_invalid.append(
                    (
                        index,
                        row.get("bug_id", ""),
                        row.get("method", ""),
                        field,
                    )
                )

    if done_invalid:
        print()
        print("[FAIL] DONE rows with missing required values")

        for item in done_invalid[:20]:
            print(
                f"       row={item[0]} "
                f"bug={item[1]} "
                f"method={item[2]} "
                f"field={item[3]}"
            )

        if len(done_invalid) > 20:
            print(
                f"       ... {len(done_invalid) - 20} more"
            )

        issues += 1
    else:
        print()
        print("[PASS] DONE rows contain required result fields")

    # ---------------------------------------------------------
    # Final result
    # ---------------------------------------------------------

    print()
    print("============================================================")

    if issues == 0:
        print("MASTER RESULTS CHECK: PASS")
        print("============================================================")
        return 0

    print(
        f"MASTER RESULTS CHECK: FAIL ({issues} issue(s))"
    )
    print("============================================================")

    return 1


if __name__ == "__main__":
    sys.exit(main())
