package POO.ClasseAbstrata;

public class CartãoDeCredito extends CartaoDePagamento {

    public CartãoDeCredito(int numeros, double limite) {
        super(numeros, limite);
    }

    @Override
    public void processarCompra(double valor) {
        if(valor <= getLimite()){
            setLimite(getLimite() - valor);
            System.out.println("Compra Aprovada");
        } else {
            System.out.println("Compra Reprovada");
        }
    }
}
