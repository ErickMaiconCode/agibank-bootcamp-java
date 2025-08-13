package Vetores.Bidimensionais;
/*
Crie um método que calcule o total de saldos de uma matriz 3x2 (clientes x meses) e outro método que calcule o saldo médio por cliente (média das linhas).
double calcularSaldoTotal(double[][] matriz);
double[] calcularMediaPorCliente(double[][] matriz)
 */
public class EX03SaldoMedio {
    public static double calcularSaldoTotal(double[][] matriz){
        double total = 0.0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++) {
                total = total + matriz[i][j];
            }
        }
        return total;
    }
    public static double[] calcularMediaPorCliente(double[][] matriz){
        double[] mediaclientes = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++){
            double somaCliente = 0.0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaCliente = somaCliente + matriz [i][j];
            }
            mediaclientes[i] = somaCliente/matriz[i].length;
        }
        return mediaclientes;
    }

    public static void main(String[] args) {
        double [][] matriz = {
                {300, 500, 400},
                {450, 394, 482},
                {293, 492, 192}
        };
        double valorfinal = calcularSaldoTotal(matriz);
        double[] mediaCliente = calcularMediaPorCliente(matriz);

        System.out.println("O saldo total dos clientes é de R$ " + valorfinal);
        for(int i = 0; i < matriz.length; i++){
            System.out.printf("A média de valores para o cliente " + (i + 1) + " é de R$ %.2f\n", mediaCliente[i]);
        }
    }
}
