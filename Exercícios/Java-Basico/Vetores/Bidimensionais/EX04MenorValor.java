package Vetores.Bidimensionais;

import java.util.Arrays;

public class EX04MenorValor {
    public static double [] encontrarMenorValor(double [][] Matriz) {
        double[] menoresprecos = new double[Matriz[0].length];

        for (int i = 0; i < Matriz[0].length; i++) {
            double menorpreçocoluna = Matriz[0][i];
            for (int j = 0; j < Matriz.length; j++) {
                if (Matriz[j][i] < menorpreçocoluna) {
                    menorpreçocoluna = Matriz[j][i];
                }
            }
            menoresprecos[i] = menorpreçocoluna;
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
