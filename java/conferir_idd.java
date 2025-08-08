import java.util.Scanner;

public class conferir_idd {
    public static void main(int args[]) {
        Scanner entrada =new Scanner (System.in);
        System.out.print("Digite sua idade: ");
        int age = entrada.nextInt(); 
        if (age <= 18) {
             System.out.print("Você é menor de idade");
        } else {
             System.out.print("Você é maior de idade");
        }
            // Fechando o objeto
    entrada.close();
    }
}
    
// Fim do código
