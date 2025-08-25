# Contar vogais

def contar_vogais(texto):
    texto = texto.lower()
    vogais = "aeiou"
    contador = 0
    for letra in texto:
        if letra in vogais:
            contador += 1
    return contador

print(contar_vogais("Meu, Mundo"))

## Par ou Impar

def par_ou_impar(numero):
    if numero % 2 == 0:
        return "É par"
    else:
        return "É ímpar"

print(par_ou_impar(2))

## Media

def media(valores):
    return sum(valores) / len(valores)

print (media([2, 3, 5,  6]))

## numeros primos

def primo(n):
    if n < 2:
        return False
    for i in range(2, n):
        if n % i ==0:
            return False
    return True

## polindromo

def  palindromo(texto):
    texto = texto.lower().replace(" ", "")
    return texto == texto[::-1]

## tabuada

def tabuada(numero):
    for i in range(1, 11):
        print(f"{numero} x {i} = {numero * i}")
        
## Fatorial

def fatorial(n):
    if n == 0 or n == 1:
        return 1
    return n * fatorial(n - 1)

## fazer contagem de idade

from datetime import datetime

nome = input("Qual é o seu nome? ")
idade = int(input("Qual é a sua idade? "))
ano_atual = datetime.now().year
ano_nascimento = ano_atual - idade
print(f"Olá {nome}, você nasceu em {ano_nascimento}")

##Calculadora

def calcular(num1, num2, operador):
    if operador == "+":
        return num1 + num2
    elif operador == "-":
        return num1 - num2
    elif operador == "*":
        return num1 * num2
    elif operador == "/":
        if num2 != 0:
            return num1 / num2
        else:
            return "Erro: Divisão por zero"
    else:
        return "Operador inválido"

print("Calculadora Simples")
print("Operações disponíveis: +, -, *, /")

try:
    numero1 = float(input("Digite o primeiro número: "))
    operador = input("Digite o operador (+, -, *, /): ")
    numero2 = float(input("Digite o segundo número: "))

    resultado = calcular(numero1, numero2, operador)
    print("Resultado:", resultado)

except ValueError:
    print("Entrada inválida. Use apenas números.")

## Pizzaria

def exibir_cardapio():
    print("\n--- CARDÁPIO ---")
    print("Pizzas:")
    print("1 - Calabresa (R$ 30.00)")
    print("2 - Mussarela (R$ 28.00)")
    print("3 - Portuguesa (R$ 32.00)")
    
    print("\nBebidas:")
    print("4 - Refrigerante (R$ 7.00)")
    
    print("\nAcompanhamentos:")
    print("5 - Batata Frita (R$ 10.00)")
    print("-----------------------")

def calcular_total(pedidos):
    total = 0
    for item in pedidos:
        total += item[1]
    return total

def main():
    cardapio = {
        "1": ("Pizza de Calabresa", 30.00),
        "2": ("Pizza de Mussarela", 28.00),
        "3": ("Pizza Portuguesa", 32.00),
        "4": ("Refrigerante", 7.00),
        "5": ("Batata Frita", 10.00)
    }

    pedidos = []

    print("Bem-vindo à Pizzaria Python!")
    
    while True:
        exibir_cardapio()
        escolha = input("Digite o número do item que deseja pedir (ou '0' para finalizar): ")

        if escolha == "0":
            break
        elif escolha in cardapio:
            pedidos.append(cardapio[escolha])
            print(f"Adicionado: {cardapio[escolha][0]}")
        else:
            print("Opção inválida. Tente novamente.")
    
    print("\n--- SEU PEDIDO ---")
    for item in pedidos:
        print(f"- {item[0]}: R$ {item[1]:.2f}")
    
    total = calcular_total(pedidos)
    print(f"Total a pagar: R$ {total:.2f}")
    print("Obrigado pela preferência!")

if __name__ == "__main__":
    main()
