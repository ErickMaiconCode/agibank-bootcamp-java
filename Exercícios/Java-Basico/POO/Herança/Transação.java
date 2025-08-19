package POO.Herança;

public class Transação {
    private String id;
    private double valor;
    private String data;

    public Transação(String id, double valor, String data){
        this.id = id;
        this.valor = valor;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }
}
