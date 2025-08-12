package Vetores;

public class EX04CalcImpostoSobreCapital {
    public static double [] lucroPorAtivo(double[] compra, double[] venda){
        double [] lucros = new double[compra.length];

        for(int i = 0; i < compra.length; i++){
            lucros[i] = compra[i] - venda[i];
        }
        return lucros;
    }
    public static double lucroTotal(double[] compra, double[] venda){
        double lucroTotal = 0.0;
        double[] variações = lucroPorAtivo(compra, venda);

        for(int i = 0; i < compra.length; i++){
            lucroTotal = lucroTotal + variações[i];
        }
        return lucroTotal;
    }
    public static double calcularImposto(double lucroTotal){
        return lucroTotal>20000?(lucroTotal-20000)*0.15:0;
    }

    public static void main(String[] args) {
        double[] compra = {100,192,394,474,283,173};
        double[] venda = {283,273,123,143,584,483};

        double lucro = lucroTotal(compra, venda);
        System.out.println("Lucro total: R$ " + lucro);
        System.out.println("Imposto devido: R$ " + calcularImposto(lucro));

    }
}
