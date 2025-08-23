package POO.Construtores;

public class TransaçãoFinanceira {
    private String id;
    private String tipo;
    private double valor;

    public TransaçãoFinanceira(String id, String tipo){
        this.id = id;
        this.tipo = tipo;
        this.valor = 0.0;
    }
    public TransaçãoFinanceira(String id, String tipo, double valor){
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }
}
