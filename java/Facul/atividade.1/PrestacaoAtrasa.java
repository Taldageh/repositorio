package Facul;
import java.util.Scanner;

public class PrestacaoAtrasa {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Digite o valor da prestação: ");
    double valor = sc.nextDouble();

    System.out.print("Digite a taxa de juros (%): ");
    double taxa = sc.nextDouble();

    System.out.print("Digite o tempo de atraso (em meses): ");
    int tempo = sc.nextInt();

    double prestacao = valor + (valor * (taxa / 100) * tempo);

    System.out.printf("O valor da prestação em atraso é: R$ %.2f%n", prestacao);

    sc.close();
}
}
