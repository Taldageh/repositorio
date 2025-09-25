// Lista de exercicios 5 - FigurasGeometricas

// import java.util.Scanner;
// import java.util.Arrays;
// 
// public class FigurasGeometricas {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// 
// ```
//     // Entrada de dados
//     System.out.print("Digite a base do retângulo: ");
//     double baseRet = sc.nextDouble();
//     System.out.print("Digite a altura do retângulo: ");
//     double altRet = sc.nextDouble();
//     double areaRet = baseRet * altRet;
// 
//     System.out.print("Digite a base do triângulo: ");
//     double baseTri = sc.nextDouble();
//     System.out.print("Digite a altura do triângulo: ");
//     double altTri = sc.nextDouble();
//     double areaTri = (baseTri * altTri) / 2;
// 
//     System.out.print("Digite o lado do quadrado: ");
//     double ladoQuad = sc.nextDouble();
//     double areaQuad = ladoQuad * ladoQuad;
// 
//     System.out.print("Digite o raio do círculo: ");
//     double raio = sc.nextDouble();
//     double areaCirc = Math.PI * Math.pow(raio, 2);
// 
//     // Exibe as áreas
//     System.out.println("\\nÁreas calculadas:");
//     System.out.println("Retângulo: " + areaRet);
//     System.out.println("Triângulo: " + areaTri);
//     System.out.println("Quadrado: " + areaQuad);
//     System.out.println("Círculo: " + areaCirc);
// 
//     // Determina menor e maior área
//     double[] areas = {areaRet, areaTri, areaQuad, areaCirc};
//     String[] nomes = {"Retângulo", "Triângulo", "Quadrado", "Círculo"};
// 
//     double menor = areas[0];
//     double maior = areas[0];
//     String figMenor = nomes[0];
//     String figMaior = nomes[0];
// 
//     for (int i = 1; i < areas.length; i++) {
//         if (areas[i] < menor) {
//             menor = areas[i];
//             figMenor = nomes[i];
//         }
//         if (areas[i] > maior) {
//             maior = areas[i];
//             figMaior = nomes[i];
//         }
//     }
// 
//     System.out.println("\\nFigura com menor área: " + figMenor + " (" + menor + ")");
//     System.out.println("Figura com maior área: " + figMaior + " (" + maior + ")");
// 
//     // Ordena áreas em ordem crescente
//     double[] areasOrdenadas = areas.clone();
//     Arrays.sort(areasOrdenadas);
//     System.out.println("\\nÁreas em ordem crescente:");
//     for (double a : areasOrdenadas) {
//         System.out.println(a);
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
// public class DinheiroViagem {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// 
// ```
//     // Entrada das cotações
//     System.out.print("Digite a cotação do Dólar: ");
//     double cotDolar = sc.nextDouble();
//     System.out.print("Digite a cotação do Euro: ");
//     double cotEuro = sc.nextDouble();
//     System.out.print("Digite a cotação da Libra: ");
//     double cotLibra = sc.nextDouble();
// 
//     // Arrays para armazenar dados
//     String[] nomes = new String[4];
//     double[] reais = new double[4];
// 
//     // Entrada dos dados dos amigos
//     for (int i = 0; i < 4; i++) {
//         System.out.print("Digite o nome do amigo " + (i + 1) + ": ");
//         nomes[i] = sc.next();
//         System.out.print("Digite quanto em Reais " + nomes[i] + " vai levar: ");
//         reais[i] = sc.nextDouble();
//     }
// 
//     // a) Soma total
//     double soma = 0;
//     for (double r : reais) soma += r;
//     System.out.println("\\nTotal em Reais do grupo: " + soma);
// 
//     // b) Amigo com maior valor
//     double maior = reais[0], menor = reais[0];
//     String nomeMaior = nomes[0], nomeMenor = nomes[0];
//     for (int i = 1; i < reais.length; i++) {
//         if (reais[i] > maior) {
//             maior = reais[i];
//             nomeMaior = nomes[i];
//         }
//         if (reais[i] < menor) {
//             menor = reais[i];
//             nomeMenor = nomes[i];
//         }
//     }
//     System.out.println("Maior valor: " + nomeMaior + " (" + maior + ")");
//     System.out.println("Menor valor: " + nomeMenor + " (" + menor + ")");
// 
//     // c) Conversão para moedas
//     System.out.println("\\nValores convertidos:");
//     for (int i = 0; i < 4; i++) {
//         double emDolar = reais[i] / cotDolar;
//         double emEuro = reais[i] / cotEuro;
//         double emLibra = reais[i] / cotLibra;
//         System.out.println(nomes[i] + " tem " + reais[i] +
//                            " reais, convertidos: " + emDolar +
//                            " dólares, " + emEuro + " euros, " + emLibra + " libras.");
//     }
// 
//     // d) Valores em ordem crescente
//     double[] reaisOrdenados = reais.clone();
//     Arrays.sort(reaisOrdenados);
//     System.out.println("\\nValores em Reais do menor para o maior:");
//     for (double r : reaisOrdenados) {
//         System.out.println(r);
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
// public class NotasAlunos {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// 
// ```
//     String[] ra = new String[3];
//     double[] nota1 = new double[3];
//     double[] nota2 = new double[3];
//     double[] notapluri = new double[3];
//     double[] medias = new double[3];
// 
//     // Entrada de dados
//     for (int i = 0; i < 3; i++) {
//         System.out.println("Aluno " + (i + 1));
//         System.out.print("RA: ");
//         ra[i] = sc.next();
//         System.out.print("Nota 1: ");
//         nota1[i] = sc.nextDouble();
//         System.out.print("Nota 2: ");
//         nota2[i] = sc.nextDouble();
//         System.out.print("Nota Pluri: ");
//         notapluri[i] = sc.nextDouble();
// 
//         // Cálculo da média ponderada
//         medias[i] = (nota1[i] * 0.3) + (nota2[i] * 0.4) + (notapluri[i] * 0.3);
//     }
// 
//     // b) Exibir RA e média
//     System.out.println("\\nMédias dos alunos:");
//     for (int i = 0; i < 3; i++) {
//         System.out.println("RA: " + ra[i] + " - Média: " + medias[i]);
//     }
// 
//     // c) Média geral
//     double somaMedias = 0;
//     for (double m : medias) somaMedias += m;
//     double mediaGeral = somaMedias / 3;
//     System.out.println("\\nMédia geral da turma: " + mediaGeral);
// 
//     // d) Situação dos alunos
//     int aprovados = 0, reprovados = 0;
//     for (int i = 0; i < 3; i++) {
//         if (medias[i] >= 7.0) {
//             System.out.println("RA " + ra[i] + " - APROVADO (Média: " + medias[i] + ")");
//             aprovados++;
//         } else {
//             System.out.println("RA " + ra[i] + " - REPROVADO (Média: " + medias[i] + ")");
//             reprovados++;
//         }
//     }
// 
//     // e) Quantidade aprovados/reprovados
//     System.out.println("\\nTotal aprovados: " + aprovados);
//     System.out.println("Total reprovados: " + reprovados);
// 
//     // f) Ordenar RA e médias pelo valor da média
//     Double[] mediasOrdenadas = Arrays.stream(medias).boxed().toArray(Double[]::new);
//     Arrays.sort(mediasOrdenadas);
//     System.out.println("\\nMédias em ordem crescente:");
//     for (double m : mediasOrdenadas) {
//         System.out.println(m);
//     }
// 
//     sc.close();
// }
// 
// ```
// 
// }