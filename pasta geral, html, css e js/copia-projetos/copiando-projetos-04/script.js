const prevButton = document.getElementById('prev')
const nextButton = document.getElementById('next')
const items = document.querySelectorAll('.item')
const dots = document.querySelectorAll('.dot')
const numberIndicator = document.querySelector('.numbers')
const list = document.querySelector('.list')

let active = 0;
const total = items.length // total de itens no carrossel a contagem por conta do length 
let timer;

function update(direction) { //direção que o usuário quer ir, -1 para voltar e 1 para avançar

    document.querySelector('.item.active') /*aqui ele procura*/.classList.remove('active') // quando ele encontra remove a classe active do item atual do html 
    document.querySelector('.dot.active').classList.remove('active')// remove a classe active do ponto atual do html

    if (direction > 0) { // se a direção for positiva, significa que o usuário quer avançar
        active = active + 1

        if (active === total) {
            active = 0
        }
    } else if (direction < 0) {
        active = active - 1

        if (active < 0) {
            active = total - 1
        }

    }

    items[active].classList.add('active')
    dots[active].classList.add('active') 

    numberIndicator.textContent = String(active + 1).padStart(2, '0')
}
clearInterval(timer)
timer = setInterval(() => {
    update(1)

}, 5000);


// Adicionando eventos de clique aos botões
// para avançar e retroceder os itens do carrossel
prevButton.addEventListener('click', () => {
    update(-1)
})

nextButton.addEventListener('click', () => {
    update(1)
})