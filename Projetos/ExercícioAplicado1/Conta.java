package ExercícioAplicado1;

public class Conta {
    private String agencia;
    private String numeroconta;
    private double saldo;

    public Conta(String agencia, String numeroconta) {
        this.agencia = agencia;
        this.numeroconta = numeroconta;
        this.saldo = 0;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("\nTransação de depósito no valor de R$ " + valor + " feita com sucesso." );
            System.out.println("Agência: " + agencia);
            System.out.println("Conta: " + numeroconta);
        }
        else{
            System.out.println("Valor inválido para efetuar a transação. Verifique novamente.");
        }
    }

    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("\nTransação de saque no valor de R$ " + valor + " feita com sucesso." );
            System.out.println("Agência: " + agencia);
            System.out.println("Conta: " + numeroconta);
        }
        else{
            System.out.println("\nValor inválido para efetuar a transação. Verifique novamente.");
        }
    }

    public void exibirSaldo(){
        System.out.println("\n|---- Dados Bancários --|");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numeroconta);
        System.out.println("Saldo: " + saldo);
    }

}
