function Verificar() {
    var data = new Date()
    var ano = data.getFullYear()
    var fano = document.getElementById('txtano')
    var res = document.getElementById('res')
    // outra possibilidade para pegar ano é (var res = document.querySelector('div#res'))
    if (fano.value.length == 0 || Number(fano.value) > ano) {
        window.alert('[ERRO] Verifique os dados e tente novamente!')
    } else {
        var fsex = document.getElementsByName('radsex')
        var idade = ano - Number(fano.value)
        var genero = ''
        var img = document.createElement('img') // cria um elemento de imagem
        img.setAttribute('id', 'foto') // define o id do elemento de imagem
        if (fsex[0].checked) {
            genero = 'Homem'
            if (idade >=0 && idade < 5) {
                //bebe
                img.setAttribute('src', 'foto-bebe-m.png')
                } else if (idade < 12){
                //criança
                img.setAttribute('src', 'foto-crianca-m.png')
            } else if (idade < 15){
                //pre-adolescente
                img.setAttribute('src', 'foto-pre-adolescente-m.png')
                } else if (idade < 21){
                //jovem
                img.setAttribute('src', 'foto-adolescente-m.png')
            } else if (idade < 50) {
                //Adulto
                img.setAttribute('src', 'foto-adulto-m.png')
            } else {
                //idoso
                img.setAttribute('src', 'foto-idoso-m.png')
            }
        } else if (fsex[1].checked) {
            genero = 'Mulher'
             if (idade >=0 && idade < 5) {
                //bebe
                img.setAttribute('src', 'foto-bebe-m.png')
                } else if (idade < 12){
                //criança
                img.setAttribute('src', 'foto-crianca-f.png')
                 } else if (idade < 15){
                //pre-adolescente
                img.setAttribute('src', 'foto-pre-adolescente-f.png')
            } else if (idade < 21){
                //jovem
                img.setAttribute('src', 'foto-adolescente-f.png')
            } else if (idade < 50) {
                //Adulto
                img.setAttribute('src', 'foto-adulto-f.png')
            } else {
                //idoso
                img.setAttribute('src', 'foto-idoso-f.png')
            }
        }
        res.style.textAlign = 'center'
        res.innerHTML = `Detectamos ${genero} com ${idade} anos.`
        res.appendChild(img)
    }
}