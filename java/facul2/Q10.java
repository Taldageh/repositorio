import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 9: ");
        int n = sc.nextInt();

        if (n >= 1 && n <= 9) {
            System.out.println("O valor está na faixa permitida");
        } else {
            System.out.println("O valor está fora da faixa permitida");
        }

        sc.close();
    }
}
