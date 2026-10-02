"""Generate, validate and measure one external AI suite per Defects4J bug."""
import csv
import hashlib
import json
import os
import re
import shutil
import signal
import subprocess
import tarfile
import time
from pathlib import Path
from core import (assess_pair, atomic_json, model_slug, parse_coverage, parse_test,
                  summarize, validate_java)


class PipelineError(RuntimeError):
    pass


class Pipeline:
    def __init__(self, root, api, d4j, config, external_generator=None):
        self.root, self.api, self.d4j, self.config = Path(root).resolve(), api, d4j, config
        self.external_generator = external_generator
        self.suite_source = 'evosuite' if external_generator else 'aiapi'
        self.timeout = int(config.get('COMMAND_TIMEOUT', 900))
        self.max_tokens = int(config.get('MAX_OUTPUT_TOKENS', 6000))
        self.max_repairs = int(config.get('MAX_REPAIRS', 2))
        self.stability = max(1, int(config.get('STABILITY_RUNS', 2)))
        self.work_base = Path(config.get('WORK_BASE') or str(Path.home() / 'SQA' / 'all-in-one-work')).expanduser().resolve()
        self.result_base = Path(config.get('RESULT_BASE') or str(self.root / 'results')).expanduser().resolve()
        self.env = dict(os.environ)
        self.env['TZ'] = 'America/Los_Angeles'
        if not self.env.get('JAVA_HOME') and shutil.which('java'):
            self.env['JAVA_HOME'] = str(Path(shutil.which('java')).resolve().parent.parent)
        framework_bin = str(Path(d4j).resolve().parent)
        self.env['PATH'] = framework_bin + os.pathsep + self.env.get('PATH', '')
        self.prompt_template = (Path(__file__).parent / 'prompts.txt').read_text(encoding='utf-8')

    def command(self, arguments, cwd=None, log=None):
        return self.run_process([self.d4j, *map(str, arguments)], cwd=cwd, log=log)

    def run_process(self, cmd, cwd=None, log=None):
        started = time.monotonic()
        if log:
            print('  ' + str(log.name), flush=True)
        process = subprocess.Popen(cmd, cwd=cwd, env=self.env, stdout=subprocess.PIPE,
                                   stderr=subprocess.STDOUT, text=True, encoding='utf-8',
                                   errors='replace', start_new_session=True)
        try:
            output, _ = process.communicate(timeout=self.timeout)
        except (subprocess.TimeoutExpired, KeyboardInterrupt) as exc:
            os.killpg(process.pid, signal.SIGTERM)
            try:
                output, _ = process.communicate(timeout=5)
            except subprocess.TimeoutExpired:
                os.killpg(process.pid, signal.SIGKILL)
                output, _ = process.communicate()
            if isinstance(exc, KeyboardInterrupt):
                raise
            output = (output or '') + '\nTIMEOUT\n'
            process.returncode = 124
        elapsed = round(time.monotonic() - started, 3)
        if log:
            log.parent.mkdir(parents=True, exist_ok=True)
            log.write_text(output, encoding='utf-8')
        return process.returncode, output, elapsed

    def bids(self, project):
        code, output, _ = self.command(['bids', '-p', project])
        ids = sorted({int(s) for s in output.splitlines() if s.strip().isdigit()})
        if code or not ids:
            raise PipelineError('อ่าน bug IDs ไม่สำเร็จ: ' + output[-2000:])
        return ids

    def export(self, checkout, prop, log):
        # -o keeps Ant progress on stderr from contaminating exported metadata.
        output_file = log.with_suffix('.value')
        code, text, _ = self.command(['export', '-p', prop, '-o', output_file], cwd=checkout, log=log)
        if code or not output_file.exists():
            raise PipelineError('Export ' + prop + ' failed: ' + text[-1500:])
        return output_file.read_text(encoding='utf-8').strip()

    def checkout(self, project, bug, suffix, checkout, folder):
        marker = checkout / '.defects4j.config'
        if marker.exists():
            content = marker.read_text(errors='replace')
            if 'pid=' + project not in content or 'vid=' + str(bug) + suffix not in content:
                raise PipelineError('Checkout directory contains a different project/version: ' + str(checkout))
        else:
            if checkout.exists() and any(checkout.iterdir()):
                raise PipelineError('Checkout ไม่สมบูรณ์: เปลี่ยน WORK_BASE ใน .env เพื่อ checkout ใหม่: ' + str(checkout))
            checkout.parent.mkdir(parents=True, exist_ok=True)
            rc, text, _ = self.command(['checkout', '-p', project, '-v', str(bug) + suffix, '-w', checkout],
                                       log=folder / ('checkout_' + suffix + '.log'))
            if rc or not marker.exists():
                raise PipelineError('Checkout failed: ' + text[-2000:])
        rc, text, elapsed = self.command(['compile'], cwd=checkout, log=folder / ('compile_' + suffix + '.log'))
        if rc or 'BUILD FAILED' in text:
            raise PipelineError('Base project compile failed: ' + text[-2000:])
        return elapsed

    def source_context(self, checkout, source_dir, target):
        source_root = (checkout / source_dir).resolve()
        target_file = source_root.joinpath(*target.split('.')).with_suffix('.java')
        if not target_file.is_file():
            outer = target.split('$')[0]
            target_file = source_root.joinpath(*outer.split('.')).with_suffix('.java')
        if not target_file.is_file():
            raise PipelineError('Source file not found for ' + target)
        limit = int(self.config.get('MAX_SOURCE_CHARS', 65000))
        source = target_file.read_text(encoding='utf-8', errors='replace')
        # Explicitly describe truncation; do not imply the model saw full code.
        if len(source) > limit:
            source = source[:limit // 2] + '\n/* SOURCE MIDDLE OMITTED: context limit */\n' + source[-limit // 2:]
        chunks = ['TARGET SOURCE: ' + target + '\n' + source]
        peers = ['Compiler', 'CompilerOptions', 'CompilationLevel', 'SourceFile', 'JSSourceFile', 'Result']
        package_dir = target_file.parent
        for peer in peers:
            file = package_dir / (peer + '.java')
            if file.is_file() and file != target_file:
                content = file.read_text(encoding='utf-8', errors='replace')
                declarations = [line for line in content.splitlines() if re.search(r'^\s*(?:package |import |public |protected |[A-Z]\w*\()', line)]
                chunks.append('RELATED API DECLARATIONS (bodies omitted): ' + file.name + '\n' + '\n'.join(declarations)[:5000])
        return '\n\n'.join(chunks), hashlib.sha256(target_file.read_bytes()).hexdigest()

    def make_archive(self, tests, project, bug, suffix, round_number, folder):
        archive = folder / ('%s-%s%s-%s.%s.tar.bz2' % (project, bug, suffix, self.suite_source, round_number))
        with tarfile.open(archive, 'w:bz2') as tar:
            for path in sorted(tests.rglob('*.java')):
                tar.add(path, arcname=path.relative_to(tests).as_posix(), recursive=False)
        return archive

    def test_suite(self, checkout, archive, folder, label):
        rc, text, elapsed = self.command(['test', '-s', archive], cwd=checkout, log=folder / (label + '.log'))
        result = parse_test(text, rc)
        result['seconds'] = elapsed
        result['log'] = text

        # Defects4J prints failing methods as:
        #   package.Class::testMethod
        result['failing_test_names'] = re.findall(
            r'(?m)^\s*(?:[-*]\s*)?((?:[A-Za-z_$][\w$]*\.)+[A-Za-z_$][\w$]*::[A-Za-z_$][\w$]*)\s*$',
            text
        )

        # Optional measured execution count, if this version writes JUnit XML.
        # Only current, matching generated classes are counted.
        result['executed_test_count'] = None
        return result

    def filter_failing_evosuite_tests(self, tests, failing_names, folder):
        """Remove EvoSuite test methods that fail on the fixed version.

        This is used only for external/EvoSuite generation.  No buggy-version
        feedback and no AI repair is used.
        """
        removed = []

        for full_name in failing_names:
            if '::' not in full_name:
                continue

            class_name, method_name = full_name.rsplit('::', 1)
            path = tests / Path(*class_name.split('.')).with_suffix('.java')

            if not path.is_file():
                continue

            source = path.read_text(encoding='utf-8')

            # Locate the generated JUnit method.
            match = re.search(
                r'(?m)^\s*public\s+void\s+' + re.escape(method_name) +
                r'\s*\([^)]*\)\s*(?:throws\s+[^\{]+)?\{',
                source
            )

            if not match:
                continue

            method_start = match.start()

            # Include contiguous annotations immediately above the method,
            # especially EvoSuite's @Test(timeout = ...).
            remove_start = method_start
            prefix = source[:method_start]
            lines = prefix.splitlines(keepends=True)

            while lines:
                last = lines[-1]
                stripped = last.strip()

                if stripped.startswith('@'):
                    remove_start -= len(last)
                    lines.pop()
                    continue

                if stripped == '':
                    break

                break

            # Find the matching closing brace while respecting strings,
            # character literals and comments.
            brace_start = source.find('{', match.start(), match.end())
            if brace_start < 0:
                continue

            i = brace_start
            depth = 0
            state = 'code'

            while i < len(source):
                ch = source[i]
                nxt = source[i + 1] if i + 1 < len(source) else ''

                if state == 'code':
                    if ch == '/' and nxt == '/':
                        state = 'line_comment'
                        i += 2
                        continue
                    if ch == '/' and nxt == '*':
                        state = 'block_comment'
                        i += 2
                        continue
                    if ch == '"':
                        state = 'string'
                    elif ch == "'":
                        state = 'char'
                    elif ch == '{':
                        depth += 1
                    elif ch == '}':
                        depth -= 1
                        if depth == 0:
                            i += 1
                            break

                elif state == 'line_comment':
                    if ch == '\n':
                        state = 'code'

                elif state == 'block_comment':
                    if ch == '*' and nxt == '/':
                        state = 'code'
                        i += 2
                        continue

                elif state == 'string':
                    if ch == '\\':
                        i += 2
                        continue
                    if ch == '"':
                        state = 'code'

                elif state == 'char':
                    if ch == '\\':
                        i += 2
                        continue
                    if ch == "'":
                        state = 'code'

                i += 1

            if depth != 0:
                continue

            # Consume the newline following the removed method.
            while i < len(source) and source[i] in '\r\n':
                i += 1

            path.write_text(
                source[:remove_start] + source[i:],
                encoding='utf-8'
            )
            removed.append(full_name)

        log_path = folder / 'filtered_fixed_failures.log'
        with log_path.open('a', encoding='utf-8') as fh:
            for name in removed:
                fh.write(name + '\n')

        return removed

    def sanitize_evosuite_sources(self, tests, folder):
        """Replace EvoSuite references to JDK-internal ZoneInfo.

        Java 11 modules do not export sun.util.calendar.  The generated value is
        a TimeZone, so java.util.TimeZone is the public compatible type.
        """
        changed = []

        for path in tests.rglob('*.java'):
            source = path.read_text(encoding='utf-8', errors='replace')

            if 'sun.util.calendar.ZoneInfo' not in source:
                continue

            if 'import java.util.TimeZone;' in source:
                source = source.replace(
                    'import sun.util.calendar.ZoneInfo;\\n', ''
                )
            else:
                source = source.replace(
                    'import sun.util.calendar.ZoneInfo;',
                    'import java.util.TimeZone;'
                )

            source = re.sub(r'\\bZoneInfo\\b', 'TimeZone', source)
            path.write_text(source, encoding='utf-8')
            changed.append(str(path.relative_to(tests)))

        if changed:
            log_path = folder / 'sanitized_evosuite_sources.log'
            log_path.write_text('\\n'.join(changed) + '\\n', encoding='utf-8')
            print(
                '[SANITIZE] replaced JDK-internal ZoneInfo in %d file(s)' % len(changed),
                flush=True
            )

        return changed

    def run_bug(self, project, bug, model, round_number=1, retry_failed=False):
        folder = self.result_base / project / model_slug(model) / ('round' + str(round_number)) / (project + '-' + str(bug))
        folder.mkdir(parents=True, exist_ok=True)
        state_path = folder / 'result.json'
        fingerprint_data = {'model': model, 'project': project, 'round': round_number,
                            'base_url': self.config.get('API_BASE_URL'), 'max_tokens': self.max_tokens,
                            'max_repairs': self.max_repairs, 'stability_runs': self.stability,
                            'max_source_chars': self.config.get('MAX_SOURCE_CHARS', 65000),
                            'prompt_sha256': hashlib.sha256(self.prompt_template.encode()).hexdigest(),
                            'generation_reference': 'fixed'}
        if self.external_generator:
            fingerprint_data = {'model': model, 'project': project, 'round': round_number,
                                'generation_reference': 'fixed', 'stability_runs': self.stability,
                                **self.external_generator.fingerprint()}
        fingerprint = hashlib.sha256(json.dumps(fingerprint_data, sort_keys=True).encode()).hexdigest()
        old = json.loads(state_path.read_text()) if state_path.exists() else {}
        if old and old.get('config_sha256') != fingerprint:
            raise PipelineError('Config เปลี่ยนจากรอบเดิม: ใช้ --round ' + str(round_number + 1))
        tests = folder / 'tests'
        if old.get('status') == 'DONE' and old.get('coverage_status') == 'OK' and not retry_failed:
            if tests.exists() and list(tests.rglob('*.java')):
                print('[RESUME] ' + project + '-' + str(bug) + ' / ' + model, flush=True)
                return old
        if retry_failed and tests.exists() and old.get('status') != 'DONE':
            backup = folder / ('previous_tests_' + str(time.time_ns()))
            tests.rename(backup)
        tests.mkdir(exist_ok=True)
        row = {'project': project, 'bug_id': bug, 'model': model, 'round': round_number,
               'method_type': 'algorithm' if self.external_generator else 'API',
               'status': 'RUNNING', 'pair_status': None, 'coverage_status': 'NOT_RUN',
               'config_sha256': fingerprint, 'generation_reference': 'fixed',
               'stability_runs': self.stability, 'output_dir': str(folder),
               'tokens': old.get('tokens', 0), 'api_seconds': old.get('api_seconds', 0),
               'generation_calls': old.get('generation_calls', 0)}
        atomic_json(state_path, row)
        print('[START] %s-%s / %s' % (project, bug, model), flush=True)
        # Dedicated model/round workspaces avoid clashes with EvoSuite runs.
        work = self.work_base / project / model_slug(model) / ('round' + str(round_number))
        fixed, buggy = work / (str(bug) + 'f'), work / (str(bug) + 'b')
        try:
            setup_time = self.checkout(project, bug, 'f', fixed, folder)
            setup_time += self.checkout(project, bug, 'b', buggy, folder)
            row['setup_compile_seconds'] = round(setup_time, 3)
            targets_text = self.export(fixed, 'classes.modified', folder / 'classes_modified.log')
            targets = [s.strip() for s in targets_text.splitlines() if s.strip()]
            if not targets or any(not re.fullmatch(r'[A-Za-z_$][\w$]*(?:\.[A-Za-z_$][\w$]*)*', s) for s in targets):
                raise PipelineError('Invalid or empty classes.modified: ' + targets_text)
            source_dir = self.export(fixed, 'dir.src.classes', folder / 'source_dir.log')
            contexts, classes, counts, source_hashes = [], [], [], {}
            if self.external_generator:
                details = self.external_generator.generate(self, fixed, targets, folder, tests, model, retry_failed)
                row.update(details)
                sanitized = self.sanitize_evosuite_sources(tests, folder)
                row['sanitized_evosuite_files'] = len(sanitized)
                counts = [details['declared_test_methods']]
                for target in targets:
                    _, source_hashes[target] = self.source_context(fixed, source_dir, target)
                atomic_json(state_path, row)
            for target in ([] if self.external_generator else targets):
                package, _, simple = target.rpartition('.')
                simple = simple.replace('$', '_') + 'AI' + str(bug) + 'Test'
                test_class = package + '.' + simple if package else simple
                context, source_hash = self.source_context(fixed, source_dir, target)
                source_hashes[target] = source_hash
                contexts.append(context)
                classes.append(test_class)
                counts.append(0)
                prompt = self.prompt_template + '\nProduction class: ' + target + '\nRequired test class: ' + test_class + '\n\n' + context
                target_folder = folder / 'evidence' / target.replace('.', '_')
                target_folder.mkdir(parents=True, exist_ok=True)
                (target_folder / 'prompt.txt').write_text(prompt, encoding='utf-8')
                relpath = Path(*test_class.split('.')).with_suffix('.java')
                path = tests / relpath
                if path.is_file():
                    _, _, counts[-1] = validate_java(path.read_text(encoding='utf-8'), test_class)
                    continue
                messages = [{'role': 'user', 'content': prompt}]
                for attempt in range(self.max_repairs + 1):
                    (target_folder / ('messages_%s.json' % attempt)).write_text(json.dumps(messages, ensure_ascii=False, indent=2), encoding='utf-8')
                    start = time.monotonic()
                    answer = self.api.chat(model, messages, self.max_tokens)
                    row['api_seconds'] = round(row['api_seconds'] + time.monotonic() - start, 3)
                    row['generation_calls'] += 1
                    row['tokens'] += answer.get('tokens') or 0
                    atomic_json(target_folder / ('response_%s.json' % attempt), answer.get('response', {'text': answer['text']}))
                    atomic_json(state_path, row)
                    try:
                        _, code, counts[-1] = validate_java(answer['text'], test_class)
                        path.parent.mkdir(parents=True, exist_ok=True)
                        path.write_text(code, encoding='utf-8')
                        break
                    except ValueError as exc:
                        if attempt == self.max_repairs:
                            raise PipelineError('Invalid Java response: ' + str(exc))
                        messages += [{'role': 'assistant', 'content': answer['text']},
                                     {'role': 'user', 'content': 'Repair format: ' + str(exc) + '. Return the full Java file.'}]
            row['target_classes'] = ';'.join(targets)
            row['source_sha256'] = source_hashes
            row['declared_test_methods'] = sum(counts)
            fixed_result = None
            # Repair uses only fixed compile/runtime feedback. Never feed buggy
            # failures or benchmark triggering tests back to the model.
            max_repairs = 10 if self.external_generator else self.max_repairs
            filtered_tests = []

            for repair in range(max_repairs + 1):
                fixed_archive = self.make_archive(tests, project, bug, 'f', round_number, folder)
                fixed_result = self.test_suite(fixed, fixed_archive, folder, 'fixed_attempt_' + str(repair))

                if fixed_result['valid_execution'] and fixed_result['failing_tests'] == 0:
                    break

                if self.external_generator:
                    failing_names = fixed_result.get('failing_test_names') or []

                    if fixed_result['valid_execution'] and failing_names and repair < max_repairs:
                        removed = self.filter_failing_evosuite_tests(
                            tests, failing_names, folder
                        )

                        if removed:
                            filtered_tests.extend(removed)
                            print(
                                '[FILTER] removed %d fixed-failing EvoSuite test(s)' % len(removed),
                                flush=True
                            )
                            continue

                    row.update(
                        status='FAILED',
                        pair_status='INVALID_FIXED',
                        fixed_failing_tests=fixed_result['failing_tests'],
                        filtered_fixed_tests=len(filtered_tests),
                        error='EvoSuite suite still does not pass the fixed version after filtering.'
                    )
                    atomic_json(state_path, row)
                    return row

                if repair == max_repairs:
                    row.update(status='FAILED', pair_status='INVALID_FIXED', fixed_failing_tests=fixed_result['failing_tests'],
                               error='Generated tests did not compile/pass on the fixed version. See fixed_attempt logs.')
                    atomic_json(state_path, row)
                    return row

                feedback = fixed_result['log'][-14000:]
                for target, test_class, context in zip(targets, classes, contexts):
                    path = tests / Path(*test_class.split('.')).with_suffix('.java')
                    previous = path.read_text(encoding='utf-8')
                    messages = [{'role': 'user', 'content': self.prompt_template + '\nProduction class: ' + target + '\nRequired test class: ' + test_class + '\n' + context},
                                {'role': 'assistant', 'content': previous},
                                {'role': 'user', 'content': 'Fixed-version compile/test feedback:\n' + feedback + '\nCorrect API usage and incorrect expected behavior, retaining meaningful tests. Return complete file.'}]
                    evidence = folder / 'evidence' / target.replace('.', '_')
                    atomic_json(evidence / ('repair_messages_%s.json' % repair), messages)
                    start = time.monotonic()
                    answer = self.api.chat(model, messages, self.max_tokens)
                    row['api_seconds'] = round(row['api_seconds'] + time.monotonic() - start, 3)
                    row['generation_calls'] += 1
                    row['tokens'] += answer.get('tokens') or 0
                    atomic_json(evidence / ('repair_response_%s.json' % repair), answer.get('response', {'text': answer['text']}))
                    _, code, count = validate_java(answer['text'], test_class)
                    counts[classes.index(test_class)] = count
                    path.write_text(code, encoding='utf-8')
                    atomic_json(state_path, row)
            if self.external_generator:
                row['declared_test_methods'] = sum(
                    len(re.findall(r'@(?:org\\.junit\\.)?Test\\b',
                                   f.read_text(encoding='utf-8', errors='replace')))
                    for f in tests.rglob('*.java')
                    if not f.name.endswith('_scaffolding.java')
                )
                row['filtered_fixed_tests'] = len(filtered_tests)
            else:
                row['declared_test_methods'] = sum(counts)

            row['fixed_failing_tests'] = fixed_result['failing_tests']
            row['fixed_test_seconds'] = fixed_result['seconds']
            for repeat in range(1, self.stability):
                again = self.test_suite(fixed, fixed_archive, folder, 'fixed_confirm_' + str(repeat))
                row['fixed_test_seconds'] += again['seconds']
                if not again['valid_execution'] or again['failing_tests'] != 0:
                    row.update(status='FAILED', pair_status='UNSTABLE_FIXED', error='Fixed-version repeat did not pass.')
                    atomic_json(state_path, row)
                    return row
            buggy_archive = folder / ('%s-%sb-%s.%s.tar.bz2' % (project, bug, self.suite_source, round_number))
            shutil.copyfile(fixed_archive, buggy_archive)
            row['suite_sha256'] = hashlib.sha256(fixed_archive.read_bytes()).hexdigest()
            row['fixed_archive'] = str(fixed_archive)
            row['buggy_archive'] = str(buggy_archive)
            buggy_result = self.test_suite(buggy, buggy_archive, folder, 'buggy')
            row['buggy_failing_tests'] = buggy_result['failing_tests']
            row['buggy_test_seconds'] = buggy_result['seconds']
            row['pair_status'] = assess_pair(fixed_result, buggy_result)
            for repeat in range(1, self.stability):
                if row['pair_status'] not in ('DETECTED', 'NOT_DETECTED'):
                    break
                again = self.test_suite(buggy, buggy_archive, folder, 'buggy_confirm_' + str(repeat))
                row['buggy_test_seconds'] += again['seconds']
                if assess_pair(fixed_result, again) != row['pair_status'] or again['failing_tests'] != buggy_result['failing_tests']:
                    row['pair_status'] = 'UNSTABLE_BUGGY'
            row['status'] = 'DONE' if row['pair_status'] in ('DETECTED', 'NOT_DETECTED') else 'FAILED'
            classes_file = folder / 'instrument_classes.txt'
            classes_file.write_text('\n'.join(targets) + '\n', encoding='utf-8')
            rc, coverage_log, seconds = self.command(['coverage', '-s', fixed_archive, '-i', classes_file], cwd=fixed, log=folder / 'coverage_fixed.log')
            row['coverage_seconds'] = seconds
            row.update(parse_coverage(coverage_log) if not rc else parse_coverage(''))
            row['coverage_status'] = 'OK' if not rc and row['line_total'] is not None else 'FAILED'
            for name in ('coverage.xml', 'summary.csv'):
                report = fixed / name
                if not rc and report.is_file():
                    shutil.copyfile(report, folder / ('coverage_' + name))
            row['coverage_scope'] = 'fixed version, classes.modified, generated external suite only'
            row['execution_time_scope'] = 'defects4j test wall time including incremental compile; API/setup/coverage separate'
            atomic_json(state_path, row)
            print('[%s] %s-%s / %s | line=%s%% | condition=%s%%' % (row['pair_status'], project, bug, model,
                                                                     row['line_coverage_pct'], row['condition_coverage_pct']), flush=True)
            return row
        except Exception as exc:
            row.update(status='FAILED', error=str(exc))
            atomic_json(state_path, row)
            raise

    def write_reports(self, project, model, round_number, planned):
        directory = self.result_base / project / model_slug(model) / ('round' + str(round_number))
        directory.mkdir(parents=True, exist_ok=True)
        plan_path = directory / 'planned.json'
        previous = json.loads(plan_path.read_text(encoding='utf-8')) if plan_path.exists() else []
        planned = sorted(set(map(int, previous)) | set(map(int, planned)))
        atomic_json(plan_path, planned)
        rows = [json.loads(path.read_text(encoding='utf-8')) for path in sorted(directory.glob(project + '-*/result.json'))]
        keys = ['project', 'bug_id', 'model', 'method_type', 'round', 'status', 'pair_status', 'coverage_status',
                'declared_test_methods', 'fixed_failing_tests', 'buggy_failing_tests', 'line_total', 'line_covered',
                'line_coverage_pct', 'condition_total', 'condition_covered', 'condition_coverage_pct',
                'api_seconds', 'generation_seconds', 'search_budget_seconds', 'setup_compile_seconds', 'fixed_test_seconds', 'buggy_test_seconds', 'coverage_seconds',
                'tokens', 'generation_calls', 'generation_reference', 'stability_runs', 'coverage_scope', 'execution_time_scope',
                'target_classes', 'suite_sha256', 'config_sha256', 'output_dir', 'error']
        temporary = directory / 'results.csv.tmp'
        with temporary.open('w', encoding='utf-8-sig', newline='') as file:
            writer = csv.DictWriter(file, fieldnames=keys, extrasaction='ignore')
            writer.writeheader()
            writer.writerows(rows)
        temporary.replace(directory / 'results.csv')
        atomic_json(directory / 'summary.json', summarize(rows, planned))
        print('CSV: ' + str(directory / 'results.csv'), flush=True)
        project_root = self.result_base / project
        combined = []
        for file in sorted(project_root.glob('*/round*/results.csv')):
            with file.open(encoding='utf-8-sig', newline='') as stream:
                combined.extend(csv.DictReader(stream))
        temp = project_root / 'combined_results.csv.tmp'
        with temp.open('w', encoding='utf-8-sig', newline='') as stream:
            writer = csv.DictWriter(stream, fieldnames=keys, extrasaction='ignore')
            writer.writeheader()
            writer.writerows(combined)
        temp.replace(project_root / 'combined_results.csv')
