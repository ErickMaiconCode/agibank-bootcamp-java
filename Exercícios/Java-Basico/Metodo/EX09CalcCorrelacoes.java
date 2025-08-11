package Metodo;

public class EX09CalcCorrelacoes {
    public static double calcularCorrelacao(double[] preçosA, double[] preçosB) {
        if (preçosA.length != preçosB.length) {
            return 0.0;
        }
        double somaA = 0.0;
        for (double r : preçosA) {
            somaA = somaA + r;
        }
        double mediaA = somaA / preçosA.length;

        double somaB = 0;
        for (double r : preçosB) {
            somaB = somaB + r;
        }
        double mediaB = somaB / preçosB.length;

        double somaQuadradosA = 0.0;
        for (double r : preçosA) {
            somaQuadradosA = somaQuadradosA + Math.pow(r - mediaA, 2);
        }
        double desvioPadraoA = Math.sqrt(somaQuadradosA / preçosA.length);

        double somaQuadradosB = 0.0;
        for (double r : preçosB) {
            somaQuadradosB = somaQuadradosB + Math.pow(r - mediaB, 2);
        }
        double desvioPadraoB = Math.sqrt(somaQuadradosB / preçosB.length);

        double covariação = 0.0;
        for(int i = 0; i < preçosA.length; i++){
            covariação = (preçosA[i] - mediaA)*(preçosB[i] - mediaB);
        }
        covariação = covariação/preçosA.length;

        if(desvioPadraoA == 0.0 && desvioPadraoB == 0.0){
            return 0.0;
        }
        return covariação/(desvioPadraoA*desvioPadraoB);
    }

    public static void main(String[] args) {
        double [] preçosInicial = {101, 102, 103, 104, 105};
        double [] preçosFinal = {56, 57, 58, 59, 60};

        double covariação = calcularCorrelacao(preçosInicial, preçosFinal);
        System.out.println("A covariação dos preços foi de " + String.format("%.2f", covariação));
    }
}
