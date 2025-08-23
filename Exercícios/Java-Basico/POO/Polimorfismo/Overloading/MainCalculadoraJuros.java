package POO.Polimorfismo.Overloading;

public class MainCalculadoraJuros {
    public static void main(String[] args) {
        CalculadoraDeJuros cj = new CalculadoraDeJuros();

        System.out.println("1 Simulação de Juros: " + cj.CalculadoraFinanceira(1000));
        System.out.println("2 Simulação de Juros: " + cj.CalculadoraFinanceira(1000, 0.015));
        System.out.println("3 Simulação de Juros: " + cj.CalculadoraFinanceira(1000, 0.015, 12));
    }
}
