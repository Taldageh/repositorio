package java.resumo;
// SWITCH-CASE + FOR + IF-ELSE + DO-WHILE
import java.util.Scanner;  // Importa Scanner para entrada de dados

public class MenuMatematico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Cria scanner para ler dados do usuário
        int opcao;  // Variável para armazenar a escolha do usuário no menu

        // Estrutura DO-WHILE para repetir o menu até o usuário escolher sair (opção 4)
        do {
            // Exibe as opções do menu para o usuário
            System.out.println("\n--- MENU MATEMÁTICO ---");
            System.out.println("1 - Somar números de 1 até N");
            System.out.println("2 - Verificar se um número é primo");
            System.out.println("3 - Mostrar os divisores de um número");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();  // Lê a opção digitada

            // Usa switch-case para escolher qual ação executar de acordo com a opção
            switch (opcao) {
                case 1:
                    // Caso 1: Somar números de 1 até N
                    System.out.print("Digite um número positivo: ");
                    int n = scanner.nextInt();  // Lê o valor N do usuário

                    // Validação para garantir que N é positivo
                    if (n <= 0) {
                        System.out.println("Número inválido! Deve ser positivo.");
                    } else {
                        int soma = 0;  // Variável que vai armazenar a soma

                        // Loop FOR para somar todos os números de 1 até N
                        for (int i = 1; i <= n; i++) {
                            soma += i;  // soma = soma + i
                        }

                        // Exibe o resultado da soma
                        System.out.println("A soma de 1 até " + n + " é " + soma);
                    }
                    break;  // Encerra o case 1 para não continuar nos próximos

                case 2:
                    // Caso 2: Verificar se número é primo
                    System.out.print("Digite um número inteiro maior que 1: ");
                    int num = scanner.nextInt();

                    // Verifica se o número digitado é válido
                    if (num <= 1) {
                        System.out.println("Número inválido! Deve ser maior que 1.");
                    } else {
                        boolean primo = true;  // Supõe que o número é primo até prova contrária

                        // Loop FOR para testar divisores entre 2 e num/2
                        for (int i = 2; i <= num / 2; i++) {
                            if (num % i == 0) {  // Se num é divisível por i (resto 0)
                                primo = false;    // Não é primo
                                break;           // Para de verificar mais divisores
                            }
                        }

                        // Imprime se é primo ou não, baseado na variável 'primo'
                        if (primo) {
                            System.out.println(num + " é um número primo!");
                        } else {
                            System.out.println(num + " não é um número primo.");
                        }
                    }
                    break;

                case 3:
                    // Caso 3: Mostrar divisores de um número
                    System.out.print("Digite um número inteiro positivo: ");
                    int valor = scanner.nextInt();

                    // Validação do valor positivo
                    if (valor <= 0) {
                        System.out.println("Número inválido! Deve ser positivo.");
                    } else {
                        System.out.print("Divisores de " + valor + ": ");

                        // Loop FOR para encontrar todos os divisores do número
                        for (int i = 1; i <= valor; i++) {
                            if (valor % i == 0) {  // Se o resto da divisão for zero, i é divisor
                                System.out.print(i + " ");  // Imprime o divisor
                            }
                        }
                        System.out.println();  // Pula linha depois da lista
                    }
                    break;

                case 4:
                    // Caso 4: sair do programa
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    // Caso padrão para opções inválidas
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);  // Repete enquanto o usuário não escolher sair

        scanner.close();  // Fecha o scanner para liberar recursos
    }
}
