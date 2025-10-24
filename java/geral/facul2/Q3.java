import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma += sc.nextDouble();
        }

        double media = soma / 4;

        if (media >= 5) {
            System.out.println("Aprovado com média " + media);
        } else {
            System.out.println("Reprovado com média " + media);
        }

        sc.close();
    }
}
