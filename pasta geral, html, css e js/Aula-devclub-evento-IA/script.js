/*
    document =HTML
    document.querySelector = Seleciona o primeiro elemento que corresponde ao seletor CSS fornecido. (Simplificado bus alguém no HTML ou DOM(arvore de objetos do documento))
    document.querySelectorAll = Seleciona todos os elementos que correspondem ao seletor CSS fornecido.
    document.getElementById = Seleciona o elemento com o ID fornecido.
*/

let webhook = "https://geh.app.n8n.cloud/webhook-test/animacao-css"
/*funcao assincrona, que permite que o código aguarde a conclusão de uma operação assíncrona antes de continuar a execução
(ele busca o que está dentro da função antes de continuar)*/
async function cliqueiNoBotao() {
    let textoInput = document.querySelector(".input-animacao").value
    //conseguir o valor do input(escrito pelo usuário)
    let resposta = await fetch(webhook, {
        method: 'POST', //Estamos enviando dados, usamos o método POST
        headers: {
            'Content-Type': 'application/json' //Estamos dizendo que os dados é no formato JSON
        },
        body: JSON.stringify({ pergunta: textoInput }) //Estamos enviando o texto do input como um objeto JSON
    })

    let resultado = await resposta.json() //Aguardamos a resposta do servidor e convertemos para JSON
    console.log(resultado) //Exibimos o resultado no console
    //fetch se comunica com algo de fora do codigo, como uma API ou um servidor
    //fetch retorna uma promessa, que é um objeto que representa a conclusão ou falha de uma operação assíncrona.
    //fetch(webhook) retorna uma promessa que será resolvida quando a resposta for recebida
}