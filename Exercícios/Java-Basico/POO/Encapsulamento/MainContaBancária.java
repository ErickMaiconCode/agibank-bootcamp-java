package POO.Encapsulamento;

public class MainContaBancária {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();

        cb.setTitular("Erick");
        cb.setNumeroConta("13984-075");
        cb.depositar(100000);
        cb.sacar(25000);
        cb.ExibirExtrato();
    }
}
