"""Adapter for the supplied custom SA/BPSO EvoSuite build."""
import hashlib
import json
import os
import re
import shutil
import subprocess
import zipfile
from pathlib import Path
from core import atomic_json, java_tokens
from runner import PipelineError


REQUIRED_CLASSES = ['org/evosuite/ga/metaheuristics/SimulatedAnnealingAlgorithm.class',
                    'org/evosuite/ga/metaheuristics/BinaryParticleSwarmAlgorithm.class']


def custom_jar(path):
    try:
        with zipfile.ZipFile(path) as jar:
            return all(name in jar.namelist() for name in REQUIRED_CLASSES)
    except (OSError, zipfile.BadZipFile):
        return False


def ensure_evosuite(root, config):
    source = Path(config.get('EVOSUITE_SOURCE') or str(Path.home() / 'SQA/evosuite')).expanduser().resolve()
    explicit = config.get('EVOSUITE_JAR')
    candidates = [Path(explicit).expanduser()] if explicit else []
    candidates += sorted((source / 'master/target').glob('evosuite-master-*.jar'))
    for jar in candidates:
        if custom_jar(jar):
            print('EvoSuite SA/BPSO: ' + str(jar))
            return jar.resolve()
    if not source.is_dir():
        raise PipelineError('ไม่พบ EvoSuite source/JAR เดิม ตั้ง EVOSUITE_SOURCE หรือ EVOSUITE_JAR ใน .env; ใช้ --methods AI เพื่อรัน API อย่างเดียวได้')
    print('กำลัง build SA/BPSO จากซอร์สเดิมครั้งแรก...', flush=True)
    code = subprocess.call(['bash', str(Path(root) / 'scripts/build_custom_evosuite.sh'), str(source)])
    if code:
        raise PipelineError('EvoSuite build failed; see build output above.')
    for jar in sorted((source / 'master/target').glob('evosuite-master-*.jar')):
        if custom_jar(jar):
            return jar.resolve()
    raise PipelineError('Build จบแต่ไม่พบ JAR ที่มี SA/BPSO')


class EvoSuiteGenerator:
    def __init__(self, jar, config):
        self.jar, self.config = Path(jar).resolve(), config
        if not custom_jar(self.jar):
            raise PipelineError('JAR ไม่มีคลาส SA/BPSO ที่ต้องใช้: ' + str(self.jar))
        self.budget = int(config.get('SEARCH_BUDGET', 30))
        self.population = int(config.get('POPULATION', 30))
        self.seed = int(config.get('RANDOM_SEED', 20260930))
        self.criteria = config.get('CRITERIA') or 'LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:CBRANCH'
        if self.budget < 1:
            raise PipelineError('SEARCH_BUDGET must be positive.')
        self.jar_sha = hashlib.sha256(self.jar.read_bytes()).hexdigest()

    def fingerprint(self):
        return {'jar_sha256': self.jar_sha, 'search_budget_seconds': self.budget,
                'population': self.population, 'random_seed': self.seed, 'criteria': self.criteria}

    def generate(self, pipeline, fixed, targets, folder, tests, algorithm, force=False):
        if algorithm not in ('SA', 'BPSO'):
            raise PipelineError('Unknown EvoSuite algorithm: ' + algorithm)
        entries = []
        for prop in ('cp.compile', 'cp.test', 'dir.bin.classes', 'dir.bin.tests'):
            value = pipeline.export(fixed, prop, folder / (prop.replace('.', '_') + '.log'))
            for item in value.split(os.pathsep):
                if not item:
                    continue
                path = Path(item)
                if not path.is_absolute():
                    path = fixed / path
                if path.exists() and str(path) not in entries:
                    entries.append(str(path.resolve()))
        if not entries:
            raise PipelineError('EvoSuite project classpath is empty.')
        classpath = os.pathsep.join(entries)
        total_seconds = 0.0
        for target in targets:
            directory = folder / 'generation' / target.replace('.', '_')
            generated = directory / 'evosuite-tests'
            directory.mkdir(parents=True, exist_ok=True)
            marker = directory / 'generation.json'
            cached = json.loads(marker.read_text()) if marker.exists() else {}
            existing = list(generated.rglob('*_ESTest.java')) if generated.exists() else []
            if force or not existing or not cached.get('success'):
                if generated.exists():
                    import time
                    generated.rename(directory / ('previous_tests_' + str(time.time_ns())))
                command = ['java', '-cp', str(self.jar) + os.pathsep + classpath, 'org.evosuite.EvoSuite',
                           '-generateSuite', '-Dalgorithm=' + algorithm, '-Dsearch_budget=' + str(self.budget),
                           '-Dpopulation=' + str(self.population), '-Drandom_seed=' + str(self.seed),
                           '-Dcriterion=' + self.criteria, '-Dglobal_timeout=120', '-Dinitialization_timeout=120',
                           '-Dminimization_timeout=60', '-Dassertion_timeout=60', '-Dwrite_junit_timeout=60',
                           '-Djunit_check_timeout=60', '-Dextra_timeout=60', '-Dno_runtime_dependency=true',
                           '-Dtest_dir=' + str(generated), '-class', target, '-projectCP', classpath]
                atomic_json(directory / 'command.json', command)
                print('[GENERATE] %s / %s / budget=%ss' % (algorithm, target, self.budget), flush=True)
                rc, output, seconds = pipeline.run_process(command, cwd=directory, log=directory / 'terminal.log')
                existing = list(generated.rglob('*_ESTest.java')) if generated.exists() else []
                cached = {'success': rc == 0 and bool(existing), 'seconds': seconds,
                          'search_budget_seconds': self.budget, 'returncode': rc}
                atomic_json(marker, cached)
                if not cached['success']:
                    raise PipelineError('EvoSuite did not produce JUnit tests: ' + target + '\n' + output[-2500:])
            total_seconds += cached.get('seconds', 0)
            for source in generated.rglob('*.java'):
                destination = tests / source.relative_to(generated)
                destination.parent.mkdir(parents=True, exist_ok=True)
                shutil.copy2(source, destination)
        count = sum(len(re.findall(r'@(?:org\.junit\.)?Test\b', java_tokens(path.read_text(encoding='utf-8')))) for path in tests.rglob('*_ESTest.java'))
        if count < 1:
            raise PipelineError('EvoSuite produced no enabled @Test methods.')
        return {'declared_test_methods': count, 'generation_seconds': round(total_seconds, 3),
                'search_budget_seconds': self.budget, 'evosuite_jar_sha256': self.jar_sha,
                'random_seed': self.seed, 'search_criteria': self.criteria}
