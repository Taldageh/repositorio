package geral.Facul;
import java.util.Scanner;

public class profSalario {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
final double valorHora = 25.0;

    System.out.print("Digite a quantidade de aulas semanais do professor: ");
    int aulasSemanais = sc.nextInt();


    double salarioBase = aulasSemanais * valorHora * 4;

    double acrescimo = salarioBase * 0.10;
    double salarioBruto = salarioBase + acrescimo;

    double descontoIR = salarioBruto * 0.05;
    double descontoINSS = salarioBruto * 0.07;
    double totalDescontos = descontoIR + descontoINSS;

    double salarioLiquido = salarioBruto - totalDescontos;

    System.out.println("\\n=== INFORMAÇÕES SALARIAIS ===");
    System.out.printf("Salário base: R$ %.2f%n", salarioBase);
    System.out.printf("Acréscimos (10%%): R$ %.2f%n", acrescimo);
    System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
    System.out.printf("Desconto IR (5%%): R$ %.2f%n", descontoIR);
    System.out.printf("Desconto INSS (7%%): R$ %.2f%n", descontoINSS);
    System.out.printf("Total de descontos: R$ %.2f%n", totalDescontos);
    System.out.printf("Salário líquido: R$ %.2f%n", salarioLiquido);

    sc.close();
}
}

