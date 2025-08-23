package POO.Polimorfismo.Override;

public class PagamentoPix extends ProcessamentoPagamento{
    private String chavePix;

    public PagamentoPix(double valor, String chavePix){
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(){
        System.out.println("Pagamento via pix pela chave " + chavePix + " no valor de R$ " + valor);
    }
}
