package Vetores.Bidimensionais;
/*
Dada uma matriz 3x4 que representa dívidas mensais de 3 clientes em 4 meses, crie um método para encontrar o maior valor da matriz.
double encontrarMaiorValor(double[][] matriz);
 */
public class EX02MaiorValor {
    public static double encontrarMaiorValor(double[][] matriz) {
        double maiorvalor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorvalor) {
                    maiorvalor = matriz[i][j];
                }
            }
        }
        return maiorvalor;
    }

    public static void main(String[] args) {
        double[][] matriz = {
                {60, 90, 50},
                {70, 65, 67},
                {45, 50, 12}
        };
        double maiorvalor = encontrarMaiorValor(matriz);
        System.out.printf("O maior valor da matriz é %.2f", maiorvalor);
    }
}
