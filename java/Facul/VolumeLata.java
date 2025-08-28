package Facul;
import java.util.Scanner;

public class VolumeLata {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Digite o raio da lata (cm): ");
    double raio = sc.nextDouble();

    System.out.print("Digite a altura da lata (cm): ");
    double altura = sc.nextDouble();

    double volume = 3.14149 * Math.pow(raio, 2) * altura;

    System.out.printf("O volume da lata é: %.2f cm³%n", volume);

    sc.close();
}

sun.security.timestamp
}
