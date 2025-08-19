package POO.Construtores;

public class ContaBancária {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancária(){
        this.titular = "";
        this.numeroConta = "";
        this.saldo = 0.0;
    }

    public ContaBancária(String titular, String numeroConta){
        this.titular = "Erick";
        this.numeroConta = "12345 - 678";
        this.saldo = 0.0;
    }

    public ContaBancária(String titular, String numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public String getTitular(){
        return titular;
    }
    public String getNumeroConta(){
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void exibirInformações(){
        System.out.println("Nome do Titular: -------------- " + titular);
        System.out.println("Número de Conta: -------------- " + numeroConta);
        System.out.println("Saldo: ------------------------ " + saldo);
    }

}
