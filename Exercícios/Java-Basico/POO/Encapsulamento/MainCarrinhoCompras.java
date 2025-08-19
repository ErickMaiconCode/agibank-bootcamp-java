package POO.Encapsulamento;

public class MainCarrinhoCompras {
    public static void main(String[] args) {
        CarrinhoCompras cps = new CarrinhoCompras();

        cps.setProduto("Moletom");
        cps.setPreçoUnitario(29.90);
        cps.setQuantia(10);
        cps.calcularSubtotal(cps.getpreçoUnitario(), cps.getQuantidade());
        cps.exibirExtrato();
    }
}
