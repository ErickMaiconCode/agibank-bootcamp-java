package Vetores.Bidimensionais;

public class EX09Saldo {
    public static double calcularSaldoTotal(double[][] matriz){
        double somaTotal = 0.0;
        for(int i = 0; i < matriz[0].length; i++){
            somaTotal = 0.0;
            for (int j = 0; j < matriz.length; j++) {
                somaTotal = somaTotal + matriz[j][i];
            }
        }
        return somaTotal;
    }
    public static double[] encontrarMaximoPorConta(double[][] matriz) {
    }
    public static void main(String[] args) {

    }
}
