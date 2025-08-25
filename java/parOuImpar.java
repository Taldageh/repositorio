import java.util.Scanner;

public class parOuImpar {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero= entrada.nextInt();
        // Verifica se o número é par ou ímpar
        if(numero % 2 == 0) {
            System.out.print("O número é par");
        } else {
            System.out.print("O número é ímpar");
        }
        // Fechando o objeto
        entrada.close();
    }
}
