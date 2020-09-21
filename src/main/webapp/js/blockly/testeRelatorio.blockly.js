window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.TesteRelatorio = window.blockly.js.blockly.TesteRelatorio || {};

/**
 * testeRelatorio
 */
window.blockly.js.blockly.TesteRelatorio.Executar = function() {

  this.cronapi.util.openReport('reports/teste.report', []);
}
