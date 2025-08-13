package Vetores.Bidimensionais;
/*
Dada uma matriz 2x3 com preços de produtos em 2 lojas, crie um método para encontrar o menor preço de cada produto (mínimo por coluna).
double[] encontrarMenorPrecoPorProduto(double[][] matriz);
 */
import java.util.Arrays;

public class EX04MenorValor {
    public static double [] encontrarMenorValor(double [][] Matriz) {
        double[] menoresprecos = new double[Matriz[0].length];

        for (int p = 0; p < Matriz[0].length; p++) {
            double menorpreçocoluna = Matriz[0][p];

            for (int l = 0; l < Matriz.length; l++) {

                if (Matriz[l][p] < menorpreçocoluna) {
                    menorpreçocoluna = Matriz[l][p];
                }
            }
            menoresprecos[p] = menorpreçocoluna;
        }
        return menoresprecos;
    }

    public static void main(String[] args) {
        double [][] matriz = {
                {3, 6, 5},
                {4, 5, 2}
        };
        double [] menorvalor = encontrarMenorValor(matriz);
        System.out.println("\nArray com os menores preços: " + Arrays.toString(menorvalor));

    }
}
