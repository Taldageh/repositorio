let prevButton = document.getElementById('prev')
let nextButton = document.getElementById('next')
let container = document.querySelector('.container')
let items = container.querySelectorAll('.list .item')
let indicator = document.querySelectorAll('.indicators')
let dots = indicator.querySelectorAll('ul li')


let active = 0
let firstPosition = 0
let lastPosition = items.length - 1

prevButton.onclick = () => {
    let itemOld = container.querySelector('.List .item .active')
    
}

prevButton.onclick = () => {
    console.log("Botão prev")
}