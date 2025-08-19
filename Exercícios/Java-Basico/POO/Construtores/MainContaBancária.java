package POO.Construtores;

public class MainContaBancária {
    public static void main(String[] args) {
        ContaBancária cb1 = new ContaBancária();
        ContaBancária cb2 = new ContaBancária("Erick", "12345-678");
        ContaBancária cb3 = new ContaBancária("Erick", "12345-678", 10000);

        System.out.println("Conta 1: Titular ----- " + cb1.getTitular() + " Numero da conta: -------- " + cb1.getNumeroConta() + " Saldo ------" + cb1.getSaldo());
        System.out.println("Conta 1: Titular ----- " + cb2.getTitular() + " Numero da conta: -------- " + cb2.getNumeroConta() + " Saldo ------" + cb2.getSaldo());
        System.out.println("Conta 1: Titular ----- " + cb3.getTitular() + " Numero da conta: -------- " + cb3.getNumeroConta() + " Saldo ------" + cb3.getSaldo());
    }
}
