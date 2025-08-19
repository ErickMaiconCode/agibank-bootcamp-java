package POO.Herança;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;

    public ProdutoPerecivel(String código, String nome, double preço, String dataValidade) {
        super(código, nome, preço);
        this.dataValidade = dataValidade;
    }

    public boolean estarVencido(String dataAtual){
        return dataValidade.compareTo(dataAtual)<0;
    }
    public String getDataValidade(){
        return dataValidade;
    }
}
