package POO.Polimorfismo.Override;

public class ContaCorrente extends ContaBancaria{
    private double descontoManutenção;

    public ContaCorrente(String titular, double saldo, double descontoManutenção){
        super(titular, saldo);
        this.descontoManutenção = descontoManutenção;
    }

    public void gerarRelatorio(){
        System.out.println(" Nome do Titular: " + titular + " Saldo: R$ " + saldo + " Taxa de Manutenção: R$ " + descontoManutenção);
    }
}
