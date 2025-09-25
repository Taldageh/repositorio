// Lista de vetores - ListaExercicios10_Repeticao

// import java.util.Scanner;
// 
// public class CarregarImprimirIdades {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// int[] idades = new int[10];
// 
// ```
//     // Carregar idades
//     for (int i = 0; i < idades.length; i++) {
//         System.out.print("Digite a idade da posição " + i + ": ");
//         idades[i] = sc.nextInt();
//     }
// 
//     // Imprimir idades com posição
//     System.out.println("\\nIdades armazenadas:");
//     for (int i = 0; i < idades.length; i++) {
//         System.out.println("Posição " + i + ": " + idades[i]);
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
// public class Mensalidades {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// double[] mensalidades = new double[10];
// int opcao;
// 
// ```
//     do {
//         System.out.println("\\n..:: MENSALIDADES ::..");
//         System.out.println("1. Zerar");
//         System.out.println("2. Carregar");
//         System.out.println("3. Imprimir");
//         System.out.println("4. Somar");
//         System.out.println("9. Sair");
//         System.out.print("Escolha uma opção: ");
//         opcao = sc.nextInt();
// 
//         switch (opcao) {
//             case 1: // Zerar
//                 for (int i = 0; i < mensalidades.length; i++) mensalidades[i] = 0;
//                 System.out.println("Mensalidades zeradas!");
//                 break;
//             case 2: // Carregar
//                 for (int i = 0; i < mensalidades.length; i++) {
//                     System.out.print("Digite a mensalidade da posição " + i + ": ");
//                     mensalidades[i] = sc.nextDouble();
//                 }
//                 break;
//             case 3: // Imprimir
//                 for (int i = 0; i < mensalidades.length; i++)
//                     System.out.println("Posição " + i + ": " + mensalidades[i]);
//                 break;
//             case 4: // Somar
//                 double soma = 0;
//                 for (double m : mensalidades) soma += m;
//                 System.out.println("Soma das mensalidades: " + soma);
//                 break;
//             case 9:
//                 System.out.println("Saindo...");
//                 break;
//             default:
//                 System.out.println("Opção inválida!");
//         }
//     } while (opcao != 9);
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
// public class MenuIdades {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// int[] idades = new int[8];
// int opcao;
// 
// ```
//     do {
//         System.out.println("\\n..:: IDADES ::..");
//         System.out.println("1. Zerar");
//         System.out.println("2. Carregar");
//         System.out.println("3. Imprimir");
//         System.out.println("4. Somar");
//         System.out.println("5. Pares");
//         System.out.println("6. Contar pares");
//         System.out.println("7. Somar pares");
//         System.out.println("8. Menores de 18");
//         System.out.println("9. Contar maiores ou iguais a 18");
//         System.out.println("10. Somar maiores ou iguais a 18");
//         System.out.println("0. Sair");
//         System.out.print("Escolha uma opção: ");
//         opcao = sc.nextInt();
// 
//         switch (opcao) {
//             case 1: // Zerar
//                 for (int i = 0; i < idades.length; i++) idades[i] = 0;
//                 break;
//             case 2: // Carregar
//                 for (int i = 0; i < idades.length; i++) {
//                     System.out.print("Digite a idade da posição " + i + ": ");
//                     idades[i] = sc.nextInt();
//                 }
//                 break;
//             case 3: // Imprimir
//                 for (int i = 0; i < idades.length; i++)
//                     System.out.println("Posição " + i + ": " + idades[i]);
//                 break;
//             case 4: // Somar
//                 int soma = 0;
//                 for (int idade : idades) soma += idade;
//                 System.out.println("Soma das idades: " + soma);
//                 break;
//             case 5: // Pares
//                 System.out.println("Idades pares:");
//                 for (int idade : idades) if (idade % 2 == 0) System.out.print(idade + " ");
//                 System.out.println();
//                 break;
//             case 6: // Contar pares
//                 int countPares = 0;
//                 for (int idade : idades) if (idade % 2 == 0) countPares++;
//                 System.out.println("Quantidade de pares: " + countPares);
//                 break;
//             case 7: // Somar pares
//                 int somaPares = 0;
//                 for (int idade : idades) if (idade % 2 == 0) somaPares += idade;
//                 System.out.println("Soma dos pares: " + somaPares);
//                 break;
//             case 8: // Menores de 18
//                 System.out.println("Idades menores que 18:");
//                 for (int idade : idades) if (idade < 18) System.out.print(idade + " ");
//                 System.out.println();
//                 break;
//             case 9: // Contar maiores ou iguais a 18
//                 int countMaiores = 0;
//                 for (int idade : idades) if (idade >= 18) countMaiores++;
//                 System.out.println("Quantidade maiores ou iguais a 18: " + countMaiores);
//                 break;
//             case 10: // Somar maiores ou iguais a 18
//                 int somaMaiores = 0;
//                 for (int idade : idades) if (idade >= 18) somaMaiores += idade;
//                 System.out.println("Soma das idades maiores ou iguais a 18: " + somaMaiores);
//                 break;
//             case 0:
//                 System.out.println("Saindo...");
//                 break;
//             default:
//                 System.out.println("Opção inválida!");
//         }
//     } while (opcao != 0);
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
// import java.util.Random;
// 
// public class ValoresAleatorios {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// Random rand = new Random();
// int[] valores = new int[60];
// int opcao;
// 
// ```
//     do {
//         System.out.println("\\n..:: SORTEIO ::..");
//         System.out.println("1. Zerar (-1)");
//         System.out.println("2. Carregar aleatório (1 a 60)");
//         System.out.println("3. Imprimir");
//         System.out.println("4. Somar");
//         System.out.println("5. Relatório ímpares");
//         System.out.println("6. Maiores que valor");
//         System.out.println("7. Quantos existem/repetidos");
//         System.out.println("0. Sair");
//         System.out.print("Escolha uma opção: ");
//         opcao = sc.nextInt();
// 
//         switch (opcao) {
//             case 1:
//                 for (int i = 0; i < valores.length; i++) valores[i] = -1;
//                 break;
//             case 2:
//                 for (int i = 0; i < valores.length; i++) valores[i] = rand.nextInt(60) + 1;
//                 break;
//             case 3:
//                 for (int i = 0; i < valores.length; i++)
//                     System.out.println("Posição " + i + ": " + valores[i]);
//                 break;
//             case 4:
//                 int soma = 0;
//                 for (int v : valores) soma += v;
//                 System.out.println("Soma dos valores: " + soma);
//                 break;
//             case 5:
//                 int countImpares = 0, somaImpares = 0;
//                 for (int v : valores) if (v % 2 != 0) { countImpares++; somaImpares += v; }
//                 System.out.println("Qtd ímpares: " + countImpares + ", Soma ímpares: " + somaImpares);
//                 break;
//             case 6:
//                 System.out.print("Informe valor para comparação: ");
//                 int lim = sc.nextInt();
//                 System.out.println("Valores maiores que " + lim + ":");
//                 for (int v : valores) if (v > lim) System.out.print(v + " ");
//                 System.out.println();
//                 break;
//             case 7:
//                 System.out.print("Informe valor para contar repetições: ");
//                 int valorBusca = sc.nextInt();
//                 int count = 0;
//                 for (int v : valores) if (v == valorBusca) count++;
//                 System.out.println("O valor " + valorBusca + " aparece " + count + " vezes.");
//                 break;
//             case 0:
//                 System.out.println("Saindo...");
//                 break;
//             default:
//                 System.out.println("Opção inválida!");
//         }
//     } while (opcao != 0);
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
// import java.util.Random;
// 
// public class ValoresAleatorios2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// Random rand = new Random();
// int[] valores
// 
// import java.util.Scanner;
// import java.util.Random;
// 
// public class ValoresAleatorios2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// Random rand = new Random();
// int[] valores = new int[60];
// int opcao;
// 
// ```
//     do {
//         System.out.println("\\n..:: SORTEIO 2 ::..");
//         System.out.println("1. Zerar (-1)");
//         System.out.println("2. Carregar aleatório (1 a 60)");
//         System.out.println("3. Imprimir");
//         System.out.println("4. Entre valores");
//         System.out.println("5. Exibir repetidos");
//         System.out.println("0. Sair");
//         System.out.print("Escolha uma opção: ");
//         opcao = sc.nextInt();
// 
//         switch (opcao) {
//             case 1: // Zerar
//                 for (int i = 0; i < valores.length; i++) valores[i] = -1;
//                 break;
// 
//             case 2: // Carregar aleatório
//                 for (int i = 0; i < valores.length; i++) valores[i] = rand.nextInt(60) + 1;
//                 break;
// 
//             case 3: // Imprimir
//                 for (int i = 0; i < valores.length; i++)
//                     System.out.println("Posição " + i + ": " + valores[i]);
//                 break;
// 
//             case 4: // Entre valores
//                 System.out.print("Digite o valor inicial: ");
//                 int v1 = sc.nextInt();
//                 System.out.print("Digite o valor final: ");
//                 int v2 = sc.nextInt();
//                 System.out.println("Valores entre " + v1 + " e " + v2 + ":");
//                 for (int v : valores) {
//                     if (v >= v1 && v <= v2) System.out.print(v + " ");
//                 }
//                 System.out.println();
//                 break;
// 
//             case 5: // Exibir repetidos
//                 System.out.println("Valores repetidos no vetor:");
//                 for (int i = 0; i < valores.length; i++) {
//                     int count = 0;
//                     // Conta quantas vezes o valor da posição i aparece
//                     for (int j = 0; j < valores.length; j++) {
//                         if (valores[i] == valores[j]) count++;
//                     }
//                     // Se aparecer mais de uma vez, exibe
//                     if (count > 1) {
//                         System.out.println(valores[i] + " = " + count);
//                     }
//                 }
//                 break;
// 
//             case 0:
//                 System.out.println("Saindo...");
//                 break;
// 
//             default:
//                 System.out.println("Opção inválida!");
//         }
// 
//     } while (opcao != 0);
// 
//     sc.close();
// }
// 
// ```
// 
// }
// 
// import java.util.Scanner;
// import java.util.Random;
// 
// public class ValoresAleatorios2 {
// public static void main(String[] args) {
// Scanner sc = new Scanner([System.in](http://system.in/));
// Random rand = new Random();
// int[] valores = new int[60];
// int opcao;
// 
// ```
//     do {
//         System.out.println("\\n..:: SORTEIO 2 ::..");
//         System.out.println("1. Zerar (-1)");
//         System.out.println("2. Carregar aleatório (1 a 60)");
//         System.out.println("3. Imprimir");
//         System.out.println("4. Entre valores");
//         System.out.println("5. Exibir repetidos");
//         System.out.println("0. Sair");
//         System.out.print("Escolha uma opção: ");
//         opcao = sc.nextInt();
// 
//         switch (opcao) {
//             case 1: // Zerar
//                 for (int i = 0; i < valores.length; i++) valores[i] = -1;
//                 break;
// 
//             case 2: // Carregar aleatório
//                 for (int i = 0; i < valores.length; i++) valores[i] = rand.nextInt(60) + 1;
//                 break;
// 
//             case 3: // Imprimir
//                 for (int i = 0; i < valores.length; i++)
//                     System.out.println("Posição " + i + ": " + valores[i]);
//                 break;
// 
//             case 4: // Entre valores
//                 System.out.print("Digite o valor inicial: ");
//                 int v1 = sc.nextInt();
//                 System.out.print("Digite o valor final: ");
//                 int v2 = sc.nextInt();
//                 System.out.println("Valores entre " + v1 + " e " + v2 + ":");
//                 for (int v : valores) {
//                     if (v >= v1 && v <= v2) System.out.print(v + " ");
//                 }
//                 System.out.println();
//                 break;
// 
//             case 5: // Exibir repetidos
//                 System.out.println("Valores repetidos no vetor:");
//                 for (int i = 0; i < valores.length; i++) {
//                     int count = 0;
//                     // Conta quantas vezes o valor da posição i aparece
//                     for (int j = 0; j < valores.length; j++) {
//                         if (valores[i] == valores[j]) count++;
//                     }
//                     // Se aparecer mais de uma vez, exibe
//                     if (count > 1) {
//                         System.out.println(valores[i] + " = " + count);
//                     }
//                 }
//                 break;
// 
//             case 0:
//                 System.out.println("Saindo...");
//                 break;
// 
//             default:
//                 System.out.println("Opção inválida!");
//         }
// 
//     } while (opcao != 0);
// 
//     sc.close();
// }
// 
// ```
// 
// }