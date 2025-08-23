package POO.ClasseAbstrata;

abstract class ContaBancaria {
    protected int numero;
    protected double saldoConta;

    public ContaBancaria(int numero, double saldoConta){
        this.numero = numero;
        this.saldoConta = saldoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }
    public int getNumero(){
        return numero;
    }

    protected void setSaldoConta(double saldoConta){
        this.saldoConta = saldoConta;
    }

    public abstract void atualizarMensal();
}
