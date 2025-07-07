/*
    document =HTML
    document.querySelector = Seleciona o primeiro elemento que corresponde ao seletor CSS fornecido. (Simplificado bus alguém no HTML ou DOM(arvore de objetos do documento))
    document.querySelectorAll = Seleciona todos os elementos que correspondem ao seletor CSS fornecido.
    document.getElementById = Seleciona o elemento com o ID fornecido.
*/

function cliqueiNoBotao() {
    let textoInput = document.querySelector(".input-animacao").value
    let button = document.querySelector(".botao-magica")
    button.disabled = true;
    //enviar para a IA
}