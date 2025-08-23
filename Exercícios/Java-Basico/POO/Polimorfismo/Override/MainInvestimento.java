package POO.Polimorfismo.Override;

public class MainInvestimento {
    public static void main(String[] args) {
        Investimento[] inv = {
                new Poupanca(1000), new CDB(1000)
        };

        for(Investimento investimentos: inv){
            System.out.println("Rendimento: R$ " + investimentos.calcularRendimento());
        }
    }
}
