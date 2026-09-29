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
export PERL5LIB="$HOME/perl5/lib/perl5:$PERL5LIB"

echo "============================================================"
echo "AI Experiment"
echo "Project : $PROJECT"
echo "Bug     : $BUG"
echo "Method  : $METHOD"
echo "============================================================"

if [ ! -d "$BUGGY_DIR" ] || [ ! -d "$FIXED_DIR" ]; then
    echo ""
    echo "Project workspaces do not exist."
    echo "Running setup_bug.sh..."
    "$ROOT/automation/scripts/setup_bug.sh" "$PROJECT" "$BUG" || exit 1
fi

TEST_FILES=("$TEST_DIR"/*.java)

if [ ! -e "${TEST_FILES[0]}" ]; then
    echo "ERROR: No Java test file found in:"
    echo "$TEST_DIR"
    exit 1
fi

if [ "${#TEST_FILES[@]}" -ne 1 ]; then
    echo "ERROR: Expected exactly one TestCode Java file."
    echo "Found:"
    printf '  %s\n' "${TEST_FILES[@]}"
    exit 1
fi

TEST_FILE="${TEST_FILES[0]}"
TEST_NAME="$(basename "$TEST_FILE" .java)"

PACKAGE=$(grep -E '^package ' "$TEST_FILE" | head -1 | sed 's/^package //;s/;//')

if [ -z "$PACKAGE" ]; then
    echo "ERROR: Could not determine Java package."
    exit 1
fi

FULL_CLASS="${PACKAGE}.${TEST_NAME}"

echo ""
echo "Test file  : $TEST_FILE"
echo "Test class : $FULL_CLASS"

BUGGY_TEST_DIR="$BUGGY_DIR/tests/$(echo "$PACKAGE" | tr '.' '/')"
FIXED_TEST_DIR="$FIXED_DIR/tests/$(echo "$PACKAGE" | tr '.' '/')"

mkdir -p "$BUGGY_TEST_DIR"
mkdir -p "$FIXED_TEST_DIR"

cp "$TEST_FILE" "$BUGGY_TEST_DIR/${TEST_NAME}.java"
cp "$TEST_FILE" "$FIXED_TEST_DIR/${TEST_NAME}.java"

echo ""
echo "[1/4] Compiling buggy version..."

cd "$BUGGY_DIR" || exit 1

if ! defects4j compile; then
    echo "ERROR: Buggy compilation failed."
    exit 1
fi

echo ""
echo "[2/4] Compiling fixed version..."

cd "$FIXED_DIR" || exit 1

if ! defects4j compile; then
    echo "ERROR: Fixed compilation failed."
    exit 1
fi

echo ""
echo "[3/4] Discovering @Test methods..."

TEST_METHODS=$(awk '
    /@Test/ {
        getline;
        if ($0 ~ /public void test[[:alnum:]_]*[[:space:]]*\(/) {
            line=$0;
            sub(/^.*public void /, "", line);
            sub(/\(.*/, "", line);
            print line;
        }
    }
' "$TEST_FILE")

if [ -z "$TEST_METHODS" ]; then
    echo "ERROR: No @Test methods found."
    exit 1
fi

echo "$TEST_METHODS"

echo ""
echo "[4/4] Running tests..."

BUGGY_OUTPUT="$RESULT_DIR/${PROJECT}-${BUG}_buggy.txt"
FIXED_OUTPUT="$RESULT_DIR/${PROJECT}-${BUG}_fixed.txt"

mkdir -p "$RESULT_DIR"

{
    echo "============================================================"
    echo "${PROJECT}-${BUG} ${METHOD} - BUGGY"
    echo "============================================================"
    echo ""
} > "$BUGGY_OUTPUT"

{
    echo "============================================================"
    echo "${PROJECT}-${BUG} ${METHOD} - FIXED"
    echo "============================================================"
    echo ""
} > "$FIXED_OUTPUT"

while IFS= read -r TEST_METHOD; do

    cd "$BUGGY_DIR" || exit 1

    echo "TEST: $TEST_METHOD" >> "$BUGGY_OUTPUT"

    defects4j test \
        -t "${FULL_CLASS}::${TEST_METHOD}" \
        >> "$BUGGY_OUTPUT" 2>&1

    echo "" >> "$BUGGY_OUTPUT"

    cd "$FIXED_DIR" || exit 1

    echo "TEST: $TEST_METHOD" >> "$FIXED_OUTPUT"

    defects4j test \
        -t "${FULL_CLASS}::${TEST_METHOD}" \
        >> "$FIXED_OUTPUT" 2>&1

    echo "" >> "$FIXED_OUTPUT"

done <<< "$TEST_METHODS"

echo ""
echo "============================================================"
echo "AI TEST EXECUTION COMPLETE"
echo "============================================================"
echo "Buggy result : $BUGGY_OUTPUT"
echo "Fixed result : $FIXED_OUTPUT"
