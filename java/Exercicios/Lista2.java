// Lista de exercicios - ListaExercicios02_Condicionais

// / ===================== Q1 =====================
// // Maior e Menor sem Vetor
// import java.util.Scanner;
// 
// 
// public class Q1_MaiorMenorSemVetor {
// public static void main(String[] args) {
// // Criar Scanner para ler do teclado
// Scanner sc = new Scanner(System.in);
// 
// 
// // Ler cinco valores inteiros sem usar vetores ou laços
// System.out.println("Q1 - Informe 5 valores inteiros:");
// System.out.print("Valor 1: "); int a = sc.nextInt();
// System.out.print("Valor 2: "); int b = sc.nextInt();
// System.out.print("Valor 3: "); int c = sc.nextInt();
// System.out.print("Valor 4: "); int d = sc.nextInt();
// System.out.print("Valor 5: "); int e = sc.nextInt();
// 
// 
// // Calcular maior valor
// int maior = Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
// 
// 
// // Calcular menor valor
// int menor = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
// 
// 
// // Exibir resultados
// System.out.println("Maior valor informado: " + maior);
// System.out.println("Menor valor informado: " + menor);
// 
// 
// sc.close();
// }
// }
// / ===================== Q2 =====================
// // Par ou Ímpar
// import java.util.Scanner;
// 
// 
// public class Q2_ParOuImpar {
// public static void main(String[] args) {
// // Criar Scanner para entrada
// Scanner sc = new Scanner(System.in);
// 
// 
// // Ler valor inteiro
// System.out.print("Q2 - Digite um valor inteiro: ");
// int valor = sc.nextInt();
// 
// 
// // Verificar se é par ou ímpar
// if (valor % 2 == 0) {
// System.out.println("O valor " + valor + " é PAR.");
// } else {
// System.out.println("O valor " + valor + " é ÍMPAR.");
// }
// 
// 
// sc.close();
// }
// }
// ===================== Q3 =====================
// // Verificação Faixa 1 a 9
// import java.util.Scanner;
// 
// 
// public class Q3_Faixa1a9 {
// public static void main(String[] args) {
// // Criar Scanner
// Scanner sc = new Scanner(System.in);
// 
// 
// // Ler valor inteiro
// System.out.print("Q3 - Digite um valor inteiro (de 1 a 9): ");
// int valor = sc.nextInt();
// 
// 
// // Verificar se está na faixa permitida
// if (valor >= 1 && valor <= 9) {
// System.out.println("O valor está na faixa permitida!");
// } else {
// System.out.println("O valor informado não é permitido pois não está na faixa de 1 a 9");
// }
// 
// 
// sc.close();
// }
// // ===================== Q4 =====================
// // Não Maior que 3 (usando !)
// import java.util.Scanner;
// 
// 
// public class Q4_NaoMaiorQueTres {
// public static void main(String[] args) {
// // Criar Scanner
// Scanner sc = new Scanner(System.in);
// 
// 
// // Ler valor inteiro qualquer
// System.out.print("Q4 - Digite um valor inteiro qualquer: ");
// int valor = sc.nextInt();
// 
// 
// /*
// Apresentar o valor caso ele NÃO seja maior que 3.
// Usamos apenas o operador lógico '!' para inverter a condição.
// */
// if (!(valor > 3)) {
// System.out.println("O valor NÃO é maior que 3. Valor: " + valor);
// } else {
// System.out.println("O valor é maior que 3, logo não será exibido.");
// }
// 
// 
// sc.close();
// } 
// }