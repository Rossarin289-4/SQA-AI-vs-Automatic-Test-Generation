#!/bin/zsh

set -u

PROJECT_ROOT="$(cd "$(dirname "$0")/../.." && pwd)"
FILE="$PROJECT_ROOT/results/master_results.csv"

EXPECTED="project,bug,method,tests,fdr,line_cov_buggy,branch_cov_buggy,line_cov_fixed,branch_cov_fixed,gen_time,exec_time,total_time,status"

if [[ ! -f "$FILE" ]]; then
    echo "FAIL: master_results.csv not found"
    exit 1
fi

HEADER="$(head -n 1 "$FILE")"

echo "Expected:"
echo "$EXPECTED"
echo
echo "Actual:"
echo "$HEADER"
echo

if [[ "$HEADER" == "$EXPECTED" ]]; then
    echo "MASTER CSV HEADER: PASS"
    exit 0
else
    echo "MASTER CSV HEADER: FAIL"
    exit 1
fi
