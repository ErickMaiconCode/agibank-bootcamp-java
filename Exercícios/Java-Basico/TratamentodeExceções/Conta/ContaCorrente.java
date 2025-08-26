package TratamentodeExceções.Conta;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numeroConta, String titular) {
        super(numeroConta, titular);
    }

    @Override
    public void deposito(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor - 0.01*getSaldo());
            System.out.println("Transação feita com sucesso no valor de R$ " + valor );
            System.out.println("Saldo Atual: " + getSaldo());
            System.out.println("Titular: " + getTitular());

        } else {
            System.out.println("Valor de transação inválida");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor < getSaldo()) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Valor de transação inválida");
        }
    }
}
