package POO.Polimorfismo.Override;

public class PagamentoCartaoCredito extends ProcessamentoPagamento{
    private String numeroCartao;

    public PagamentoCartaoCredito(double valor, String numeroCartao){
        super(valor);
        this.numeroCartao = numeroCartao;

    }
    @Override
    public void processarPagamento(){
        System.out.println("Pagamento de com cartão de crédito: " + numeroCartao + " no valor de R$ " + valor);
    }
}
