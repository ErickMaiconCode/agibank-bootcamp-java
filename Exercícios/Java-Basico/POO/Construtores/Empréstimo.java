package POO.Construtores;

public class Empréstimo {
    private double valor;
    private double taxajuros;
    private int prazomeses;

    public Empréstimo(double valor, int prazomeses) {

        this.taxajuros = 1.5;
        this.prazomeses = prazomeses;
        this.valor = valor;
    }

    public Empréstimo(double valor, int prazomeses, double taxajuros) {

        this.taxajuros = taxajuros;
        this.prazomeses = prazomeses;
        this.valor = valor;
    }

    public double getTaxajuros() {
        return taxajuros;
    }

    public int getPrazomeses() {
        return prazomeses;
    }

    public double getValor() {
        return valor;
    }

}