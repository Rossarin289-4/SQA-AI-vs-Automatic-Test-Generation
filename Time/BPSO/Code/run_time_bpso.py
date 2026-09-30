#!/usr/bin/env python3

import csv
import os
import re
import shutil
import subprocess
import sys
import time
from pathlib import Path

ROOT = Path.cwd()
D4J = Path.home() / "defects4j/framework/bin/defects4j"

BUGS = list(range(1, 21)) + [22, 23, 24, 25, 26, 27]

ROUND = int(sys.argv[1]) if len(sys.argv) > 1 else 1
ONLY_BUG = int(sys.argv[2]) if len(sys.argv) > 2 else None

SEED = 20260928 + (ROUND - 1)

CONFIG = ROOT / "Time/BPSO/Configuration"
RESULT = ROOT / f"Time/BPSO/Result_Round{ROUND}"
PROJECT_ROOT = Path("/tmp")

RESULT.mkdir(parents=True, exist_ok=True)


def run(cmd, cwd=None, timeout=900):
    start = time.time()

    p = subprocess.run(
        cmd,
        cwd=cwd,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
        timeout=timeout
    )

    elapsed = time.time() - start
    return p.returncode, p.stdout, elapsed


def failing_tests(output):
    m = re.search(r"Failing tests:\s*(\d+)", output)
    return int(m.group(1)) if m else 0


def coverage_values(output):
    line = re.search(
        r"Line coverage:\s*([0-9.]+)%",
        output
    )

    condition = re.search(
        r"Condition coverage:\s*([0-9.]+)%",
        output
    )

    return (
        float(line.group(1)) if line else None,
        float(condition.group(1)) if condition else None
    )


def checkout(bug, version):
    work = PROJECT_ROOT / f"Time-{bug}{version}"

    if work.exists():
        shutil.rmtree(work)

    suffix = "b" if version == "b" else "f"

    cmd = [
        str(D4J),
        "checkout",
        "-p", "Time",
        "-v", f"{bug}{suffix}",
        "-w", str(work)
    ]

    code, out, _ = run(cmd)

    if code != 0:
        raise RuntimeError(
            f"Checkout failed: Time-{bug}{suffix}\n{out}"
        )

    return work


def read_selection(bug):
    path = RESULT / f"time-{bug}-selection.csv"

    if not path.exists():
        raise RuntimeError(f"Missing selection: {path}")

    rows = []

    with path.open() as f:
        reader = csv.DictReader(f)

        for row in reader:
            rows.append(row)

    if len(rows) != 3:
        raise RuntimeError(
            f"Time-{bug}: expected 3 selected tests, got {len(rows)}"
        )

    return rows


def run_test(work, target):
    return run(
        [
            str(D4J),
            "test",
            "-w", str(work),
            "-t", target
        ],
        timeout=900
    )


def run_coverage(work, target):
    return run(
        [
            str(D4J),
            "coverage",
            "-w", str(work),
            "-t", target
        ],
        timeout=900
    )


def write_test_result(path, bug, rows, buggy_results, fixed_results):
    with path.open("w", newline="") as f:

        fields = [
            "bug_id",
            "test_id",
            "test_target",
            "buggy_status",
            "buggy_failures",
            "fixed_status",
            "fixed_failures",
            "fault_detected",
            "buggy_line_pct",
            "buggy_condition_pct",
            "fixed_line_pct",
            "fixed_condition_pct",
            "buggy_execution_ms",
            "fixed_execution_ms"
        ]

        writer = csv.DictWriter(f, fieldnames=fields)
        writer.writeheader()

        for i, row in enumerate(rows):

            br = buggy_results[i]
            fr = fixed_results[i]

            buggy_fail = failing_tests(br["output"])
            fixed_fail = failing_tests(fr["output"])

            writer.writerow({
                "bug_id": bug,
                "test_id": row["test_id"],
                "test_target": row["test_target"],
                "buggy_status":
                    "OK" if br["returncode"] == 0 else "ERROR",
                "buggy_failures": buggy_fail,
                "fixed_status":
                    "OK" if fr["returncode"] == 0 else "ERROR",
                "fixed_failures": fixed_fail,
                "fault_detected":
                    "YES"
                    if br["returncode"] == 0
                    and fr["returncode"] == 0
                    and buggy_fail > 0
                    and fixed_fail == 0
                    else "NO",
                "buggy_line_pct": br["line"],
                "buggy_condition_pct": br["condition"],
                "fixed_line_pct": fr["line"],
                "fixed_condition_pct": fr["condition"],
                "buggy_execution_ms":
                    round(br["elapsed"] * 1000),
                "fixed_execution_ms":
                    round(fr["elapsed"] * 1000)
            })


def main_bug(bug):

    print()
    print("=" * 60)
    print(f"Time-{bug} | Round {ROUND} | Seed {SEED}")
    print("=" * 60)

    selection_path = (
        ROOT /
        f"Time/BPSO/Result_Round{ROUND}/time-{bug}-selection.csv"
    )

    if not selection_path.exists():

        selector_cmd = [
            "java",
            "-cp",
            "/tmp/time-bpso-classes",
            "BPSOTestSelector",
            str(CONFIG / f"time-{bug}-candidates.csv"),
            str(selection_path),
            str(SEED)
        ]

        code, out, _ = run(selector_cmd)

        print(out)

        if code != 0:
            raise RuntimeError(
                f"BPSO selector failed for Time-{bug}"
            )

    rows = read_selection(bug)

    buggy = checkout(bug, "b")
    fixed = checkout(bug, "f")

    buggy_results = []
    fixed_results = []

    for n, row in enumerate(rows, 1):

        target = row["test_target"]

        print(f"[{n}/3] {target}")

        rc_b, out_b, elapsed_b = run_test(buggy, target)
        rc_f, out_f, elapsed_f = run_test(fixed, target)

        line_b, cond_b = coverage_values(
            run_coverage(buggy, target)[1]
        )

        line_f, cond_f = coverage_values(
            run_coverage(fixed, target)[1]
        )

        buggy_results.append({
            "returncode": rc_b,
            "output": out_b,
            "elapsed": elapsed_b,
            "line": line_b,
            "condition": cond_b
        })

        fixed_results.append({
            "returncode": rc_f,
            "output": out_f,
            "elapsed": elapsed_f,
            "line": line_f,
            "condition": cond_f
        })

    output = RESULT / f"time-{bug}-results.csv"

    write_test_result(
        output,
        bug,
        rows,
        buggy_results,
        fixed_results
    )

    detected = 0

    for i in range(3):

        bf = failing_tests(buggy_results[i]["output"])
        ff = failing_tests(fixed_results[i]["output"])

        if (
            buggy_results[i]["returncode"] == 0
            and fixed_results[i]["returncode"] == 0
            and bf > 0
            and ff == 0
        ):
            detected += 1

    print()
    print(f"Time-{bug} COMPLETE")
    print(f"Selected tests : 3")
    print(f"Detected tests : {detected}")
    print(f"Result         : {output}")


def main():

    bugs = [ONLY_BUG] if ONLY_BUG else BUGS

    for bug in bugs:
        main_bug(bug)

    print()
    print("=" * 60)
    print(f"ROUND {ROUND} COMPLETE")
    print("=" * 60)


if __name__ == "__main__":
    main()
