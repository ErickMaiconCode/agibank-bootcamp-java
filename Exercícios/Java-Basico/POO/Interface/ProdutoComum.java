package POO.Interface;

public class ProdutoComum implements IDescontavel {
    @Override
    public double calcularPrecoFinal(double precoBase) {
        return precoBase - precoBase*0.05;
    }
}
