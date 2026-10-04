(() => {
  let dialog;
  let messageNode;
  let titleNode;
  let cancelButton;
  let resolveCurrent;

  const create = () => {
    if (dialog) return;
    dialog = document.createElement('dialog');
    dialog.className = 'app-modal';
    dialog.setAttribute('aria-labelledby', 'app-modal-title');
    dialog.innerHTML = '<section class="app-modal-card"><h2 id="app-modal-title"></h2><p class="app-modal-message"></p><div class="app-modal-actions"><button class="app-modal-cancel" type="button">ยกเลิก</button><button class="app-modal-accept" type="button">ตกลง</button></div></section>';
    document.body.appendChild(dialog);
    messageNode = dialog.querySelector('.app-modal-message');
    titleNode = dialog.querySelector('#app-modal-title');
    cancelButton = dialog.querySelector('.app-modal-cancel');
    const finish = value => {
      if (!resolveCurrent) return;
      const resolve = resolveCurrent;
      resolveCurrent = null;
      dialog.close();
      resolve(value);
    };
    dialog.querySelector('.app-modal-accept').addEventListener('click', () => finish(true));
    cancelButton.addEventListener('click', () => finish(false));
    dialog.addEventListener('cancel', event => { event.preventDefault(); finish(false); });
  };

  const show = (message, options = {}) => new Promise(resolve => {
    create();
    titleNode.textContent = options.title || (options.confirm ? 'ยืนยันการทำรายการ' : 'แจ้งเตือน');
    messageNode.textContent = String(message || '');
    cancelButton.hidden = !options.confirm;
    resolveCurrent = resolve;
    dialog.showModal();
    dialog.querySelector(options.confirm ? '.app-modal-cancel' : '.app-modal-accept').focus();
  });

  window.appModal = {
    alert: message => show(message),
    confirm: message => show(message, {confirm: true})
  };
})();
