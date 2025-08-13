package Vetores.Bidimensionais;

import java.util.Scanner;
/*
Crie um método para preencher uma matriz 2x2 com receitas e despesas. Depois, crie um método que calcule a soma total de todos os elementos da matriz.
void preencherMatriz(double[][] matriz);
double calcularSomaTotal(double[][] matriz);
 */
public class EX01ReceitasEDespesas {
    public static double calcularSomaTotal(double[][] matriz) {
        double valorTotal = 0.0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                valorTotal = valorTotal + matriz[i][j];
            }
        }
        return valorTotal;
    }
    public static void preenchermatriz(double [][] matriz){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = scanner.nextDouble();
            }
        }
    }

    public static void main(String[] args) {
        double[][] matriz = new double[2][2];
        preenchermatriz(matriz);
        double somatotal = calcularSomaTotal(matriz);
    System.out.println("A soma total dos elementos das matrizes é: " + somatotal);
    }
}
