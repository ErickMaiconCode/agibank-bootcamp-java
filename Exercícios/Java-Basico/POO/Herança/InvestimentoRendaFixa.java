package POO.Herança;

public class InvestimentoRendaFixa extends Investimento {
    private double taxaAnual;
    private int periodomeses;

    public InvestimentoRendaFixa(String codigo, double valorInicial, double taxaAnual, int periodomeses) {
        super(codigo, valorInicial);
        this.periodomeses = periodomeses;
        this.taxaAnual = taxaAnual;
    }

    public double calcularValorFinal(double valorInicial){
        double valorFinal = valorInicial*(1 + taxaAnual *(periodomeses/12));
        return valorFinal;
    }

    public double getTaxaAnual() {
        return taxaAnual;
    }

    public int getPeriodomeses() {
        return periodomeses;
    }
}
