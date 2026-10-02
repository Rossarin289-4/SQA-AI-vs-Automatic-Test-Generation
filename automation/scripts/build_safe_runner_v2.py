from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
RUNNER = ROOT / "run_all.sh"

text = RUNNER.read_text(encoding="utf-8")
original = text


def require_once(label, marker):
    count = text.count(marker)
    if count != 1:
        raise RuntimeError(
            f"{label}: expected exactly 1 occurrence, found {count}"
        )


# ============================================================
# A. Header helper paths
# ============================================================

marker = 'MASTER_OUTPUT="$ROOT/automation/state/master_results.csv"\n'
require_once("header marker", marker)

replacement = marker + '''
CHECKPOINT_SCRIPT="$ROOT/automation/scripts/checkpoint.sh"
RESOURCE_POLICY_SCRIPT="$ROOT/automation/scripts/run_policy.sh"
BUG_COMPLETE_SCRIPT="$ROOT/automation/scripts/check_bug_complete.py"
CLEANUP_SCRIPT="$ROOT/automation/scripts/cleanup_completed_bug.py"
'''

text = text.replace(marker, replacement, 1)


# ============================================================
# B. Export helper paths
# ============================================================

marker = 'export MASTER_OUTPUT\n'
require_once("MASTER_OUTPUT export", marker)

replacement = marker + '''
export CHECKPOINT_SCRIPT
export RESOURCE_POLICY_SCRIPT
export BUG_COMPLETE_SCRIPT
export CLEANUP_SCRIPT
'''

text = text.replace(marker, replacement, 1)


# ============================================================
# C. Python environment paths
# ============================================================

marker = 'METHODS = [\n'
require_once("METHODS marker", marker)

insert_before = '''
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


'''

text = text.replace(marker, insert_before + marker, 1)


# ============================================================
# D. DONE method checkpoint
# ============================================================

marker = '    if current_status == "DONE":\n'
require_once("DONE status marker", marker)

old = '''    if current_status == "DONE":
        print(
            f"[SKIP] {DATASET}-{bug} {method}: DONE"
        )
'''

new = '''    if current_status == "DONE":
        checkpoint(bug, method, "DONE")
        print(
            f"[SKIP] {DATASET}-{bug} {method}: DONE"
        )
'''

require_once("DONE block", old)
text = text.replace(old, new, 1)


# ============================================================
# E. Pending checkpoint
# ============================================================

old = '''        print(
            f"[PENDING] {DATASET}-{bug} {method}: {new_status}"
        )

        return
'''

new = '''        checkpoint(bug, method, new_status)

        print(
            f"[PENDING] {DATASET}-{bug} {method}: {new_status}"
        )

        return
'''

require_once("pending block", old)
text = text.replace(old, new, 1)


# ============================================================
# F. EVALUATING -> RUNNING checkpoint
# ============================================================

old = '''    (artifact_dir / "status").write_text(
        "EVALUATING\\n",
        encoding="utf-8"
    )

    cmd = [
'''

new = '''    (artifact_dir / "status").write_text(
        "EVALUATING\\n",
        encoding="utf-8"
    )

    checkpoint(bug, method, "RUNNING")

    cmd = [
'''

require_once("evaluation block", old)
text = text.replace(old, new, 1)


# ============================================================
# G. Final status checkpoint
# ============================================================

old = '''    print(
        f"[{final_status}] {DATASET}-{bug} {method}"
    )
'''

new = '''    checkpoint(bug, method, final_status)

    print(
        f"[{final_status}] {DATASET}-{bug} {method}"
    )
'''

require_once("final status print", old)
text = text.replace(old, new, 1)


# ============================================================
# H. Exception checkpoint
# ============================================================

old = '''              print(
                  f"[FAILED] {DATASET}-{bug} {method}: {exc}"
              )
'''

new = '''              checkpoint(bug, method, "FAILED")

              print(
                  f"[FAILED] {DATASET}-{bug} {method}: {exc}"
              )
'''

require_once("exception print", old)
text = text.replace(old, new, 1)


# ============================================================
# I. Resource policy before bug loop
# ============================================================

old = '''print(
    f"Active bugs: {len(active_rows)}"
)

for index, row in enumerate(active_rows, 1):
'''

new = '''print(
    f"Active bugs: {len(active_rows)}"
)

print()
print("============================================================")
print("RESOURCE POLICY CHECK")
print("============================================================")

if not resource_policy():
    print("[STOP] Resource policy blocked the experiment.")
    sys.exit(3)

for index, row in enumerate(active_rows, 1):
'''

require_once("bug loop", old)
text = text.replace(old, new, 1)


# ============================================================
# J. Completion check before workspace preparation
# ============================================================

old = '''    print(
        f"===== BUG {index}/{len(active_rows)} : "
        f"{DATASET}-{bug} ====="
    )

    # Make sure both workspaces exist.
'''

new = '''    print(
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
'''

require_once("preparation block", old)
text = text.replace(old, new, 1)


# ============================================================
# K. Completion check after method loop
# ============================================================

marker = '''  print()
  print("============================================================")
  print("GENERATION / EVALUATION LOOP FINISHED")
'''

# Actual file uses four spaces in Python body before print.
# Use a safer substring that is known to exist.
marker2 = '''print()
print("============================================================")
print("GENERATION / EVALUATION LOOP FINISHED")
'''

require_once("loop finish marker", marker2)

replacement = '''      print()
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
              "Results and workspace are retained."
          )

''' + marker2

text = text.replace(marker2, replacement, 1)


# ============================================================
# L. Do not write anything if no changes occurred
# ============================================================

if text == original:
    raise RuntimeError("No changes were made.")

RUNNER.write_text(text, encoding="utf-8")

print("============================================================")
print("SAFE RUNNER PATCH V2 APPLIED")
print("============================================================")
print(f"Runner: {RUNNER}")
print(f"Original bytes: {len(original.encode('utf-8'))}")
print(f"New bytes     : {len(text.encode('utf-8'))}")
