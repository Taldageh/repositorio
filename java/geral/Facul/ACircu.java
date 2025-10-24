package geral.Facul;
import java.util.Scanner;

public class ACircu {
    public static void main(String args[]) {
Scanner aa = new Scanner(System.in);

System.out.println("Digite o raio da circunferência: ");
int raio = aa.nextInt();
if (raio <= 0) {
    System.out.println("Raio inválido. Por favor, insira um valor positivo.");
    aa.close();
    return;
} else if (raio > 100) {
    System.out.println("Raio muito grande. Por favor, insira um valor menor ou igual a 100.");
    aa.close();
    return;
} 
double area = 3.14159 * (raio * raio);

System.out.printf("A área da circunferência è: %.2f.", area);

aa.close();
}
}
    

