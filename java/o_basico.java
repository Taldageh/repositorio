import java.util.Scanner; //importando a classe(Blibioteca) Scanner


public /*aberto para todos*/ class MyClass {
  public static /*para não criar um objeto*/ void /*só executa o que tem dentro*/ main(String args[])/*forma de receber informações*/ {
    Scanner entrada = new Scanner(System.in); //criando um objeto chamado entrada da classe Scanner
    //System.in = entrada de dados do sistema (teclado)
    System.out.print("Digite a primeira nota: ");
    int nota1= entrada.nextInt();
    
    System.out.print("Digite a segunda nota: ");
    int nota2= entrada.nextInt();
    
    System.out.print("Digite a terceira nota: ");
    int nota3= entrada.nextInt();
    
    //calculo da media
    int media = (nota1 + nota2 + nota3) / 3;
    
    //mostrando a media
    System.out.println("A sua media foi " + media);
    
    //fechando o objeto
    entrada.close();
    

    //condição
    if (media <= 5) { 
        System.out.print("Você está reprovado!");
        } else {
        System.out.print("Você está aprovado!");
    }
  }
}