import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor " + (i+1) + ": ");
            valores[i] = sc.nextInt();
        }

        int maior = valores[0];
        int menor = valores[0];

        for (int v : valores) {
            if (v > maior) maior = v;
            if (v < menor) menor = v;
        }

        System.out.println("Maior valor = " + maior);
        System.out.println("Menor valor = " + menor);

        sc.close();
    }
}
