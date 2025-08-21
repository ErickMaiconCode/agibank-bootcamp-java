package POO.ClasseAbstrata;

abstract class CartaoDePagamento {
    protected int numeros;
    protected double limite;

    public CartaoDePagamento(int numeros, double limite){
        this.numeros = numeros;
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
    public int getNumeros(){
        return numeros;
    }

    protected void setLimite(double limite){
        this.limite = limite;
    }

    public abstract void processarCompra(double valor);
}
