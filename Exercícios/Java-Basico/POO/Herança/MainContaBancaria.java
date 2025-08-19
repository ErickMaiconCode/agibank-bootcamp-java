package POO.Herança;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Erick", "12345-678", 2450);
        System.out.println("Saldo Inicial: R$ " + cc.getSaldo());

        boolean saque = cc.sacarComChequeEspecial(2450);
        System.out.println("Saque de R$ 2.400,00" + (saque?" Autorizado":" Negado"));
        System.out.println("Saldo atual R$ " + cc.getSaldo());
    }
}
