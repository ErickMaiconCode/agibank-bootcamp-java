package ExercicioAplicadoBancário;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numeroConta, String ClienteTitular) {
        super(numeroConta, ClienteTitular);
    }

    @Override
    public void aplicarJuros() {
        System.out.println("Conta Corrente: Categoria de conta não possui juros ou taxas aplicáveis");
    }

}
