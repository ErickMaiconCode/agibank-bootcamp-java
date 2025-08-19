package POO.Encapsulamento;

public class MainProduto {
    public static void main(String[] args) {
        Produto P1 = new Produto();

        P1.setProduto("Faca");
        P1.setPreco(15.45);
        P1.AdicionarEstoque(10);
        P1.RemoverEstoque(2);
        P1.exibirProduto();
    }
}
