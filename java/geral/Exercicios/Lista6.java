// Lista de comando de repetição - ListaExercicios06_Repeticao

// public class QuadradoNumeros {
// public static void main(String[] args) {
// // Percorre de 15 até 50
// for (int i = 15; i <= 50; i++) {
// int quadrado = i * i;
// System.out.println(i + "² = " + quadrado);
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
// import java.util.Scanner;
// 
// public class Tabuada {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// 
// ```
//     // Usuário informa um número
//     System.out.print("Digite um número para ver sua tabuada: ");
//     int numero = sc.nextInt();
// 
//     // Exibe tabuada de 1 até 10
//     for (int i = 1; i <= 10; i++) {
//         System.out.println(numero + " x " + i + " = " + (numero * i));
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
// public class Soma100 {
// public static void main(String[] args) {
// int soma = 0;
// 
// ```
//     // Soma de 1 até 100
//     for (int i = 1; i <= 100; i++) {
//         soma += i;
//     }
// 
//     System.out.println("A soma de 1 até 100 é: " + soma);
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
// public class SomaPares {
// public static void main(String[] args) {
// int soma = 0;
// 
// ```
//     // Percorre e soma apenas os pares
//     for (int i = 1; i <= 500; i++) {
//         if (i % 2 == 0) {
//             soma += i;
//         }
//     }
// 
//     System.out.println("A soma dos pares de 1 a 500 é: " + soma);
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
// public class Impares {
// public static void main(String[] args) {
// System.out.println("Números ímpares de 1 a 20:");
// 
// ```
//     for (int i = 1; i <= 20; i++) {
//         if (i % 2 != 0) {
//             System.out.println(i);
//         }
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
// public class DivisiveisPor4 {
// public static void main(String[] args) {
// System.out.println("Números divisíveis por 4 de 1 a 200:");
// 
// ```
//     for (int i = 1; i <= 200; i++) {
//         if (i % 4 == 0) {
//             System.out.println(i);
//         }
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
// public class Potencia3 {
// public static void main(String[] args) {
// // Calcula 3^0 até 3^15
// for (int i = 0; i <= 15; i++) {
// long resultado = (long) Math.pow(3, i);
// System.out.println("3^" + i + " = " + resultado);
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
// import java.util.Scanner;
// 
// public class PotenciaBaseExpoente {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// 
// ```
//     // Usuário informa base e expoente
//     System.out.print("Digite a base: ");
//     int base = sc.nextInt();
//     System.out.print("Digite o expoente: ");
//     int expoente = sc.nextInt();
// 
//     // Calcula potência
//     long resultado = (long) Math.pow(base, expoente);
//     System.out.println(base + "^" + expoente + " = " + resultado);
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
// public class Fatorial {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// 
// ```
//     // Usuário informa um número
//     System.out.print("Digite um número para calcular o fatorial: ");
//     int n = sc.nextInt();
// 
//     long fatorial = 1;
//     for (int i = 1; i <= n; i++) {
//         fatorial *= i;
//     }
// 
//     System.out.println(n + "! = " + fatorial);
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
// public class SomatorioFatoriais {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// 
// ```
//     long soma = 0;
// 
//     // Lê 5 valores do usuário
//     for (int j = 1; j <= 5; j++) {
//         System.out.print("Digite o " + j + "º valor: ");
//         int n = sc.nextInt();
// 
//         long fatorial = 1;
//         for (int i = 1; i <= n; i++) {
//             fatorial *= i;
//         }
// 
//         soma += fatorial;
//     }
// 
//     System.out.println("O somatório dos fatoriais é: " + soma);
// 
//     sc.close();
// }
// 
// ```
// 
// }