package POO.Construtores;

public class MainEmpréstimo {
    public static void main(String[] args) {
        Empréstimo ep = new Empréstimo(1000, 10);
        Empréstimo ep2 = new Empréstimo(2000, 12, 2.0);

        System.out.println(" Valor: --- " + ep.getValor() + " Meses: --- " + ep.getPrazomeses() + " Taxas: --- " + ep.getTaxajuros());
        System.out.println(" Valor: --- " + ep2.getValor() + " Meses: --- " + ep2.getPrazomeses() + " Taxas: --- " + ep2.getTaxajuros());
    }
}
