// Lista de exercicios - ListaExercicios01_EntradaProcessSaida

//import java.util.Scanner;
//
//public class Q1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Entrada de 3 notas
//        System.out.print("Digite a primeira nota: ");
//        double n1 = sc.nextDouble();
//
//        System.out.print("Digite a segunda nota: ");
//        double n2 = sc.nextDouble();
//
//        System.out.print("Digite a terceira nota: ");
//        double n3 = sc.nextDouble();
//
//        // Cálculo da média
//        double media = (n1 + n2 + n3) / 3;
//
//        // Saída
//        System.out.println("A média é: " + media);
//
//        sc.close();
//    }
//}

// import java.util.Scanner;
// 
// public class Q2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// 
//         // Entrada: ano de nascimento e ano atual
//         System.out.print("Digite o ano de nascimento: ");
//         int nascimento = sc.nextInt();
// 
//         System.out.print("Digite o ano atual: ");
//         int atual = sc.nextInt();
// 
//         // Diferença em anos
//         int anos = atual - nascimento;
// 
//         // Considerando 365 dias por ano
//         int dias = anos * 365;
// 
//         // Saída
//         System.out.println("Você já viveu aproximadamente " + dias + " dias.");
// 
//         sc.close();
//     }
// }
// import java.util.Scanner;
// 
// public class Q3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// 
//         // Entrada dos custos
//         System.out.print("Digite o valor da mensalidade: ");
//         double mensalidade = sc.nextDouble();
// 
//         System.out.print("Digite o custo mensal com transporte: ");
//         double transporte = sc.nextDouble();
// 
//         System.out.print("Digite o custo mensal com alimentação: ");
//         double alimentacao = sc.nextDouble();
// 
//         // Cálculo total
//         double custoMensal = mensalidade + transporte + alimentacao;
//         double custoAnual = custoMensal * 12;
// 
//         // Saída
//         System.out.println("Custo mensal: R$ " + custoMensal);
//         System.out.println("Custo anual: R$ " + custoAnual);
// 
//         sc.close();
//     }
// }

// import java.util.Scanner;
// 
// public class Q4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// 
//         // Entrada do raio
//         System.out.print("Digite o raio da circunferência: ");
//         double raio = sc.nextDouble();
// 
//         // Fórmula da área: PI * r²
//         double area = Math.PI * Math.pow(raio, 2);
// 
//         // Saída
//         System.out.println("A área da circunferência é: " + area);
// 
//         sc.close();
//     }
// }

//import java.util.Scanner;
//
//public class Q5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Valor fixo da hora/aula
//        double valorHora = 25.0;
//
//        // Entrada da quantidade de aulas semanais
//        System.out.print("Digite a quantidade de aulas semanais: ");
//        int aulasSemana = sc.nextInt();
//
//        // Salário bruto: horas semanais * valor hora * 4 semanas
//        double salarioBruto = aulasSemana * valorHora * 4;
//
//        // Acréscimo de 10% (benefícios)
//        salarioBruto *= 1.10;
//
//        // Descontos
//        double descontoIR = salarioBruto * 0.05;   // 5% IR
//        double descontoINSS = salarioBruto * 0.07; // 7% INSS
//
//        // Salário líquido
//        double salarioLiquido = salarioBruto - (descontoIR + descontoINSS);
//
//        // Saída
//        System.out.println("Salário Bruto: R$ " + salarioBruto);
//        System.out.println("Desconto IR (5%): R$ " + descontoIR);
//        System.out.println("Desconto INSS (7%): R$ " + descontoINSS);
//        System.out.println("Salário Líquido: R$ " + salarioLiquido);
//
//        sc.close();
//    }
//}

// import java.util.Scanner;
// 
// public class Q6 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// 
//         // Entrada em Celsius
//         System.out.print("Digite a temperatura em Celsius: ");
//         double celsius = sc.nextDouble();
// 
//         // Fórmula: F = C * 9/5 + 32
//         double fahrenheit = (celsius * 9/5) + 32;
// 
//         // Saída
//         System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
// 
//         sc.close();
//     }
// }

//import java.util.Scanner;
//
//public class Q7 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Entrada raio e altura
//        System.out.print("Digite o raio da lata: ");
//        double raio = sc.nextDouble();
//
//        System.out.print("Digite a altura da lata: ");
//        double altura = sc.nextDouble();
//
//        // Fórmula: V = 3.14149 * r² * altura
//        double volume = 3.14149 * Math.pow(raio, 2) * altura;
//
//        // Saída
//        System.out.println("O volume da lata é: " + volume);
//
//        sc.close();
//    }
//}

// import java.util.Scanner;
// 
// public class Q8 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// 
//         // Entrada
//         System.out.print("Digite o valor da prestação: ");
//         double valor = sc.nextDouble();
// 
//         System.out.print("Digite a taxa (%): ");
//         double taxa = sc.nextDouble();
// 
//         System.out.print("Digite o tempo (meses de atraso): ");
//         int tempo = sc.nextInt();
// 
//         // Fórmula: prestação = valor + (valor * (taxa/100) * tempo)
//         double prestacao = valor + (valor * (taxa / 100) * tempo);
// 
//         // Saída
//         System.out.println("O valor da prestação em atraso é: R$ " + prestacao);
// 
//         sc.close();
//     }
// }

// import java.util.Scanner;
// 
// public class Q9 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// 
//         // Entrada em reais
//         System.out.print("Digite o valor em Reais: ");
//         double reais = sc.nextDouble();
// 
//         // Entrada das cotações
//         System.out.print("Digite a cotação do Dólar: ");
//         double dolar = sc.nextDouble();
// 
//         System.out.print("Digite a cotação do Euro: ");
//         double euro = sc.nextDouble();
// 
//         // Conversão
//         double emDolares = reais / dolar;
//         double emEuros = reais / euro;
// 
//         // Saída
//         System.out.println("Valor em Dólares: " + emDolares);
//         System.out.println("Valor em Euros: " + emEuros);
// 
//         sc.close();
//     }
// }

// import java.util.Scanner;
// 
// public class Q10 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// 
//         // ===== NP1 =====
//         System.out.print("Digite a nota das ATVs (NP1): ");
//         double atv1 = sc.nextDouble();
// 
//         System.out.print("Digite a nota de EAD (NP1): ");
//         double ead1 = sc.nextDouble();
// 
//         System.out.print("Digite a nota da AV1: ");
//         double av1 = sc.nextDouble();
// 
//         // Fórmula NP1 = 20% ATVs + 20% EAD + 60% AV1
//         double np1 = (atv1 * 0.2) + (ead1 * 0.2) + (av1 * 0.6);
// 
//         // ===== NP2 =====
//         System.out.print("Digite a nota das ATVs (NP2): ");
//         double atv2 = sc.nextDouble();
// 
//         System.out.print("Digite a nota de EAD (NP2): ");
//         double ead2 = sc.nextDouble();
// 
//         System.out.print("Digite a nota do PLURI: ");
//         double pluri = sc.nextDouble();
// 
//         System.out.print("Digite a nota da AV2: ");
//         double av2 = sc.nextDouble();
// 
//         // Fórmula NP2 = 20% ATVs + 20% EAD + 20% PLURI + 40% AV2
//         double np2 = (atv2 * 0.2) + (ead2 * 0.2) + (pluri * 0.2) + (av2 * 0.4);
// 
//         // ===== Média Final =====
//         // MF = 40% NP1 + 60% NP2
//         double mf = (np1 * 0.4) + (np2 * 0.6);
// 
//         // Saída
//         System.out.println("NP1 = " + np1);
//         System.out.println("NP2 = " + np2);
//         System.out.println("Média Final = " + mf);
// 
//         sc.close();
//     }
// }













