package resumo; // Declara o pacote onde a classe está localizada

//    import java.util.Scanner; // Importa a classe Scanner para ler dados do usuário

// public class resumo {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in); // Cria o objeto Scanner ligado ao teclado (System.in)

//       System.out.print("Digite seu nome: "); // Mostra mensagem sem pular linha
//       String nome = scanner.nextLine(); // Lê uma linha completa (incluindo espaços)

//       System.out.print("Digite sua idade: ");
//        int idade = scanner.nextInt(); // Lê um número inteiro

//        System.out.println("Olá " + nome + ", você tem " + idade + " anos."); // Exibe o resultado

//        scanner.close(); // Fecha o Scanner (boa prática)
//    }
//}

//====================================================================

// import java.util.Random; // Importa a classe Random para gerar números aleatórios

// public class resumo {
//     public static void main(String[] args) {
//         Random random = new Random(); // Cria o objeto Random
// 
//         int numero = random.nextInt(10) + 1; // Gera número entre 1 e 10 (nextInt(10) gera de 0 a 9)
//         System.out.println("Número aleatório: " + numero); // Exibe o número
//     }
// }

//====================================================================


// import java.util.ArrayList; // Importa a classe ArrayList para criar listas dinâmicas
// 
// public class resumo {
//     public static void main(String[] args) {
//         ArrayList<String> nomes = new ArrayList<>(); // Cria uma lista de Strings
// 
//         nomes.add("Ana");    // Adiciona "Ana" à lista
//         nomes.add("Carlos"); // Adiciona "Carlos"
//         nomes.add("Maria");  // Adiciona "Maria"
// 
//         System.out.println("Nomes cadastrados:");
// 
//         for (String nome : nomes) { // Laço for-each para percorrer a lista
//             System.out.println(nome); // Exibe cada nome
//         }
//     }
// }

//====================================================================

// import java.util.ArrayList;     // Para criar a lista
// import java.util.Collections;  // Para ordenar ou manipular a lista
// 
// public class resumo {
//     public static void main(String[] args) {
//         ArrayList<Integer> numeros = new ArrayList<>(); // Lista de inteiros
// 
//         numeros.add(5);
//         numeros.add(2);
//         numeros.add(8);
// 
//         System.out.println("Original: " + numeros); // Mostra lista como foi inserida
// 
//         Collections.sort(numeros); // Ordena a lista em ordem crescente
//         System.out.println("Ordenado: " + numeros);
// 
//         Collections.reverse(numeros); // Inverte a lista
//         System.out.println("Invertido: " + numeros);
//     }
// }

//====================================================================

// import java.text.DecimalFormat; // Importa classe para formatar números decimais
// 
// public class resumo {
//     public static void main(String[] args) {
//         double valor = 3.14159; // Número com várias casas decimais
// 
//         DecimalFormat df = new DecimalFormat("#.00"); // Formata para 2 casas decimais
//         System.out.println("Valor formatado: " + df.format(valor)); // Saída: 3.14
//     }
// }

//====================================================================

// import java.time.LocalDate; // Importa a classe que representa uma data (sem hora)
// 
// public class resumo {
//     public static void main(String[] args) {
//         LocalDate hoje = LocalDate.now(); // Pega a data de hoje (data do sistema)
//         System.out.println("Data de hoje: " + hoje); // Exibe no formato padrão (YYYY-MM-DD)
//     }
// }

//====================================================================

//  import java.util.*; // Importa Scanner, Random, ArrayList, Collections, etc.
//  
//  public class resumo {
//      public static void main(String[] args) {
//          Scanner scanner = new Scanner(System.in); // Leitor de entrada
//          Random random = new Random(); // Gera aleatórios
//          ArrayList<Integer> numeros = new ArrayList<>(); // Lista de inteiros
//  
//          // Adiciona 5 números aleatórios entre 1 e 100
//          for (int i = 0; i < 5; i++) {
//              numeros.add(random.nextInt(100) + 1);
//          }
//  
//          System.out.println("Números aleatórios: " + numeros);
//  
//          Collections.sort(numeros); // Ordena os números
//          System.out.println("Ordenados: " + numeros);
//  
//          scanner.close();
//      }
//  }


