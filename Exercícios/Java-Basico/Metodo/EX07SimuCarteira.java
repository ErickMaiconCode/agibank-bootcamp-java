package Metodo;

public class EX07SimuCarteira {
    public static double simularCarteira(double []ativos, double[] investimentos) {
        double soma = 0.0;

        for(int i = 0; i < ativos.length; i++){
            soma = soma + ativos[i]*(1+investimentos[i]);
        }
        return soma;
    }

    public static void main(String[] args) {
        double [] aplicações = {1500, 1400, 1800, 700};
        double [] investimoAplicações = {0.05, 0.04, 0.08, 0.09};

        double simularInvestimento = simularCarteira(aplicações, investimoAplicações);

        System.out.println("O valor final dos investimentos é de: " + simularInvestimento);
    }
}
