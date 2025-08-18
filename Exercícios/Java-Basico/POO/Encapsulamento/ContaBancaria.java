package POO.Encapsulamento;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return this.titular;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta(){
        return this.numeroConta;
    }

    public double saque(double valor){
        this.saldo = this.saldo - valor;
        this.saldo = saldo;
        return saldo;
    }
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }
        else {
            System.out.println("Valor inválido ou igual a 0.");
        }
    }
    public void sacar(double valor){
        if (valor <= saldo || valor > 0){
            this.saldo -= valor;
        }
        else {
            System.out.println("Valor inválido ou igual a 0.");
        }
    }
    public void ExibirExtrato(){
        System.out.println("Nome Completo: ------------ " + getTitular());
        System.out.println("Número da Conta: ---------- " + getNumeroConta());
        System.out.println("Saldo: --------------------" + this.saldo);

    }
}
