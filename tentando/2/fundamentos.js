var VariavelAntiga = "oiiie";

console.log(VariavelAntiga);

var meuNumero = 10;

console.log(meuNumero);

console.log(meuNumero + 5);

console.log(typeof meuNumero);

var booleano = true;

console.log(typeof booleano);

var meuObjeto = {};
var meuArray = [];
var meuNull = null;
var meuUndefined = undefined;

console.log(typeof meuObjeto);
console.log(typeof meuArray);
console.log(typeof meuNull);
console.log(typeof meuUndefined);

let x = 10;
const y = 5;

console.log(typeof x);

console.log(x, y);

console.log(x + y);
console.log(x - y);
console.log(x * y);
console.log(x / y);

console.log(x == y); //comparar se são iguais
console.log(x != y); // se são direfentes

console.log("5" == 5); // só verifica se são iguais
console.log("5" === 5); //verifica o tipo também
console.log("5" !== 5);

//and = &&
// Or = ||

console.log(10 > 5 && 20 > 5);
console.log(10 > 5 && 20 < 5);
console.log(10 < 5 && 20 < 5);


console.log(10 > 5 || 20 > 5);
console.log(10 > 5 || 20 < 5);
console.log(10 < 5 || 20 < 5);

const meuNumero2 = "123";

const meuNumeroConvertido = Number(meuNumero2);

console.log(meuNumeroConvertido);
console.log(typeof meuNumeroConvertido);

const idade = 15;

if(idade < 13) {
    console.log("Criança");
} else if(idade < 20) {
    console.log("Adolescente");
} else {
    console.log("Adulto");
}

if(false) {
    console.log("Isso executa");
} else {
    console.log("Isso agora é executado!")
}

const fruta ="Mamão";

switch(fruta) {
    case "Banana":
    console.log("Banana é a fruta!");
    break;
    case "Maça":
    console.log("Maçã é a fruta!");
    break;
    default:
        console.log("Fruta não encontrada!");
}

for(let i = 0; i < 5; i++) {
    console.log("O valor de i é: " + i);
}

let k = 0;

while (k < 5) {
    console.log("O valor de k: " + k);
    k++;
}

let j = 0;

do {
    console.log("O valor de j é: " + j);
    j++;
} while( j < 5);

