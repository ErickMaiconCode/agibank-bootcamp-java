package POO.ClasseAbstrata;

public class MainConta {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaCorrente(3, 1200);
        ContaBancaria c2 = new ContaPoupança(3, 1200);

        c1.atualizarMensal();
        c2.atualizarMensal();

        System.out.println("Saldo CC: " + c1.getSaldoConta());
        System.out.println("Saldo CP: " + c2.getSaldoConta());

    }
}
