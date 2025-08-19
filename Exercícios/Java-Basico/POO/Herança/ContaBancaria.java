package POO.Herança;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }
    public double getSaldo(){
        return saldo;
    }
    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }
    public String getNumeroConta(){
        return numeroConta;
    }
}
