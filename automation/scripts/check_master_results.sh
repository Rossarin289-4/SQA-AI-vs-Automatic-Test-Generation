#!/usr/bin/env python3

import csv
import sys
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
CSV_FILE = ROOT / "results" / "master_results.csv"

EXPECTED_HEADER = [
    "project",
    "bug",
    "method",
    "tests",
    "fdr",
    "line_cov_buggy",
    "branch_cov_buggy",
    "line_cov_fixed",
    "branch_cov_fixed",
    "gen_time",
    "exec_time",
    "total_time",
    "status",
]

EXPECTED_ROWS = {
    "ChatGPT": [
        "Lang", "3", "ChatGPT", "5", "80.0",
        "14.2", "8.7", "17.9", "11.5",
        "", "6.0", "", "DONE"
    ],
    "Gemini": [
        "Lang", "3", "Gemini", "6", "100.0",
        "13.4", "7.2", "15.7", "8.9",
        "", "", "", "DONE"
    ],
    "SA": [
        "Lang", "3", "SA", "12", "0.0",
        "28.7", "20.4", "29.1", "20.7",
        "0.016639292", "", "", "DONE"
    ],
    "BPSO": [
        "Lang", "3", "BPSO", "12", "8.33",
        "25.2", "18.0", "25.6", "18.3",
        "0.643467209", "0.390891", "1.034358209", "DONE"
    ],
}

print("==============================================")
print("MASTER RESULTS CHECK")
print("==============================================")

fail = 0

# --------------------------------------------------
# File
# --------------------------------------------------

if not CSV_FILE.is_file():
    print(f"[FAIL] Missing file: {CSV_FILE}")
    sys.exit(1)

print()
print("----- FILE -----")
print(f"[PASS] {CSV_FILE}")

# --------------------------------------------------
# Read CSV
# --------------------------------------------------

try:
    with CSV_FILE.open("r", newline="", encoding="utf-8") as f:
        reader = csv.reader(f)
        rows = list(reader)
except Exception as e:
    print(f"[FAIL] Cannot read CSV: {e}")
    sys.exit(1)

if not rows:
    print("[FAIL] CSV is empty")
    sys.exit(1)

header = rows[0]
data = rows[1:]

# --------------------------------------------------
# Header
# --------------------------------------------------

print()
print("----- HEADER -----")

if header == EXPECTED_HEADER:
    print("[PASS] MASTER CSV HEADER")
else:
    print("[FAIL] MASTER CSV HEADER")
    print("Expected:", EXPECTED_HEADER)
    print("Actual  :", header)
    fail = 1

# --------------------------------------------------
# Row count
# --------------------------------------------------

print()
print("----- DATASET -----")

if len(data) == 4:
    print("[PASS] Row count = 4")
else:
    print(f"[FAIL] Row count = {len(data)} (expected 4)")
    fail = 1

# --------------------------------------------------
# Methods
# --------------------------------------------------

methods = [row[2] for row in data if len(row) >= 3]

print()
print("Methods:")
for method in methods:
    print(method)

expected_methods = ["ChatGPT", "Gemini", "SA", "BPSO"]

if methods == expected_methods:
    print("[PASS] All four methods present in expected order")
else:
    print("[FAIL] Method set/order mismatch")
    print("Expected:", expected_methods)
    print("Actual  :", methods)
    fail = 1

# --------------------------------------------------
# Validate rows
# --------------------------------------------------

print()
print("----- EXPECTED RESULTS -----")

for method in expected_methods:

    matching = [row for row in data if len(row) >= 3 and row[2] == method]

    if len(matching) != 1:
        print(f"[FAIL] {method}: expected exactly one row, found {len(matching)}")
        fail = 1
        continue

    actual = matching[0]
    expected = EXPECTED_ROWS[method]

    if actual == expected:
        print(f"[PASS] {method}")
    else:
        print(f"[FAIL] {method}")
        print("Expected:", expected)
        print("Actual  :", actual)
        fail = 1

# --------------------------------------------------
# Status
# --------------------------------------------------

print()
print("----- STATUS -----")

bad_status = []

for row in data:
    if len(row) != len(EXPECTED_HEADER):
        bad_status.append(row)
        continue

    if row[12] != "DONE":
        bad_status.append(row)

if not bad_status:
    print("[PASS] All experiments are DONE")
else:
    print("[FAIL] Experiments not DONE:")
    for row in bad_status:
        print(",".join(row))
    fail = 1

# --------------------------------------------------
# Final
# --------------------------------------------------

print()
print("----- FINAL RESULT -----")

if fail == 0:
    print("MASTER RESULTS CHECK: PASS")
    sys.exit(0)
else:
    print("MASTER RESULTS CHECK: FAIL")
    sys.exit(1)
