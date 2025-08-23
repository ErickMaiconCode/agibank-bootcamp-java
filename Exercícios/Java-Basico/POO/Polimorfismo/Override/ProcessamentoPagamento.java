package POO.Polimorfismo.Override;

public abstract class ProcessamentoPagamento {
    protected double valor;

    public ProcessamentoPagamento(double valor){
        this.valor = valor;
    }

    public void processarPagamento(){
        System.out.println("Processando pagamento genérico" + valor);
    }
}
