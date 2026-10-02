import re, sys, difflib

def read(p):
    return open(p, encoding="utf-8", errors="ignore").read().splitlines()

buggy, fixed = read(sys.argv[1]), read(sys.argv[2])

decl = re.compile(
    r'^(?:    |\t)'
    r'(?!(?:return|throw|else|new|if|for|while|switch|try|case)\b)'
    r'(?!@)'
    r'(?:(?:public|protected|private|static|final|synchronized|abstract)\s+)*'
    r'(?:<[^>]+>\s*)?'
    r'[\w$][\w$<>\[\],.? ]*?\s+([A-Za-z_$][\w$]*)\s*\('
)

def enclosing(lines, idx):
    if not lines:
        return None

    idx = min(max(idx, 0), len(lines) - 1)

    for i in range(idx, -1, -1):
        m = decl.match(lines[i])
        if m:
            return m.group(1)

    return None

names = []

sm = difflib.SequenceMatcher(None, buggy, fixed, autojunk=False)

for tag, i1, i2, j1, j2 in sm.get_opcodes():
    if tag == "equal":
        continue

    candidates = [
        (buggy, i1 if i2 > i1 else i1 - 1),
        (fixed, j1 if j2 > j1 else j1 - 1),
    ]

    for lines, idx in candidates:
        if not lines:
            continue

        n = enclosing(lines, idx)

        if n and n not in names:
            names.append(n)

print({"methods": names})
