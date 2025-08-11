package Metodo;

public class EX06CalcVolatilidade {
    public static double calculaVolatilidade(double [] retornos){
        double soma = 0.0;

        for(double r : retornos){
            soma = soma + r;
        }
        double media = soma/ retornos.length;
        double somaQuadrados = 0;

        for(double r: retornos){
        somaQuadrados = somaQuadrados + Math.pow(r - media, 2);
        }
        return Math.sqrt(somaQuadrados/ retornos.length);
    }

    public static void main(String[] args) {
        double [] retornoDeAtivos = {0.01, 0.02, -0.01, 0.03, -0.02};

        double volatilidade = calculaVolatilidade(retornoDeAtivos);

        System.out.println("A volatilidade é de: " + String.format("%.2f", volatilidade));
    }
}
