package Vetores.Bidimensionais;
/*
Dada uma matriz 3x2 com quantidade de produtos vendidos por vendedor e mês, crie um método para somar o total vendido por mês (soma das colunas).
int[] somarVendasPorMes(int[][] matriz);
 */
import java.util.Arrays;

public class EX08TotalVendidoMes {
    public static int[] somarVendasPorMes(int[][] matriz){
        int [] meses = new int[matriz.length];

        for(int i = 0; i < matriz[0].length; i++){
            int produtos = 0;
            for (int j = 0; j < matriz.length; j++) {
                produtos = produtos + matriz[j][i];
            }
            meses[i] = produtos;
        }
        return meses;
    }
    public static void main(String[] args) {
        int [][] vendasMes = {
                {101, 235},
                {245, 125}
        };
        int [] quantiaProdutos = somarVendasPorMes(vendasMes);
        System.out.println("O total vendido por mês foi de " + Arrays.toString(quantiaProdutos));
    }
}
