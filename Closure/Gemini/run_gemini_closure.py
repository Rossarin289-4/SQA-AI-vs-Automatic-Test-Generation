#!/usr/bin/env python3
"""Run existing-test wrappers for Closure Gemini folders in Defects4J."""
import argparse
import csv
import re
import shutil
import subprocess
import time
from pathlib import Path


def run(command, cwd, log):
    start = time.monotonic()
    try:
        proc = subprocess.run(command, cwd=cwd, text=True, stdout=subprocess.PIPE,
                              stderr=subprocess.STDOUT, check=False)
        content = proc.stdout
        code = proc.returncode
    except OSError as error:
        content, code = str(error), 127
    log.write_text(content, encoding='utf-8')
    return code, content, round((time.monotonic() - start) * 1000)


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument('--projects', type=Path, default=Path.home() / 'SQA/projects')
    parser.add_argument('--start', type=int, default=1)
    parser.add_argument('--end', type=int, default=176)
    args = parser.parse_args()
    if not shutil.which('defects4j'):
        parser.error('defects4j is not in PATH')
    root = Path(__file__).resolve().parent
    output = root / 'Result' / 'verified'
    output.mkdir(parents=True, exist_ok=True)
    result = output / 'results.csv'
    header = ['bug_id', 'method', 'buggy_status', 'fixed_status', 'detected',
              'buggy_rc', 'fixed_rc', 'buggy_failing', 'fixed_failing',
              'buggy_ms', 'fixed_ms']
    records = []
    if result.exists():
        with result.open(newline='', encoding='utf-8') as file:
            records = [list(row.values()) for row in csv.DictReader(file)]
    for bug in range(args.start, args.end + 1):
        source = (root / 'TestCode' / f'Closure-{bug}' / 'com/google/javascript/jscomp'
                  / f'Closure{bug}GeminiTest.java')
        if not source.is_file():
            print(f'Closure-{bug}: no source (skipped)')
            continue
        methods = re.findall(r'public void (test\w+)\s*\(', source.read_text(encoding='utf-8'))
        outcomes = {}
        for version in ('b', 'f'):
            checkout = args.projects.expanduser() / f'Closure-{bug}{version}'
            logs = output / f'Closure-{bug}{version}'
            logs.mkdir(parents=True, exist_ok=True)
            if not checkout.is_dir():
                outcomes[version] = {m: ('MISSING_CHECKOUT', '', '', '') for m in methods}
                continue
            rc, text, _ = run(['defects4j', 'export', '-p', 'dir.src.tests'], checkout,
                              logs / 'export.log')
            if rc:
                outcomes[version] = {m: ('EXPORT_ERROR', '', '', '') for m in methods}
                continue
            lines = [line.strip() for line in text.splitlines() if line.strip()
                     and not line.startswith('Running ant')]
            if not lines:
                outcomes[version] = {m: ('EXPORT_ERROR', '', '', '') for m in methods}
                continue
            target = (checkout / lines[-1] / 'com/google/javascript/jscomp' / source.name)
            target.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(source, target)
            rc, _, _ = run(['defects4j', 'compile'], checkout, logs / 'compile.log')
            if rc:
                outcomes[version] = {m: ('COMPILE_ERROR', '', '', '') for m in methods}
                continue
            outcomes[version] = {}
            for method in methods:
                qualified = f'com.google.javascript.jscomp.Closure{bug}GeminiTest::{method}'
                rc, text, ms = run(['defects4j', 'test', '-t', qualified], checkout,
                                   logs / f'{method}.log')
                match = re.search(r'Failing tests:\s*(\d+)', text)
                failures = match.group(1) if match else ''
                status = ('FAIL' if failures and int(failures) > 0 else
                          'PASS' if failures == '0' and rc == 0 else 'RUN_ERROR')
                outcomes[version][method] = (status, rc, failures, ms)
        records = [row for row in records if row[0] != f'Closure-{bug}']
        for method in methods:
            buggy = outcomes['b'][method]
            fixed = outcomes['f'][method]
            detected = 'YES' if buggy[0] == 'FAIL' and fixed[0] == 'PASS' else 'NO'
            records.append([f'Closure-{bug}', method, buggy[0], fixed[0], detected,
                            buggy[1], fixed[1], buggy[2], fixed[2], buggy[3], fixed[3]])
            print(f'Closure-{bug} {method}: buggy={buggy[0]} fixed={fixed[0]} detected={detected}', flush=True)
        temporary = result.with_suffix('.tmp')
        with temporary.open('w', newline='', encoding='utf-8') as file:
            writer = csv.writer(file)
            writer.writerow(header)
            writer.writerows(records)
        temporary.replace(result)
    print(f'Saved {len(records)} test rows to {result}')


if __name__ == '__main__':
    main()
