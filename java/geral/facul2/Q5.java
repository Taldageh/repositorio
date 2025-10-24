import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Não é uma equação completa de segundo grau.");
        } else {
            double delta = b*b - 4*a*c;
            System.out.println("Delta = " + delta);

            if (delta < 0) {
                System.out.println("Não existem raízes reais.");
            } else if (delta == 0) {
                double x = -b / (2*a);
                System.out.println("Raiz única: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("Duas raízes: x1 = " + x1 + ", x2 = " + x2);
            }
        }

        sc.close();
    }
}
