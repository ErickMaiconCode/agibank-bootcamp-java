package ExercicioAplicadoVarejo;

public class ProdutoFisico extends Produto {

    public ProdutoFisico(int codigo, String nome, double preco, String clienteComprador) {
        super(codigo, nome, preco, clienteComprador);
    }

    @Override
    public void calcularFrete() {
        setPreco(getPreco() + 20);
        System.out.println("\nFrete de 20 R$ aplicado ao valor final (Produto Físico).");
        System.out.println("Valor final da compra é de R$ " + getPreco());
    }
}
