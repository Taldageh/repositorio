import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo ou negativo: ");
        int n = sc.nextInt();

        if (n <= 0) {
            n = n * -1;
        }

        System.out.println("Valor positivo: " + n);
        sc.close();
    }
}
