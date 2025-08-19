package POO.Herança;

public class MainProduto {
    public static void main(String[] args) {
        ProdutoPerecivel p1 = new ProdutoPerecivel("12345", "Iogurte",12.50, "2025-08-20");
        System.out.println("| Código Do Produto: " + p1.getCódigo() + "| Nome do Produto: " + p1.getNome() + "| Preço do Produto: " + p1.getPreço());
        System.out.println("Vencido em 2025-08-20 ?" + p1.estarVencido("2025-08-19"));
    }
}
