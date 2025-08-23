package POO.ClasseAbstrata;

class ContaPoupança extends ContaBancaria {
    public ContaPoupança(int numero, double saldoConta) {
        super(numero, saldoConta);
    }

    @Override
    public void atualizarMensal() {
        setSaldoConta(getSaldoConta()*1.005);
    }
}
