#!/bin/zsh

set -u

if [[ $# -ne 1 ]]; then
    echo "Usage:"
    echo "  $0 <METHOD>"
    echo
    echo "METHOD:"
    echo "  ChatGPT"
    echo "  Gemini"
    echo "  SA"
    echo "  BPSO"
    exit 1
fi

METHOD="$1"

case "$METHOD" in
    ChatGPT|Gemini|SA|BPSO)
        ;;
    *)
        echo "ERROR: Invalid method: $METHOD"
        exit 1
        ;;
esac

PROJECT_ROOT="$(cd "$(dirname "$0")/../.." && pwd)"
RESULT_DIR="$PROJECT_ROOT/Lang/$METHOD/Result/Bug-3"

mkdir -p "$RESULT_DIR/Buggy"
mkdir -p "$RESULT_DIR/Fixed"

cat > "$RESULT_DIR/experiment.json" <<EOF2
{
  "experiment": {
    "project": "Lang",
    "bug": "3",
    "method": "$METHOD",
    "status": "PENDING"
  },
  "defects4j": {
    "version": "2.0.0",
    "project": "Lang",
    "bug_id": "3",
    "buggy_version": "Lang-3b",
    "fixed_version": "Lang-3f",
    "buggy_revision": "feb3701163f8ff15d0348f031244613148c3c9c3",
    "fixed_revision": "fe116d3e25805192f59eef744beb9fbf025c0442"
  },
  "generation": {
    "status": "PENDING",
    "test_count": 0,
    "generation_time": 0.0,
    "prompt": "prompt.txt",
    "raw_output": "raw_output.txt",
    "generated_test": "generated_test.java"
  },
  "compilation": {
    "status": "PENDING"
  },
  "buggy": {
    "status": "PENDING",
    "tests_total": 0,
    "tests_passed": 0,
    "tests_failed": 0,
    "tests_error": 0,
    "execution_log": "Buggy/execution.txt",
    "coverage": "Buggy/coverage.csv"
  },
  "fixed": {
    "status": "PENDING",
    "tests_total": 0,
    "tests_passed": 0,
    "tests_failed": 0,
    "tests_error": 0,
    "execution_log": "Fixed/execution.txt",
    "coverage": "Fixed/coverage.csv"
  },
  "evaluation": {
    "evaluated_tests": 0,
    "detected_tests": 0,
    "fdr": 0.0
  },
  "timing": {
    "generation_time": 0.0,
    "execution_time": 0.0,
    "total_time": 0.0
  },
  "ground_truth": {
    "project": "projects/Lang/Bug-3",
    "diff": "projects/Lang/Bug-3/diff.txt"
  }
}
EOF2

echo "Initialized:"
echo "$RESULT_DIR/experiment.json"
