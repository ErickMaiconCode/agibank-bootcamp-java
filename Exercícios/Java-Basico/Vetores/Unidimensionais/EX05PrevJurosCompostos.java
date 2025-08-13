package Vetores.Unidimensionais;

public class EX05PrevJurosCompostos {
    public static double[] calcularJurosCompostos(double valorInicial, double taxa, int meses){
        double [] jurosCompostos = new double[meses];

        for(int i = 1; i<=meses; i++){
            jurosCompostos[i-1] = valorInicial*Math.pow((1+taxa),meses);
        }
        return jurosCompostos;
    }

    public static void main(String[] args) {

        double[] previsão = calcularJurosCompostos(1000,0.02,6);
        for(double v: previsão) {
            System.out.printf("A previsão de juros é %.2f \n", v);
        }
    }
}
