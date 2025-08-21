package POO.ClasseAbstrata;

public class MainCartões {
    public static void main(String[] args) {
        CartaoDePagamento c1 = new CartãoDeCredito(12, 1200);
        CartaoDePagamento c2 = new CartaoDeDebito(13, 1200, 1400);

        c1.processarCompra(1401);
        c2.processarCompra(1401);
    }
}
