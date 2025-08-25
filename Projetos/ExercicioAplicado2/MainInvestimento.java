package ExercicioAplicado2;

public class MainInvestimento {
    public static void main(String[] args) {
        CDB c1 = new CDB();
        LCI l1 = new LCI();
        Acao a1 = new Acao();

        c1.valorAplicado = 2000;
        c1.taxaRendimentoAnual = 0.225;
        c1.calcularImposto(450);
        c1.calcularRetornoAnual();
    }
}
