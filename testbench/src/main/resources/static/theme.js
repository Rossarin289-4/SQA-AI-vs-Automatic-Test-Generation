(() => {
  const storageKey = 'testbench-theme';
  let theme = 'light';
  try {
    const saved = localStorage.getItem(storageKey);
    if (saved === 'dark' || saved === 'light') theme = saved;
  } catch (_) { /* Keep the page usable when browser storage is disabled. */ }
  document.documentElement.dataset.theme = theme;

  const updateButtons = () => {
    document.querySelectorAll('[data-theme-toggle]').forEach(button => {
      const next = theme === 'dark' ? 'light' : 'dark';
      const label = next === 'dark' ? 'โหมดมืด' : 'โหมดสว่าง';
      const text = button.querySelector('[data-theme-label]');
      const icon = button.querySelector('.theme-toggle-icon');
      if (text) text.textContent = label;
      if (icon) icon.textContent = next === 'dark' ? '☾' : '☀';
      button.setAttribute('aria-label', 'เปลี่ยนเป็น' + label);
      button.setAttribute('aria-pressed', String(theme === 'dark'));
    });
  };

  const bind = () => {
    updateButtons();
    document.querySelectorAll('[data-theme-toggle]').forEach(button => button.addEventListener('click', () => {
      theme = theme === 'dark' ? 'light' : 'dark';
      document.documentElement.dataset.theme = theme;
      try { localStorage.setItem(storageKey, theme); } catch (_) { /* Theme still applies for this page. */ }
      updateButtons();
    }));
  };
  if (document.readyState === 'loading') document.addEventListener('DOMContentLoaded', bind);
  else bind();
})();
