#!/usr/bin/env python3
"""Run Defects4J's *original triggering tests* for every active Lang bug.

This is an environment/baseline check. Its tests must NEVER be credited to
ChatGPT, Gemini, SA, or BPSO as newly generated tests.
"""

import argparse
import csv
import json
import re
import shutil
import subprocess
import sys
import time
from datetime import datetime, timezone
from pathlib import Path

ROOT = Path(__file__).resolve().parents[1]
STUDY = ROOT / "lang-study"
INDEX = STUDY / "bug-index.csv"
FAILURES = re.compile(r"Failing tests:\s*(\d+)")


def run(command, cwd, log, timeout):
    start = time.monotonic()
    try:
        result = subprocess.run(command, cwd=cwd, text=True,
                                stdout=subprocess.PIPE, stderr=subprocess.STDOUT,
                                timeout=timeout, check=False)
        output = result.stdout
        code = result.returncode
    except subprocess.TimeoutExpired as exc:
        output = (exc.stdout or b"")
        if isinstance(output, bytes):
            output = output.decode("utf-8", errors="replace")
        output += "\nTIMEOUT\n"
        code = 124
    log.parent.mkdir(parents=True, exist_ok=True)
    log.write_text("$ " + " ".join(map(str, command)) + "\n" + output,
                   encoding="utf-8")
    try:
        log_path = str(log.relative_to(ROOT))
    except ValueError:
        log_path = str(log)
    return {"exit_code": code, "seconds": round(time.monotonic() - start, 3),
            "log": log_path}


def check(result, step):
    if result["exit_code"] != 0:
        raise RuntimeError(f"{step} failed (exit {result['exit_code']}); see {result['log']}")


def write_json(path, data):
    path.parent.mkdir(parents=True, exist_ok=True)
    temporary = path.with_suffix(".tmp")
    temporary.write_text(json.dumps(data, indent=2, ensure_ascii=False) + "\n",
                         encoding="utf-8")
    temporary.replace(path)


def update_baseline_status(bug, status):
    with INDEX.open(newline="", encoding="utf-8") as stream:
        rows = list(csv.DictReader(stream))
    for row in rows:
        if row["bug_id"] == bug:
            row["baseline"] = status
    temporary = INDEX.with_suffix(".tmp")
    with temporary.open("w", newline="", encoding="utf-8") as stream:
        writer = csv.DictWriter(stream, fieldnames=rows[0].keys())
        writer.writeheader()
        writer.writerows(rows)
    temporary.replace(INDEX)
    status_file = STUDY / "bugs" / bug / "STATUS.md"
    if status_file.exists():
        old = status_file.read_text(encoding="utf-8")
        old = re.sub(r"(?m)^- Defects4J baseline: .*?$",
                     f"- Defects4J baseline: {status} (see `lang-study/runs/{bug}/baseline/summary.json`)", old)
        status_file.write_text(old, encoding="utf-8")


def parse_ids(rows, value):
    known = {row["bug_id"] for row in rows}
    if value:
        requested = [x.strip() for x in value.split(",") if x.strip()]
        ids = [x if x.startswith("Lang-") else "Lang-" + x for x in requested]
        unknown = set(ids) - known
        if unknown:
            raise ValueError("Not active Lang bug IDs: " + ", ".join(sorted(unknown)))
        return list(dict.fromkeys(ids))
    return [row["bug_id"] for row in rows]


def one_bug(row, executable, work_root, runs_root, timeout):
    bug = row["bug_id"]
    number = bug.split("-")[1]
    out = runs_root / bug / "baseline"
    summary_path = out / "summary.json"
    summary = {"bug_id": bug, "report_id": row["report_id"],
               "kind": "original_defects4j_triggering_tests", "status": "running",
               "started_utc": datetime.now(timezone.utc).isoformat(), "steps": {},
               "tests": []}
    write_json(summary_path, summary)
    try:
        directories = {}
        for suffix in ("b", "f"):
            target = work_root / (bug + suffix)
            directories[suffix] = target
            if not (target / ".defects4j.config").is_file():
                if target.exists() and any(target.iterdir()):
                    raise RuntimeError(f"{target} exists but is not a Defects4J checkout")
                target.parent.mkdir(parents=True, exist_ok=True)
                step = run([executable, "checkout", "-p", "Lang", "-v",
                            number + suffix, "-w", str(target)], ROOT,
                           out / f"checkout-{suffix}.log", timeout)
                summary["steps"][f"checkout_{suffix}"] = step
                check(step, f"checkout {suffix}")
            step = run([executable, "compile"], target,
                       out / f"compile-{suffix}.log", timeout)
            summary["steps"][f"compile_{suffix}"] = step
            check(step, f"compile {suffix}")

        step = run([executable, "export", "-p", "tests.trigger"],
                   directories["b"], out / "triggers.log", timeout)
        summary["steps"]["export_triggers"] = step
        check(step, "export triggers")
        contents = (out / "triggers.log").read_text(encoding="utf-8").splitlines()[1:]
        triggers = [line.strip() for line in contents
                    if "::" in line and not line.lstrip().startswith("#")]
        if not triggers:
            raise RuntimeError("No triggering test names returned by export")
        summary["trigger_count"] = len(triggers)

        for index, test in enumerate(triggers, 1):
            item = {"test": test}
            summary["tests"].append(item)
            for suffix in ("b", "f"):
                step = run([executable, "test", "-t", test], directories[suffix],
                           out / f"test-{index:03d}-{suffix}.log", timeout)
                item[suffix] = step
                match = FAILURES.search((ROOT / step["log"]).read_text(encoding="utf-8"))
                if match is None:
                    raise RuntimeError(f"No 'Failing tests' count for {test} on {suffix}")
                step["failing_tests"] = int(match.group(1))
                if step["exit_code"] != 0:
                    step["note"] = "Nonzero exit despite a parseable test count; review log"
            item["detects_bug"] = (item["b"]["failing_tests"] > 0
                                   and item["f"]["failing_tests"] == 0)
            write_json(summary_path, summary)

        summary["status"] = "verified" if all(t["detects_bug"] for t in summary["tests"]) else "unexpected_result"
        summary["detected_by_any_original_trigger"] = any(t["detects_bug"] for t in summary["tests"])
    except Exception as exc:
        summary["status"] = "error"
        summary["error"] = str(exc)
    finally:
        summary["finished_utc"] = datetime.now(timezone.utc).isoformat()
        write_json(summary_path, summary)
    return summary["status"]


def main():
    parser = argparse.ArgumentParser(description=__doc__)
    parser.add_argument("--all", action="store_true", help="all 61 active Lang bugs")
    parser.add_argument("--ids", help="comma-separated IDs, e.g. 3,4,Lang-5")
    parser.add_argument("--list", action="store_true", help="show selected IDs")
    parser.add_argument("--dry-run", action="store_true", help="show intended commands only")
    parser.add_argument("--resume", action="store_true", help="skip verified baseline results")
    parser.add_argument("--timeout", type=int, default=900, help="seconds per command")
    parser.add_argument("--work-root", type=Path, default=ROOT / "projects" )
    parser.add_argument("--runs-root", type=Path, default=STUDY / "runs")
    args = parser.parse_args()
    if not (args.all or args.ids):
        parser.error("choose --all or --ids")
    with INDEX.open(newline="", encoding="utf-8") as stream:
        rows = list(csv.DictReader(stream))
    if len(rows) != 61 or len({r["bug_id"] for r in rows}) != 61:
        parser.error("bug-index.csv must contain exactly 61 unique active Lang bugs")
    try:
        selected = parse_ids(rows, args.ids)
    except ValueError as exc:
        parser.error(str(exc))
    if args.list or args.dry_run:
        for bug in selected:
            print(bug)
        print(f"Selected: {len(selected)} / 61; baseline only (original triggers)")
        return 0
    executable = shutil.which("defects4j")
    if executable is None:
        parser.error("defects4j not found in PATH; see lang-study/README.md")
    print("Java:", subprocess.run(["java", "-version"], text=True,
                                   stderr=subprocess.PIPE).stderr.splitlines()[0], flush=True)
    failures = 0
    for row in rows:
        bug = row["bug_id"]
        if bug not in selected:
            continue
        prior = args.runs_root / bug / "baseline" / "summary.json"
        if args.resume and prior.exists() and json.loads(prior.read_text(encoding="utf-8")).get("status") == "verified":
            print(f"{bug}: skipped verified", flush=True)
            continue
        status = one_bug(row, executable, args.work_root.resolve(),
                         args.runs_root.resolve(), args.timeout)
        if args.runs_root.resolve() == (STUDY / "runs").resolve():
            update_baseline_status(bug, status)
        print(f"{bug}: {status}", flush=True)
        failures += status != "verified"
    return 1 if failures else 0


if __name__ == "__main__":
    sys.exit(main())
