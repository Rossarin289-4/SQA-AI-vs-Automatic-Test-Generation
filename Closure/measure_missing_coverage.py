#!/usr/bin/env python3
"""Resume real Defects4J coverage for verified Closure candidates.
Run from any directory: python3 Closure/measure_missing_coverage.py --start 27 --end 170
"""
import argparse
import csv
import re
import shutil
import subprocess
from pathlib import Path

ROOT = Path(__file__).resolve().parent.parent
BASE = ROOT / 'Closure' / 'BPSO'
RESULTS = BASE / 'closure-test-results.csv'
COVERAGE = BASE / 'closure-coverage.csv'
FIELDS = ['bug_id','test_method','lines_total','lines_covered','line_pct',
          'conditions_total','conditions_covered','condition_pct','status']
LABELS = ['Lines total','Lines covered','Line coverage','Conditions total',
          'Conditions covered','Condition coverage']

def read(path):
    if not path.exists(): return []
    with path.open(newline='', encoding='utf-8-sig') as f:
        return list(csv.DictReader(f))

def save(rows):
    temp = COVERAGE.with_suffix('.csv.tmp')
    with temp.open('w', newline='', encoding='utf-8') as f:
        writer = csv.DictWriter(f, FIELDS)
        writer.writeheader()
        writer.writerows(rows)
    temp.replace(COVERAGE)

def source_for(bug):
    folder = BASE / 'Test' / bug
    number = bug.split('-')[1]
    files = list(folder.rglob(f'Closure{number}GeneratedTest.java'))
    for file in files:
        text = file.read_text(encoding='utf-8', errors='replace')
        match = re.search(r'^\s*package\s+([\w.]+)\s*;', text, re.M)
        if match and file.relative_to(folder).as_posix() == match.group(1).replace('.', '/') + '/' + file.name:
            return file, match.group(1)
    raise RuntimeError(f'No packaged generated test for {bug}')

def main():
    ap = argparse.ArgumentParser()
    ap.add_argument('--start', type=int, default=1)
    ap.add_argument('--end', type=int, default=170)
    ap.add_argument('--projects', type=Path, default=Path.home() / 'SQA/projects')
    args = ap.parse_args()
    tested = {(r['bug_id'], r['test_method']): r for r in read(RESULTS)
              if r['status'] == 'OK'}
    rows = read(COVERAGE)
    done = {(r['bug_id'], r['test_method']) for r in rows if r['status'] == 'OK'}
    keys = sorted((key for key in tested if args.start <= int(key[0].split('-')[1]) <= args.end),
                  key=lambda k: (int(k[0].split('-')[1]), k[1]))
    print(f'Coverage pending: {sum(k not in done for k in keys)} of {len(keys)}', flush=True)
    errors = []
    for bug, method in keys:
        if (bug, method) in done: continue
        project = args.projects / (bug + 'b')
        if not (project / '.defects4j.config').exists():
            errors.append(f'{bug}::{method}: checkout missing: {project}')
            print(errors[-1], flush=True)
            continue
        try:
            source, package = source_for(bug)
            testdir = subprocess.run(['defects4j','export','-p','dir.src.tests'], cwd=project,
                                     text=True, capture_output=True, check=True).stdout.strip().splitlines()[-1]
            destination = project / testdir / package.replace('.', '/') / source.name
            destination.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(source, destination)
            target = f'{package}.{source.stem}::{method}'
            run = subprocess.run(['defects4j','coverage','-t',target], cwd=project,
                                 text=True, stdout=subprocess.PIPE, stderr=subprocess.STDOUT)
            values = {}
            for label in LABELS:
                m = re.search(r'^\s*' + re.escape(label) + r':\s*([\d.]+)', run.stdout, re.M)
                if m: values[label] = m.group(1)
            if run.returncode or len(values) != len(LABELS):
                raise RuntimeError(f'coverage failed (rc={run.returncode}): {run.stdout[-600:]}')
            rows = [r for r in rows if (r['bug_id'],r['test_method']) != (bug,method)]
            rows.append(dict(zip(FIELDS, [bug,method,values['Lines total'],values['Lines covered'],
                        values['Line coverage'],values['Conditions total'],values['Conditions covered'],
                        values['Condition coverage'],'OK'])))
            save(rows)
            done.add((bug,method))
            print(f'{bug} {method}: line={values["Line coverage"]}% condition={values["Condition coverage"]}%', flush=True)
        except Exception as ex:
            errors.append(f'{bug}::{method}: {ex}')
            print(errors[-1], flush=True)
    print(f'Complete: {len(done)} measured OK; {len(errors)} errors. Re-run to resume.', flush=True)
    if errors: raise SystemExit(1)

if __name__ == '__main__': main()
