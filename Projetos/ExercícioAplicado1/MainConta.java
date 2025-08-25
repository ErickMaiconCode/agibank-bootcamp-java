package ExercícioAplicado1;

public class MainConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("234", "12345-332", 2000);
        ContaPoupança cp = new ContaPoupança("235", "12543-432", 10);

        cc.sacar(2000);
        cc.depositar(400);
        cc.exibirSaldo();

        cp.depositar(200);
        cp.sacar(300);
        cp.aplicarRendimento();
        cp.exibirSaldo();
    }
}
