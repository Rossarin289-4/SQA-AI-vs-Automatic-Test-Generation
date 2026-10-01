#!/usr/bin/env python3
import csv
import hashlib
import json
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
METHODS = ["ChatGPT", "Gemini", "SA", "BPSO"]
REQUIRED = [
    "experiment.json", "prompt.txt", "raw_output.txt", "generated_test.java",
    "evaluation.json", "evaluation.csv", "checksums.sha256",
    "Buggy/execution.txt", "Buggy/coverage.csv",
    "Fixed/execution.txt", "Fixed/coverage.csv",
]
TRIGGERS = ["1.23", "3.40282354e+38", "1.797693134862315759e+308"]
EXPECTED = {
    "ChatGPT": (5, 4, 80.0),
    "Gemini": (6, 6, 100.0),
    "SA": (12, 0, 0.0),
    "BPSO": (12, 1, 8.33),
}

fail = 0
print("==============================================")
print("ARTIFACT CONTRACT CHECK")
print("==============================================")

# Required canonical files
for m in METHODS:
    base = ROOT / "Lang" / m / "Result" / "Bug-3"
    for rel in REQUIRED:
        if (base / rel).is_file():
            continue
        print(f"[FAIL] {m}: missing {rel}")
        fail = 1

# Coverage schema and expected values
for m in METHODS:
    base = ROOT / "Lang" / m / "Result" / "Bug-3"
    for version in ("Buggy", "Fixed"):
        p = base / version / "coverage.csv"
        try:
            with p.open(newline="", encoding="utf-8") as f:
                rows = list(csv.reader(f))
            if rows != [
                ["metric", "value"],
                ["line_coverage", rows[1][1]],
                ["branch_coverage", rows[2][1]],
            ] or len(rows) != 3:
                raise ValueError("schema mismatch")
            if rows[1][0] != "line_coverage" or rows[2][0] != "branch_coverage":
                raise ValueError("metric mismatch")
        except Exception as e:
            print(f"[FAIL] {m}/{version}/coverage.csv: {e}")
            fail = 1

# Evaluation consistency
for m, (tests, detected, fdr) in EXPECTED.items():
    base = ROOT / "Lang" / m / "Result" / "Bug-3"
    try:
        ev = json.loads((base / "evaluation.json").read_text(encoding="utf-8"))
        if (ev["project"], ev["bug"], ev["method"], ev["status"]) != ("Lang", "3", m, "DONE"):
            raise ValueError("identity/status mismatch")
        if (ev["tests_generated"], ev["evaluated_tests"], ev["detected_tests"]) != (tests, tests, detected):
            raise ValueError("test counts mismatch")
        if float(ev["FDR"]) != fdr:
            raise ValueError("FDR mismatch")
        with (base / "evaluation.csv").open(newline="", encoding="utf-8") as f:
            rows = list(csv.DictReader(f))
        if len(rows) != 1 or rows[0]["method"] != m or int(rows[0]["tests_generated"]) != tests:
            raise ValueError("evaluation.csv mismatch")
    except Exception as e:
        print(f"[FAIL] {m}: evaluation mismatch: {e}")
        fail = 1

# Checksum manifests
for m in METHODS:
    manifest = ROOT / "Lang" / m / "Result" / "Bug-3" / "checksums.sha256"
    try:
        for line in manifest.read_text(encoding="utf-8").splitlines():
            digest, rel = line.split("  ", 1)
            p = ROOT / rel
            if not p.is_file():
                raise FileNotFoundError(rel)
            actual = hashlib.sha256(p.read_bytes()).hexdigest()
            if actual != digest:
                raise ValueError(f"checksum mismatch: {rel}")
    except Exception as e:
        print(f"[FAIL] {m}: checksum validation: {e}")
        fail = 1

# Exact original trigger values must not occur in generated/evaluated test sources.
for m in METHODS:
    base = ROOT / "Lang" / m
    candidates = list(base.glob("Result/Bug-3/generated_test.java")) + list(base.glob("TestCode/*.java")) + list(base.glob("Test/*.java"))
    for p in candidates:
        text = p.read_text(encoding="utf-8", errors="ignore")
        for trigger in TRIGGERS:
            if trigger in text and trigger not in ("1.23",):
                # handled below by exact token check; substring matches like 1.234... are not exclusions
                pass
            if f'"{trigger}"' in text:
                print(f"[FAIL] {m}: original trigger value found in {p}: {trigger}")
                fail = 1

# Root/results master CSV must be byte-identical.
root_csv = ROOT / "master_results.csv"
result_csv = ROOT / "results" / "master_results.csv"
if root_csv.read_bytes() != result_csv.read_bytes():
    print("[FAIL] root master_results.csv differs from results/master_results.csv")
    fail = 1
else:
    print("[PASS] master_results.csv copies are identical")

print()
print("ARTIFACT CONTRACT CHECK:", "PASS" if fail == 0 else "FAIL")
sys.exit(fail)
