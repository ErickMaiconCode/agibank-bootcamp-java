package Vetores.Bidimensionais;
/*
Crie um método que encontre a menor taxa de juros numa matriz 2x2 e outro que calcule a média das taxas por mês (média das colunas).
double encontrarMenorTaxa(double[][] matriz);
double[] calcularMediaPorMes(double[][] matriz);
 */
import java.lang.reflect.Array;
import java.util.Arrays;

public class EX07Taxas {
    public static double encontrarMenorTaxa(double[][] matriz){
        double menorTaxa = matriz[0][0];
        for (int i = 0; i <matriz[0].length; i++){
            for (int j = 0; j < matriz.length; j++){
                if (matriz[j][i] < menorTaxa){
                    menorTaxa = matriz[j][i];
                }
            }
        }
        return menorTaxa;
    }
    public static double[] calcularMediaPorMes(double[][] matriz) {
        double[] media = new double[matriz.length];

        for (int i = 0; i < matriz[0].length; i++) {
            double totalTaxas = 0.0;

            for (int j = 0; j < matriz.length; j++) {
                totalTaxas = totalTaxas + matriz[j][i];

            }
            media[i] = totalTaxas / matriz.length;
        }
        return media;
    }
    public static void main(String[] args) {
        double [][] ações = {
                {0.06, 0.07},
                {0.08, 0.08}
        };
        double menorTaxa = encontrarMenorTaxa(ações);
        System.out.printf("A menor taxa encontrada foi no valor de %.2f\n", menorTaxa);

        double[] mediaMes = calcularMediaPorMes(ações);
        System.out.println("As médias de taxas por mês foi de " + Arrays.toString(mediaMes));
    }
}
