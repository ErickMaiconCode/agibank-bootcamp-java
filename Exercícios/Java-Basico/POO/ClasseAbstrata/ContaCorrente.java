package POO.ClasseAbstrata;

 class ContaCorrente extends ContaBancaria {
     public ContaCorrente(int numero, double saldoConta) {
         super(numero, saldoConta);
     }

     @Override
     public void atualizarMensal() {
        setSaldoConta(getSaldoConta() - 15);
     }
 }
