package POO.Herança;

public class MainCliente {
    public static void main(String[] args) {
        ClienteVIP c1 = new ClienteVIP("Erick Maicon Lima de Almeida","000.000.000-00",3,20);
        double preçoOriginal = 1000;
        double preçoFinal = c1.calcularPrecoComDesconto(preçoOriginal);

        System.out.println("Nome Completo: " + c1.getNome());
        System.out.println("CPF: " + c1.getCpf());
        System.out.println("Nível de Ingresso: " + c1.getNivel());
        System.out.println("Desconto Aplicado(%): " + c1.getDescontoPercentual());
        System.out.println("Valor Inicial sem Desconto(R$) " + preçoOriginal);
        System.out.println("Valor final R$ " + preçoFinal);
    }
}
