package POO.Encapsulamento;

public class InvestimentoFinanceiro {
    private String tipoInvestimento;
    private double valorInicial;
    private double taxaAnual;

    public void setInvestimento(String tipoInvestimento){
        this.tipoInvestimento = tipoInvestimento;
    }

    public String getTipoInvestimento(){
        return tipoInvestimento;
    }

    public double getValorInicial(){
        return valorInicial;
    }

    public void setTaxa(double taxaAnual){
        this.taxaAnual = taxaAnual;
    }

    public double getTaxaAnual(){
        return taxaAnual*100;
    }

    public void setValorInicial(double valor) {
        if (valor < 1000) {
            System.out.println("Valor insuficiente.");
        } else {
            this.valorInicial = valor;
        }
    }
    public double calcularValorFuturo(int anos){
     double valorFinal = valorInicial * Math.pow((1+taxaAnual), anos);
     return valorFinal;
    }

    public void exibirCalculo(){
        System.out.println("CALCULADORA DE JUROS COMPOSTOS");
        System.out.println("Valor Inicial (R$): -----------" + getValorInicial());
        System.out.println("Tipo de Investimento: ---------" + getTipoInvestimento());
        System.out.println("Taxa Anual (%): ---------------" + getTaxaAnual());
    }
}
