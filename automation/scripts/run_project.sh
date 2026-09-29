#!/bin/bash

set -u

PROJECT="${1:-}"
START_BUG="${2:-}"
END_BUG="${3:-}"

if [ -z "$PROJECT" ] || [ -z "$START_BUG" ] || [ -z "$END_BUG" ]; then
    echo "Usage:"
    echo "$0 <project> <start_bug> <end_bug>"
    exit 1
fi

ROOT="$HOME/Documents/SQA_Project"

RUN_AI="$ROOT/automation/scripts/run_ai_test.sh"
COLLECT="$ROOT/automation/scripts/collect_result.sh"
FDR="$ROOT/automation/scripts/calculate_fdr.py"

echo "============================================================"
echo "Run Project"
echo "Project : $PROJECT"
echo "Bugs    : $START_BUG -> $END_BUG"
echo "============================================================"
echo ""

for (( BUG=START_BUG; BUG<=END_BUG; BUG++ ))
do

    echo "------------------------------------------------------------"
    echo "Processing ${PROJECT}-${BUG}"
    echo "------------------------------------------------------------"

    for METHOD in ChatGPT Gemini
    do

        TEST_DIR="$ROOT/$PROJECT/$METHOD/TestCode"

        if [ ! -d "$TEST_DIR" ]; then
            echo "[SKIP] $PROJECT-$BUG $METHOD"
            echo "       TestCode directory not found."
            echo ""
            continue
        fi

        TEST_FILE=""

        for FILE in "$TEST_DIR"/*.java
        do
            [ -f "$FILE" ] || continue

            NAME=$(basename "$FILE")

            if [[ "$NAME" == "${PROJECT}${BUG}"* ]] || \
               [[ "$NAME" == "${PROJECT}-${BUG}"* ]]; then
                TEST_FILE="$FILE"
                break
            fi
        done

        if [ -z "$TEST_FILE" ]; then
            echo "[SKIP] $PROJECT-$BUG $METHOD"
            echo "       TestCode not found."
            echo ""
            continue
        fi

        echo "[RUN] $PROJECT-$BUG $METHOD"
        echo "      TestCode: $(basename "$TEST_FILE")"

        "$RUN_AI" "$PROJECT" "$BUG" "$METHOD"

        if [ $? -ne 0 ]; then
            echo "[ERROR] $PROJECT-$BUG $METHOD failed."
            exit 1
        fi

        echo ""
    done

done

echo "============================================================"
echo "Collecting execution results..."
echo "============================================================"

"$COLLECT" "$PROJECT"

if [ $? -ne 0 ]; then
    echo "ERROR: collect_result.sh failed."
    exit 1
fi

echo ""

echo "============================================================"
echo "Calculating FDR..."
echo "============================================================"

"$FDR" "$PROJECT"

if [ $? -ne 0 ]; then
    echo "ERROR: calculate_fdr.py failed."
    exit 1
fi

echo ""

echo "============================================================"
echo "PROJECT RUN COMPLETE"
echo "Project : $PROJECT"
echo "============================================================"
