#!/bin/zsh

set -u

PROJECT_ROOT="/Users/fangfang/Documents/SQA_Project_2026"
OUTPUT_DIR="$PROJECT_ROOT/automation/datasets/Lang"
OUTPUT_CSV="$OUTPUT_DIR/bugs.csv"

D4J="/Users/fangfang/Documents/SQA_Project/defects4j/framework/bin/defects4j"

PROJECT_ID="Lang"
PROJECT_NAME="commons-lang"

# ============================================================
# SOURCE OF TRUTH
# Defects4J Lang active bugs used in this experiment.
#
# Lang-2 is deprecated and MUST NOT be included.
# ============================================================

ACTIVE_BUGS=(
    1
    3 4 5 6 7 8 9 10 11 12 13 14 15 16 17
    19 20 21 22 23 24
    26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47
    49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65
)

EXPECTED_COUNT=${#ACTIVE_BUGS[@]}

mkdir -p "$OUTPUT_DIR"

echo "============================================================"
echo "BUILD LANG DATASET METADATA"
echo "============================================================"
echo "Project      : $PROJECT_ID"
echo "Project name : $PROJECT_NAME"
echo "Active bugs  : $EXPECTED_COUNT"
echo "Output       : $OUTPUT_CSV"
echo

cat > "$OUTPUT_CSV" <<'HEADER'
project,bug_id,status,bug_report,fixed_revision,trigger_test,modified_source
HEADER

READY_COUNT=0
DEPRECATED_COUNT=0
ERROR_COUNT=0

for ((i=1; i<=EXPECTED_COUNT; i++)); do

    bug="${ACTIVE_BUGS[$i]}"

    echo "[$i/$EXPECTED_COUNT] Reading Lang-$bug ..."

    info="$("$D4J" info -p "$PROJECT_ID" -b "$bug" 2>&1)"
    exit_code=$?

    # --------------------------------------------------------
    # This should never happen for the active bug list.
    # Keep explicit error status instead of silently creating
    # an empty row.
    # --------------------------------------------------------
    if [[ $exit_code -ne 0 ]]; then

        if printf '%s\n' "$info" | grep -q "deprecated bug"; then
            row_status="DEPRECATED"
            DEPRECATED_COUNT=$((DEPRECATED_COUNT + 1))

            echo "    STATUS: DEPRECATED"
            echo "    NOTE  : Lang-$bug is deprecated and is not part of this dataset."

            # Do NOT write deprecated bugs into CSV.
            continue
        fi

        row_status="METADATA_ERROR"
        ERROR_COUNT=$((ERROR_COUNT + 1))

        echo "    STATUS: METADATA_ERROR"
        echo "    ERROR : defects4j info failed for Lang-$bug"
        echo "$info"

        # Explicit error row.
        printf '"%s","%s","%s","","","",""\n' \
            "$PROJECT_ID" "$bug" "$row_status" \
            >> "$OUTPUT_CSV"

        continue
    fi

    bug_report="$(
        printf '%s\n' "$info" |
        awk '
            /Bug report id:/ {
                getline
                gsub(/^[[:space:]]+|[[:space:]]+$/, "")
                print
                exit
            }
        '
    )"

    fixed_revision="$(
        printf '%s\n' "$info" |
        awk '
            /Revision ID \(fixed version\):/ {
                getline
                gsub(/^[[:space:]]+|[[:space:]]+$/, "")
                print
                exit
            }
        '
    )"

    trigger_test="$(
        printf '%s\n' "$info" |
        awk '
            /Root cause in triggering tests:/ {
                getline
                sub(/^[[:space:]]*-[[:space:]]*/, "")
                gsub(/^[[:space:]]+|[[:space:]]+$/, "")
                print
                exit
            }
        '
    )"

    modified_source="$(
        printf '%s\n' "$info" |
        awk '
            /List of modified sources:/ {
                getline
                sub(/^[[:space:]]*-[[:space:]]*/, "")
                gsub(/^[[:space:]]+|[[:space:]]+$/, "")
                print
                exit
            }
        '
    )"

    # --------------------------------------------------------
    # Validate required metadata.
    # --------------------------------------------------------
    if [[ -z "$bug_report" ||
          -z "$fixed_revision" ||
          -z "$trigger_test" ||
          -z "$modified_source" ]]; then

        row_status="METADATA_ERROR"
        ERROR_COUNT=$((ERROR_COUNT + 1))

        echo "    STATUS: METADATA_ERROR"
        echo "    Bug report      : $bug_report"
        echo "    Fixed revision  : $fixed_revision"
        echo "    Trigger test    : $trigger_test"
        echo "    Modified source : $modified_source"

        printf '"%s","%s","%s","%s","%s","%s","%s"\n' \
            "$PROJECT_ID" \
            "$bug" \
            "$row_status" \
            "$bug_report" \
            "$fixed_revision" \
            "$trigger_test" \
            "$modified_source" \
            >> "$OUTPUT_CSV"

        continue
    fi

    row_status="READY"
    READY_COUNT=$((READY_COUNT + 1))

    printf '"%s","%s","%s","%s","%s","%s","%s"\n' \
        "$PROJECT_ID" \
        "$bug" \
        "$row_status" \
        "$bug_report" \
        "$fixed_revision" \
        "$trigger_test" \
        "$modified_source" \
        >> "$OUTPUT_CSV"

    echo "    STATUS          : READY"
    echo "    Bug report      : $bug_report"
    echo "    Fixed revision  : $fixed_revision"
    echo "    Trigger test    : $trigger_test"
    echo "    Modified source : $modified_source"
done

echo
echo "============================================================"
echo "METADATA BUILD COMPLETE"
echo "============================================================"
echo "Expected active bugs : $EXPECTED_COUNT"
echo "READY                 : $READY_COUNT"
echo "DEPRECATED            : $DEPRECATED_COUNT"
echo "METADATA_ERROR        : $ERROR_COUNT"

TOTAL_ROWS=$(
    tail -n +2 "$OUTPUT_CSV" |
    grep -c '^"Lang",'
)

echo "CSV data rows         : $TOTAL_ROWS"

echo
echo "============================================================"
echo "BUG IDS IN CSV"
echo "============================================================"

tail -n +2 "$OUTPUT_CSV" |
awk -F',' '{gsub(/"/, "", $2); print $2}' |
sort -n |
tr '\n' ' '

echo
echo

echo "============================================================"
echo "FIRST 5 ROWS"
echo "============================================================"

head -6 "$OUTPUT_CSV"

echo
echo "============================================================"
echo "LAST 5 ROWS"
echo "============================================================"

tail -5 "$OUTPUT_CSV"

echo
echo "============================================================"
echo "FINAL STATUS"
echo "============================================================"

if [[ "$READY_COUNT" -eq "$EXPECTED_COUNT" &&
      "$DEPRECATED_COUNT" -eq 0 &&
      "$ERROR_COUNT" -eq 0 &&
      "$TOTAL_ROWS" -eq "$EXPECTED_COUNT" ]]; then

    echo "OK: Lang dataset metadata is complete."
    exit 0
else
    echo "ERROR: Lang dataset metadata validation failed."
    exit 1
fi
