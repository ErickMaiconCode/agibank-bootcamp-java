package ExercicioAplicadoBancário;

public class MainCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("123.456.789-00", "Maria das Neves");

        Conta cc = new ContaCorrente(123456123, "Maria Das Neves");
        Conta cp = new ContaPoupança(987432323, "Maria Das Neves");

        cc.sacar(1200);
        cp.depositar(1200);

        cp.aplicarJuros();
        cc.aplicarJuros();

        System.out.println("\nValor atual da Conta Corrente R$ " + cc.getSaldo());
        System.out.println("Valor atual da Conta Poupança R$ " + cp.getSaldo());
    }
}
