package Metodo;

public class EX02JurosSimples {
    public static float calcularJurosSimples(float capitalInicial, float jurosAnual,float tempoAnos){
        return capitalInicial*jurosAnual*tempoAnos;
    }

    public static void main(String[] args) {
        float jurosSimples = calcularJurosSimples(10000,0.05f,3);
        System.out.printf("O valor total de juros é R$ %.2f", jurosSimples);
    }
}
