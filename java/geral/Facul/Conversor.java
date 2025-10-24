package geral.Facul;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    System.out.print("Digite o valor em reais: R$ ");
    double reais = sc.nextDouble();

    System.out.print("Digite a cotação do dólar: ");
    double cotacaoDolar = sc.nextDouble();

    System.out.print("Digite a cotação do euro: ");
    double cotacaoEuro = sc.nextDouble();

    double emDolares = reais / cotacaoDolar;
    double emEuros = reais / cotacaoEuro;

    System.out.printf("Valor em dólares: US$ %.2f%n", emDolares);
    System.out.printf("Valor em euros: € %.2f%n", emEuros);

    sc.close();
}
}
