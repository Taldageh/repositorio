package resumo; // Declara o pacote onde a classe está localizada
// Senha com limite de tentativas
// DO-WHILE + IF-ELSE
import java.util.Scanner;  // Importa Scanner para ler do teclado

public class SenhaLimite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Cria scanner para leitura

        final String SENHA_CORRETA = "prova123";  // Define a senha correta (constante)
        String senhaDigitada;  // Variável para armazenar a senha digitada
        int tentativas = 0;    // Contador de tentativas feitas pelo usuário
        final int MAX_TENTATIVAS = 3;  // Limite máximo de tentativas permitidas

        // Usa o do-while para garantir que o usuário tente ao menos uma vez digitar a senha
        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();  // Lê a senha que o usuário digitou
            tentativas++;  // Incrementa o número de tentativas

            // Verifica se a senha digitada é igual à senha correta
            if (senhaDigitada.equals(SENHA_CORRETA)) {
                // Se a senha estiver correta, permite acesso e sai do laço com 'break'
                System.out.println("Senha correta! Acesso permitido.");
                break;  // Sai do do-while
            } else {
                // Se a senha estiver errada, verifica se ainda há tentativas restantes
                if (tentativas < MAX_TENTATIVAS) {
                    // Se ainda pode tentar, avisa que a senha está incorreta e quantas tentativas restam
                    System.out.println("Senha incorreta! Tente novamente. Tentativa " + tentativas + " de " + MAX_TENTATIVAS);
                } else {
                    // Se acabou as tentativas, bloqueia o acesso
                    System.out.println("Número máximo de tentativas atingido. Acesso bloqueado.");
                }
            }
        } while (tentativas < MAX_TENTATIVAS && !senhaDigitada.equals(SENHA_CORRETA));
        // Continua enquanto não acertar a senha e não ultrapassar o limite de tentativas

        scanner.close();  // Fecha o scanner para liberar recursos
    }
}

