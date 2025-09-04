package Facul;
import java.util.Scanner;

public class temF {
    public static void main(String[] args) {
    Scanner aa = new Scanner(System.in);
    System.out.println("A temperatura em celsius hoje é: ");
        double celsius = aa.nextInt();

        double Fahrenheit = (celsius * 1.8) + 32;
        System.out.print("Temperatura em Fahrenheit é: " + Fahrenheit);
        aa.close();
}
}
