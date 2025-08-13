package Vetores.Bidimensionais;

import java.util.Arrays;

public class EX05MediaGeralVendas {
    public static double calcularMediaTotal(double [][] matriz){
        double soma = 0.0;
        int elementos = 0;

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                soma = soma + matriz[i][j];
                elementos++;
            }
        }
        return soma/elementos;
    }
    public static double [] somarVendasPorVendedor(double [][] matriz){
        double [] vendaPorVendedor = new double[matriz[0].length];
        for(int i = 0; i < matriz[0].length; i++){
            double somaTotal = 0.0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaTotal = somaTotal + matriz[j][i];
            }
            vendaPorVendedor[i] = somaTotal;
        }
        return vendaPorVendedor;
    }

    public static void main(String[] args) {
    double [][] vendas = {
            {100, 140, 68},
            {300, 500, 300},
            {400, 300, 200}
        };
    double mediageral = calcularMediaTotal(vendas);
        System.out.printf("A media geral de vendas foi de R$ %.2f\n", mediageral);
    double [] vendasVendedores = somarVendasPorVendedor(vendas);
        System.out.println("As vendas por vendedores foi de R$ " + Arrays.toString(vendasVendedores));
    }
}
