package ExercicioAplicado2;

public class LCI extends Investimento {
    @Override
    public double calcularRetornoAnual() {
        double valorRendimento = valorAplicado * taxaRendimentoAnual;
        System.out.println("Valor de rendimento foi de R$ " + valorRendimento);
    }
}
