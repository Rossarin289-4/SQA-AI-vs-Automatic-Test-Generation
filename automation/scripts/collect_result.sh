#!/bin/bash

set -u

PROJECT="${1:-}"

if [ -z "$PROJECT" ]; then
    echo "Usage:"
    echo "$0 <project>"
    exit 1
fi

ROOT="$HOME/Documents/SQA_Project"

RESULT_DIR="$ROOT/automation/results/$PROJECT"
OUTPUT_CSV="$RESULT_DIR/execution_results.csv"

mkdir -p "$RESULT_DIR"

echo "============================================================"
echo "Collect Execution Results"
echo "Project : $PROJECT"
echo "============================================================"
echo ""

echo "project,bug,method,environment,test_method,status,execution_file" > "$OUTPUT_CSV"

for METHOD in ChatGPT Gemini
do

    EXEC_DIR="$ROOT/$PROJECT/$METHOD/Result/Execution"

    if [ ! -d "$EXEC_DIR" ]; then
        continue
    fi

    for BUGGY_FILE in "$EXEC_DIR"/*_buggy.txt
    do

        [ -f "$BUGGY_FILE" ] || continue

        BASE_NAME=$(basename "$BUGGY_FILE")
        BUG=${BASE_NAME#${PROJECT}-}
        BUG=${BUG%_buggy.txt}

        FIXED_FILE="$EXEC_DIR/${PROJECT}-${BUG}_fixed.txt"

        if [ ! -f "$FIXED_FILE" ]; then
            continue
        fi

        # --------------------------------------------------
        # BUGGY
        # --------------------------------------------------

        awk -v project="$PROJECT" \
            -v bug="$BUG" \
            -v method="$METHOD" \
            -v env="buggy" \
            -v file="$BUGGY_FILE" '
            /^TEST: / {
                test=$0
                sub(/^TEST: /, "", test)
                next
            }

            /^Failing tests: / {
                fail=$0
                sub(/^Failing tests: /, "", fail)

                status="PASS"

                if (fail != "0") {
                    status="FAIL"
                }

                print project "," bug "," method "," env "," test "," status "," file
            }
            ' "$BUGGY_FILE" >> "$OUTPUT_CSV"

        # --------------------------------------------------
        # FIXED
        # --------------------------------------------------

        awk -v project="$PROJECT" \
            -v bug="$BUG" \
            -v method="$METHOD" \
            -v env="fixed" \
            -v file="$FIXED_FILE" '
            /^TEST: / {
                test=$0
                sub(/^TEST: /, "", test)
                next
            }

            /^Failing tests: / {
                fail=$0
                sub(/^Failing tests: /, "", fail)

                status="PASS"

                if (fail != "0") {
                    status="FAIL"
                }

                print project "," bug "," method "," env "," test "," status "," file
            }
            ' "$FIXED_FILE" >> "$OUTPUT_CSV"

    done

done

echo "Collected results:"
echo "$OUTPUT_CSV"
echo ""

cat "$OUTPUT_CSV"