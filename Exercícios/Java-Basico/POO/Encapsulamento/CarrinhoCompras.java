package POO.Encapsulamento;

public class CarrinhoCompras {
    private String produto;
    private int quantidade;
    private double preçoUnitario;

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    public void setQuantia(int quant){
        if(quant < 0){
            System.out.println("Quantidade insuficiente ou igual a 0.");
        }
        else {
            this.quantidade = quant;
        }
    }
    public int getQuantidade(){
        return quantidade;
    }

    public void setPreçoUnitario(double preço){
        if(preço < 0){
            System.out.println("Valor inválido. Digite um valor positivo.");
        }else {
            this.preçoUnitario = preço;
        }
    }
    public double getpreçoUnitario (){
        return preçoUnitario;
    }
    public double calcularSubtotal(double preçoUnitario, int quantidade){
        return preçoUnitario*quantidade;
    }

    public void exibirExtrato(){
        System.out.println("Produto: -----------" + this.produto);
        System.out.println("Preço UN: ----------" + this.preçoUnitario);
        System.out.println("Quantidade: --------" + this.quantidade);
        System.out.println("Valor final: -------" + calcularSubtotal(preçoUnitario, quantidade));
    }
}
