#!/bin/zsh

set -u

ROOT="$(cd "$(dirname "$0")" && pwd)"

DATASET=""
BUG_FILTER=""

while [[ $# -gt 0 ]]; do
    case "$1" in
        --dataset)
            DATASET="$2"
            shift 2
            ;;
        --bug)
            BUG_FILTER="$2"
            shift 2
            ;;
        *)
            echo "ERROR: unknown argument: $1"
            exit 2
            ;;
    esac
done

if [[ -z "$DATASET" ]]; then
    echo "Usage:"
    echo "  ./run_all.sh --dataset Lang"
    echo "  ./run_all.sh --dataset Lang --bug 8"
    exit 2
fi

ENV_FILE="$ROOT/automation/config/${DATASET}.env"
METADATA="$ROOT/automation/datasets/${DATASET}/bugs.csv"
RESULT_ROOT="$ROOT/automation/runs/${DATASET}"
MASTER_OUTPUT="$ROOT/automation/state/master_results.csv"

CHECKPOINT_SCRIPT="$ROOT/automation/scripts/checkpoint.sh"
RESOURCE_POLICY_SCRIPT="$ROOT/automation/scripts/run_policy.sh"
BUG_COMPLETE_SCRIPT="$ROOT/automation/scripts/check_bug_complete.py"
CLEANUP_SCRIPT="$ROOT/automation/scripts/cleanup_completed_bug.py"

if [[ ! -f "$ENV_FILE" ]]; then
    echo "ERROR: missing config:"
    echo "  $ENV_FILE"
    exit 1
fi

if [[ ! -f "$METADATA" ]]; then
    echo "ERROR: missing metadata:"
    echo "  $METADATA"
    exit 1
fi

mkdir -p "$RESULT_ROOT"

echo
echo "============================================================"
echo "DEFECTS4J EXPERIMENT RUNNER"
echo "============================================================"
echo "Dataset : $DATASET"
echo "Root    : $ROOT"
echo

export ROOT
export DATASET
export BUG_FILTER
export METADATA
export RESULT_ROOT
export MASTER_OUTPUT

export CHECKPOINT_SCRIPT
export RESOURCE_POLICY_SCRIPT
export BUG_COMPLETE_SCRIPT
export CLEANUP_SCRIPT

python3 - <<'PY'
import csv
import json
import os
import subprocess
import sys
import time
from pathlib import Path


ROOT = Path(os.environ["ROOT"])
DATASET = os.environ["DATASET"]
BUG_FILTER = os.environ.get("BUG_FILTER", "").strip()
METADATA = Path(os.environ["METADATA"])
RESULT_ROOT = Path(os.environ["RESULT_ROOT"])

METHODS = [
    "ChatGPT",
    "Gemini",
    "SA",
    "BPSO",
]



CHECKPOINT_SCRIPT = Path(os.environ["CHECKPOINT_SCRIPT"])
RESOURCE_POLICY_SCRIPT = Path(os.environ["RESOURCE_POLICY_SCRIPT"])
BUG_COMPLETE_SCRIPT = Path(os.environ["BUG_COMPLETE_SCRIPT"])
CLEANUP_SCRIPT = Path(os.environ["CLEANUP_SCRIPT"])


def checkpoint(bug, method, status):
    proc = subprocess.run(
        [
            "zsh",
            str(CHECKPOINT_SCRIPT),
            DATASET,
            str(bug),
            method,
            status,
        ],
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )

    if proc.stdout:
        print(proc.stdout.rstrip())

    return proc.returncode == 0


def resource_policy():
    proc = subprocess.run(
        [
            "zsh",
            str(RESOURCE_POLICY_SCRIPT),
        ],
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )

    if proc.stdout:
        print(proc.stdout.rstrip())

    return proc.returncode == 0


def bug_complete(bug):
    proc = subprocess.run(
        [
            sys.executable,
            str(BUG_COMPLETE_SCRIPT),
            "--dataset",
            DATASET,
            "--bug",
            str(bug),
        ],
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )

    if proc.stdout:
        print(proc.stdout.rstrip())

    return proc.returncode == 0


def cleanup_completed_bug(bug):
    proc = subprocess.run(
        [
            sys.executable,
            str(CLEANUP_SCRIPT),
            "--dataset",
            DATASET,
            "--bug",
            str(bug),
        ],
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )

    if proc.stdout:
        print(proc.stdout.rstrip())

    return proc.returncode == 0


def read_rows():
    with open(
        METADATA,
        newline="",
        encoding="utf-8"
    ) as f:
        return list(csv.DictReader(f))


def artifact_ready(artifact_dir, method):
    # ChatGPT/Gemini require the complete AI artifact set.
    if method in ("ChatGPT", "Gemini"):
        required = [
            "prompt.txt",
            "raw_output.txt",
            "generated_test.java",
        ]

        return all(
            (artifact_dir / x).is_file()
            and (artifact_dir / x).stat().st_size > 0
            for x in required
        )

    # SA/BPSO require the executable generated test.
    if method in ("SA", "BPSO"):
        path = artifact_dir / "generated_test.java"
        return path.is_file() and path.stat().st_size > 0

    return False


def status_file(artifact_dir):
    path = artifact_dir / "status"

    if not path.is_file():
        return None

    return path.read_text(
        encoding="utf-8"
    ).strip()


def run_method(row, method):
    bug = row["bug_id"]

    artifact_dir = (
        RESULT_ROOT
        / f"Bug-{bug}"
        / method
    )

    artifact_dir.mkdir(
        parents=True,
        exist_ok=True
    )

    current_status = status_file(
        artifact_dir
    )

    # ------------------------------------------------------
    # Canonical DONE protection
    # ------------------------------------------------------
    # experiment.json is the authoritative completion marker.
    # This prevents accidental reruns if the status file is stale.
    experiment_file = artifact_dir / "experiment.json"

    if experiment_file.is_file():
        try:
            import json

            experiment_data = json.loads(
                experiment_file.read_text(
                    encoding="utf-8"
                )
            )

            if experiment_data.get("status") == "DONE":
                (artifact_dir / "status").write_text(
                    "DONE\n",
                    encoding="utf-8"
                )

                checkpoint(bug, method, "DONE")

                print(
                    f"[SKIP] {DATASET}-{bug} {method}: canonical experiment DONE"
                )

                return

        except Exception as exc:
            print(
                f"[WARN] {DATASET}-{bug} {method}: "
                f"could not read experiment.json: {exc}"
            )

    if current_status == "DONE":
        checkpoint(bug, method, "DONE")
        print(
            f"[SKIP] {DATASET}-{bug} {method}: DONE"
        )
        return

    generated = (
        artifact_dir
        / "generated_test.java"
    )

    # ------------------------------------------------------
    # Artifact availability / automatic generator
    # ------------------------------------------------------

    if not artifact_ready(artifact_dir, method):

        # AI methods still require manually supplied artifacts.
        if method in ("ChatGPT", "Gemini"):
            new_status = "PENDING_ARTIFACT"

            (artifact_dir / "status").write_text(
                new_status + "\n",
                encoding="utf-8"
            )

            checkpoint(bug, method, new_status)

            print(
                f"[PENDING] {DATASET}-{bug} {method}: {new_status}"
            )

            return

        # SA/BPSO can be generated automatically.
        if method in ("SA", "BPSO"):

            if DATASET == "Lang":
                generator_wrapper = (
                    ROOT
                    / "automation/scripts/auto_generate_missing.sh"
                )

                print(
                    f"[GENERATE] {DATASET}-{bug} {method}: "
                    "automatic generator starting"
                )

                generator_result = subprocess.run(
                    [
                        str(generator_wrapper),
                        DATASET,
                        bug,
                        method,
                    ],
                    stdout=subprocess.PIPE,
                    stderr=subprocess.STDOUT,
                    text=True,
                )

                (
                    artifact_dir
                    / "auto_generation_runner.log"
                ).write_text(
                    generator_result.stdout,
                    encoding="utf-8"
                )

                if generator_result.returncode == 0:
                    print(
                        f"[GENERATE] {DATASET}-{bug} {method}: "
                        "generator completed"
                    )

                else:
                    new_status = "PENDING_GENERATOR"

                    (artifact_dir / "status").write_text(
                        new_status + "\n",
                        encoding="utf-8"
                    )

                    checkpoint(
                        bug,
                        method,
                        new_status
                    )

                    print(
                        f"[PENDING] {DATASET}-{bug} {method}: "
                        "generator failed"
                    )

                    return

            # If generation was not available for this dataset,
            # preserve the existing pending behavior.
            else:
                new_status = "PENDING_GENERATOR"

                (artifact_dir / "status").write_text(
                    new_status + "\n",
                    encoding="utf-8"
                )

                checkpoint(
                    bug,
                    method,
                    new_status
                )

                print(
                    f"[PENDING] {DATASET}-{bug} {method}: "
                    "{new_status}"
                )

                return

        # Verify that generation actually produced an artifact.
        if not artifact_ready(artifact_dir, method):
            new_status = "PENDING_GENERATOR"

            (artifact_dir / "status").write_text(
                new_status + "\n",
                encoding="utf-8"
            )

            checkpoint(
                bug,
                method,
                new_status
            )

            print(
                f"[PENDING] {DATASET}-{bug} {method}: "
                "generated artifact unavailable"
            )

            return

        # The generated artifact is now available.
        (artifact_dir / "status").write_text(
            "GENERATED\n",
            encoding="utf-8"
        )

        checkpoint(
            bug,
            method,
            "GENERATED"
        )

        print(
            f"[GENERATED] {DATASET}-{bug} {method}: "
            "artifact ready for evaluation"
        )

    # ------------------------------------------------------
    # Artifact validation
    # ------------------------------------------------------

    validator = (
        ROOT
        / "automation/scripts/check_generated_artifact.py"
    )

    check = subprocess.run(
        [
            sys.executable,
            str(validator),
            "--artifact-dir",
            str(artifact_dir),
            "--method",
            method,
        ],
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )

    (
        artifact_dir
        / "artifact_validation.log"
    ).write_text(
        check.stdout,
        encoding="utf-8"
    )

    if check.returncode != 0:
        (artifact_dir / "status").write_text(
            "FAILED\n",
            encoding="utf-8"
        )

        checkpoint(bug, method, "FAILED")
        print(
            f"[FAILED] {DATASET}-{bug} {method}: invalid artifact"
        )

        return

    # ------------------------------------------------------
    # Destination
    # ------------------------------------------------------

    text = generated.read_text(
        encoding="utf-8"
    )

    import re

    package_match = re.search(
        r'^\s*package\s+([A-Za-z0-9_.]+)\s*;',
        text,
        re.MULTILINE
    )

    class_match = re.search(
        r'\bclass\s+([A-Za-z0-9_]+)',
        text
    )

    if not package_match or not class_match:
        (artifact_dir / "status").write_text(
            "FAILED\n",
            encoding="utf-8"
        )

        checkpoint(bug, method, "FAILED")
        print(
            f"[FAILED] {DATASET}-{bug} {method}: cannot determine package/class"
        )

        return

    package = package_match.group(1)
    class_name = class_match.group(1)

    destination = (
        package.replace(".", "/")
        + "/"
        + class_name
        + ".java"
    )

    # ------------------------------------------------------
    # Generation timing
    # ------------------------------------------------------

    generation_seconds = None

    generation_file = (
        artifact_dir
        / "generation_seconds.txt"
    )

    if generation_file.is_file():
        try:
            generation_seconds = float(
                generation_file.read_text().strip()
            )
        except Exception:
            generation_seconds = None

    # ------------------------------------------------------
    # Evaluate
    # ------------------------------------------------------

    evaluator = (
        ROOT
        / "automation/scripts/evaluate_method.py"
    )

    (artifact_dir / "status").write_text(
        "EVALUATING\n",
        encoding="utf-8"
    )

    checkpoint(bug, method, "RUNNING")

    cmd = [
        sys.executable,
        str(evaluator),
        "--project",
        DATASET,
        "--bug",
        bug,
        "--method",
        method,
        "--buggy",
        str(
            ROOT
            / "workspaces"
            / f"{DATASET}-{bug}-buggy"
        ),
        "--fixed",
        str(
            ROOT
            / "workspaces"
            / f"{DATASET}-{bug}-fixed"
        ),
        "--generated-test",
        str(generated),
        "--destination",
        destination,
        "--artifact-dir",
        str(artifact_dir),
    ]

    if generation_seconds is not None:
        cmd.extend([
            "--generation-seconds",
            str(generation_seconds)
        ])

    start = time.perf_counter()

    with open(
        artifact_dir / "evaluate.log",
        "w",
        encoding="utf-8"
    ) as log:
        proc = subprocess.run(
            cmd,
            stdout=log,
            stderr=subprocess.STDOUT,
            text=True
        )

    elapsed = time.perf_counter() - start

    (
        artifact_dir
        / "evaluation_wall_seconds.txt"
    ).write_text(
        f"{elapsed:.6f}\n",
        encoding="utf-8"
    )

    if proc.returncode == 0:
        final_status = "DONE"
    else:
        final_status = "FAILED"

    (
        artifact_dir / "status"
    ).write_text(
        final_status + "\n",
        encoding="utf-8"
    )

    checkpoint(bug, method, final_status)
    print(
        f"[{final_status}] {DATASET}-{bug} {method}"
    )


rows = read_rows()

active_rows = [
    r for r in rows
    if r.get("status") == "READY"
]

if BUG_FILTER:
    active_rows = [
        r for r in active_rows
        if str(r.get("bug_id", "")).strip() == BUG_FILTER
    ]

print(
    f"Active bugs: {len(active_rows)}"
)

if BUG_FILTER:
    print(
        f"Bug filter: {BUG_FILTER}"
    )

print()
print("============================================================")
print("RESOURCE POLICY CHECK")
print("============================================================")

if not resource_policy():
    raise RuntimeError(
        "Resource policy blocked the experiment."
    )

for index, row in enumerate(active_rows, 1):
    bug = row["bug_id"]

    print()
    print(
        f"===== BUG {index}/{len(active_rows)} : "
        f"{DATASET}-{bug} ====="
    )

    print()
    print("[COMPLETION CHECK] Before workspace preparation")

    if bug_complete(bug):
        print(
            f"[COMPLETE] {DATASET}-{bug}: all four methods are DONE."
        )
        print("[CLEANUP] Running safe completed-bug cleanup.")
        cleanup_completed_bug(bug)
        continue

    # Make sure both workspaces exist.
    prepare = (
        ROOT
        / "automation/scripts/prepare_bug_workspace.sh"
    )

    buggy = (
        ROOT
        / "workspaces"
        / f"{DATASET}-{bug}-buggy"
    )

    fixed = (
        ROOT
        / "workspaces"
        / f"{DATASET}-{bug}-fixed"
    )

    if not buggy.is_dir() or not fixed.is_dir():
        prep = subprocess.run(
            [
                str(prepare),
                DATASET,
                bug
            ],
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            text=True
        )

        (
            RESULT_ROOT
            / f"Bug-{bug}"
            / "workspace_prepare.log"
        ).parent.mkdir(
            parents=True,
            exist_ok=True
        )

        (
            RESULT_ROOT
            / f"Bug-{bug}"
            / "workspace_prepare.log"
        ).write_text(
            prep.stdout,
            encoding="utf-8"
        )

        if prep.returncode != 0:
            print(
                f"[FAILED] workspace preparation for {DATASET}-{bug}"
            )

            continue

    for method in METHODS:
        try:
            run_method(
                row,
                method
            )
        except Exception as exc:
            artifact_dir = (
                RESULT_ROOT
                / f"Bug-{bug}"
                / method
            )

            artifact_dir.mkdir(
                parents=True,
                exist_ok=True
            )

            (artifact_dir / "status").write_text(
                "FAILED\n",
                encoding="utf-8"
            )

            (artifact_dir / "error.txt").write_text(
                repr(exc) + "\n",
                encoding="utf-8"
            )

            print(
                f"[FAILED] {DATASET}-{bug} {method}: {exc}"
            )

    print()
    print("[COMPLETION CHECK] After method loop")

    if bug_complete(bug):
        print(
            f"[COMPLETE] {DATASET}-{bug}: all four methods are DONE."
        )
        print("[CLEANUP] Running safe completed-bug cleanup.")
        cleanup_completed_bug(bug)
    else:
        print(
            f"[RESUME] {DATASET}-{bug}: incomplete. "
            "Results and workspaces are retained."
        )

print()
print("============================================================")
print("GENERATION / EVALUATION LOOP FINISHED")
print("============================================================")
PY
PYTHON_STATUS=$?

if [[ "$PYTHON_STATUS" -ne 0 ]]; then
    echo
    echo "============================================================"
    echo "RUN FAILED"
    echo "============================================================"
    echo "Embedded Python runner failed with status: $PYTHON_STATUS"
    echo "Aggregate update was skipped."
    echo "Existing experiment results were retained."
    echo "============================================================"

    false
else
    echo
    echo "Updating aggregate..."

    python3 \
        "$ROOT/automation/scripts/aggregate_results.py" \
        --project "$DATASET" \
        --metadata "$METADATA" \
        --output "$MASTER_OUTPUT"

    AGGREGATE_STATUS=$?

    if [[ "$AGGREGATE_STATUS" -ne 0 ]]; then
        echo
        echo "============================================================"
        echo "RUN FAILED"
        echo "============================================================"
        echo "Aggregate update failed with status: $AGGREGATE_STATUS"
        echo "Existing experiment results were retained."
        echo "============================================================"

        false
    else
        echo
        echo "============================================================"
        echo "RUN COMPLETE"
        echo "============================================================"

        echo
        echo "Master results:"
        echo "  $MASTER_OUTPUT"

        true
    fi
fi
