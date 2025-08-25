package MiniHackaton2;

/*
Erick Maicon Lima de Almeida - 25/08
 */

abstract class Investimento {
    private double valorInicial;

    public Investimento(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public abstract double calcularRendimento();
}
