package Metodo;

public class EX08JurosCompostos {
    public static double calcularJurosCompostos(double capital, double taxa, int tempo){
        double montante = capital*(Math.pow((1+taxa), tempo));

        return montante;
    }

    public static void main(String[] args) {
        double valorInicial = 1500;
        double taxaDeCompra = 0.10;
        int meses = 12;

        double valorFinal = calcularJurosCompostos(valorInicial,taxaDeCompra,meses);

        System.out.printf("O valor final da compra será de R$ " + String.format("%.2f", valorFinal));
    }
}
