package geral.Facul;
import java.util.Scanner;

public class Media {
    public static void main(String[] args){
Scanner aa = new Scanner(System.in);
double nota1, nota2, media;
System.out.println("Sua primeira nota foi: " );
nota1 = aa.nextInt();
System.out.println("Sua segunda nota foi: " );
nota2 = aa.nextInt();
media = (nota1 + nota2) / 2;


    System.out.println("Sua media é: " + media);

    System.out.println("Sua situação é: ");

    if(media >= 6.0) {
        System.out.println("Aprovado");
    } else {
        System.out.println("Reprovado"); {
        }

    }

    aa.close();

}
}
