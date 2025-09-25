// Lista de exercicios 3 - ListaExercicios01_EntradaProcessSaida

//import java.util.*;
//
//public class Q1_Ordenar {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Solicita os três números
//        System.out.print("Digite o primeiro valor inteiro: ");
//        int n1 = sc.nextInt();
//        System.out.print("Digite o segundo valor inteiro: ");
//        int n2 = sc.nextInt();
//        System.out.print("Digite o terceiro valor inteiro: ");
//        int n3 = sc.nextInt();
//
//        // Colocamos os números em um array
//        int[] numeros = {n1, n2, n3};
//
//        // Ordenamos com Arrays.sort
//        Arrays.sort(numeros);
//
//        // Exibimos os números em ordem crescente
//        System.out.println("Valores ordenados: " + Arrays.toString(numeros));
//
//        sc.close();
//    }
//}

//  import java.util.*;
//  
//  public class Q2_MaiorValidacao {
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//  
//          System.out.print("Digite o primeiro valor inteiro: ");
//          int n1 = sc.nextInt();
//          System.out.print("Digite o segundo valor inteiro: ");
//          int n2 = sc.nextInt();
//  
//          if (n1 == n2) {
//              System.out.println("Valores iguais não são permitidos!");
//          } else {
//              int maior = (n1 > n2) ? n1 : n2;
//              System.out.println("O maior valor informado é: " + maior);
//          }
//  
//          sc.close();
//      }
//  }

// import java.util.*;
// 
// public class Q3_ClassificarIdade {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// 
//         System.out.print("Digite sua idade: ");
//         int idade = sc.nextInt();
// 
//         if (idade >= 0 && idade <= 10) {
//             System.out.println("Olá criança!");
//         } else if (idade <= 14) {
//             System.out.println("Olá, você é um(a) pré-adolescente.");
//         } else if (idade <= 18) {
//             System.out.println("Parabéns, você já pode ser um eleitor.");
//         } else if (idade <= 21) {
//             System.out.println("Hummm, você já é um adulto.");
//         } else {
//             System.out.println("Bem, agora já está na hora de sair de casa e seguir sua vida...");
//         }
// 
//         sc.close();
//     }
// }
// 
// import java.util.*;
// 
// public class Q4_IMC {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// 
//         System.out.print("Digite seu peso (kg): ");
//         double peso = sc.nextDouble();
// 
//         System.out.print("Digite sua altura (m): ");
//         double altura = sc.nextDouble();
// 
//         // Fórmula do IMC: peso / (altura^2)
//         double imc = peso / (altura * altura);
// 
//         System.out.printf("Seu IMC é: %.2f\n", imc);
// 
//         // Classificação simples (existem várias tabelas possíveis)
//         if (imc < 18.5) {
//             System.out.println("Abaixo do peso.");
//         } else if (imc < 24.9) {
//             System.out.println("Peso normal.");
//         } else if (imc < 29.9) {
//             System.out.println("Sobrepeso.");
//         } else if (imc < 34.9) {
//             System.out.println("Obesidade grau I.");
//         } else if (imc < 39.9) {
//             System.out.println("Obesidade grau II.");
//         } else {
//             System.out.println("Obesidade grau III.");
//         }
// 
//         sc.close();
//     }
// }
// 
// import java.util.*;
// 
// public class Q5_Aprovacao {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// 
//         System.out.print("Digite a nota da avaliação 01: ");
//         double n1 = sc.nextDouble();
// 
//         System.out.print("Digite a nota da avaliação 02: ");
//         double n2 = sc.nextDouble();
// 
//         System.out.print("Digite a nota do trabalho: ");
//         double n3 = sc.nextDouble();
// 
//         // Média ponderada: 30%, 40%, 30%
//         double media = (n1 * 0.3) + (n2 * 0.4) + (n3 * 0.3);
// 
//         System.out.printf("Média final: %.2f\n", media);
// 
//         if (media < 5.0) {
//             System.out.println("Reprovado");
//         } else if (media <= 7.49) {
//             System.out.println("Aprovado");
//         } else {
//             System.out.println("Parabéns, você foi aprovado com excelência!");
//         }
// 
//         sc.close();
//     }
// }
// 
// import java.util.*;
// 
// public class Q6_OrdenarSemRepetidos {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// 
//         Set<Integer> numeros = new HashSet<>(); // conjunto não permite repetição
// 
//         while (numeros.size() < 3) {
//             System.out.print("Digite um valor inteiro: ");
//             int valor = sc.nextInt();
//             if (numeros.contains(valor)) {
//                 System.out.println("Valor repetido! Digite outro.");
//             } else {
//                 numeros.add(valor);
//             }
//         }
// 
//         // Convertemos para lista para ordenar
//         List<Integer> lista = new ArrayList<>(numeros);
//         Collections.sort(lista);
// 
//         System.out.println("Valores ordenados: " + lista);
// 
//         sc.close();
//     }
// }
// 
// import java.util.*;
// 
// public class Q7_ContarParesImpares {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// 
//         int pares = 0;
//         int impares = 0;
// 
//         for (int i = 1; i <= 5; i++) {
//             System.out.print("Digite o valor " + i + ": ");
//             int valor = sc.nextInt();
//             if (valor % 2 == 0) {
//                 pares++;
//             } else {
//                 impares++;
//             }
//         }
// 
//         System.out.println("Quantidade de pares: " + pares);
//         System.out.println("Quantidade de ímpares: " + impares);
// 
//         if (pares > impares) {
//             System.out.println("Foram fornecidos mais números pares.");
//         } else if (impares > pares) {
//             System.out.println("Foram fornecidos mais números ímpares.");
//         } else {
//             System.out.println("Foram fornecidos a mesma quantidade de pares e ímpares.");
//         }
// 
//         sc.close();
//     }
// }
