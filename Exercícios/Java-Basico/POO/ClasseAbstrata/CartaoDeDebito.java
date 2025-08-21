package POO.ClasseAbstrata;

public class CartaoDeDebito extends CartaoDePagamento {
    private double saldoConta;

    public CartaoDeDebito(int numeros, double limite, double saldoConta) {
        super(numeros, limite);
        this.saldoConta = saldoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    @Override
    public void processarCompra(double valor) {
        if(valor <= getSaldoConta()) {
            setSaldoConta(getSaldoConta() - valor);
            System.out.println("Compra Aprovada");
        } else {
            System.out.println("Compra Reprovada");
        }
    }
}
