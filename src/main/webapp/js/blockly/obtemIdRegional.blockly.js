window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ObtemIdRegional = window.blockly.js.blockly.ObtemIdRegional || {};

/**
 * obtemIdRegional
 */
window.blockly.js.blockly.ObtemIdRegional.Executar = function(obterId) {
 var item;
  item = obterId;
  console.log(item);
  this.cronapi.screen.changeValueOfField("ListaservicosGrid.active.regional", item);
}
