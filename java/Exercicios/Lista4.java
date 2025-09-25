// Lista de exercicios 4 - ListaExercicios04_Condicionais
//
//// ===================== Q1 =====================
//// Diferença entre dois valores inteiros (maior - menor)
//import java.util.Scanner;
//
//public class Q1_DiferencaMaiorMenor {
//public static void main(String[] args) {
//Scanner sc = new Scanner([System.in](http://system.in/));
//
//```
//    System.out.print("Digite o primeiro valor inteiro: ");
//    int a = sc.nextInt();
//    System.out.print("Digite o segundo valor inteiro: ");
//    int b = sc.nextInt();
//
//    int maior = Math.max(a, b);
//    int menor = Math.min(a, b);
//    int diferenca = maior - menor;
//
//    System.out.println("Diferença do maior pelo menor: " + diferenca);
//
//    sc.close();
//}
//
//```
//
//}
//
//// ===================== Q2 =====================
//// Converter valor para positivo
//import java.util.Scanner;
//
//public class Q2_ValorPositivo {
//public static void main(String[] args) {
//Scanner sc = new Scanner([System.in](http://system.in/));
//
//```
//    System.out.print("Digite um valor inteiro positivo ou negativo: ");
//    int valor = sc.nextInt();
//
//    if (valor <= 0) {
//        valor = valor * -1;
//    }
//
//    System.out.println("Valor positivo: " + valor);
//
//    sc.close();
//}
//
//```
//
//}
//
//// ===================== Q3 =====================
//// Média de 4 notas e aprovação >= 5
//import java.util.Scanner;
//
//public class Q3_MediaAprovacao5 {
//public static void main(String[] args) {
//Scanner sc = new Scanner([System.in](http://system.in/));
//
//```
//    System.out.println("Digite as quatro notas do aluno:");
//    double n1 = sc.nextDouble();
//    double n2 = sc.nextDouble();
//    double n3 = sc.nextDouble();
//    double n4 = sc.nextDouble();
//
//    double media = (n1 + n2 + n3 + n4) / 4;
//
//    if (media >= 5) {
//        System.out.println("Aprovado com média: " + media);
//    } else {
//        System.out.println("Reprovado com média: " + media);
//    }
//
//    sc.close();
//}
//
//```
//
//}
//
//// ===================== Q4 =====================
//// Média de 4 notas, exame se média < 7
//import java.util.Scanner;
//
//public class Q4_MediaComExame {
//public static void main(String[] args) {
//Scanner sc = new Scanner([System.in](http://system.in/));
//
//```
//    System.out.println("Digite as quatro notas do aluno:");
//    double n1 = sc.nextDouble();
//    double n2 = sc.nextDouble();
//    double n3 = sc.nextDouble();
//    double n4 = sc.nextDouble();
//
//    double media = (n1 + n2 + n3 + n4) / 4;
//
//    if (media >= 7) {
//        System.out.println("Aprovado com média: " + media);
//    } else {
//        System.out.print("Digite a nota do exame: ");
//        double exame = sc.nextDouble();
//        double novaMedia = (media + exame) / 2;
//
//        if (novaMedia >= 5) {
//            System.out.println("Aprovado em exame com média: " + novaMedia);
//        } else {
//            System.out.println("Reprovado com média: " + novaMedia);
//        }
//    }
//
//    sc.close();
//}
//
//```
//
//}
//
//// ===================== Q5 =====================
//// Equação do 2º grau - Fórmula de Bhaskara
//import java.util.Scanner;
//
//public class Q5_Bhaskara {
//public static void main(String[] args) {
//Scanner sc = new Scanner([System.in](http://system.in/));
//
//```
//    System.out.println("Digite os coeficientes a, b, c:");
//    double a = sc.nextDouble();
//    double b = sc.nextDouble();
//    double c = sc.nextDouble();
//
//    if (a == 0 || b == 0 || c == 0) {
//        System.out.println("Não é uma equação completa do 2º grau.");
//    } else {
//        double delta = (b * b) - (4 * a * c);
//        if (delta < 0) {
//            System.out.println("Delta = " + delta + ". Não existem raízes reais.");
//        } else if (delta == 0) {
//            double raiz = -b / (2 * a);
//            System.out.println("Delta = 0. Raiz única: " + raiz);
//        } else {
//            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
//            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
//            System.out.println("Delta = " + delta + ". Raízes: " + raiz1 + " e " + raiz2);
//        }
//    }
//
//    sc.close();
//}
//
//```
//
//}
//
//// ===================== Q6 =====================
//// Divisíveis por 2 e 3
//import java.util.Scanner;
//
//public class Q6_Divisiveis2e3 {
//public static void main(String[] args) {
//Scanner sc = new Scanner([System.in](http://system.in/));
//
//```
//    System.out.println("Digite 4 valores inteiros:");
//    int v1 = sc.nextInt();
//    int v2 = sc.nextInt();
//    int v3 = sc.nextInt();
//    int v4 = sc.nextInt();
//
//    System.out.println("Valores divisíveis por 2 e 3:");
//    if (v1 % 2 == 0 && v1 % 3 == 0) System.out.println(v1);
//    if (v2 % 2 == 0 && v2 % 3 == 0) System.out.println(v2);
//    if (v3 % 2 == 0 && v3 % 3 == 0) System.out.println(v3);
//    if (v4 % 2 == 0 && v4 % 3 == 0) System.out.println(v4);
//
//    sc.close();
//}
//
//```
//
//}
//
//// ===================== Q7 =====================
//// Divisíveis por 2 ou 3
//import java.util.Scanner;
//
//public class Q7_Divisiveis2ou3 {
//public static void main(String[] args) {
//Scanner sc = new Scanner([System.in](http://system.in/));
//
//```
//    System.out.println("Digite 4 valores inteiros:");
//    int v1 = sc.nextInt();
//    int v2 = sc.nextInt();
//    int v3 = sc.nextInt();
//    int v4 = sc.nextInt();
//
//    System.out.println("Valores divisíveis por 2 ou 3:");
//    if (v1 % 2 == 0 || v1 % 3 == 0) System.out.println(v1);
//    if (v2 % 2 == 0 || v2 % 3 == 0) System.out.println(v2);
//    if (v3 % 2 == 0 || v3 % 3 == 0) System.out.println(v3);
//    if (v4 % 2 == 0 || v4 % 3 == 0) System.out.println(v4);
//
//    sc.close();
//}
//
//```
//
//}
//
//// ===================== Q8 =====================
//// Maior e menor entre 5 valores
//import java.util.Scanner;
//
//public class Q8_MaiorMenor5Valores {
//public static void main(String[] args) {
//Scanner sc = new Scanner([System.in](http://system.in/));
//
//```
//    System.out.println("Digite 5 valores inteiros:");
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int c = sc.nextInt();
//    int d = sc.nextInt();
//    int e = sc.nextInt();
//
//    int maior = Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);
//    int menor = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
//
//    System.out.println("Maior valor: " + maior);
//    System.out.println("Menor valor: " + menor);
//
//    sc.close();
//}
//
//```
//
//}
//
//// ===================== Q9 =====================
//// Par ou Ímpar
//import java.util.Scanner;
//
//public class Q9_ParOuImpar {
//public static void main(String[] args) {
//Scanner sc = new Scanner([System.in](http://system.in/));
//
//```
//    System.out.print("Digite um valor inteiro: ");
//    int valor = sc.nextInt();
//
//    if (valor % 2 == 0) {
//        System.out.println("O valor " + valor + " é PAR.");
//    } else {
//        System.out.println("O valor " + valor + " é ÍMPAR.");
//    }
//
//    sc.close();
//}
//
//```
//
//}
//
//// ===================== Q10 =====================
//// Verificação faixa 1 a 9
//import java.util.Scanner;
//
//public class Q10_Faixa1a9 {
//public static void main(String[] args) {
//Scanner sc = new Scanner([System.in](http://system.in/));
//
//```
//    System.out.print("Digite um valor inteiro (1 a 9): ");
//    int valor = sc.nextInt();
//
//    if (valor >= 1 && valor <= 9) {
//        System.out.println("O valor está na faixa permitida");
//    } else {
//        System.out.println("O valor está fora da faixa permitida");
//    }
//
//    sc.close();
//}
//
//```
//
//}
//
//.
//
//.
//
//.
//
//.
//
//.
//
//import java.util.Scanner;
//import java.util.Arrays;
//
//public class FigurasGeometricas {
//public static void main(String[] args) {
//Scanner sc = new Scanner([System.in](http://system.in/));
//
//```
//    // Entrada de dados
//    System.out.print("Digite a base do retângulo: ");
//    double baseRet = sc.nextDouble();
//    System.out.print("Digite a altura do retângulo: ");
//    double altRet = sc.nextDouble();
//    double areaRet = baseRet * altRet;
//
//    System.out.print("Digite a base do triângulo: ");
//    double baseTri = sc.nextDouble();
//    System.out.print("Digite a altura do triângulo: ");
//    double altTri = sc.nextDouble();
//    double areaTri = (baseTri * altTri) / 2;
//
//    System.out.print("Digite o lado do quadrado: ");
//    double ladoQuad = sc.nextDouble();
//    double areaQuad = ladoQuad * ladoQuad;
//
//    System.out.print("Digite o raio do círculo: ");
//    double raio = sc.nextDouble();
//    double areaCirc = Math.PI * Math.pow(raio, 2);
//
//    // Exibe as áreas
//    System.out.println("\\nÁreas calculadas:");
//    System.out.println("Retângulo: " + areaRet);
//    System.out.println("Triângulo: " + areaTri);
//    System.out.println("Quadrado: " + areaQuad);
//    System.out.println("Círculo: " + areaCirc);
//
//    // Determina menor e maior área
//    double[] areas = {areaRet, areaTri, areaQuad, areaCirc};
//    String[] nomes = {"Retângulo", "Triângulo", "Quadrado", "Círculo"};
//
//    double menor = areas[0];
//    double maior = areas[0];
//    String figMenor = nomes[0];
//    String figMaior = nomes[0];
//
//    for (int i = 1; i < areas.length; i++) {
//        if (areas[i] < menor) {
//            menor = areas[i];
//            figMenor = nomes[i];
//        }
//        if (areas[i] > maior) {
//            maior = areas[i];
//            figMaior = nomes[i];
//        }
//    }
//
//    System.out.println("\\nFigura com menor área: " + figMenor + " (" + menor + ")");
//    System.out.println("Figura com maior área: " + figMaior + " (" + maior + ")");
//
//    // Ordena áreas em ordem crescente
//    double[] areasOrdenadas = areas.clone();
//    Arrays.sort(areasOrdenadas);
//    System.out.println("\\nÁreas em ordem crescente:");
//    for (double a : areasOrdenadas) {
//        System.out.println(a);
//    }
//
//    sc.close();
//}
//
//
//
//}

