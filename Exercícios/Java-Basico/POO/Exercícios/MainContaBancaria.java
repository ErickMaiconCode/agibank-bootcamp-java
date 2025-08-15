package POO.Exercícios;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria Usuário1 = new ContaBancaria();
        Usuário1.saldo = 1000.00;
        Usuário1.numerodeconta = "9849-384";
        Usuário1.titular = "Ana";

        System.out.println(">>>>>>> Depósito Efetuado <<<<<<<");
        Usuário1.depositar(350);
        Usuário1.exibirsaldo();

        System.out.println(">>>>>>>>> Saque Efetuado <<<<<<<<");
        Usuário1.sacar(429);
        Usuário1.exibirsaldo();

        ContaBancaria Usuário2 = new ContaBancaria();
        Usuário2.saldo = 1000.00;
        Usuário2.numerodeconta = "3931-943";
        Usuário2.titular = "Francisco";

        System.out.println(">>>>> Depósito Efetuado <<<<<<<");
        Usuário2.depositar(2933);
        Usuário2.exibirsaldo();

        System.out.println(">>>>> Saque Efetuado <<<<<<<");
        Usuário2.sacar(2737);
        Usuário2.exibirsaldo();


    }
}
