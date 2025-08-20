package POO.Polimorfismo.Override;

public class CDB extends Investimento{

    public CDB(double valorAplicado){
        super(valorAplicado);
    }

    public double calcularRendimento(){
        return valorAplicado*0.1;
    }
}
