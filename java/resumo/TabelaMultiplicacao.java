package resumo; // Declara o pacote onde a classe está localizada
import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado

public class TabelaMultiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Cria um objeto Scanner para leitura

        // Solicita que o usuário digite um número inteiro entre 1 e 20
        System.out.print("Digite um número inteiro entre 1 e 20 para ver sua tabela de multiplicação: ");
        int numero = scanner.nextInt();  // Lê o número digitado pelo usuário

        // Verifica se o número digitado está dentro do intervalo permitido
        if (numero < 1 || numero > 20) {
            // Se o número for menor que 1 ou maior que 20, mostra mensagem de erro
            System.out.println("Número inválido! O programa só aceita números entre 1 e 20.");
        } else {
            // Se o número for válido, inicia o processo de mostrar a tabela
            System.out.println("Tabela de multiplicação do número " + numero + ":");

            // Laço FOR que vai de 1 até 10 para gerar a tabela de multiplicação
            for (int i = 1; i <= 10; i++) {
                // Calcula o resultado da multiplicação do número pelo contador i
                int resultado = numero * i;

                // Imprime a operação no formato "numero x i = resultado"
                System.out.println(numero + " x " + i + " = " + resultado);

                // Condição para verificar se o resultado é múltiplo de 10
                if (resultado % 10 == 0) {  
                    // Se o resultado for múltiplo de 10, avisa o usuário
                    System.out.println("==> O resultado " + resultado + " é múltiplo de 10!");
                }
            }
        }

        // Fecha o scanner para liberar os recursos do sistema
        scanner.close();
    }
}
