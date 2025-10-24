package Facul;

import java.util.Scanner;

public class MediaFinal {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Notas da NP1
    System.out.print("Digite a nota das ATVs (NP1): ");
    double atvs1 = sc.nextDouble();

    System.out.print("Digite a nota do EAD (NP1): ");
    double ead1 = sc.nextDouble();

    System.out.print("Digite a nota da AV1: ");
    double av1 = sc.nextDouble();

    // Calculando NP1
    double np1 = (atvs1 * 0.20) + (ead1 * 0.20) + (av1 * 0.60);

    // Notas da NP2
    System.out.print("Digite a nota das ATVs (NP2): ");
    double atvs2 = sc.nextDouble();

    System.out.print("Digite a nota do EAD (NP2): ");
    double ead2 = sc.nextDouble();

    System.out.print("Digite a nota do PLURI: ");
    double pluri = sc.nextDouble();

    System.out.print("Digite a nota da AV2: ");
    double av2 = sc.nextDouble();

    // Calculando NP2
    double np2 = (atvs2 * 0.20) + (ead2 * 0.20) + (pluri * 0.20) + (av2 * 0.40);

    // Média final
    double mf = (np1 * 0.40) + (np2 * 0.60);

    // Saída
    System.out.printf("%nNP1 = %.2f%n", np1);
    System.out.printf("NP2 = %.2f%n", np2);
    System.out.printf("Média final = %.2f%n", mf);

    sc.close();
}
}
