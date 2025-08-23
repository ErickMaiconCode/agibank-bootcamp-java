package ExercicioAplicadoBancário;

public abstract class Conta implements OperacoesBancarias {
    private int numeroConta;
    private String ClienteTitular;
    private double saldo;

    public Conta(int numeroConta, String ClienteTitular) {
        this.numeroConta = numeroConta;
        this.ClienteTitular = ClienteTitular;
        this.saldo = 0;
    }

    public double getSaldo(){
        return saldo;
    }

    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {

        if(valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " efetuado com sucesso.");
        }
        else{
            System.out.println("Valor de depósito inválido");
        }
    }

    @Override
    public void sacar(double valor) {
        if(valor <= saldo || valor > 0){
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " efetuado com sucesso. ");
        }
        else {
            System.out.println("Valor insuficiente para realizar a transação");
        }
    }

    public abstract void aplicarJuros();
}
