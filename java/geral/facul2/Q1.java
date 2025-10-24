import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor inteiro: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo valor inteiro: ");
        int n2 = sc.nextInt();

        int diferenca;

        if (n1 > n2) {
            diferenca = n1 - n2;
        } else {
            diferenca = n2 - n1;
        }

        System.out.println("A diferença do maior pelo menor é: " + diferenca);

        sc.close();
    }
}
