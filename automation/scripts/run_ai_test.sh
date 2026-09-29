#!/bin/bash

set -u

PROJECT="${1:-}"
BUG="${2:-}"
METHOD="${3:-}"

if [ -z "$PROJECT" ] || [ -z "$BUG" ] || [ -z "$METHOD" ]; then
    echo "Usage:"
    echo "$0 <project> <bug> <method>"
    echo ""
    echo "Example:"
    echo "$0 Chart 1 ChatGPT"
    exit 1
fi

ROOT="$HOME/Documents/SQA_Project"

TEST_DIR="$ROOT/${PROJECT}/${METHOD}/TestCode"
RESULT_DIR="$ROOT/${PROJECT}/${METHOD}/Result/Execution"

BUGGY_DIR="$ROOT/projects/${PROJECT}-${BUG}"
FIXED_DIR="$ROOT/projects/${PROJECT}-${BUG}-fixed"

export JAVA_HOME="/opt/homebrew/opt/openjdk@11/libexec/openjdk.jdk/Contents/Home"
export PATH="/opt/homebrew/bin:/opt/homebrew/sbin:/opt/homebrew/opt/openjdk@11/bin:$PATH"
export PERL5LIB="$HOME/perl5/lib/perl5:${PERL5LIB:-}"

echo "============================================================"
echo "AI Experiment"
echo "Project : $PROJECT"
echo "Bug     : $BUG"
echo "Method  : $METHOD"
echo "============================================================"

# ============================================================
# 1. Check project workspaces
# ============================================================

if [ ! -d "$BUGGY_DIR" ] || [ ! -d "$FIXED_DIR" ]; then
    echo ""
    echo "Project workspaces do not exist."
    echo "Running setup_bug.sh..."

    "$ROOT/automation/scripts/setup_bug.sh" "$PROJECT" "$BUG" || exit 1
fi

# ============================================================
# 2. Check TestCode directory
# ============================================================

if [ ! -d "$TEST_DIR" ]; then
    echo ""
    echo "ERROR: TestCode directory does not exist:"
    echo "$TEST_DIR"
    exit 1
fi

# ============================================================
# 3. Find TestCode for this specific project and bug
#
# Example:
#   Chart + Bug 2
#   -> DatasetUtilitiesChart2Test.java
#
# It must contain:
#   Chart2
# or
#   Chart-2
#
# This prevents Chart-1 TestCode from being selected.
# ============================================================

VALID_TEST_FILES=()

for FILE in "$TEST_DIR"/*.java; do
    [ -f "$FILE" ] || continue

    FILE_NAME="$(basename "$FILE" .java)"

    if [[ "$FILE_NAME" == *"${PROJECT}${BUG}"* ]] || \
       [[ "$FILE_NAME" == *"${PROJECT}-${BUG}"* ]]; then
        VALID_TEST_FILES+=("$FILE")
    fi
done

if [ "${#VALID_TEST_FILES[@]}" -eq 0 ]; then
    echo ""
    echo "ERROR: No TestCode Java file found for ${PROJECT}-${BUG}."
    echo ""
    echo "TestCode directory:"
    echo "$TEST_DIR"
    echo ""
    echo "Available Java files:"
    find "$TEST_DIR" -maxdepth 1 -type f -name "*.java" -print
    exit 1
fi

if [ "${#VALID_TEST_FILES[@]}" -ne 1 ]; then
    echo ""
    echo "ERROR: Expected exactly one TestCode Java file for ${PROJECT}-${BUG}."
    echo ""
    echo "Found:"
    printf '  %s\n' "${VALID_TEST_FILES[@]}"
    exit 1
fi

TEST_FILE="${VALID_TEST_FILES[0]}"

# ============================================================
# 4. Determine Java class information
# ============================================================

TEST_NAME="$(basename "$TEST_FILE" .java)"

PACKAGE="$(
    grep -E '^package[[:space:]]+' "$TEST_FILE" \
    | head -1 \
    | sed 's/^package[[:space:]]*//;s/;//'
)"

if [ -z "$PACKAGE" ]; then
    echo ""
    echo "ERROR: Could not determine Java package."
    echo "Test file: $TEST_FILE"
    exit 1
fi

FULL_CLASS="${PACKAGE}.${TEST_NAME}"

echo ""
echo "Test file  : $TEST_FILE"
echo "Test class : $FULL_CLASS"

# ============================================================
# 5. Copy TestCode into buggy and fixed projects
# ============================================================

BUGGY_TEST_DIR="$BUGGY_DIR/tests/$(echo "$PACKAGE" | tr '.' '/')"
FIXED_TEST_DIR="$FIXED_DIR/tests/$(echo "$PACKAGE" | tr '.' '/')"

mkdir -p "$BUGGY_TEST_DIR"
mkdir -p "$FIXED_TEST_DIR"

cp "$TEST_FILE" "$BUGGY_TEST_DIR/${TEST_NAME}.java"
cp "$TEST_FILE" "$FIXED_TEST_DIR/${TEST_NAME}.java"

# ============================================================
# 6. Compile buggy version
# ============================================================

echo ""
echo "[1/4] Compiling buggy version..."

cd "$BUGGY_DIR" || exit 1

if ! defects4j compile; then
    echo ""
    echo "ERROR: Buggy compilation failed."
    exit 1
fi

# ============================================================
# 7. Compile fixed version
# ============================================================

echo ""
echo "[2/4] Compiling fixed version..."

cd "$FIXED_DIR" || exit 1

if ! defects4j compile; then
    echo ""
    echo "ERROR: Fixed compilation failed."
    exit 1
fi

# ============================================================
# 8. Discover @Test methods
#
# Supports:
#
# @Test
# public void testSomething()
#
# and:
#
# @Test
# public void
# testSomething()
#
# The method name is extracted from the source.
# ============================================================

echo ""
echo "[3/4] Discovering @Test methods..."

TEST_METHODS="$(
    awk '
    /@Test/ {
        found = 1
        next
    }

    found {
        if ($0 ~ /public[[:space:]]+void[[:space:]]+[A-Za-z_][A-Za-z0-9_]*[[:space:]]*\(/) {
            line = $0

            sub(/^.*public[[:space:]]+void[[:space:]]+/, "", line)
            sub(/[[:space:]]*\(.*/, "", line)

            print line

            found = 0
        }
    }
    ' "$TEST_FILE"
)"

if [ -z "$TEST_METHODS" ]; then
    echo ""
    echo "ERROR: No @Test methods found."
    echo "Test file: $TEST_FILE"
    exit 1
fi

TEST_COUNT="$(printf '%s\n' "$TEST_METHODS" | grep -c .)"

echo ""
echo "Discovered test methods: $TEST_COUNT"
echo ""

printf '%s\n' "$TEST_METHODS"

# ============================================================
# 9. Prepare result files
# ============================================================

echo ""
echo "[4/4] Running tests..."

mkdir -p "$RESULT_DIR"

BUGGY_OUTPUT="$RESULT_DIR/${PROJECT}-${BUG}_buggy.txt"
FIXED_OUTPUT="$RESULT_DIR/${PROJECT}-${BUG}_fixed.txt"

{
    echo "============================================================"
    echo "${PROJECT}-${BUG} ${METHOD} - BUGGY"
    echo "============================================================"
    echo ""
    echo "Project       : $PROJECT"
    echo "Bug           : $BUG"
    echo "Method        : $METHOD"
    echo "Test class    : $FULL_CLASS"
    echo "Test file     : $TEST_FILE"
    echo "Total tests   : $TEST_COUNT"
    echo "Environment   : BUGGY"
    echo ""
} > "$BUGGY_OUTPUT"

{
    echo "============================================================"
    echo "${PROJECT}-${BUG} ${METHOD} - FIXED"
    echo "============================================================"
    echo ""
    echo "Project       : $PROJECT"
    echo "Bug           : $BUG"
    echo "Method        : $METHOD"
    echo "Test class    : $FULL_CLASS"
    echo "Test file     : $TEST_FILE"
    echo "Total tests   : $TEST_COUNT"
    echo "Environment   : FIXED"
    echo ""
} > "$FIXED_OUTPUT"

# ============================================================
# 10. Run every generated test on buggy and fixed versions
# ============================================================

while IFS= read -r TEST_METHOD; do

    [ -z "$TEST_METHOD" ] && continue

    # --------------------------------------------------------
    # BUGGY
    # --------------------------------------------------------

    cd "$BUGGY_DIR" || exit 1

    echo "TEST: $TEST_METHOD" | tee -a "$BUGGY_OUTPUT"

    defects4j test \
        -t "${FULL_CLASS}::${TEST_METHOD}" \
        >> "$BUGGY_OUTPUT" 2>&1

    BUGGY_EXIT_CODE=$?

    echo "Exit code: $BUGGY_EXIT_CODE" >> "$BUGGY_OUTPUT"
    echo "" >> "$BUGGY_OUTPUT"

    # --------------------------------------------------------
    # FIXED
    # --------------------------------------------------------

    cd "$FIXED_DIR" || exit 1

    echo "TEST: $TEST_METHOD" | tee -a "$FIXED_OUTPUT"

    defects4j test \
        -t "${FULL_CLASS}::${TEST_METHOD}" \
        >> "$FIXED_OUTPUT" 2>&1

    FIXED_EXIT_CODE=$?

    echo "Exit code: $FIXED_EXIT_CODE" >> "$FIXED_OUTPUT"
    echo "" >> "$FIXED_OUTPUT"

done <<< "$TEST_METHODS"

# ============================================================
# 11. Finish
# ============================================================

echo ""
echo "============================================================"
echo "AI TEST EXECUTION COMPLETE"
echo "============================================================"
echo "Project       : $PROJECT"
echo "Bug           : $BUG"
echo "Method        : $METHOD"
echo "Test class    : $FULL_CLASS"
echo "Total tests   : $TEST_COUNT"
echo ""
echo "Buggy result  : $BUGGY_OUTPUT"
echo "Fixed result  : $FIXED_OUTPUT"
echo "============================================================"