package Vetores.Bidimensionais;

import java.util.Arrays;

/*
Crie um método que calcule o saldo total acumulado numa matriz 2x3 e outro método que calcule o saldo máximo por conta (máximo por linha).
double calcularSaldoTotal(double[][] matriz);
double[] encontrarMaximoPorConta(double[][] matriz);
 */
public class EX09Saldo {
    public static double calcularSaldoTotal(double[][] matriz){
        double somatotal = 0.0;

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                somatotal = somatotal + matriz[i][j];
            }
        }
        return somatotal;
    }
    public static double[] encontrarMaximoPorConta(double[][] matriz) {
        double [] saldoMaximo = new double[matriz.length];

        for(int i = 0; i < matriz.length; i++){
            double totalConta = matriz[i][0];
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > totalConta)
                totalConta = matriz[i][j];
            }
            saldoMaximo[i] = totalConta;
        }
        return saldoMaximo;
    }
    public static void main(String[] args) {
        double [][] saldosContas = {
                {200, 300, 400},
                {300, 100, 200}
        };
        System.out.println("O valor total das contas foi de R$ " + calcularSaldoTotal(saldosContas));
        System.out.println("O saldo máximo de cada conta é de R$ " + Arrays.toString(encontrarMaximoPorConta(saldosContas)));
    }
}