package ExercicioAplicadoBancário;

public class ContaPoupança extends Conta {

    public ContaPoupança(int numeroConta, String ClienteTitular) {
        super(numeroConta, ClienteTitular);
    }

    @Override
    public void aplicarJuros() {
        setSaldo(getSaldo()*1.01);
    }
}
