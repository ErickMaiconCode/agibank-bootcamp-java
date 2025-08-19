package POO.Encapsulamento;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public void setProduto(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setPreco(double preco){
        if(preco < 0){
            System.out.println("Valor de preço inválido");
        } else {
            this.preco = preco;
        }
    }
    public double getPreco(){
        return this.preco;
    }
    public void AdicionarEstoque(int quantidade){
        this.estoque += quantidade;
    }
    public void RemoverEstoque(int quantidade){
        this.estoque -= quantidade;
    }
    public int getEstoque() {
        return estoque;
    }

    public void exibirProduto(){
        System.out.println("Nome do Produto: ---------" + this.nome);
        System.out.println("Preço do Produto: --------" + this.preco);
        System.out.println("Quantidade Estoque: ------" + this.estoque);
    }
}
