package Metodo;

public class EX03CalcCrescimento {
    public static float calcularCrescimento(float valorInicial, float valorFinal){
        return ((valorFinal - valorInicial)/valorInicial)*100;
    }

    public static void main(String[] args) {
        float variacao = calcularCrescimento(100.00f,105.00f);
        System.out.printf("A variação em percentual é de %.2f%%", variacao);
    }
}
