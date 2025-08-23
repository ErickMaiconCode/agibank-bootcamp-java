package POO.Interface;

public class ProdutoPromocional implements IDescontavel{
    @Override
    public double calcularPrecoFinal(double precoBase) {
        return precoBase - precoBase*0.20;
    }
}
