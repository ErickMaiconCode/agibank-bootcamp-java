package POO.Interface;

public class PagamentoBoleto implements Ipagamentos {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via boleto bancário.");
    }
}
