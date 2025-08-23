package POO.Construtores;

public class MainTransaçãoFinanceira {
    public static void main(String[] args) {
        TransaçãoFinanceira t1 = new TransaçãoFinanceira("ERI123", "Poupança");
        System.out.println(" ID: " + t1.getId() + " Tipo de Investimento: " + t1.getTipo() + " Valor Investido: " + t1.getValor());

        TransaçãoFinanceira t2 = new TransaçãoFinanceira("ERI123", "Poupança", 1200);
        System.out.println(" ID: " + t2.getId() + " Tipo de Investimento: " + t2.getTipo() + " Valor Investido: " + t2.getValor());
    }
}
