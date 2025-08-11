package Metodo;

import java.util.Random;

public class EX10SimMonteCarlo {
    public static double [] simularPrecoMonteCarlo(double preçoinicial, double retorno, double volatilidade, int periodos){
        Random random = new Random();
        double [] simulacaoPrecos = new double[periodos + 1];

        simulacaoPrecos[0] = preçoinicial;

        for(int i = 1; i < periodos; i++){
            double z = random.nextGaussian();
            double retornoperiodo = retorno + volatilidade * z;

            double preçoAnterior = simulacaoPrecos[i - 1];
            double novopreço = preçoAnterior*(1 + retornoperiodo);

            simulacaoPrecos[i] = novopreço;
        }
        return simulacaoPrecos;
    }

    public static void main(String[] args) {
        double preçoInicio = 1000;
        int periodo = 12;
        double retornoMedio = 0.002;
        double Volatilidade = 0.02;

        double [] simulação = simularPrecoMonteCarlo(preçoInicio, retornoMedio, Volatilidade, periodo);
        System.out.println("A variação de preço foi de: ");
        for(double preco: simulação){
            System.out.println(String.format("%.2f", preco));
        }
    }
}
