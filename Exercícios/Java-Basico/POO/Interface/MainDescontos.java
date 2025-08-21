package POO.Interface;

public class MainDescontos {
    public static void main(String[] args) {
        IDescontavel produto1 = new ProdutoComum();
        IDescontavel produto2 = new ProdutoPromocional();

        System.out.println("Preço final com desconto no valor de R$ " + produto1.calcularPrecoFinal(1200));
        System.out.println("Preço final com desconto no valor de R$ " + produto2.calcularPrecoFinal(1200));

    }
}
