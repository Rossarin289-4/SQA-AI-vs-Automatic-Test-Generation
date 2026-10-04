(() => {
  const source = document.getElementById('diff-source');
  const viewer = document.getElementById('defect-diff');
  if (!source || !viewer) return;

  const patch = source.textContent.replace(/\r\n?/g, '\n');
  const lines = patch.split('\n');
  const keywords = new Set(('abstract assert boolean break byte case catch char class const continue default do double else enum extends final finally float for if goto implements import instanceof int interface long native new package private protected public return short static strictfp super switch synchronized this throw throws transient try void volatile while var record yield').split(' '));
  const types = new Set(('BigDecimal BigInteger Boolean Byte Character Class Double Float Integer Long Number Object Short String').split(' '));

  function javaCode(text) {
    const frag = document.createDocumentFragment();
    const pattern = /(\/\/.*|\/\*.*?\*\/|"(?:\\.|[^"\\])*"|'(?:\\.|[^'\\])*'|\b[A-Za-z_$][\w$]*\b|\b\d+(?:\.\d+)?[fFdDlL]?\b)/g;
    let cursor = 0;
    for (const match of text.matchAll(pattern)) {
      const token = match[0];
      const start = match.index;
      if (start > cursor) frag.append(document.createTextNode(text.slice(cursor, start)));
      let cls = '';
      if (token.startsWith('//') || token.startsWith('/*')) cls = 'syntax-comment';
      else if (token.startsWith('"') || token.startsWith("'")) cls = 'syntax-string';
      else if (/^\d/.test(token)) cls = 'syntax-number';
      else if (keywords.has(token)) cls = 'syntax-keyword';
      else if (types.has(token)) cls = 'syntax-type';
      if (cls) {
        const span = document.createElement('span');
        span.className = cls;
        span.textContent = token;
        frag.append(span);
      } else frag.append(document.createTextNode(token));
      cursor = start + token.length;
    }
    if (cursor < text.length) frag.append(document.createTextNode(text.slice(cursor)));
    return frag;
  }

  function addFile(label) {
    const heading = document.createElement('div');
    heading.className = 'code-diff-file';
    heading.textContent = label;
    viewer.append(heading);
  }

  let table = null;
  let oldLine = null;
  let newLine = null;
  const ensureTable = () => {
    if (!table) {
      table = document.createElement('table');
      table.className = 'code-diff-table';
      const body = document.createElement('tbody');
      table.append(body);
      viewer.append(table);
    }
    return table.tBodies[0];
  };
  const row = (kind, oldNo, newNo, marker, code) => {
    const tr = document.createElement('tr');
    tr.className = kind;
    const oldCell = document.createElement('td');
    oldCell.className = 'code-diff-num';
    oldCell.textContent = oldNo == null ? '' : String(oldNo);
    const newCell = document.createElement('td');
    newCell.className = 'code-diff-num';
    newCell.textContent = newNo == null ? '' : String(newNo);
    const signCell = document.createElement('td');
    signCell.className = 'code-diff-marker';
    signCell.textContent = marker;
    const codeCell = document.createElement('td');
    codeCell.className = 'code-diff-code';
    codeCell.append(javaCode(code));
    tr.append(oldCell, newCell, signCell, codeCell);
    ensureTable().append(tr);
  };
  const meta = (text) => {
    const tr = document.createElement('tr');
    tr.className = 'diff-meta';
    const td = document.createElement('td');
    td.colSpan = 4;
    td.textContent = text;
    tr.append(td);
    ensureTable().append(tr);
  };

  for (const line of lines) {
    if (line.startsWith('diff --git ')) {
      table = null;
      addFile(line.slice('diff --git '.length).replace(/^a\//, '').replace(/ b\//, ' → '));
      continue;
    }
    if (line.startsWith('--- ') || line.startsWith('+++ ') || line.startsWith('index ')) continue;
    const hunk = line.match(/^@@ -(\d+)(?:,\d+)? \+(\d+)(?:,\d+)? @@(.*)$/);
    if (hunk) {
      oldLine = Number(hunk[1]);
      newLine = Number(hunk[2]);
      const heading = document.createElement('div');
      heading.className = 'code-diff-hunk';
      heading.textContent = line;
      viewer.append(heading);
      table = null;
      continue;
    }
    if (oldLine == null || newLine == null) continue;
    if (line.startsWith('\\')) { meta(line); continue; }
    if (line.startsWith('+')) {
      row('diff-added', null, newLine++, '+', line.slice(1));
    } else if (line.startsWith('-')) {
      row('diff-removed', oldLine++, null, '−', line.slice(1));
    } else if (line.startsWith(' ')) {
      row('diff-context', oldLine++, newLine++, ' ', line.slice(1));
    } else if (line.length) {
      meta(line);
    }
  }
  if (!viewer.childElementCount) viewer.textContent = 'ไม่พบรายการเปลี่ยนแปลงใน patch';
})();
