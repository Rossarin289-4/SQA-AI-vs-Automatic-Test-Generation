#!/bin/zsh

set -u

ROOT="$(cd "$(dirname "$0")/../.." && pwd)"

DATASET="${1:-Lang}"

ENV_FILE="$ROOT/automation/config/environment.sh"
METADATA="$ROOT/automation/datasets/$DATASET/bugs.csv"
CONFIG="$ROOT/automation/config/$DATASET.env"

echo "============================================================"
echo "SQA PROJECT 2026 — ENVIRONMENT CHECK"
echo "============================================================"
echo "Dataset: $DATASET"
echo

# ------------------------------------------------------------
# Environment
# ------------------------------------------------------------

if [[ -f "$ENV_FILE" ]]; then
    echo "[PASS] environment.sh"
    source "$ENV_FILE"
else
    echo "[FAIL] Missing environment.sh"
fi

echo
echo "----- JAVA -----"

if [[ -n "${JAVA_HOME:-}" && -x "$JAVA_HOME/bin/java" ]]; then
    echo "[PASS] JAVA_HOME=$JAVA_HOME"
else
    echo "[FAIL] Java is not available through JAVA_HOME"
fi

JAVA_VERSION="$(java -version 2>&1 | head -1)"

if [[ "$JAVA_VERSION" == *'version "11.'* ]]; then
    echo "[PASS] $JAVA_VERSION"
else
    echo "[FAIL] Expected Java 11"
    echo "       Actual: $JAVA_VERSION"
fi

echo
echo "----- PERL -----"

if [[ -n "${PERL5LIB:-}" ]]; then
    echo "[PASS] PERL5LIB=$PERL5LIB"
else
    echo "[FAIL] PERL5LIB is not configured"
fi

if perl -MString::Interpolate -e 'exit 0' >/dev/null 2>&1; then
    echo "[PASS] String::Interpolate"
else
    echo "[FAIL] String::Interpolate"
fi

echo
echo "----- DEFECTS4J -----"

if command -v defects4j >/dev/null 2>&1; then
    echo "[PASS] $(command -v defects4j)"
else
    echo "[FAIL] defects4j not found"
fi

if defects4j pids >/dev/null 2>&1; then
    echo "[PASS] defects4j pids"
else
    echo "[FAIL] defects4j pids"
fi

echo
echo "----- DATASET -----"

if [[ -f "$CONFIG" ]]; then
    echo "[PASS] Dataset config: $CONFIG"
else
    echo "[FAIL] Missing dataset config: $CONFIG"
fi

if [[ -f "$METADATA" ]]; then
    echo "[PASS] Dataset metadata: $METADATA"
else
    echo "[FAIL] Missing dataset metadata: $METADATA"
fi

if [[ -f "$METADATA" ]]; then

    python3 - "$METADATA" "$DATASET" <<'PY'
import csv
import sys

path = sys.argv[1]
dataset = sys.argv[2]

with open(path, newline="", encoding="utf-8") as f:
    rows = list(csv.DictReader(f))

ready = [
    row for row in rows
    if row.get("status") == "READY"
]

print(f"[INFO] Dataset rows: {len(rows)}")
print(f"[INFO] READY rows: {len(ready)}")

if not ready:
    print("[FAIL] No READY bugs found")
else:
    print("[PASS] Dataset contains READY bugs")

ids = []

for row in ready:
    bug_id = row.get("bug_id", "").strip()

    if bug_id:
        ids.append(bug_id)
    else:
        print("[FAIL] Found READY row with empty bug_id")

if len(ids) == len(set(ids)):
    print("[PASS] READY bug IDs are unique")
else:
    print("[FAIL] Duplicate READY bug IDs found")

if dataset == "Lang":
    if "2" not in ids:
        print("[PASS] Deprecated Lang-2 is excluded")
    else:
        print("[FAIL] Deprecated Lang-2 must not be included")

    expected = {
        "1", "3", "4", "5", "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15", "16", "17", "19",
        "20", "21", "22", "23", "24", "26", "27", "28",
        "29", "30", "31", "32", "33", "34", "35", "36",
        "37", "38", "39", "40", "41", "42", "43", "44",
        "45", "46", "47", "49", "50", "51", "52", "53",
        "54", "55", "56", "57", "58", "59", "60", "61",
        "62", "63", "64", "65"
    }

    actual = set(ids)

    if actual == expected:
        print("[PASS] Lang active bug ID set matches expected Defects4J set")
    else:
        print("[FAIL] Lang active bug ID set mismatch")

        missing = sorted(
            expected - actual,
            key=lambda x: int(x)
        )

        extra = sorted(
            actual - expected,
            key=lambda x: int(x)
        )

        print("Missing:", missing)
        print("Extra  :", extra)
PY
fi

echo
echo "============================================================"
echo "ENVIRONMENT CHECK COMPLETE"
echo "============================================================"
