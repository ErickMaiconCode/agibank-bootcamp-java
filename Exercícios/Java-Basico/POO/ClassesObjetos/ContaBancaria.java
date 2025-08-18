package POO.ClassesObjetos;

public class ContaBancaria {
    public String titular;
    public String numerodeconta;
    public double saldo;

    public void depositar(double saldo){
        this.saldo += saldo;
    }
    public void sacar(double saldo){
        this.saldo = this.saldo - saldo;
    }
    public void exibirsaldo(){
        System.out.println(">>>>>>> DADOS BANCÁRIOS <<<<<<<<<");
        System.out.println("Titular da conta: -----" + titular);
        System.out.println("CONTA: ------------------" + numerodeconta);
        System.out.println("Saldo: ---------------- R$ " + String.format("%.2f", saldo));

    }
}
