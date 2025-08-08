package Metodo;

public class EX01ConvMoeda {
    public static float converterMoeda(float reais,float taxaconversao){
        return reais/taxaconversao;
    }

    public static void main(String[] args) {
        float valorDol = converterMoeda(100,4.9f);
        System.out.printf("O valor em dólar é de U$ %.2f", valorDol);
    }
}
