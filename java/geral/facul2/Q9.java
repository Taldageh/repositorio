import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " é par");
        } else {
            System.out.println(n + " é ímpar");
        }

        sc.close();
    }
}
