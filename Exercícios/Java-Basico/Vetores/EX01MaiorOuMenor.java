package Vetores;

public class EX01MaiorOuMenor {
    public static double maiorPreço(double [] preço) {
        double maior = preço[0];

        for (int i = 0; i < preço.length; i++) {
            if (preço[i] > maior) {
                maior = preço[i];
            }
        }
        return maior;
    }
    public static double menorPreço(double [] preço){
        double menor = preço[0];

        for(int i = 0; i < preço.length; i++){
            if(preço[i] < menor){
                menor = preço[i];
            }
        }
        return menor;
    }
    public static void main(String[] args) {
        double[] vendas = {110, 129, 128, 123, 145, 134, 167, 187, 123, 134};

        double menoresvendas = menorPreço(vendas);
        double maioresvendas = maiorPreço(vendas);

        System.out.println("As vendas maiores foram R$ " + maioresvendas);
        System.out.println("As vendas maiores foram R$ " + menoresvendas);
    }
}
