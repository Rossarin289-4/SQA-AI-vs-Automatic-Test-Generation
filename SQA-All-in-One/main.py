#!/usr/bin/env python3
"""API + SA/BPSO generation and evaluation in one Ubuntu/WSL toolkit."""
import argparse
import fcntl
import getpass
import json
import os
import re
import shutil
import subprocess
import sys
from pathlib import Path
from api import APIError, Client
from core import atomic_json, load_env
from runner import Pipeline, PipelineError
from evosuite import EvoSuiteGenerator, ensure_evosuite

ROOT = Path(__file__).resolve().parent
DEFAULT_URL = 'https://gen.ai.kku.ac.th/api/v1'


def config_values():
    config = load_env(ROOT / '.env.example')
    config.update(load_env(ROOT / '.env'))
    # Generic shell variables from another toolkit must not redirect this run.
    allowed = {'KKU_API_KEY', 'API_BASE_URL', 'MODEL_1', 'MODEL_2',
               'DEFECTS4J_BIN', 'EVOSUITE_SOURCE', 'EVOSUITE_JAR'}
    for key in list(config):
        if key in allowed and key in os.environ:
            config[key] = os.environ[key]
        if 'SQA_' + key in os.environ:
            config[key] = os.environ['SQA_' + key]
    return config


def find_d4j(config):
    configured = config.get('DEFECTS4J_BIN')
    if configured:
        file = Path(configured).expanduser()
        if not file.is_file():
            raise PipelineError('DEFECTS4J_BIN does not exist: ' + str(file))
        return str(file.resolve())
    found = shutil.which('defects4j')
    if found:
        return found
    for folder in ('defects4j', 'SQA/defects4j'):
        file = Path.home() / folder / 'framework/bin/defects4j'
        if file.is_file():
            return str(file)
    raise PipelineError('ไม่พบ Defects4J: ตั้ง DEFECTS4J_BIN ใน .env เป็น /home/test/defects4j/framework/bin/defects4j')


def preflight(config):
    if not shutil.which('java'):
        raise PipelineError('ไม่พบ Java ใน WSL ต้องติดตั้ง JDK ก่อน')
    result = subprocess.run(['java', '-version'], capture_output=True, text=True)
    print((result.stderr or result.stdout).splitlines()[0])
    if not shutil.which('javac'):
        raise PipelineError('ไม่พบ javac: ต้องใช้ JDK เช่น sudo apt install openjdk-11-jdk')
    d4j = find_d4j(config)
    print('Defects4J: ' + d4j)
    return d4j


def client_from(config):
    return Client(config.get('API_BASE_URL') or DEFAULT_URL, config.get('KKU_API_KEY', ''),
                  timeout=int(config.get('API_TIMEOUT', 180)))


def select_model(models, label, optional=False):
    while True:
        answer = input(label + (' [Enter = ยังไม่เพิ่ม]: ' if optional else ': ')).strip()
        if not answer and optional:
            return ''
        if answer.isdigit() and 1 <= int(answer) <= len(models):
            return models[int(answer) - 1]
        if answer in models or (not models and answer):
            return answer
        print('เลือกเลขในรายการ หรือวาง model ID ที่แสดง')


def setup(config):
    print('\nตั้งค่า KKU API ครั้งแรก (ไม่ต้องแก้ Python)')
    url = config.get('API_BASE_URL') or DEFAULT_URL
    print('API URL: ' + url)
    key = getpass.getpass('วาง KKU API key แล้วกด Enter (ไม่แสดงบนหน้าจอ): ').strip()
    client = Client(url, key, timeout=int(config.get('API_TIMEOUT', 180)))
    try:
        models = client.models()
        print('เชื่อมต่อ API /models สำเร็จ เลือกโมเดลจากบัญชีนี้:')
        for i, model in enumerate(models, 1):
            print('%3s. %s' % (i, model))
    except APIError as exc:
        if exc.status not in (404, 405):
            raise
        models = []
        print('API นี้ไม่มี /models: วาง exact model ID จากหน้า KKU API; จะตรวจด้วย completion ตอนเริ่มรัน')
    first = select_model(models, 'โมเดลที่ 1 (เช่น ChatGPT หรือ Gemini)')
    second = select_model(models, 'โมเดลที่ 2', optional=True)
    if second and second == first:
        print('เลือกโมเดลซ้ำ จึงตั้งให้รันเพียงครั้งเดียว')
        second = ''
    config.update(KKU_API_KEY=key, API_BASE_URL=url, MODEL_1=first, MODEL_2=second)
    env = ROOT / '.env'
    env.write_text('\n'.join(key + '=' + json.dumps(str(value), ensure_ascii=False) for key, value in config.items()) + '\n', encoding='utf-8')
    env.chmod(0o600)
    print('บันทึกแล้ว: โมเดลที่ 1 = ' + first + ('; โมเดลที่ 2 = ' + second if second else ''))
    return config


def selftest():
    result = subprocess.run([sys.executable, '-m', 'unittest', 'discover', '-s', 'tests', '-v'], cwd=ROOT,
                            env={**os.environ, 'SQA_SELFTEST_NESTED': '1'})
    return result.returncode


def main():
    parser = argparse.ArgumentParser(description='Closure: API → JUnit 4 → fixed/buggy validation → coverage → CSV')
    parser.add_argument('command', nargs='?', default='run', choices=['run', 'setup', 'check', 'models', 'selftest'])
    parser.add_argument('--project', help='default Closure')
    parser.add_argument('--methods', nargs='+', choices=['AI', 'SA', 'BPSO'], default=['AI', 'SA', 'BPSO'])
    parser.add_argument('--search-budget', type=int, help='SA/BPSO search seconds per class; default 30')
    parser.add_argument('--model', help='exact API model ID; default selected models from .env')
    parser.add_argument('--start', type=int, default=1)
    parser.add_argument('--end', type=int, default=1)
    parser.add_argument('--all', action='store_true', help='all active bug IDs in installed Defects4J')
    parser.add_argument('--round', type=int, default=1, help='new round separates experiments')
    parser.add_argument('--retry-failed', action='store_true', help='back up and regenerate failed suites')
    args = parser.parse_args()
    if args.command == 'selftest':
        return selftest()
    if args.start < 1 or args.end < args.start or args.round < 1:
        parser.error('Need start >= 1, end >= start, round >= 1')
    config = config_values()
    if args.command == 'setup':
        setup(config)
        return 0
    d4j = preflight(config) if args.command in ('run', 'check') else None
    if args.search_budget is not None:
        if args.search_budget < 1:
            parser.error('--search-budget must be positive')
        config['SEARCH_BUDGET'] = str(args.search_budget)
    use_ai = 'AI' in args.methods or args.command == 'models'
    client, models = None, []
    if use_ai:
        if not config.get('KKU_API_KEY') or config.get('KKU_API_KEY') == 'YOUR_KKU_API_KEY' or (not config.get('MODEL_1') and not args.model):
            config = setup(config)
        client = client_from(config)
        models = [args.model] if args.model else list(dict.fromkeys(v for v in (config.get('MODEL_1'), config.get('MODEL_2')) if v))
    generator = None
    if args.command != 'models' and any(m in args.methods for m in ('SA', 'BPSO')):
        generator = EvoSuiteGenerator(ensure_evosuite(ROOT, config), config)
    if args.command in ('models', 'check'):
        if client:
            try:
                available = client.models()
                for model in available:
                    print(model)
                missing = set(models) - set(available)
                if missing:
                    raise PipelineError('Model ID ไม่อยู่ในรายการ API: ' + ', '.join(missing) + '; รัน bash run.sh setup')
            except APIError as exc:
                if exc.status not in (404, 405):
                    raise
                for model in models:
                    client.chat(model, [{'role': 'user', 'content': 'Reply with OK.'}], 32)
        print('Configuration checked. Run bash run.sh to generate and evaluate Closure-1.')
        return 0
    project = args.project or config.get('PROJECT') or 'Closure'
    if not re.fullmatch(r'[A-Za-z][A-Za-z0-9]*', project):
        parser.error('Invalid project ID')
    lock = (ROOT / '.run.lock').open('a')
    try:
        fcntl.flock(lock, fcntl.LOCK_EX | fcntl.LOCK_NB)
    except BlockingIOError:
        raise PipelineError('โปรแกรมชุดนี้กำลังรันอยู่อีก terminal รอให้จบก่อน') from None
    pipeline = Pipeline(ROOT, client, d4j, config)
    installed = pipeline.bids(project)
    bugs = installed if args.all else [i for i in installed if args.start <= i <= args.end]
    if not bugs:
        raise PipelineError('ไม่มี active bug IDs ในช่วงนี้ของ ' + project)
    print('\nProject: %s | bugs: %s | models: %s' % (project, ','.join(map(str, bugs)), ', '.join(models + [m for m in args.methods if m != 'AI'])))
    print('รันทีละ bug เพื่อใช้คอมเก่าได้; Ctrl+C หยุด แล้วใช้คำสั่งเดิมรันต่อได้')
    problems = 0
    # Keep the required Chart-1 compatibility checkpoint before any bulk run.
    if generator:
        gate = Pipeline(ROOT, None, d4j, config, external_generator=generator)
        print('[CHECKPOINT] Chart-1: checking SA and BPSO with this JAR before continuing')
        for algorithm in ('SA', 'BPSO'):
            try:
                checked = gate.run_bug('Chart', 1, algorithm, args.round, args.retry_failed)
                if checked['status'] != 'DONE':
                    raise PipelineError('Chart-1 / ' + algorithm + ' checkpoint failed: ' + checked.get('error', 'invalid test pair'))
            finally:
                gate.write_reports('Chart', algorithm, args.round, [1])
        print('[CHECKPOINT PASSED] Chart-1 / SA + BPSO')
    tasks = [(model, None) for model in models] + [(method, generator) for method in dict.fromkeys(args.methods) if method != 'AI']
    for model, external in tasks:
        pipeline = Pipeline(ROOT, client if external is None else None, d4j, config, external_generator=external)
        for bug in bugs:
            try:
                row = pipeline.run_bug(project, bug, model, args.round, args.retry_failed)
                if row['status'] != 'DONE' or row.get('coverage_status') != 'OK':
                    problems += 1
                    print('[CHECK LOG] ' + row.get('error', 'coverage incomplete') + '\n' + row['output_dir'])
            except APIError as exc:
                problems += 1
                print('[API FAILED] ' + str(exc), file=sys.stderr)
                if exc.status in (401, 403, 404, 429):
                    break  # Stop for invalid key, permission, model, or quota errors.
                continue  # Keep the failed result and move to the next bug.
            except (PipelineError, ValueError, OSError) as exc:
                problems += 1
                print('[FAILED] ' + str(exc), file=sys.stderr)
            finally:
                pipeline.write_reports(project, model, args.round, bugs)
    print('\nจบการรัน ผลอยู่ใน: ' + str(pipeline.result_base / project))
    if problems:
        print('มี %s รายการที่ยังไม่สมบูรณ์ ดู result.json / .log ในโฟลเดอร์นั้น' % problems)
    return 1 if problems else 0


if __name__ == '__main__':
    try:
        sys.exit(main())
    except KeyboardInterrupt:
        print('\nหยุดแล้ว เทส/ผลที่บันทึกไว้ยังอยู่ รันคำสั่งเดิมเพื่อทำต่อ', file=sys.stderr)
        sys.exit(130)
    except (APIError, PipelineError, ValueError, OSError) as exc:
        message = str(exc)
        for secret in (config_values().get('KKU_API_KEY'), os.environ.get('KKU_API_KEY')):
            if secret:
                message = message.replace(secret, '[REDACTED]')
        print('\n[ERROR] ' + message, file=sys.stderr)
        sys.exit(2)
