package ExercicioAplicado2;

public class CDB extends Investimento implements Tributavel{
    @Override
    public double calcularRetornoAnual() {
        double valorRendimento = valorAplicado * taxaRendimentoAnual;
        System.out.println("Valor de rendimento foi de R$ " + valorRendimento);
        return valorRendimento;
    }

    @Override
    public double calcularImposto(double rendimento) {
        rendimento -= rendimento*0.225;
        return rendimento;
    }
}
