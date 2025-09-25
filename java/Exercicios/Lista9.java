// Lista de comandos de repetição 3 - ListaExercicios09_Repeticao

// import java.util.Scanner;
// 
// public class ImprimirNomes {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// int repetir;
// 
// ```
//     do {
//         System.out.print("Digite o nome: ");
//         String nome = sc.next();
//         System.out.print("Digite o número de repetições: ");
//         int n = sc.nextInt();
// 
//         for (int i = 1; i <= n; i++) {
//             System.out.println(i + " - " + nome);
//         }
// 
//         System.out.print("Deseja repetir o processamento? (0 = Não; 1 = Sim): ");
//         repetir = sc.nextInt();
// 
//     } while (repetir == 1);
// 
//     sc.close();
// }
// 
// ```
// 
// }
// 
// .
// 
// .
// 
// .
// 
// .
// 
// .
// 
// import java.util.Scanner;
// 
// public class ImprimirMultiplos {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// 
// ```
//     System.out.print("Digite o valor n: ");
//     int n = sc.nextInt();
//     System.out.print("Digite o passo p (pressione 0 para usar p = 1): ");
//     int p = sc.nextInt();
//     if (p == 0) p = 1; // passo padrão
// 
//     System.out.println("Contagem de 0 até " + n + " de " + p + " em " + p + ":");
//     for (int i = 0; i <= n; i += p) {
//         System.out.print(i + " ");
//     }
// 
//     sc.close();
// }
// 
// ```
// 
// }
// 
// .
// 
// .
// 
// .
// 
// .
// 
// .
// 
// import java.util.Scanner;
// 
// public class TresContagens {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// int[] valores = new int[3];
// 
// ```
//     for (int i = 0; i < 3; i++) {
//         System.out.print("Digite o valor " + (i+1) + ": ");
//         valores[i] = sc.nextInt();
//     }
// 
//     for (int i = 0; i < 3; i++) {
//         System.out.println("Impressão contagem do valor " + valores[i] + ":");
//         for (int j = 1; j <= valores[i]; j++) {
//             System.out.println(j);
//         }
//     }
// 
//     sc.close();
// }
// 
// ```
// 
// }
// 
// .
// 
// .
// 
// .
// 
// .
// 
// .
// 
// import java.util.Scanner;
// 
// public class TresContagensDecrescente {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// int[] valores = new int[3];
// 
// ```
//     for (int i = 0; i < 3; i++) {
//         System.out.print("Digite o valor " + (i+1) + ": ");
//         valores[i] = sc.nextInt();
//     }
// 
//     for (int i = 0; i < 3; i++) {
//         System.out.println("Impressão contagem decrescente do valor " + valores[i] + ":");
//         for (int j = valores[i]; j >= 1; j--) {
//             System.out.println(j);
//         }
//     }
// 
//     sc.close();
// }
// 
// ```
// 
// }
// 
// .
// 
// .
// 
// .
// 
// .
// 
// .
// 
// import java.util.Scanner;
// import java.util.Arrays;
// 
// public class SomarIntervalos {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// int[] valores = new int[3];
// int[] somas = new int[3];
// 
// ```
//     for (int i = 0; i < 3; i++) {
//         System.out.print("Digite o valor " + (i+1) + ": ");
//         valores[i] = sc.nextInt();
//         int soma = 0;
//         for (int j = 1; j <= valores[i]; j++) {
//             soma += j;
//         }
//         somas[i] = soma;
//         System.out.println("Soma do valor " + valores[i] + " = " + soma);
//     }
// 
//     int menor = Arrays.stream(somas).min().getAsInt();
//     int maior = Arrays.stream(somas).max().getAsInt();
//     Arrays.sort(somas);
// 
//     System.out.println("Menor soma: " + menor);
//     System.out.println("Maior soma: " + maior);
//     System.out.println("Somas em ordem crescente: " + Arrays.toString(somas));
// 
//     sc.close();
// }
// 
// ```
// 
// }
// 
// .
// 
// .
// 
// .
// 
// .
// 
// .
// 
// import java.util.Scanner;
// import java.util.Arrays;
// 
// public class ProdutoIntervalos {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// int[] valores = new int[3];
// long[] produtos = new long[3];
// 
// ```
//     for (int i = 0; i < 3; i++) {
//         System.out.print("Digite o valor " + (i+1) + ": ");
//         valores[i] = sc.nextInt();
//         long produto = 1;
//         for (int j = 1; j <= valores[i]; j++) {
//             produto *= j;
//         }
//         produtos[i] = produto;
//         System.out.println("Produto do valor " + valores[i] + " = " + produto);
//     }
// 
//     long menor = Arrays.stream(produtos).min().getAsLong();
//     long maior = Arrays.stream(produtos).max().getAsLong();
//     Arrays.sort(produtos);
// 
//     System.out.println("Menor produto: " + menor);
//     System.out.println("Maior produto: " + maior);
//     System.out.print("Produtos em ordem crescente: ");
//     for (long p : produtos) System.out.print(p + " ");
// }
// 
// ```
// 
// }
// 
// .
// 
// .
// 
// .
// 
// .
// 
// .
// 
// import java.util.Scanner;
// 
// public class SomarSalarios {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// int count = 0;
// double soma = 0;
// int continuar;
// 
// ```
//     do {
//         System.out.print("Digite o salário: ");
//         double salario = sc.nextDouble();
//         soma += salario;
//         count++;
// 
//         if (count >= 5) {
//             System.out.println("Número máximo de salários atingido.");
//             break;
//         }
// 
//         System.out.print("Deseja informar outro salário? (0 = Não, 1 = Sim): ");
//         continuar = sc.nextInt();
//     } while (continuar == 1);
// 
//     System.out.println("A soma dos salários informados é: " + soma);
//     sc.close();
// }
// 
// ```
// 
// }
// 
// .
// 
// .
// 
// .
// 
// .
// 
// .
// 
// import java.util.Scanner;
// 
// public class MenuOperacoes {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// int opcao;
// 
// ```
//     do {
//         System.out.println("\\nMenu:");
//         System.out.println("1. Contar pares");
//         System.out.println("2. Contar ímpares");
//         System.out.println("3. Produto pares");
//         System.out.println("4. Produto ímpares");
//         System.out.println("9. Sair");
//         System.out.print("Escolha uma opção: ");
//         opcao = sc.nextInt();
// 
//         if (opcao == 9) break;
// 
//         System.out.print("Digite um número inteiro: ");
//         int n = sc.nextInt();
// 
//         switch (opcao) {
//             case 1:
//                 int somaPares = 0;
//                 for (int i = 1; i <= n; i++) if (i % 2 == 0) somaPares++;
//                 System.out.println("Quantidade de pares: " + somaPares);
//                 break;
//             case 2:
//                 int somaImpares = 0;
//                 for (int i = 1; i <= n; i++) if (i % 2 != 0) somaImpares++;
//                 System.out.println("Quantidade de ímpares: " + somaImpares);
//                 break;
//             case 3:
//                 long produtoPares = 1;
//                 for (int i = 1; i <= n; i++) if (i % 2 == 0) produtoPares *= i;
//                 System.out.println("Produto dos pares: " + produtoPares);
//                 break;
//             case 4:
//                 long produtoImpares = 1;
//                 for (int i = 1; i <= n; i++) if (i % 2 != 0) produtoImpares *= i;
//                 System.out.println("Produto dos ímpares: " + produtoImpares);
//                 break;
//             default:
//                 System.out.println("Opção inválida!");
//         }
//     } while (opcao != 9);
// 
//     sc.close();
//     System.out.println("Programa encerrado.");
// }
// 
// ```
// 
// }