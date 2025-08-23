package POO.Polimorfismo.Override;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria[] cb = {
                new ContaCorrente("Erick Maicon", 1000, 20), new ContaPoupança("João Silva", 2500, 0.5)
        };

        for(ContaBancaria contaBancaria: cb){
            contaBancaria.gerarRelatorio();
        }
    }
}
