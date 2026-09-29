#!/bin/bash

set -u

PROJECT="${1:-}"
BUG="${2:-}"
TEST_CLASS="${3:-}"
TEST_METHOD="${4:-}"
OUTPUT_FILE="${5:-}"

if [ -z "$PROJECT" ] || [ -z "$BUG" ] || \
   [ -z "$TEST_CLASS" ] || [ -z "$TEST_METHOD" ] || \
   [ -z "$OUTPUT_FILE" ]; then
    echo "Usage:"
    echo "$0 <project> <bug> <test_class> <test_method> <output_file>"
    exit 1
fi

ROOT="$HOME/Documents/SQA_Project"
PROJECT_DIR="$ROOT/projects/${PROJECT}-${BUG}"

export JAVA_HOME="/opt/homebrew/opt/openjdk@11/libexec/openjdk.jdk/Contents/Home"
export PATH="/opt/homebrew/bin:/opt/homebrew/sbin:/opt/homebrew/opt/openjdk@11/bin:$PATH"
export PERL5LIB="$HOME/perl5/lib/perl5:$PERL5LIB"

mkdir -p "$(dirname "$OUTPUT_FILE")"

cd "$PROJECT_DIR" || exit 1

echo "TEST: ${TEST_METHOD}" >> "$OUTPUT_FILE"

defects4j test \
    -t "${TEST_CLASS}::${TEST_METHOD}" \
    >> "$OUTPUT_FILE" 2>&1

EXIT_CODE=$?

echo "" >> "$OUTPUT_FILE"

exit $EXIT_CODE
