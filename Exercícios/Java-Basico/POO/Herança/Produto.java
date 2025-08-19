package POO.Herança;

public class Produto {
    private String código;
    private String nome;
    private double preço;

    public Produto(String código, String nome, double preço){
        this.código = código;
        this.nome = nome;
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }

    public String getCódigo() {
        return código;
    }
}
