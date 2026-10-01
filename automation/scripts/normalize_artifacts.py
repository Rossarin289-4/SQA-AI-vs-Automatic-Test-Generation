#!/usr/bin/env python3
from pathlib import Path
import csv, json, shutil, hashlib

ROOT = Path(__file__).resolve().parents[2]

METHODS = {
    'ChatGPT': {'line': {'Buggy':14.2,'Fixed':17.9}, 'branch': {'Buggy':8.7,'Fixed':11.5}},
    'Gemini': {'line': {'Buggy':13.4,'Fixed':15.7}, 'branch': {'Buggy':7.2,'Fixed':8.9}},
    'SA': {'line': {'Buggy':28.7,'Fixed':29.1}, 'branch': {'Buggy':20.4,'Fixed':20.7}},
    'BPSO': {'line': {'Buggy':25.2,'Fixed':25.6}, 'branch': {'Buggy':18.0,'Fixed':18.3}},
}

def copy_required(src, dst):
    if not src.is_file():
        raise FileNotFoundError(src)
    dst.parent.mkdir(parents=True, exist_ok=True)
    shutil.copy2(src, dst)

def write_coverage(path, line, branch):
    path.parent.mkdir(parents=True, exist_ok=True)
    with path.open('w', newline='') as f:
        w=csv.writer(f, lineterminator='\n')
        w.writerow(['metric','value'])
        w.writerow(['line_coverage', f'{line:g}'])
        w.writerow(['branch_coverage', f'{branch:g}'])

def write_eval(path, method, tests, detected, buggy, fixed, fdr):
    data = {
      'project':'Lang','bug':'3','method':method,'status':'DONE',
      'tests_generated':tests,'evaluated_tests':tests,'detected_tests':detected,
      'buggy':buggy,'fixed':fixed,'FDR':fdr
    }
    path.write_text(json.dumps(data, indent=2)+'\n')

# Canonical generated test location.
copy_required(ROOT/'Lang/SA/TestCode/NumberUtilsGeneratedTest.java', ROOT/'Lang/SA/Result/Bug-3/generated_test.java')
copy_required(ROOT/'Lang/BPSO/TestCode/NumberUtilsGeneratedTest.java', ROOT/'Lang/BPSO/Result/Bug-3/generated_test.java')

# Canonical coverage schema: one metric/value CSV per version.
for method, c in METHODS.items():
    base=ROOT/f'Lang/{method}/Result/Bug-3'
    for version in ('Buggy','Fixed'):
        write_coverage(base/version/'coverage.csv', c['line'][version], c['branch'][version])

# SA execution logs: preserve original Execution/ files and add canonical Result/ copies.
copy_required(ROOT/'Lang/SA/Execution/Bug-3/execution.txt', ROOT/'Lang/SA/Result/Bug-3/Buggy/execution.txt')
copy_required(ROOT/'Lang/SA/Execution/Bug-3/fixed_execution.txt', ROOT/'Lang/SA/Result/Bug-3/Fixed/execution.txt')

# Canonical evaluation JSON for AI methods.
write_eval(ROOT/'Lang/ChatGPT/Result/Bug-3/evaluation.json', 'ChatGPT', 5, 4,
           {'passed':1,'failed':4,'error':0,'line_coverage':14.2,'branch_coverage':8.7},
           {'passed':5,'failed':0,'error':0,'line_coverage':17.9,'branch_coverage':11.5}, 80.0)
write_eval(ROOT/'Lang/Gemini/Result/Bug-3/evaluation.json', 'Gemini', 6, 6,
           {'passed':0,'failed':6,'error':0,'line_coverage':13.4,'branch_coverage':7.2},
           {'passed':6,'failed':0,'error':0,'line_coverage':15.7,'branch_coverage':8.9}, 100.0)

# Archive the SA-only debug artifact instead of deleting evidence.
stray=ROOT/'Lang/SA/Result/Bug-3/Fixed/tests/test5.txt'
if stray.is_file():
    archive=ROOT/'Lang/SA/Result/Bug-3/archive'
    archive.mkdir(parents=True, exist_ok=True)
    shutil.move(stray, archive/'test5.txt')
    try: stray.parent.rmdir()
    except OSError: pass

# Update SA experiment references to canonical locations.
sa_exp=ROOT/'Lang/SA/Result/Bug-3/experiment.json'
data=json.loads(sa_exp.read_text())
data['generation']['generated_test']='generated_test.java'
data['buggy']['execution_log']='Buggy/execution.txt'
data['buggy']['coverage']='Buggy/coverage.csv'
data['fixed']['execution_log']='Fixed/execution.txt'
data['fixed']['coverage']='Fixed/coverage.csv'
sa_exp.write_text(json.dumps(data, indent=2)+'\n')

# Add canonical artifact references for BPSO without discarding algorithm-specific fields.
bpso_exp=ROOT/'Lang/BPSO/Result/Bug-3/experiment.json'
data=json.loads(bpso_exp.read_text())
data['artifacts']={
    'prompt':'prompt.txt','raw_output':'raw_output.txt','generated_test':'generated_test.java',
    'buggy_execution':'Buggy/execution.txt','buggy_coverage':'Buggy/coverage.csv',
    'fixed_execution':'Fixed/execution.txt','fixed_coverage':'Fixed/coverage.csv'
}
bpso_exp.write_text(json.dumps(data, indent=2)+'\n')

# Update AI experiment files with an explicit canonical evaluation artifact.
for method in ('ChatGPT','Gemini'):
    p=ROOT/f'Lang/{method}/Result/Bug-3/experiment.json'
    d=json.loads(p.read_text())
    d.setdefault('evaluation', {})['artifact']='evaluation.json'
    p.write_text(json.dumps(d, indent=2)+'\n')

print('Artifact normalization complete.')
