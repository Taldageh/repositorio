print(
    "Olá, mundo!"
)

# Inteiro
numero_inteiro = 10
print("Número inteiro:", numero_inteiro)

# Ponto flutuante
numero_ponto_flutuante = 10.5
print("Número ponto flutuante:", numero_ponto_flutuante)

# type()
print("Tipo de numero_inteiro:", type(numero_inteiro))
print("Tipo de numero_ponto_flutuante:", type(numero_ponto_flutuante))

# Conversão de tipos
numero_convertido = int(numero_ponto_flutuante)
print("Número convertido:", numero_convertido)

# soma 
soma = numero_inteiro + numero_convertido
print("Soma:", soma)

# Subtração
subtracao = numero_inteiro - numero_convertido
print("Subtração:", subtracao)

# Multiplicação
multiplicacao = numero_inteiro * numero_convertido
print("Multiplicação:", multiplicacao)

# Divisão float
divisao = numero_ponto_flutuante / numero_convertido
print("Divisão:", divisao)
print("Valor em inteiro:", int(divisao))

# Divisão inteira
divisao_inteira = numero_ponto_flutuante // numero_convertido
print("Divisão inteira:", divisao_inteira)
print("Valor em inteiro:", float(divisao_inteira))

# int
print("Conversão de string para inteiro:", int("numero_ponto_flutuante"))

# float
print("Conversão de string para float:", float("soma"))

#Modulo
modulo = numero_inteiro % 3
print("Módulo:", modulo)