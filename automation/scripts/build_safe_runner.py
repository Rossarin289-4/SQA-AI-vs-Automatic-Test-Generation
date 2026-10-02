from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
RUNNER = ROOT / "run_all.sh"

text = RUNNER.read_text(encoding="utf-8")

# ------------------------------------------------------------
# 1. Add helper paths after RESULT_ROOT / MASTER_OUTPUT
# ------------------------------------------------------------

old = '''RESULT_ROOT="$ROOT/automation/runs/${DATASET}"
MASTER_OUTPUT="$ROOT/automation/state/master_results.csv"
'''

new = '''RESULT_ROOT="$ROOT/automation/runs/${DATASET}"
MASTER_OUTPUT="$ROOT/automation/state/master_results.csv"

CHECKPOINT_SCRIPT="$ROOT/automation/scripts/checkpoint.sh"
RESOURCE_POLICY_SCRIPT="$ROOT/automation/scripts/run_policy.sh"
BUG_COMPLETE_SCRIPT="$ROOT/automation/scripts/check_bug_complete.py"
CLEANUP_SCRIPT="$ROOT/automation/scripts/cleanup_completed_bug.py"
'''

if text.count(old) != 1:
    raise RuntimeError(
        "STEP 124 failed: runner header anchor not found exactly once"
    )

text = text.replace(old, new, 1)

# ------------------------------------------------------------
# 2. Export helper paths
# ------------------------------------------------------------

old = '''export ROOT
export DATASET
export METADATA
export RESULT_ROOT
export MASTER_OUTPUT
'''

new = '''export ROOT
export DATASET
export METADATA
export RESULT_ROOT
export MASTER_OUTPUT
export CHECKPOINT_SCRIPT
export RESOURCE_POLICY_SCRIPT
export BUG_COMPLETE_SCRIPT
export CLEANUP_SCRIPT
'''

if text.count(old) != 1:
    raise RuntimeError(
        "STEP 124 failed: export block not found exactly once"
    )

text = text.replace(old, new, 1)

# ------------------------------------------------------------
# 3. Add Python helper functions after METHODS
# ------------------------------------------------------------

old = '''METHODS = [
    "ChatGPT",
    "Gemini",
    "SA",
    "BPSO",
]


def read_rows():
'''

new = '''METHODS = [
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
'''

if text.count(old) != 1:
    raise RuntimeError(
        "STEP 124 failed: METHODS anchor not found exactly once"
    )

text = text.replace(old, new, 1)

# ------------------------------------------------------------
# 4. DONE method -> checkpoint DONE
# ------------------------------------------------------------

old = '''    if current_status == "DONE":
        print(
            f"[SKIP] {DATASET}-{bug} {method}: DONE"
        )
        return
'''

new = '''    if current_status == "DONE":
        checkpoint(bug, method, "DONE")
        print(
            f"[SKIP] {DATASET}-{bug} {method}: DONE"
        )
        return
'''

if text.count(old) != 1:
    raise RuntimeError(
        "STEP 124 failed: DONE block not found exactly once"
    )

text = text.replace(old, new, 1)

# ------------------------------------------------------------
# 5. Pending status -> checkpoint same status
# ------------------------------------------------------------

old = '''        (artifact_dir / "status").write_text(
            new_status + "\\n",
            encoding="utf-8"
        )

        print(
            f"[PENDING] {DATASET}-{bug} {method}: {new_status}"
        )

        return
'''

new = '''        (artifact_dir / "status").write_text(
            new_status + "\\n",
            encoding="utf-8"
        )

        checkpoint(bug, method, new_status)

        print(
            f"[PENDING] {DATASET}-{bug} {method}: {new_status}"
        )

        return
'''

if text.count(old) != 1:
    raise RuntimeError(
        "STEP 124 failed: pending block not found exactly once"
    )

text = text.replace(old, new, 1)

# ------------------------------------------------------------
# 6. Artifact validation failure -> checkpoint FAILED
# ------------------------------------------------------------

old = '''        (artifact_dir / "status").write_text(
            "FAILED\\n",
            encoding="utf-8"
        )

        print(
            f"[FAILED] {DATASET}-{bug} {method}: invalid artifact"
        )

        return
'''

new = '''        (artifact_dir / "status").write_text(
            "FAILED\\n",
            encoding="utf-8"
        )

        checkpoint(bug, method, "FAILED")

        print(
            f"[FAILED] {DATASET}-{bug} {method}: invalid artifact"
        )

        return
'''

if text.count(old) != 1:
    raise RuntimeError(
        "STEP 124 failed: artifact failure block not found exactly once"
    )

text = text.replace(old, new, 1)

# ------------------------------------------------------------
# 7. Package/class failure -> checkpoint FAILED
# ------------------------------------------------------------

old = '''        (artifact_dir / "status").write_text(
            "FAILED\\n",
            encoding="utf-8"
        )

        print(
            f"[FAILED] {DATASET}-{bug} {method}: cannot determine package/class"
        )

        return
'''

new = '''        (artifact_dir / "status").write_text(
            "FAILED\\n",
            encoding="utf-8"
        )

        checkpoint(bug, method, "FAILED")

        print(
            f"[FAILED] {DATASET}-{bug} {method}: cannot determine package/class"
        )

        return
'''

if text.count(old) != 1:
    raise RuntimeError(
        "STEP 124 failed: package/class failure block not found exactly once"
    )

text = text.replace(old, new, 1)

# ------------------------------------------------------------
# 8. EVALUATING -> checkpoint RUNNING
# ------------------------------------------------------------

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

if text.count(old) != 1:
    raise RuntimeError(
        "STEP 124 failed: EVALUATING block not found exactly once"
    )

text = text.replace(old, new, 1)

# ------------------------------------------------------------
# 9. Final status -> checkpoint
# ------------------------------------------------------------

old = '''    (
        artifact_dir / "status"
    ).write_text(
        final_status + "\\n",
        encoding="utf-8"
    )

    print(
        f"[{final_status}] {DATASET}-{bug} {method}"
    )
'''

new = '''    (
        artifact_dir / "status"
    ).write_text(
        final_status + "\\n",
        encoding="utf-8"
    )

    checkpoint(bug, method, final_status)

    print(
        f"[{final_status}] {DATASET}-{bug} {method}"
    )
'''

if text.count(old) != 1:
    raise RuntimeError(
        "STEP 124 failed: final status block not found exactly once"
    )

text = text.replace(old, new, 1)

# ------------------------------------------------------------
# 10. Resource policy before bug loop
# ------------------------------------------------------------

old = '''print(
    f"Active bugs: {len(active_rows)}"
)

for index, row in enumerate(active_rows, 1):
'''

new = '''print(
    f"Active bugs: {len(active_rows)}"
)

if not resource_policy():
    print("[STOP] Resource policy blocked the experiment.")
    sys.exit(3)

for index, row in enumerate(active_rows, 1):
'''

if text.count(old) != 1:
    raise RuntimeError(
        "STEP 124 failed: active bug loop anchor not found exactly once"
    )

text = text.replace(old, new, 1)

# ------------------------------------------------------------
# 11. Completion check before workspace preparation
# ------------------------------------------------------------

old = '''      print(
          f"===== BUG {index}/{len(active_rows)} : "
          f"{DATASET}-{bug} ====="
      )

      # Make sure both workspaces exist.
'''

new = '''      print(
          f"===== BUG {index}/{len(active_rows)} : "
          f"{DATASET}-{bug} ====="
      )

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

if text.count(old) != 1:
    raise RuntimeError(
        "STEP 124 failed: bug loop preparation anchor not found exactly once"
    )

text = text.replace(old, new, 1)

# ------------------------------------------------------------
# 12. Exception -> checkpoint FAILED
# ------------------------------------------------------------

old = '''              (artifact_dir / "status").write_text(
                  "FAILED\\n",
                  encoding="utf-8"
              )

              (artifact_dir / "error.txt").write_text(
                  repr(exc) + "\\n",
                  encoding="utf-8"
              )

              print(
                  f"[FAILED] {DATASET}-{bug} {method}: {exc}"
              )
'''

new = '''              (artifact_dir / "status").write_text(
                  "FAILED\\n",
                  encoding="utf-8"
              )

              (artifact_dir / "error.txt").write_text(
                  repr(exc) + "\\n",
                  encoding="utf-8"
              )

              checkpoint(bug, method, "FAILED")

              print(
                  f"[FAILED] {DATASET}-{bug} {method}: {exc}"
              )
'''

if text.count(old) != 1:
    raise RuntimeError(
        "STEP 124 failed: exception block not found exactly once"
    )

text = text.replace(old, new, 1)

# ------------------------------------------------------------
# 13. Completion check after all methods
# ------------------------------------------------------------

old = '''          except Exception as exc:
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
                  "FAILED\\n",
                  encoding="utf-8"
              )

              (artifact_dir / "error.txt").write_text(
                  repr(exc) + "\\n",
                  encoding="utf-8"
              )

              checkpoint(bug, method, "FAILED")

              print(
                  f"[FAILED] {DATASET}-{bug} {method}: {exc}"
              )

print()
print("============================================================")
'''

new = '''          except Exception as exc:
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
                  "FAILED\\n",
                  encoding="utf-8"
              )

              (artifact_dir / "error.txt").write_text(
                  repr(exc) + "\\n",
                  encoding="utf-8"
              )

              checkpoint(bug, method, "FAILED")

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
              "Workspaces/results are retained."
          )

print()
print("============================================================")
'''

if text.count(old) != 1:
    raise RuntimeError(
        "STEP 124 failed: post-method anchor not found exactly once"
    )

text = text.replace(old, new, 1)

RUNNER.write_text(text, encoding="utf-8")

print("SAFE RUNNER PATCH APPLIED")
print(f"Runner: {RUNNER}")
