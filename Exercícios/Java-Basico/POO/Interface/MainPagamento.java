package POO.Interface;

public class MainPagamento {
    public static void main(String[] args) {
        Ipagamentos boleto = new PagamentoBoleto();
        Ipagamentos card = new PagamentoCartãoCredito();

        boleto.processarPagamento(2000);
        card.processarPagamento(1200);
    }
}
