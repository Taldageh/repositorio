package Facul;

import java.util.Scanner;

public class diasVividos {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Digite seu ano de nascimento: ");
    int anoNasci = sc.nextInt();

    System.out.println("Digite o ano_atual: ");
    int anoAtual = sc.nextInt();

    int anosVividos = anoAtual - anoNasci;
    int DiasVividos = anosVividos * 365;

    System.out.println("Seus dias vividos foram: " + DiasVividos);

    sc.close();
}
}
