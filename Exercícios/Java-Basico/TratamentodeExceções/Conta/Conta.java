package TratamentodeExceções.Conta;

abstract class Conta implements Operações {
    private int numeroConta;
    private double saldo;
    private String titular;

    public Conta(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
        this.titular = titular;
    }

    public void exibirDados(){
        System.out.println("Dados da Conta");
        System.out.println("Conta: " + numeroConta);
        System.out.println("Nome: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public void deposito(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Valor de transação inválida");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor < saldo) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Valor de transação inválida");
        }
    }
}
