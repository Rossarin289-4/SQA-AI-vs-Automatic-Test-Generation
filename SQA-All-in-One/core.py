"""Validation and measurements shared by the CLI and offline checks."""
import hashlib
import json
import re
from pathlib import Path, PurePosixPath


def java_tokens(source):
    # Remove comments and literals before inspecting annotations/assertions.
    pattern = r'"(?:\\.|[^"\\])*"|\x27(?:\\.|[^\x27\\])*\x27|//[^\n]*|/\*[\s\S]*?\*/'
    return re.sub(pattern, lambda m: ' ' * len(m.group()), source)


def validate_java(response, expected_class):
    code = response.strip()
    fence = re.fullmatch(r'```(?:java)?\s*\n([\s\S]*?)\n```', code)
    if fence:
        code = fence.group(1).strip()
    if not code or '```' in code:
        raise ValueError('Expected one complete Java file; response is empty or contains prose/fences.')
    tokens = java_tokens(code)
    package, _, simple = expected_class.rpartition('.')
    found = re.search(r'\bpackage\s+([\w.]+)\s*;', tokens)
    actual = found.group(1) if found else ''
    if package != actual:
        raise ValueError('Package must be ' + (package or '(default package)'))
    names = re.findall(r'\bpublic\s+(?:final\s+)?class\s+([\w$]+)', tokens)
    if names != [simple]:
        raise ValueError('Exactly one public class named ' + simple + ' is required.')
    if 'org.junit.jupiter' in tokens:
        raise ValueError('Use JUnit 4, not JUnit 5.')
    if not re.search(r'\bimport\s+org\.junit\.Test\s*;', tokens) and '@org.junit.Test' not in tokens:
        raise ValueError('Import org.junit.Test or use @org.junit.Test.')
    count = len(re.findall(r'@(?:org\.junit\.)?Test\b', tokens))
    if count < 1 or '@Ignore' in tokens or '@org.junit.Ignore' in tokens:
        raise ValueError('At least one enabled @Test method is required; @Ignore is prohibited.')
    if not re.search(r'\b(?:assert\w+|fail)\s*\(', tokens) and not re.search(r'@(?:org\.junit\.)?Test\s*\(\s*expected\s*=', tokens):
        raise ValueError('Tests must contain behavior assertions or an expected exception.')
    return PurePosixPath(*expected_class.split('.')).with_suffix('.java'), code + '\n', count


def parse_test(log, returncode):
    failures = re.findall(r'Failing tests:\s*(\d+)', log, re.I)
    failed_build = re.search(r'BUILD FAILED|Cannot compile|Fileset of tests to run is empty|TIMEOUT|Could not find or load main class|UnsupportedClassVersionError|NoClassDefFoundError|ClassNotFoundException|ExceptionInInitializerError', log, re.I)
    valid = returncode == 0 and bool(failures) and not failed_build

    failing_test_names = re.findall(
        r'^\s*-\s+([\w.$]+)::([\w$]+)\s*$',
        log,
        re.M
    )

    return {
        'valid_execution': bool(valid),
        'failing_tests': int(failures[-1]) if valid else None,
        'failing_test_names': [
            cls + '::' + method for cls, method in failing_test_names
        ],
        'returncode': returncode
    }


def assess_pair(fixed, buggy):
    if not fixed['valid_execution'] or fixed['failing_tests'] != 0:
        return 'INVALID_FIXED'
    if not buggy['valid_execution']:
        return 'INVALID_BUGGY'
    return 'DETECTED' if buggy['failing_tests'] > 0 else 'NOT_DETECTED'


def parse_coverage(log):
    result = {}
    for key, text in [('line_total', 'Lines total'), ('line_covered', 'Lines covered'),
                      ('condition_total', 'Conditions total'), ('condition_covered', 'Conditions covered')]:
        match = re.search(text.replace(' ', r'\s+') + r':\s*(\d+)', log, re.I)
        result[key] = int(match.group(1)) if match else None
    for kind in ('line', 'condition'):
        total, covered = result[kind + '_total'], result[kind + '_covered']
        result[kind + '_coverage_pct'] = round(100 * covered / total, 3) if total and covered is not None and covered <= total else None
    return result


def summarize(rows, planned):
    planned = set(map(int, planned))
    valid = {int(r['bug_id']) for r in rows if r.get('pair_status') in ('DETECTED', 'NOT_DETECTED') and int(r['bug_id']) in planned}
    detected = {int(r['bug_id']) for r in rows if r.get('pair_status') == 'DETECTED' and int(r['bug_id']) in planned}
    attempted = {int(r['bug_id']) for r in rows if int(r['bug_id']) in planned}
    return {'planned_bugs': len(planned), 'attempted_bugs': len(attempted), 'valid_bugs': len(valid),
            'detected_unique_bugs': len(detected),
            'fdr_all_planned_pct': round(100 * len(detected) / len(planned), 3) if planned else None,
            'fdr_valid_bugs_pct': round(100 * len(detected) / len(valid), 3) if valid else None,
            'missing_bugs': sorted(planned - attempted), 'invalid_or_incomplete_bugs': sorted(attempted - valid)}


def atomic_json(path, value):
    path = Path(path)
    path.parent.mkdir(parents=True, exist_ok=True)
    temp = path.with_name(path.name + '.tmp')
    temp.write_text(json.dumps(value, ensure_ascii=False, indent=2), encoding='utf-8')
    temp.replace(path)


def model_slug(model):
    safe = re.sub(r'[^A-Za-z0-9_-]+', '_', model).strip('_')[:75] or 'model'
    return safe + '_' + hashlib.sha256(model.encode()).hexdigest()[:8]


def load_env(path):
    values = {}
    if not Path(path).exists():
        return values
    for line in Path(path).read_text(encoding='utf-8-sig').splitlines():
        line = line.strip()
        if not line or line.startswith('#') or '=' not in line:
            continue
        key, value = line.split('=', 1)
        key, value = key.removeprefix('export ').strip(), value.strip()
        if not re.fullmatch(r'[A-Z][A-Z0-9_]*', key):
            continue
        if value.startswith('"'):
            try:
                value = json.loads(value)
            except json.JSONDecodeError:
                value = value.strip('"')
        elif value.startswith("'") and value.endswith("'"):
            value = value[1:-1]
        values[key] = value
    return values
