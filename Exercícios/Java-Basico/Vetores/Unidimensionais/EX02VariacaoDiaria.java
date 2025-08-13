package Vetores.Unidimensionais;

public class EX02VariacaoDiaria {
    public static double [] variacaoDiaria(double[] precos){
        double[]variação = new double[precos.length-1];
        for (int i = 0; i < precos.length -1; i++) {
           variação[i] = ((precos[i + 1] - precos[i] )/precos[i])*100;
        }
        return variação;
    }

    public static void main(String[] args) {
        double[] valores = {101, 189, 293, 127, 182};

        double[] percentVariação = variacaoDiaria(valores);

        for(double v: percentVariação) {
            System.out.println("A variação foi de: " + v);
        }
    }
}
