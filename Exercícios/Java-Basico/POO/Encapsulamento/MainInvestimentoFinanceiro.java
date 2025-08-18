package POO.Encapsulamento;

public class MainInvestimentoFinanceiro {
    public static void main(String[] args) {
        InvestimentoFinanceiro ivs = new InvestimentoFinanceiro();

        ivs.setInvestimento("Poupança");
        ivs.setTaxa(0.0243);
        ivs.setValorInicial(1000);
        ivs.exibirCalculo();

        double valorfuturo = ivs.calcularValorFuturo(10);
        System.out.printf("O valor final do investimento (em R$) foi de R$ %.2f", valorfuturo);
    }
}
