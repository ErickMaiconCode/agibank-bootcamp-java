package ExercicioAplicadoVarejo;

public class ProdutoDigital extends Produto{
    public ProdutoDigital(int codigo, String nome, double preco, String clienteComprador) {
        super(codigo, nome, preco, clienteComprador);
    }

    @Override
    public void calcularFrete() {
        System.out.println("\nValor de frete não aplicável a categoria de produtos digitais.");
    }
}
