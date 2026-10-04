#!/usr/bin/env python3
"""Export TestBench runs into the team repository layout (branch rossarin/SQA_Project_2026):

    <Project>/<Method>/Code/            generator sources (algorithms) or the prompt templates (AI)
    <Project>/<Method>/Configuration/   <Project>-<bug>-<Method>-config.txt
    <Project>/<Method>/Result/Bug-<n>/  coverage.csv, fdr_summary.csv, evaluation.json, generated_test.java, benchmark.json, logs
    <Project>/<Method>/Test/            Defects4J suite archives (<Project>-<n>f-<method>.1.tar.bz2)
    <Project>/<Method>/TestCode/        the generated JUnit classes
    master_results.csv                  one row per project/bug/method (appended/replaced for TestBench methods)

Nothing of the team's own files is modified except master_results.csv, where rows of the same (project, bug, method)
produced by TestBench are replaced. Usage:
    python3 testbench/scripts/export_team_layout.py --output <ai-runs dir> --dest <repository root>
"""
import argparse, csv, glob, json, os, re, shutil

METHOD_NAMES = {"sa": "TestBench-SA", "pso": "TestBench-BPSO", "ga": "TestBench-GA", "random": "TestBench-Random"}
SOURCE_FILES = {
    "algorithm": ["src/main/java/edu/kku/sqa/GenericSearchTestGenerator.java", "src/main/resources/generator/GenericFitnessWorker.java",
                  "src/main/resources/generator/SearchInputFactory_scaffolding.java", "src/main/resources/generator/BranchAgent.java",
                  "src/main/resources/generator/BranchRecorder.java", "src/main/java/edu/kku/sqa/Defects4jRunner.java"],
}


def load(path, default=None):
    try:
        with open(path, encoding="utf-8") as f:
            return json.load(f)
    except Exception:
        return default


def copy(src, dst):
    if os.path.isfile(src):
        os.makedirs(os.path.dirname(dst), exist_ok=True)
        shutil.copy2(src, dst)
        return True
    return False


def safe(name):
    return re.sub(r"[^A-Za-z0-9._-]+", "_", name).strip("_")


def coverage_row(version):
    cov = (version or {}).get("coverage") or {}
    return [cov.get("linesTotal", ""), cov.get("linesCovered", ""), round(cov["lineCoveragePercent"], 1) if cov.get("lineCoveragePercent") is not None else "",
            cov.get("branchesTotal", ""), cov.get("branchesCovered", ""), round(cov["branchCoveragePercent"], 1) if cov.get("branchCoveragePercent") is not None else ""]


def failing_count(version):
    text = (version or {}).get("failingTests") or ""
    return len([line for line in text.splitlines() if line.startswith("--- ") and "::" in line])


def export_row(row, meta, run_dir, dest, app_root, master):
    project, bug = meta["project"], meta["bugId"]
    bench = row.get("benchmark") or {}
    is_ai = row.get("mode") in ("direct", "batch")
    if is_ai:
        method = "TestBench-" + safe(row.get("label", "AI"))
        folder = next((f for f in os.listdir(run_dir) if f.startswith("model-") and os.path.isdir(os.path.join(run_dir, f))
                       and safe(row.get("label", "")) in safe(f)), None)
        if folder is None:
            folder = next((f for f in os.listdir(run_dir) if f.startswith("model-")), None)
    else:
        method = METHOD_NAMES.get(row.get("model"), str(row.get("model")))
        folder = "algorithm-" + str(row.get("model"))
    if folder is None:
        return
    mdir = os.path.join(run_dir, folder)
    base = os.path.join(dest, project, method)
    result = os.path.join(base, "Result", "Bug-" + bug)
    os.makedirs(result, exist_ok=True)

    # generated tests
    java_files = glob.glob(os.path.join(mdir, "generated", "original", "suite-root", "**", "*.java"), recursive=True)
    for f in java_files:
        name = os.path.basename(f)
        copy(f, os.path.join(base, "TestCode", project + "-" + bug + "-" + name))
        if not name.endswith("_scaffolding.java"):
            copy(f, os.path.join(result, "generated_test.java"))
    copy(os.path.join(mdir, "evaluation", "buggy", "test-suite.tar.bz2"), os.path.join(base, "Test", "%s-%sf-%s.1.tar.bz2" % (project, bug, method.lower())))
    copy(os.path.join(mdir, "evaluation", "original-test-suite.tar.bz2"), os.path.join(result, "suite-before-repair.tar.bz2"))

    # evidence
    copy(os.path.join(mdir, "report", "benchmark.json"), os.path.join(result, "benchmark.json"))
    copy(os.path.join(mdir, "report", "generation.json"), os.path.join(result, "generation.json"))
    copy(os.path.join(mdir, "report", "bug-analysis.json"), os.path.join(result, "bug-analysis.json"))
    copy(os.path.join(mdir, "generated", "original", "test-inputs.csv"), os.path.join(result, "selected_inputs.csv"))
    for side in ("buggy", "fixed"):
        for name in ("test.log", "coverage.log", "test-rerun.log"):
            copy(os.path.join(mdir, "evaluation", side, "logs", name), os.path.join(result, side, name))
        for name in ("failing_tests", "all_tests", "summary.csv"):
            copy(os.path.join(mdir, "evaluation", side, "evidence", name), os.path.join(result, side, name))
    copy(os.path.join(mdir, "evaluation", "repair", "suites", "fix_test_suite.summary.log"), os.path.join(result, "fix_test_suite.summary.log"))
    if is_ai:
        copy(os.path.join(run_dir, "prompt-used.txt"), os.path.join(result, "prompt.txt"))
        copy(os.path.join(run_dir, "system-skill-used.md"), os.path.join(result, "system_instruction.md"))
        copy(os.path.join(mdir, "generated", "original", "response.md"), os.path.join(result, "raw_output.txt"))
        for r in glob.glob(os.path.join(mdir, "generated", "repair-*")):
            for f in os.listdir(r):
                copy(os.path.join(r, f), os.path.join(result, os.path.basename(r), f))

    versions = bench.get("versions") or {}
    b, f_ = versions.get("b") or {}, versions.get("f") or {}
    with open(os.path.join(result, "coverage.csv"), "w", newline="", encoding="utf-8") as out:
        w = csv.writer(out)
        w.writerow(["version", "lines_total", "lines_covered", "line_coverage", "conditions_total", "conditions_covered", "branch_coverage"])
        w.writerow(["Buggy"] + coverage_row(b))
        w.writerow(["Fixed"] + coverage_row(f_))
    tests = bench.get("validTests") if bench.get("validTests") is not None else bench.get("uniqueTests")
    detected = len(bench.get("detectedTests") or [])
    evaluated = tests if b.get("testStatus") in ("PASS", "FAIL") and f_.get("testStatus") in ("PASS", "FAIL") else 0
    fdr = round(detected * 100.0 / evaluated, 2) if evaluated else 0.0
    bf, ff = failing_count(b), failing_count(f_)
    with open(os.path.join(result, "fdr_summary.csv"), "w", newline="", encoding="utf-8") as out:
        w = csv.writer(out)
        w.writerow(["tests_generated", "evaluated_tests", "detected_tests", "buggy_passed", "buggy_failed", "buggy_error", "fixed_passed", "fixed_failed", "fixed_error", "FDR"])
        w.writerow([bench.get("uniqueTests", ""), evaluated, detected, (evaluated - bf) if evaluated else "", bf, 1 if b.get("testStatus") == "ERROR" else 0,
                    (evaluated - ff) if evaluated else "", ff, 1 if f_.get("testStatus") == "ERROR" else 0, fdr])
    evaluation = {
        "project": project, "bug": bug, "method": method, "detection": bench.get("detection"), "detected_tests": bench.get("detectedTests"),
        "buggy_status": b.get("testStatus"), "fixed_status": f_.get("testStatus"), "patch_coverage": bench.get("patchCoverage"),
        "suite_repair": bench.get("suiteRepair"), "reference_version": "fixed" if (meta.get("algorithmOracle") == "fixed" and not is_ai) or (is_ai and meta.get("aiSourceVersion") == "fixed") else "buggy",
        "defects4j_version": bench.get("defects4jVersion"), "prompt_version": meta.get("promptVersion") if is_ai else None,
        "repair_rounds": row.get("repairRounds") if is_ai else None, "actual_model": row.get("actualModel") if is_ai else None,
        "tokens": {"input": row.get("promptTokens"), "output": row.get("completionTokens")} if is_ai else None,
    }
    with open(os.path.join(result, "evaluation.json"), "w", encoding="utf-8") as out:
        json.dump(evaluation, out, indent=2, ensure_ascii=False)

    # configuration
    cfg = os.path.join(base, "Configuration", "%s-%s-%s-config.txt" % (project, bug, method))
    os.makedirs(os.path.dirname(cfg), exist_ok=True)
    gen = bench
    lines = ["Method: %s" % method, "Defects4J Project: %s" % project, "Bug: %s-%s" % (project, bug),
             "Defects4J version: %s" % bench.get("defects4jVersion", ""), "Reference version: %s" % evaluation["reference_version"],
             "Test framework: %s" % (gen.get("testStyle") or "JUnit 4"), "Generated by: TestBench (testbench/ in this repository)"]
    if not is_ai:
        lines += ["Search budget (s): %s" % gen.get("budgetSeconds", ""), "Seed: %s" % gen.get("seed", ""), "Repetition: %s" % gen.get("repetition", ""),
                  "Search strategy: %s" % gen.get("searchStrategy", ""), "Fitness: %s" % gen.get("fitness", ""),
                  "Input construction: %s" % gen.get("inputConstruction", ""), "Max tests: 300; suite repaired on fixed with Defects4J fix_test_suite.pl"]
    else:
        lines += ["AI: %s (%s)" % (row.get("label"), row.get("actualModel")), "Prompt version: %s" % meta.get("promptVersion", ""),
                  "Compile-repair rounds allowed: %s" % meta.get("aiRepairRounds", 0), "Output limit (tokens): %s" % meta.get("maxTokens", 0),
                  "Sampling: %s" % meta.get("sampling", "")]
    with open(cfg, "w", encoding="utf-8") as out:
        out.write("\n".join(lines) + "\n")

    # code
    if not is_ai:
        for rel in SOURCE_FILES["algorithm"]:
            copy(os.path.join(app_root, rel), os.path.join(base, "Code", os.path.basename(rel)))
    else:
        for rel in glob.glob(os.path.join(app_root, "prompts", "*.md")) + glob.glob(os.path.join(app_root, "prompts", "versions", "*.md")):
            copy(rel, os.path.join(base, "Code", os.path.relpath(rel, os.path.join(app_root, "prompts"))))

    gen_time = round((row.get("elapsedMs") or bench.get("generationElapsedMs") or 0) / 1000.0, 3)
    exec_time = round(((b.get("testElapsedMs") or 0) + (f_.get("testElapsedMs") or 0) + (b.get("coverageElapsedMs") or 0) + (f_.get("coverageElapsedMs") or 0)) / 1000.0, 3)
    master[(project, int(bug), method)] = {
        "project": project, "bug": bug, "method": method, "tests": tests if tests is not None else "", "fdr": fdr,
        "line_cov_buggy": coverage_row(b)[2], "branch_cov_buggy": coverage_row(b)[5], "line_cov_fixed": coverage_row(f_)[2], "branch_cov_fixed": coverage_row(f_)[5],
        "gen_time": gen_time, "exec_time": exec_time, "total_time": round(gen_time + exec_time, 3),
        "status": "DONE" if bench.get("status") == "COMPLETED" else ("ERROR" if bench else "NO_SUITE"),
    }


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--output", required=True, help="TestBench output/ai-runs directory")
    ap.add_argument("--dest", required=True, help="team repository root")
    ap.add_argument("--app-root", default=os.path.join(os.path.dirname(os.path.abspath(__file__)), ".."))
    args = ap.parse_args()
    master = {}
    # latest completed run per (project, bug, method)
    for meta_file in sorted(glob.glob(os.path.join(args.output, "*", "*", "metadata.json"))):
        meta = load(meta_file)
        if not meta or meta.get("project") is None:
            continue
        run_dir = os.path.dirname(meta_file)
        for row in meta.get("results", []):
            bench = row.get("benchmark") or {}
            if row.get("mode") == "skipped" or not bench:
                continue
            export_row(row, meta, run_dir, args.dest, os.path.abspath(args.app_root), master)
    # master_results.csv: keep the team's rows, replace rows of the same (project, bug, method)
    master_path = os.path.join(args.dest, "master_results.csv")
    header = ["project", "bug", "method", "tests", "fdr", "line_cov_buggy", "branch_cov_buggy", "line_cov_fixed", "branch_cov_fixed", "gen_time", "exec_time", "total_time", "status"]
    rows = []
    if os.path.isfile(master_path):
        with open(master_path, encoding="utf-8") as f:
            for r in csv.DictReader(f):
                key = (r.get("project"), int(r.get("bug") or 0), r.get("method"))
                if key not in master:
                    rows.append(r)
    rows += [master[k] for k in sorted(master)]
    with open(master_path, "w", newline="", encoding="utf-8") as f:
        w = csv.DictWriter(f, fieldnames=header, extrasaction="ignore")
        w.writeheader()
        for r in rows:
            w.writerow(r)
    print("exported %d result rows into %s" % (len(master), args.dest))


if __name__ == "__main__":
    main()
