package Metodo;

import java.util.Arrays;

public class EX04MediaMovel {
    public static double[] calcularMediaMovel(double[] preço, int intervalos) {
        int n = preço.length - intervalos + 1;
        double[] medias = new double[n];

        for (int i = 0; i < n; i++) {
            double soma = 0.0;

            for (int j = 0; j < intervalos; j++) {
                soma = soma + preço[i + j];
            }
            medias[i] = soma / intervalos;
        }
        return medias;
    }
    public static void main(String[] args) {
        double [] preço ={101,102,103,104,105};
        int intervalo = 3;

        double[] mediaMovel = calcularMediaMovel(preço, intervalo);
        System.out.println("Os preços originais foi de R$ " + Arrays.toString(preço));
        System.out.println("O intervalo foi de " + intervalo);
        System.out.println("A média de valores foi de R$ " + Arrays.toString(mediaMovel));
    }
}
