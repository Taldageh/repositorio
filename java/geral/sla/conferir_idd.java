import java.util.Scanner;

public class conferir_idd {
    public static void main(String[] args)
 {
        Scanner entrando =new Scanner (System.in);
        System.out.print("Digite sua idade: ");
        int age = entrando.nextInt(); 
        if (age < 18) {
             System.out.print("Você é menor de idade: ");
             System.out.print("Barrado");
        } else {
             System.out.print("Você é maior de idade: ");
             System.out.print("Liberado");
        }
            // Fechando o objeto
    entrando.close();
    }
}
    
// Fim do código
