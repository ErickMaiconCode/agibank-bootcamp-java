package POO.Herança;

public class TransferênciaBancária extends Transação {
    private String contaOrigem;
    private String contaDestino;
    public TransferênciaBancária(String id, double valor, String data, String contaOrigem, String contaDestino) {
        super(id, valor, data);
        this.contaDestino = contaDestino;
        this.contaOrigem = contaOrigem;
    }
    public String transferênciaEntreContas(){
        return "Transferência de R$ " + getValor() + " feita de conta " + contaOrigem + " para " + contaDestino;
    }
}
