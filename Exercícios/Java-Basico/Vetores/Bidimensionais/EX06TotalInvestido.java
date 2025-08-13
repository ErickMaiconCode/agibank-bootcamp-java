package Vetores.Bidimensionais;
/*
Dada uma matriz 3x2 com valores investidos em fundos durante 2 trimestres, crie um método que calcule o total investido em cada fundo (soma das linhas).
double[] calcularTotalPorFundo(double[][] matriz);
 */
import java.util.Arrays;

public class EX06TotalInvestido {
    public static double[] calcularTotalPorFundo(double[][] matriz){
        double[] totalInvestido = new double[matriz[0].length];
        double somaTotal = 0.0;

        for(int i = 0; i < matriz[0].length; i++){
            for (int j = 0; j < matriz.length; j++){
                somaTotal += matriz[j][i];
            }
            totalInvestido[i] = somaTotal;
        }
        return totalInvestido;
    }
    public static void main(String[] args) {
        double [][] investimentos = {
                {350, 500},
                {456, 458},
                {458, 687}
        };
        double [] totalInvestidos = calcularTotalPorFundo(investimentos);
        System.out.println("O total investido em cada Ativo foi de R$ " + Arrays.toString(totalInvestidos));
    }
}
