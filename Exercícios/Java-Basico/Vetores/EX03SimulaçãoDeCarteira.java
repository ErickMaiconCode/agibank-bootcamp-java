package Vetores;

public class EX03SimulaçãoDeCarteira {
    public static double totalInvestido(double[] carteira) {
        double valorInvestido = 0.0;

        for(int i = 0; i < carteira.length; i++){
            valorInvestido = valorInvestido + carteira[i];
        }
        return valorInvestido;

    }
    public static double[] percentualAção(double[] carteira){
        double valorTotal = totalInvestido(carteira);
        double [] porcentagem = new double[carteira.length];

        for(int i = 0; i < carteira.length; i++){
            porcentagem[i] = (carteira[i]/valorTotal)*100;
        }
        return porcentagem;
    }

    public static void main(String[] args) {
        double[] açõesInvestidas = {101, 140, 148, 283, 394, 574};
        double valorInvestido = totalInvestido(açõesInvestidas);
        double[] percentual = percentualAção(açõesInvestidas);

        System.out.println("O valor total investido foi de R$ "+ valorInvestido);
        for(double v: percentual)
        System.out.println("O percentual de cada ação sobre o total investido é " + v);
    }
}
