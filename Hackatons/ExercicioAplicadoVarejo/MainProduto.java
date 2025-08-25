package ExercicioAplicadoVarejo;

public class MainProduto {
    public static void main(String[] args) {
        ProdutoDigital pd = new ProdutoDigital(232, "PS5 Físico", 3400, "Erick Maicon");
        ProdutoFisico pf = new ProdutoFisico(231, "PS5 Digital", 3400, "Erick Maicon");

        pd.aplicarDesconto(10);
        pd.aumentarPreco(10);
        pf.aplicarDesconto(10);
        pf.aumentarPreco(10);
        pd.calcularFrete();
        pf.calcularFrete();
    }
}
