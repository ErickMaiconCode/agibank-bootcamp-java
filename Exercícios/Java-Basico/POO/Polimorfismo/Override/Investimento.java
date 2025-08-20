package POO.Polimorfismo.Override;

public abstract class Investimento {
    protected double valorAplicado;

    public Investimento(double valorAplicado){
        this.valorAplicado = valorAplicado;

    }
    public double calcularRendimento(double valorAplicado){
        valorAplicado = 0.0;
        return valorAplicado;
    }

    public abstract double calcularRendimento();
}
