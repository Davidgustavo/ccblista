window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.SomaIrmaoIrma = window.blockly.js.blockly.SomaIrmaoIrma || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.SomaIrmaoIrma.desabilitar = function() {
 var total, irmao, irma;
  this.cronapi.screen.disableComponent("crn-modal-textinput-resultadototal-89459");
}

/**
 * somaIrmaoIrma
 */
window.blockly.js.blockly.SomaIrmaoIrma.Executar = function() {
 var total, irmao, irma;
  irmao = this.cronapi.screen.getValueOfField("ListaservicosGrid.active.resultadoirmaos");
  irma = this.cronapi.screen.getValueOfField("ListaservicosGrid.active.resultadoirmas");
  total = irma + irmao;
  this.cronapi.screen.changeValueOfField("ListaservicosGrid.active.resultadototal", total);
}
