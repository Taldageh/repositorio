package geral.Facul;

public class MesEAno {
    public static void main(String[] args) {
        // Valores mensais
        int mensalidadeMensal = 620;
        int transporteMensal = 320;
        int alimentacaoMensal = 150;

        // Impressão dos valores mensais
        System.out.println("A mensalidade da faculdade (mensal) é: R$ " + mensalidadeMensal);
        System.out.println("O transporte da faculdade (mensal) é: R$ " + transporteMensal);
        System.out.println("A alimentação na faculdade (mensal) é: R$ " + alimentacaoMensal);

        // Cálculo dos valores anuais
        int mensalidadeAnual = mensalidadeMensal * 12;
        int transporteAnual = transporteMensal * 12;
        int alimentacaoAnual = alimentacaoMensal * 12;

        // Impressão dos valores anuais
        System.out.println("A mensalidade da faculdade (anual) é: R$ " + mensalidadeAnual);
        System.out.println("O transporte da faculdade (anual) é: R$ " + transporteAnual);
        System.out.println("A alimentação na faculdade (anual) é: R$ " + alimentacaoAnual);

        // Custo total anual
        int totalAnual = mensalidadeAnual + transporteAnual + alimentacaoAnual;
        System.out.println("O custo total anual com a faculdade é: R$ " + totalAnual);
    }
}
