package POO.Interface;

public class PagamentoCartãoCredito implements Ipagamentos {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via cartão de crédito.");
    }
}
