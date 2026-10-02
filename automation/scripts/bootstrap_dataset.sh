#!/bin/zsh

DATASET="$1"

ROOT="/Users/fangfang/Documents/SQA_Project_2026"
D4J="${D4J_HOME:-/Users/fangfang/Documents/SQA_Project/defects4j}"

export PERL5LIB="$HOME/perl5/lib/perl5:${PERL5LIB:-}"

if [ -z "$DATASET" ]; then
    echo "Usage: bootstrap_dataset.sh <Dataset>"
    exit 2
fi

echo "============================================================"
echo "DATASET BOOTSTRAP"
echo "============================================================"
echo "Dataset: $DATASET"
echo "============================================================"

if ! "$D4J/framework/bin/defects4j" info -p "$DATASET" >/dev/null 2>&1; then
    echo "[FAILED] Unknown Defects4J project: $DATASET"
    exit 1
fi

mkdir -p \
    "$ROOT/automation/datasets/$DATASET" \
    "$ROOT/automation/runs/$DATASET"

QUERY_FILE="$ROOT/automation/datasets/$DATASET/.defects4j_query.csv"

echo
echo "[1] Exporting Defects4J metadata..."

"$D4J/framework/bin/defects4j" query \
    -p "$DATASET" \
    -q "bug.id,report.id,report.url,revision.id.fixed,classes.modified,tests.trigger" \
    -o "$QUERY_FILE"

if [ ! -s "$QUERY_FILE" ]; then
    echo "[FAILED] Defects4J metadata query returned no data."
    exit 1
fi

echo
echo "[2] Building canonical bugs.csv..."

python3 - "$QUERY_FILE" "$ROOT/automation/datasets/$DATASET/bugs.csv" "$DATASET" <<'PY'
import csv
import sys
from pathlib import Path

source = Path(sys.argv[1])
destination = Path(sys.argv[2])
dataset = sys.argv[3]

with source.open(
    newline="",
    encoding="utf-8"
) as f:
    rows = list(csv.DictReader(f))

with destination.open(
    "w",
    newline="",
    encoding="utf-8"
) as f:
    writer = csv.writer(f)

    writer.writerow([
        "project",
        "bug_id",
        "status",
        "bug_report",
        "fixed_revision",
        "trigger_test",
        "modified_source",
    ])

    for row in rows:
        bug_id = row.get("bug.id", "").strip()

        if not bug_id:
            continue

        report_id = row.get("report.id", "").strip()
        fixed_revision = row.get(
            "revision.id.fixed",
            ""
        ).strip()

        trigger = row.get(
            "tests.trigger",
            ""
        ).strip()

        modified = row.get(
            "classes.modified",
            ""
        ).strip()

        writer.writerow([
            dataset,
            bug_id,
            "READY",
            report_id,
            fixed_revision,
            trigger,
            modified,
        ])

print(
    f"Created {destination} "
    f"with {len(rows)} metadata rows."
)
PY

echo
echo "[3] Creating generic dataset config..."

CONFIG="$ROOT/automation/config/$DATASET.env"

if [ -f "$CONFIG" ]; then
    echo "[KEEP] Existing config: $CONFIG"
else
    cat > "$CONFIG" <<EOF
DATASET_NAME="$DATASET"
PROJECT_ID="$DATASET"
D4J_PROJECT="$DATASET"
TEST_FRAMEWORK="JUnit 4.12"

BUGGY_WORKSPACE_ROOT="$ROOT/workspaces"
FIXED_WORKSPACE_ROOT="$ROOT/workspaces"
RESULT_ROOT="$ROOT/automation/runs/$DATASET"
METADATA_FILE="$ROOT/automation/datasets/$DATASET/bugs.csv"

SEED=20260923

SA_SUITE_SIZE=12
SA_ITERATIONS=5000

BPSO_PARTICLES=20
BPSO_SUITE_SIZE=12
BPSO_ITERATIONS=5000

ORIGINAL_TRIGGER_VALUES_EXCLUDED=true
PRODUCTION_SOURCE_MODIFICATION=false
EOF

    echo "[CREATED] $CONFIG"
fi

echo
echo "[4] Dataset summary"

python3 - "$ROOT/automation/datasets/$DATASET/bugs.csv" <<'PY'
import csv
import sys
from collections import Counter

path = sys.argv[1]

with open(path, newline="", encoding="utf-8") as f:
    rows = list(csv.DictReader(f))

print("Rows :", len(rows))
print("Status:", dict(Counter(
    row["status"] for row in rows
)))
print("Bug IDs:", ", ".join(
    row["bug_id"] for row in rows
))
PY

echo
echo "============================================================"
echo "BOOTSTRAP COMPLETE"
echo "============================================================"
echo "$DATASET is now registered."
echo "============================================================"
