window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.AbrirRelatorio = window.blockly.js.blockly.AbrirRelatorio || {};

/**
 * abrirRelatorio
 */
window.blockly.js.blockly.AbrirRelatorio.Executar = function(id_regional) {
 var item, x;
  console.log(id_regional);
  this.cronapi.util.openReport('reports/ListaServicos.report', [{ regional_nome : id_regional } , { regionalRegional_nome : id_regional }]);
}
