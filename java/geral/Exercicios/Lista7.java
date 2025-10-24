// Lista de comandos de repetição 2- ListaExercicios07_Repeticao
// 
// .
// 
// .
// 
// public class Fibonacci15 {
// public static void main(String[] args) {
// int n1 = 1, n2 = 1;
// System.out.println("Série Fibonacci (15 termos):");
// System.out.print(n1 + " " + n2 + " ");
// 
// ```
//     for (int i = 3; i <= 15; i++) {
//         int proximo = n1 + n2;
//         System.out.print(proximo + " ");
//         n1 = n2;
//         n2 = proximo;
//     }
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
// public class ConversaoGraus {
// public static void main(String[] args) {
// System.out.println("Celsius -> Fahrenheit");
// for (int c = 10; c <= 100; c += 10) {
// double f = (c * 9.0/5.0) + 32;
// System.out.println(c + "°C -> " + f + "°F");
// }
// }
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
// public class GraosTabuleiro {
// public static void main(String[] args) {
// long grao = 1;
// long total = 0;
// System.out.println("Grãos por quadrado:");
// 
// ```
//     for (int i = 1; i <= 64; i++) {
//         System.out.println("Quadrado " + i + ": " + grao);
//         total += grao;
//         grao *= 2; // dobra a cada quadrado
//     }
// 
//     System.out.println("Total de grãos no tabuleiro: " + total);
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
// public class Soma5Fatoriais {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// long soma = 0;
// 
// ```
//     for (int j = 1; j <= 5; j++) {
//         System.out.print("Digite o " + j + "º valor: ");
//         int n = sc.nextInt();
//         long fatorial = 1;
//         for (int i = 1; i <= n; i++) {
//             fatorial *= i;
//         }
//         soma += fatorial;
//     }
// 
//     System.out.println("Soma dos 5 fatoriais: " + soma);
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
// public class Soma6Media {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// double soma = 0;
// 
// ```
//     for (int i = 1; i <= 6; i++) {
//         System.out.print("Digite o " + i + "º valor: ");
//         double valor = sc.nextDouble();
//         soma += valor;
//     }
// 
//     double media = soma / 6;
//     System.out.println("Soma dos valores: " + soma);
//     System.out.println("Média: " + media);
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
// public class SomaPositivos {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// double soma = 0;
// int count = 0;
// 
// ```
//     while (true) {
//         System.out.print("Digite um valor (negativo para parar): ");
//         double valor = sc.nextDouble();
//         if (valor < 0) break;
// 
//         soma += valor;
//         count++;
//     }
// 
//     if (count > 0) {
//         double media = soma / count;
//         System.out.println("Soma dos valores: " + soma);
//         System.out.println("Número de valores somados: " + count);
//         System.out.println("Média: " + media);
//     } else {
//         System.out.println("Nenhum valor positivo foi fornecido.");
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
// public class SomaFatoriaisImpares {
// public static void main(String[] args) {
// long soma = 0;
// int count = 0;
// 
// ```
//     for (int i = 1; i <= 20; i += 2) { // percorre apenas ímpares
//         long fatorial = 1;
//         for (int j = 1; j <= i; j++) {
//             fatorial *= j;
//         }
//         soma += fatorial;
//         count++;
//     }
// 
//     System.out.println("Número de valores ímpares somados: " + count);
//     System.out.println("Soma dos fatoriais ímpares de 1 a 20: " + soma);
// }
// 
// ```
// 
// }