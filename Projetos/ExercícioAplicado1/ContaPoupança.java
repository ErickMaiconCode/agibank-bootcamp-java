package ExercícioAplicado1;

public class ContaPoupança extends Conta{
    private double taxaRendimento;

    public ContaPoupança(String agencia, String numeroconta, double taxaRendimento) {
        super(agencia, numeroconta);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento(){
        setSaldo(getSaldo() + getSaldo()*(getTaxaRendimento()/100));

        System.out.println("\nConta Poupança: Nesta categoria há uma taxa de rendimento no valor de " + taxaRendimento + " %.");
    }
}
