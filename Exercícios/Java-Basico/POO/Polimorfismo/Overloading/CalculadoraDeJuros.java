package POO.Polimorfismo.Overloading;

public class CalculadoraDeJuros {
    public double CalculadoraFinanceira(double capital, double taxaJuros, int meses){
        return capital*taxaJuros*meses;
    }
    public double CalculadoraFinanceira(double capital, double taxaJuros){
        return capital*taxaJuros*12;
    }
    public double CalculadoraFinanceira(double capital){
        return capital*0.015*12;
    }
}
