package POO.Polimorfismo.Override;

public class MainPagamento {
    public static void main(String[] args) {
        ProcessamentoPagamento[] pagamentos = {
                new PagamentoCartaoCredito(1000, "123 432 843 281 12"), new PagamentoPix(1000,"(19) 9000-0000")
        };

        for(ProcessamentoPagamento p:pagamentos){
            p.processarPagamento();
        }

    }
}
