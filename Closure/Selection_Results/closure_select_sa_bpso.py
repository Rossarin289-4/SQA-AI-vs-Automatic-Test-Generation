#!/usr/bin/env python3
"""Select measured Closure candidates with SA and binary PSO from measured CSVs.

Run from the repository root: python3 closure_select_sa_bpso.py
This compares per-test coverage; it does not claim suite union coverage or test time.
"""

import csv
import math
import random
import statistics
import time
from collections import defaultdict
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
BASE = ROOT / "Closure" / "BPSO"
RESULTS = BASE / "closure-test-results.csv"
COVERAGE = BASE / "closure-coverage.csv"
OUT = ROOT / "Closure" / "Selection_Results" / "full_1_170"
SEEDS = (20260929, 20260930)


def read_csv(path):
    with path.open(newline="", encoding="utf-8-sig") as handle:
        return list(csv.DictReader(handle))


def load_candidates():
    results = {}
    for row in read_csv(RESULTS):
        key = (row["bug_id"], row["test_method"])
        if row["status"] == "OK" and key not in results:
            results[key] = row
    covered = {}
    for row in read_csv(COVERAGE):
        key = (row["bug_id"], row["test_method"])
        if row["status"] == "OK" and key not in covered:
            covered[key] = row

    groups = defaultdict(list)
    for (bug, method), result in results.items():
        pieces = bug.split("-")
        if len(pieces) != 2 or pieces[0] != "Closure" or not pieces[1].isdigit():
            continue
        number = int(pieces[1])
        coverage = covered.get((bug, method))
        if coverage is None:
            raise ValueError(f"Coverage missing or invalid: {bug}::{method}")
        line = float(coverage["line_pct"])
        condition = float(coverage["condition_pct"])
        detected = result["detected"] == "YES" and result["buggy_failing"] != "0" and result["fixed_failing"] == "0"
        # Measured candidate fitness; no invented execution time or suite union.
        score = 0.45 * line / 100 + 0.45 * condition / 100 + 0.10 * detected
        groups[number].append(dict(bug=bug, method=method, line=line,
                                   condition=condition, detected=detected,
                                   buggy_failing=result["buggy_failing"],
                                   fixed_failing=result["fixed_failing"],
                                   score=score))
    missing = sorted(set(results) - set(covered))
    if missing:
        raise ValueError(f"Coverage missing for {len(missing)} candidates; examples: {missing[:8]}")
    if not groups:
        raise ValueError("No measured candidates")
    for group in groups.values():
        group.sort(key=lambda item: item["method"])
    return groups


def fitness(indices, candidates):
    return sum(candidates[i]["score"] for i in indices)


def sa(candidates, k, seed):
    rng = random.Random(seed)
    n = len(candidates)
    current = set(rng.sample(range(n), k))
    best = set(current)
    current_score = best_score = fitness(current, candidates)
    temp = 10.0
    for _ in range(5000):
        if k == n:
            break
        proposal = set(current)
        proposal.remove(rng.choice(tuple(sorted(proposal))))
        proposal.add(rng.choice(tuple(sorted(set(range(n)) - proposal))))
        score = fitness(proposal, candidates)
        delta = score - current_score
        if delta >= 0 or rng.random() < math.exp(delta / max(temp, 1e-12)):
            current, current_score = proposal, score
            if score > best_score:
                best, best_score = set(proposal), score
        temp *= 0.995
    return sorted(best), best_score


def bpso(candidates, k, seed):
    rng = random.Random(seed)
    n = len(candidates)
    swarm = []
    for _ in range(24):
        position = set(rng.sample(range(n), k))
        swarm.append([position, [rng.uniform(-1, 1) for _ in range(n)],
                      set(position), fitness(position, candidates)])
    global_best = max(swarm, key=lambda p: p[3])
    best = set(global_best[2])
    best_score = global_best[3]
    for _ in range(120):
        for particle in swarm:
            position, velocities, personal, personal_score = particle
            priorities = []
            for i in range(n):
                x = int(i in position)
                velocity = (0.72 * velocities[i]
                            + 1.49 * rng.random() * (int(i in personal) - x)
                            + 1.49 * rng.random() * (int(i in best) - x))
                velocities[i] = max(-40, min(40, velocity))
                probability = 1 / (1 + math.exp(-velocities[i]))
                priorities.append((probability + rng.random() * 1e-12, i))
            position = {i for _, i in sorted(priorities, reverse=True)[:k]}
            score = fitness(position, candidates)
            particle[0] = position
            if score > personal_score:
                particle[2], particle[3] = set(position), score
            if score > best_score:
                best, best_score = set(position), score
    return sorted(best), best_score


def write_csv(path, fields, rows):
    with path.open("w", newline="", encoding="utf-8") as handle:
        writer = csv.DictWriter(handle, fieldnames=fields)
        writer.writeheader()
        writer.writerows(rows)


def main():
    groups = load_candidates()
    OUT.mkdir(exist_ok=True)
    selected_rows = []
    summaries = []
    for algorithm, selector in (("SA", sa), ("BPSO", bpso)):
        for round_number, seed in enumerate(SEEDS, 1):
            chosen = []
            generation_ms = 0.0
            total_fitness = 0.0
            for bug in sorted(groups):
                candidates = groups[bug]
                k = max(1, math.ceil(len(candidates) / 2))
                started = time.perf_counter_ns()
                indexes, score = selector(candidates, k, seed + bug)
                bug_generation_ms = (time.perf_counter_ns() - started) / 1e6
                generation_ms += bug_generation_ms
                total_fitness += score
                bug_chosen = [candidates[i] for i in indexes]
                bug_out = OUT / algorithm / f"Result_Round{round_number}" / f"Closure-{bug}"
                bug_out.mkdir(parents=True, exist_ok=True)
                write_csv(bug_out / "selected_tests.csv",
                    ["bug_id", "algorithm", "round", "seed", "test_method",
                     "line_pct", "condition_pct", "buggy_failing", "fixed_failing",
                     "detected", "candidate_fitness"],
                    [dict(bug_id=row["bug"], algorithm=algorithm, round=round_number,
                          seed=seed + bug, test_method=row["method"], line_pct=row["line"],
                          condition_pct=row["condition"],
                          buggy_failing=row["buggy_failing"],
                          fixed_failing=row["fixed_failing"],
                          detected="YES" if row["detected"] else "NO",
                          candidate_fitness=f"{row['score']:.6f}") for row in bug_chosen])
                write_csv(bug_out / "result.csv",
                    ["bug_id", "algorithm", "round", "seed", "candidate_count",
                     "selected_count", "detected", "mean_selected_line_pct",
                     "mean_selected_condition_pct", "fitness", "generation_ms"],
                    [dict(bug_id=f"Closure-{bug}", algorithm=algorithm,
                          round=round_number, seed=seed + bug,
                          candidate_count=len(candidates), selected_count=len(bug_chosen),
                          detected="YES" if any(row["detected"] for row in bug_chosen) else "NO",
                          mean_selected_line_pct=f"{statistics.mean(row['line'] for row in bug_chosen):.2f}",
                          mean_selected_condition_pct=f"{statistics.mean(row['condition'] for row in bug_chosen):.2f}",
                          fitness=f"{score:.6f}", generation_ms=f"{bug_generation_ms:.3f}")])
                for i in indexes:
                    row = candidates[i]
                    chosen.append(row)
                    selected_rows.append(dict(algorithm=algorithm, round=round_number,
                        seed=seed + bug, bug_id=row["bug"], test_method=row["method"],
                        line_pct=row["line"], condition_pct=row["condition"],
                        detected="YES" if row["detected"] else "NO",
                        candidate_fitness=f"{row['score']:.6f}"))
            summaries.append(dict(algorithm=algorithm, round=round_number,
                base_seed=seed, candidate_count=sum(map(len, groups.values())),
                selected_tests=len(chosen), detected_bugs=len({r["bug"] for r in chosen if r["detected"]}),
                mean_selected_line_pct=f"{statistics.mean(r['line'] for r in chosen):.2f}",
                mean_selected_condition_pct=f"{statistics.mean(r['condition'] for r in chosen):.2f}",
                total_fitness=f"{total_fitness:.6f}", generation_ms=f"{generation_ms:.3f}"))
    write_csv(OUT / "summary.csv", list(summaries[0]), summaries)
    for algorithm in ("SA", "BPSO"):
        write_csv(OUT / f"{algorithm}_selected_tests.csv", list(selected_rows[0]),
                  [row for row in selected_rows if row["algorithm"] == algorithm])
        write_csv(OUT / f"{algorithm}_summary.csv", list(summaries[0]),
                  [row for row in summaries if row["algorithm"] == algorithm])
    print(f"Candidates: {sum(map(len, groups.values()))} across {len(groups)} bugs")
    for row in summaries:
        print(f"{row['algorithm']} round {row['round']}: {row['selected_tests']} tests, "
              f"{row['detected_bugs']}/{len(groups)} bugs detected, generation {row['generation_ms']} ms")
    print(f"Saved separate SA and BPSO CSV files in: {OUT}")


if __name__ == "__main__":
    main()
