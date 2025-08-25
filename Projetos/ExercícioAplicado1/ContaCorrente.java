package ExercícioAplicado1;

public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String agencia, String numeroconta, double limiteChequeEspecial) {
        super(agencia, numeroconta);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    protected void setSaldo(double saldo) {
        super.setSaldo(saldo);
    }

    @Override
    public void sacar(double valor) {
        if(valor > 0 && valor <= getSaldo() + limiteChequeEspecial){
            setSaldo(getSaldo() - valor);

            System.out.println("Transação de saque no valor de R$ " + valor + " feita com sucesso." );
            System.out.println("Agência: " + getAgencia());
            System.out.println("Conta: " + getNumeroconta());
        }
        else {
            System.out.println("\nValor inválido para efetuar a transação. Verifique novamente.");
        }
    }
}
