package MiniHackaton2;

public class MainInvestimento {
    public static void main(String[] args) {
        Investimento[] cb = {
                new RendaFixa(1000), new RendaVariavel(1000)
        };

        for(Investimento c: cb){
            System.out.println("Os valores finais dos rendimentos foi de R$ "+ c.calcularRendimento());
        }
    }
}
