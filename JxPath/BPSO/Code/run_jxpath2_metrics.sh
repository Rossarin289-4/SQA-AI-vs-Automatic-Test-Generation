#!/usr/bin/env bash
set -u

WORK="/tmp/JxPath-2b"
CANDIDATES="JxPath/BPSO/Configuration/jxpath-2-candidates.txt"
OUT="JxPath/BPSO/Configuration/jxpath-2-candidates-full.csv"
INSTR="/tmp/jxpath-2-instrument.txt"

echo "test_target,status,line_coverage,condition_coverage,line_total,line_covered,condition_total,condition_covered" > "$OUT"

while IFS= read -r TEST_TARGET; do
    [ -z "$TEST_TARGET" ] && continue

    LOG=$(mktemp)

    timeout 30s bash -c "
        cd '$WORK' &&
        rm -f coverage.xml failing_tests &&
        defects4j coverage \
          -t '$TEST_TARGET' \
          -i '$INSTR'
    " >"$LOG" 2>&1

    RC=$?

    if [ "$RC" -eq 124 ]; then
        echo "\"$TEST_TARGET\",ERROR,0,0,0,0,0,0" >> "$OUT"
        rm -f "$LOG"
        continue
    fi

    if grep -q "Some tests failed" "$LOG"; then
        STATUS="FAIL"
    else
        STATUS="OK"
    fi

    LINE_TOTAL=$(grep "Lines total:" "$LOG" | awk '{print $3}')
    LINE_COVERED=$(grep "Lines covered:" "$LOG" | awk '{print $3}')
    CONDITION_TOTAL=$(grep "Conditions total:" "$LOG" | awk '{print $3}')
    CONDITION_COVERED=$(grep "Conditions covered:" "$LOG" | awk '{print $3}')
    LINE_COV=$(grep "Line coverage:" "$LOG" | awk '{print $3}' | tr -d '%')
    CONDITION_COV=$(grep "Condition coverage:" "$LOG" | awk '{print $3}' | tr -d '%')

    if [ -z "$LINE_TOTAL" ] || [ -z "$LINE_COVERED" ] || \
       [ -z "$CONDITION_TOTAL" ] || [ -z "$CONDITION_COVERED" ]; then
        echo "\"$TEST_TARGET\",ERROR,0,0,0,0,0,0" >> "$OUT"
    else
        echo "\"$TEST_TARGET\",$STATUS,$LINE_COV,$CONDITION_COV,$LINE_TOTAL,$LINE_COVERED,$CONDITION_TOTAL,$CONDITION_COVERED" >> "$OUT"
    fi

    rm -f "$LOG"

done < "$CANDIDATES"

echo "Finished: $OUT"
