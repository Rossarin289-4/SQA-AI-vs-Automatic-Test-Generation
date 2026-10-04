#!/usr/bin/env python3
"""Build the submission tree required by the assignment (CP353201) from the runs in output/ai-runs.

    <ProjectName>/
      README.md
      <Algorithm>/   Code/  Configuration/  Result_Round1/ Result_Round2/ ...  Test/
      <AI name>/     Prompt/  Result/  TestCode/
      Summary/       (comparison tables)
      TestBench-App/ (the application, prompts and configuration needed to reproduce)

A "round" is one repetition of the experiment (campaign repetition 0 = Round1). Only runs made with one prompt version
are exported (default: the current prompts/prompt-version.txt) so rounds from different prompts never mix.
Usage: python3 scripts/export_submission.py [--app-root .] [--dest submission] [--prompt-version v4] [--all-versions]
"""
import argparse, csv, glob, json, os, shutil, sys, zipfile

ALGO_METHOD = {"sa": "Search.sa()", "pso": "Search.pso()", "ga": "Search.ga()", "random": "Search.randomSearch()"}
ALGO_PARAMS = {
    "sa": ["Candidate = (target method, one value index per parameter) drawn from the type's domain.",
           "Fitness = sum of 1/(1+count) over the novel features of the candidate (target, parameter partitions, outcome kind/type/short value).",
           "Neighbour: change 1 gene (15% chance 2) among the genes of the current target.",
           "Temperature T = 8 * (0.05/8)^(elapsed/epoch); epoch = max(1 s, budget/5); acceptance exp((f_new - f)/T) for worse candidates.",
           "Restart from a random candidate when the epoch ends or after 3000 evaluations without a new feature."],
    "pso": ["Binary encoding: every gene is coded with ceil(log2(domain size)) bits; 12 particles.",
            "Velocity v = 0.68 v + 1.45 r1 (pBest - x) + 1.45 r2 (gBest - x), clamped to [-6, 6]; bit = 1 with probability sigmoid(v).",
            "gBest is re-derived from the pBests every sweep because the fitness surface changes as features are found.",
            "Half of the swarm is re-seeded after 3000 evaluations without a new feature."],
    "ga": ["Population 16, tournament selection (4 contenders), uniform crossover, 1-2 gene mutation.",
           "Half of the population is replaced by random individuals after 3000 evaluations without a new feature."],
    "random": ["Uniform random candidates (target and values); baseline."],
}
COMMON = ["Search budget is wall-clock seconds per algorithm per bug (pauses are excluded); the suite is capped at 150 tests, 10 per target.",
          "Seed = 31-hash of project|bug|algorithm|repetition|2026 (a different seed for every round).",
          "Expected values are recorded from the BUGGY version and replayed in a fresh JVM (reverse order); only reproducible outcomes become assertions.",
          "Input domains: boundary values per type, null for reference types, and string/number constants read from the bytecode of the modified classes.",
          "Evaluation: the same suite archive (same SHA-256) runs on buggy and fixed with `defects4j test` and `defects4j coverage`; a defect is detected only if the same test method fails on buggy and passes on fixed (confirmed by a second run)."]


def read_json(path, default=None):
    try:
        with open(path, encoding="utf-8") as f: return json.load(f)
    except Exception: return default


def copy_file(src, dst):
    if os.path.isfile(src):
        os.makedirs(os.path.dirname(dst), exist_ok=True); shutil.copy2(src, dst); return True
    return False


def copy_tree_files(src_dir, dst_dir, pattern="*"):
    n = 0
    for f in glob.glob(os.path.join(src_dir, "**", pattern), recursive=True):
        if os.path.isfile(f):
            n += copy_file(f, os.path.join(dst_dir, os.path.relpath(f, src_dir)))
    return n


def eval_files(method_dir, dst):
    """Small evidence files of one evaluated generator: reports, logs, failing tests, coverage, the suite archive."""
    copy_file(os.path.join(method_dir, "report", "benchmark.json"), os.path.join(dst, "benchmark.json"))
    copy_file(os.path.join(method_dir, "report", "generation.json"), os.path.join(dst, "generation.json"))
    copy_file(os.path.join(method_dir, "generated", "original", "test-inputs.csv"), os.path.join(dst, "test-inputs.csv"))
    for side in ("buggy", "fixed"):
        ev = os.path.join(method_dir, "evaluation", side)
        for name in ("test.log", "test-rerun.log", "coverage.log"):
            copy_file(os.path.join(ev, "logs", name), os.path.join(dst, side, name))
        for name in ("failing_tests", "all_tests", "summary.csv"):
            # the checkout is removed after evaluation; its small evidence files are kept in evidence/
            if not copy_file(os.path.join(ev, "workspace", name), os.path.join(dst, side, name)):
                copy_file(os.path.join(ev, "evidence", name), os.path.join(dst, side, name))
    copy_file(os.path.join(method_dir, "evaluation", "buggy", "test-suite.tar.bz2"), os.path.join(dst, "test-suite.tar.bz2"))


def d4j_version(output):
    """Defects4J version recorded in the exported runs (older runs did not store it)."""
    for meta in sorted(glob.glob(os.path.join(output, "*", "*", "metadata.json"))):
        v = read_json(meta, {}).get("defects4jVersion")
        if v: return v
    return "unknown (not recorded in these runs)"


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--app-root", default=".")
    ap.add_argument("--output", default=None)
    ap.add_argument("--dest", default="submission")
    ap.add_argument("--prompt-version", default=None)
    ap.add_argument("--all-versions", action="store_true")
    ap.add_argument("--zip", action="store_true")
    a = ap.parse_args()
    root = os.path.abspath(a.app_root)
    output = a.output or os.path.join(root, "output", "ai-runs")
    info = read_json(os.path.join(root, "submission-info.json"), {})
    name = info.get("projectName", "TestBench-SQA-2026")
    version = a.prompt_version
    if not version:
        try: version = open(os.path.join(root, "prompts", "prompt-version.txt")).read().strip()
        except Exception: version = ""
    dest = os.path.join(os.path.abspath(a.dest), name)
    if os.path.isdir(dest): shutil.rmtree(dest)
    os.makedirs(dest)

    runs = []
    for meta_path in sorted(glob.glob(os.path.join(output, "*", "*", "metadata.json"))):
        meta = read_json(meta_path)
        if not meta or meta.get("project") is None: continue
        rv = meta.get("promptVersion", "")
        has_ai = bool(meta.get("requestedModels")) and meta.get("experimentMode") != "algorithms-only"
        if has_ai and not a.all_versions and version and rv != version: continue
        runs.append((os.path.dirname(meta_path), meta))
    if not runs:
        print("no runs found in", output); sys.exit(1)

    taken, summary_rows, algorithms_seen, ais_seen = set(), [], set(), {}
    for run_dir, meta in runs:
        project, bug, run_id = meta["project"], meta["bugId"], meta["runId"]
        bug_dir = "%s-%s" % (project, bug)
        rnd = "Round%d" % (int(meta.get("repetition", 0)) + 1)
        rv = meta.get("promptVersion", "") or "unversioned"
        key = (bug_dir, rnd, rv if a.all_versions else "", meta.get("algorithmOracle", "buggy"))
        tag = rnd if key not in taken else "%s_%s" % (rnd, run_id)
        taken.add(key)
        models, folders = meta.get("requestedModels", []), meta.get("modelFolders", [])
        algos = meta.get("algorithms", [])
        for i, row in enumerate(meta.get("results", [])):
            bench = row.get("benchmark") or {}
            versions = bench.get("versions") or {}
            cov = lambda s, k: ((versions.get(s) or {}).get("coverage") or {}).get(k)
            if i < len(models):
                label = "AI"
                folder = folders[i] if i < len(folders) else "model-%d" % (i + 1)
                ai_name = folder.split("-", 2)[2] if folder.count("-") >= 2 else folder
                if row.get("mode") == "skipped": continue
                ais_seen[ai_name] = True
                method_dir = os.path.join(run_dir, folder)
                vdir = ("/" + rv) if a.all_versions else ""
                base = os.path.join(dest, ai_name)
                sub = os.path.join(bug_dir + vdir, tag)
                copy_file(os.path.join(run_dir, "prompt-used.txt"), os.path.join(base, "Prompt", sub, "prompt-used.txt"))
                copy_file(os.path.join(run_dir, "system-skill-used.md"), os.path.join(base, "Prompt", sub, "system-skill-used.md"))
                copy_file(os.path.join(run_dir, "buggy-source-prompt.txt"), os.path.join(base, "Prompt", sub, "buggy-source-sent.txt"))
                gen = os.path.join(method_dir, "generated", "original")
                copy_file(os.path.join(gen, "response.md"), os.path.join(base, "Result", sub, "response.md"))
                copy_file(os.path.join(method_dir, "report", "ai-report.md"), os.path.join(base, "Result", sub, "ai-report.md"))
                eval_files(method_dir, os.path.join(base, "Result", sub))
                for f in glob.glob(os.path.join(gen, "*.java")):
                    copy_file(f, os.path.join(base, "TestCode", sub, os.path.basename(f)))
                gname = ai_name
            else:
                code = algos[i - len(models)] if i - len(models) < len(algos) else ""
                if not code: continue
                gname = (info.get("algorithms") or {}).get(code, code)
                algorithms_seen.add(code)
                method_dir = os.path.join(run_dir, "algorithm-" + code)
                base = os.path.join(dest, gname)
                # runs whose expected values come from the fixed version are kept apart from the default (buggy) ones
                alg_bug = bug_dir + ("__oracle-fixed" if (row.get("benchmark") or {}).get("oracleVersion") == "fixed" else "")
                sub = os.path.join(alg_bug, tag)
                eval_files(method_dir, os.path.join(base, "Result_" + tag, alg_bug))
                suite = os.path.join(method_dir, "generated", "original", "suite-root")
                for f in glob.glob(os.path.join(suite, "**", "*.java"), recursive=True):
                    copy_file(f, os.path.join(base, "Test", sub, os.path.basename(f)))
                label = "Algorithm"
            summary_rows.append({
                "project": project, "bug": bug, "round": tag, "type": label, "generator": gname, "promptVersion": rv if label == "AI" else "",
                "detection": "INVALID_OUTPUT" if row.get("invalidOutput") else bench.get("detection") or ("NO_SUITE" if label == "AI" and not row.get("javaFile") else "ERROR"),
                "oracle": bench.get("oracleVersion", "") if label == "Algorithm" else "", "behaviorDiffers": bench.get("behaviorDiffers"),
                "detectedTests": len(bench.get("detectedTests") or []), "regressionTests": len(bench.get("regressionTests") or []),
                "tests": bench.get("uniqueTests"), "buggyStatus": (versions.get("b") or {}).get("testStatus"),
                "fixedStatus": (versions.get("f") or {}).get("testStatus"), "fixedSuitePasses": bench.get("fixedSuitePasses"),
                "buggyLineCov": cov("b", "lineCoveragePercent"), "buggyBranchCov": cov("b", "branchCoveragePercent"),
                "fixedLineCov": cov("f", "lineCoveragePercent"), "fixedBranchCov": cov("f", "branchCoveragePercent"),
                "generationMs": row.get("elapsedMs"), "promptTokens": row.get("promptTokens"), "completionTokens": row.get("completionTokens"),
                "cachedTokens": row.get("cachedTokens"), "costUsd": row.get("cost"), "seed": bench.get("seed"), "runId": run_id,
            })

    # Code / Configuration per algorithm
    java = os.path.join(root, "src", "main", "java", "edu", "kku", "sqa")
    res = os.path.join(root, "src", "main", "resources")
    for code in sorted(algorithms_seen):
        gname = (info.get("algorithms") or {}).get(code, code)
        base = os.path.join(dest, gname)
        for f in ("GenericSearchTestGenerator.java", "AlgorithmSettingsService.java"):
            copy_file(os.path.join(java, f), os.path.join(base, "Code", f))
        for f in ("GenericFitnessWorker.java", "SearchInputFactory_scaffolding.java", "BranchAgent.java", "BranchRecorder.java"):
            copy_file(os.path.join(res, "generator", f), os.path.join(base, "Code", "generator", f))
        with open(os.path.join(base, "Code", "README.md"), "w", encoding="utf-8") as f:
            f.write("# %s\n\nImplemented in `GenericSearchTestGenerator.java` as `%s` (shared encoding, fitness and worker with the other algorithms).\n\n"
                    "`generator/` holds the worker JVM (`GenericFitnessWorker.java`) and the reflective helper copied into every generated suite.\n" % (gname, ALGO_METHOD.get(code, "")))
        cfg = {"algorithm": gname, "code": code, "parameters": ALGO_PARAMS.get(code, []), "common": COMMON,
               "defects4j": d4j_version(output), "promptVersion": version,
               "applicationProperties": open(os.path.join(res, "application.properties")).read() if os.path.isfile(os.path.join(res, "application.properties")) else ""}
        os.makedirs(os.path.join(base, "Configuration"), exist_ok=True)
        with open(os.path.join(base, "Configuration", "configuration.json"), "w", encoding="utf-8") as f:
            json.dump(cfg, f, ensure_ascii=False, indent=2)
        copy_file(os.path.join(root, "docker-compose.yml"), os.path.join(base, "Configuration", "docker-compose.yml"))

    # AI prompt templates (all versions + changelog)
    for ai_name in ais_seen:
        copy_tree_files(os.path.join(root, "prompts"), os.path.join(dest, ai_name, "Prompt", "templates"), "*")

    # Summary
    sdir = os.path.join(dest, "Summary"); os.makedirs(sdir)
    if summary_rows:
        with open(os.path.join(sdir, "results.csv"), "w", newline="", encoding="utf-8") as f:
            w = csv.DictWriter(f, fieldnames=list(summary_rows[0].keys())); w.writeheader(); w.writerows(summary_rows)
    for c in glob.glob(os.path.join(output, "campaigns", "*", "campaign-summary.json")):
        copy_file(c, os.path.join(sdir, "campaigns", os.path.basename(os.path.dirname(c)) + ".json"))

    # The application (reproducibility)
    app = os.path.join(dest, "TestBench-App")
    for f in ("pom.xml", "Dockerfile", "docker-compose.yml", ".env.example", ".dockerignore", ".gitignore", "README.md", "submission-info.json"):
        copy_file(os.path.join(root, f), os.path.join(app, f))
    for d in ("src", "prompts", "scripts", "docs"):
        if os.path.isdir(os.path.join(root, d)): shutil.copytree(os.path.join(root, d), os.path.join(app, d), ignore=shutil.ignore_patterns(".DS_Store", "._*"))

    # README
    lines = ["# %s" % name, "", info.get("title", ""), "", "%s · กลุ่มที่ %s" % (info.get("course", ""), info.get("group", "")), "", "## สมาชิก", ""]
    lines += ["- %s (%s)" % (m["name"], m["studentId"]) for m in info.get("members", [])]
    lines += ["", "## โครงสร้าง", "", "```text", "%s/" % name]
    for code in sorted(algorithms_seen):
        lines += ["  %s/            Code · Configuration · Result_Round1..N · Test" % (info.get("algorithms") or {}).get(code, code)]
    for ai_name in sorted(ais_seen): lines += ["  %s/            Prompt · Result · TestCode" % ai_name]
    lines += ["  Summary/          results.csv (ทุก run) และ campaign summary", "  TestBench-App/    แอปทดลอง (Java/Spring Boot + Defects4J ใน Docker), prompt, scripts", "```", "",
              "- `Round<N>` คือรอบทำซ้ำที่ N ของการทดลอง (seed ต่างกันทุกรอบ); `<Project>-<Bug>` คือ Defects4J bug (เช่น `Lang-3`).",
              "- Defects4J ที่ใช้: เวอร์ชัน %s (ผลทั้งหมดมาจากเวอร์ชันนี้; ถ้าเปลี่ยนเวอร์ชัน ต้องรันใหม่ทั้งหมด)." % d4j_version(output),
              "- เอกสารและ diagram: `TestBench-App/docs/ARCHITECTURE.md`; Project ที่รองรับและข้อจำกัด: `TestBench-App/docs/COMPATIBILITY.md`.",
              "- ผลทุกชุดเปรียบเทียบด้วย test suite ไฟล์เดียวกันบน buggy และ fixed; detection = test method เดียวกัน FAIL บน buggy และ PASS บน fixed.",
              "- Prompt version ที่ส่งออกในโฟลเดอร์ AI: `%s` (ทุกเวอร์ชันอยู่ใน `Prompt/templates/versions/` พร้อม CHANGELOG)." % (version or "ทุกเวอร์ชัน"), "",
              "## ทำซ้ำการทดลอง", "", "```sh", "cd TestBench-App", "cp .env.example .env", "docker compose up --build   # เปิด http://localhost:8081", "```", "",
              "ตั้ง AI/algorithm ที่หน้า Settings แล้วเริ่มการทดลองที่หน้าแรก; สร้างโฟลเดอร์นี้ใหม่ด้วย `python3 scripts/export_submission.py`.", "", "## สรุปผลที่ส่งออก", ""]
    if summary_rows:
        lines += ["| Project-Bug | Round | Generator | Detection | Tests | Buggy/Fixed | Line cov (buggy) |", "|---|---|---|---|---|---|---|"]
        for r in summary_rows:
            lc = r["buggyLineCov"]
            lines.append("| %s-%s | %s | %s | %s | %s | %s/%s | %s |" % (r["project"], r["bug"], r["round"], r["generator"], r["detection"], r["tests"], r["buggyStatus"], r["fixedStatus"], "-" if lc is None else "%.1f%%" % lc))
    with open(os.path.join(dest, "README.md"), "w", encoding="utf-8") as f: f.write("\n".join(lines) + "\n")

    if a.zip:
        z = dest + ".zip"
        with zipfile.ZipFile(z, "w", zipfile.ZIP_DEFLATED) as zf:
            for dp, _, fs in os.walk(dest):
                for fn in fs:
                    p = os.path.join(dp, fn); zf.write(p, os.path.relpath(p, os.path.dirname(dest)))
        print("zip:", z)
    print("exported %d runs, %d result rows -> %s" % (len(runs), len(summary_rows), dest))


if __name__ == "__main__":
    main()
