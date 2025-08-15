package POO.Exercícios;

public class MainProduto {
    public static void main(String[] args) {
        Produto notebook = new Produto();
        notebook.quantidade = 20;
        notebook.preco = 300.00;
        notebook.nome = "Notebook Acer";

        System.out.println(">>>>>>>>>>Adicionando 5 Unidade");
        notebook.adicionarEstoque(5);
        notebook.exibirDados();

        System.out.println(">>>>>>>>>>Retirando 10 produtos");
        notebook.removerEstoque(10);
        notebook.exibirDados();

        Produto tablet = new Produto();
        tablet.quantidade = 30;
        tablet.preco = 200.00;
        tablet.nome = "IPAD 17";

        System.out.println(">>>>>>>>>>Adicionando 10 unidade.");
        tablet.removerEstoque(10);
        tablet.exibirDados();

        System.out.println(">>>>>>>>>>Removendo 5 produtos");
        tablet.removerEstoque(12);
        tablet.exibirDados();

    }
}
