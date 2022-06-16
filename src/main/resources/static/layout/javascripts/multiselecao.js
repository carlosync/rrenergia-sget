/**
 * Created by Carlos Aurélio on 15/09/19.
 */
var Sgap = Sgap || {};

Sgap.Multiselecao = (function () {

    function Multiselecao() {
        this.statusBtn = $('.js-status-btn');
        this.selecaoCheckbox = $('.js-selecao');
    }

    Multiselecao.prototype.iniciar = function () {
        this.statusBtn.on('click', onAlterarStatusClicado.bind(this));
    }

    function onAlterarStatusClicado(event) {
        var botaoClicado = $(event.currentTarget);

        var checkboxSelecionados = this.selecaoCheckbox.filter(':checked');
    }

    return Multiselecao;

}());

$(function () {
    var multiselecao = new Sgap.Multiselecao();
    multiselecao.iniciar();
});