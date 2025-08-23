package POO.Polimorfismo.Override;

public class Poupanca extends Investimento{

    public Poupanca(double valorAplicado){
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento(){
        return valorAplicado*0.05;
    }
}
