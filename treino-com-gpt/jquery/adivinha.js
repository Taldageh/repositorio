let numeroAleatorio = Math.floor(Math.random() * 100) + 1;
let contagemPalpites = 1;

const campoPalpite = document.getElementById("campoPalpite");
const palpites = document.getElementById("palpites");
const ultimoResultado = document.getElementById("ultimoResultado");
const baixoOuAlto = document.getElementById("baixoOuAlto");

function conferirPalpite() {
  const palpiteUsuario = Number(campoPalpite.value);
  if (contagemPalpites === 1) {
    palpites.textContent = "Palpites anteriores: ";
  }
  palpites.textContent += palpiteUsuario + " ";

  if (palpiteUsuario === numeroAleatorio) {
    ultimoResultado.textContent = "Parabéns! Você acertou!";
    ultimoResultado.style.backgroundColor = "green";
    baixoOuAlto.textContent = "";
    configFimDeJogo();
  } else if (contagemPalpites === 10) {
    ultimoResultado.textContent = "!!!FIM DE JOGO!!!";
    baixoOuAlto.textContent = "";
    configFimDeJogo();
  } else {
    ultimoResultado.textContent = "Errado!";
    ultimoResultado.style.backgroundColor = "red";
    if (palpiteUsuario < numeroAleatorio) {
      baixoOuAlto.textContent = "Seu palpite está muito baixo!";
    } else {
      baixoOuAlto.textContent = "Seu palpite está muito alto!";
    }
  }

  contagemPalpites++;
  campoPalpite.value = "";
  campoPalpite.focus();
}

function configFimDeJogo() {
  campoPalpite.disabled = true;
  document.querySelector("button").disabled = true;

  const botaoReinicio = document.createElement("button");
  botaoReinicio.textContent = "Reiniciar Jogo";
  document.body.appendChild(botaoReinicio);
  botaoReinicio.addEventListener("click", reiniciarJogo);
}

function reiniciarJogo() {
  contagemPalpites = 1;

  const reiniciarResultados = document.querySelectorAll(".resultado");
  reiniciarResultados.forEach((p) => (p.textContent = ""));

  const botao = document.querySelector("button");
  botao.disabled = false;

  campoPalpite.disabled = false;
  campoPalpite.value = "";
  campoPalpite.focus();

  numeroAleatorio = Math.floor(Math.random() * 100) + 1;

  const botaoReinicio = document.querySelector("body").lastChild;
  botaoReinicio.remove();
}
