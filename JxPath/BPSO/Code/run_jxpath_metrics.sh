#!/usr/bin/env bash
set -u

ROOT="/mnt/c/Users/User/SQA-AI-vs-Automatic-Test-Generation"
BUG="${1:-1}"
CANDIDATE_FILE="${2:-}"

WORK="/tmp/JxPath-${BUG}b"

if [ -n "$CANDIDATE_FILE" ]; then
    CANDIDATES="$CANDIDATE_FILE"
else
    CANDIDATES="$ROOT/JxPath/BPSO/Configuration/jxpath-${BUG}-candidates.txt"
fi
OUTPUT="$ROOT/JxPath/BPSO/Configuration/jxpath-${BUG}-candidates-full.csv"
INSTRUMENT="/tmp/jxpath-${BUG}-instrument.txt"

TARGET1="org.apache.commons.jxpath.ri.model.dom.DOMNodePointer"
TARGET2="org.apache.commons.jxpath.ri.model.jdom.JDOMNodePointer"

mkdir -p "$(dirname "$OUTPUT")"

if [ ! -d "$WORK" ]; then
    echo "[ERROR] Missing checkout: $WORK"
    exit 1
fi

if [ ! -f "$CANDIDATES" ]; then
    echo "[ERROR] Missing candidates: $CANDIDATES"
    exit 1
fi

cat > "$INSTRUMENT" <<EOT
$TARGET1
$TARGET2
EOT

if [ ! -f "$OUTPUT" ]; then
    echo "test_id,test_target,line_pct,condition_pct,execution_ms,status" > "$OUTPUT"
fi

python3 - "$OUTPUT" <<'PY'
import csv
import sys

path = sys.argv[1]

seen = set()

try:
    with open(path, newline="") as f:
        for row in csv.DictReader(f):
            seen.add(row["test_target"])
except FileNotFoundError:
    pass

with open("/tmp/jxpath_seen.txt", "w") as f:
    for x in sorted(seen):
        f.write(x + "\n")
PY

COUNT=0
SKIP=0

echo "=========================================="
echo "JxPath-${BUG} Candidate Metrics"
echo "Candidates : $(wc -l < "$CANDIDATES")"
echo "Output     : $OUTPUT"
echo "=========================================="

while IFS= read -r TEST_TARGET; do

    [ -z "$TEST_TARGET" ] && continue

    if grep -Fxq "$TEST_TARGET" /tmp/jxpath_seen.txt 2>/dev/null; then
        SKIP=$((SKIP + 1))
        continue
    fi

    COUNT=$((COUNT + 1))

    CLASS="${TEST_TARGET%%::*}"
    METHOD="${TEST_TARGET##*::}"

    echo
    echo "[$COUNT] $TEST_TARGET"

    START_NS=$(date +%s%N)

    LOG="/tmp/jxpath-${BUG}-coverage.log"

    set +e
    timeout 30s bash -c "
        cd '$WORK' &&
        defects4j coverage \
          -t '$TEST_TARGET' \
          -i '$INSTRUMENT'
    " > "$LOG" 2>&1
    RC=$?
    set -e

    END_NS=$(date +%s%N)
    ELAPSED_MS=$(( (END_NS - START_NS) / 1000000 ))

    STATUS="ERROR"
    LINE_PCT="0.00"
    CONDITION_PCT="0.00"

    if [ "$RC" -eq 124 ]; then
        STATUS="ERROR"
        echo "  STATUS = ERROR (timeout)"
    elif [ "$RC" -ne 0 ]; then
        STATUS="ERROR"
        echo "  STATUS = ERROR (exit=$RC)"
    else

        # failing_tests indicates whether the selected test failed.
        # It does NOT mean that coverage collection failed.
        if [ -f "$WORK/coverage.xml" ]; then
            if [ -f "$WORK/failing_tests" ] && [ -s "$WORK/failing_tests" ]; then
                STATUS="FAIL"
            else
                STATUS="OK"
            fi

            METRICS=$(python3 - "$WORK/coverage.xml" "$TARGET1" "$TARGET2" <<'PY'
import sys
import xml.etree.ElementTree as ET

xml_file = sys.argv[1]
targets = {sys.argv[2], sys.argv[3]}

root = ET.parse(xml_file).getroot()

lines_total = 0
lines_covered = 0
conditions_total = 0
conditions_covered = 0

for cls in root.findall(".//class"):
    if cls.attrib.get("name") not in targets:
        continue

    lines = cls.findall("./lines/line")

    for line in lines:
        lines_total += 1
        if int(line.attrib.get("hits", "0")) > 0:
            lines_covered += 1

        if line.attrib.get("branch") == "true":
            for condition in line.findall("./conditions/condition"):
                conditions_total += 1
                value = condition.attrib.get("coverage", "0%").rstrip("%")
                if float(value) > 0:
                    conditions_covered += 1

line_pct = (lines_covered / lines_total * 100) if lines_total else 0
condition_pct = (conditions_covered / conditions_total * 100) if conditions_total else 0

print(f"{line_pct:.2f},{condition_pct:.2f}")
PY
)

            LINE_PCT="${METRICS%,*}"
            CONDITION_PCT="${METRICS#*,}"

        fi

        echo "  STATUS    = $STATUS"
        echo "  LINE      = $LINE_PCT%"
        echo "  CONDITION = $CONDITION_PCT%"
        echo "  TIME      = ${ELAPSED_MS} ms"
    fi

    echo "$COUNT,$TEST_TARGET,$LINE_PCT,$CONDITION_PCT,$ELAPSED_MS,$STATUS" >> "$OUTPUT"

    echo "$TEST_TARGET" >> /tmp/jxpath_seen.txt

done < "$CANDIDATES"

echo
echo "=========================================="
echo "COMPLETE"
echo "Processed : $COUNT"
echo "Skipped   : $SKIP"
echo "CSV       : $OUTPUT"
echo "=========================================="

echo
echo "===== STATUS SUMMARY ====="
tail -n +2 "$OUTPUT" | cut -d',' -f6 | sort | uniq -c

echo
echo "===== CSV ROWS ====="
wc -l "$OUTPUT"
