package POO.Polimorfismo.Override;

public class ContaPoupança extends ContaBancaria{
    private double rendimentoMensal;

    public ContaPoupança(String titular, double saldo, double rendimentoMensal){
        super(titular, saldo);
        this.rendimentoMensal = rendimentoMensal;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println(" Nome do Titular: " + titular + " Saldo: R$ " + saldo + " Rendimento Mensal(%): " + rendimentoMensal);
    }
}
