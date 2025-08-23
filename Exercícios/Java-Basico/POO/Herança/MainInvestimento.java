package POO.Herança;

public class MainInvestimento {
    public static void main(String[] args) {
        double valorInicio = 1200;
        InvestimentoRendaFixa inv = new InvestimentoRendaFixa("INV323", valorInicio, 2.0,48);
        System.out.println("Código Investimento: " + inv.getCodigo());
        System.out.println("Valor Inicial(R$): " + inv.getValorInicial());
        System.out.println("Taxa anual(%): " + inv.getTaxaAnual());
        System.out.println("Período de Investimento: " + inv.getPeriodomeses());
        System.out.println("Valor Final(R$): " + inv.calcularValorFinal(valorInicio));
    }
}
