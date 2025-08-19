package POO.Herança;

public class ClienteVIP extends Cliente{
    private int nivel;
    private double descontoPercentual;

    public ClienteVIP(String nome, String cpf, int nivel, double descontoPercentual) {
        super(nome, cpf);
        this.nivel = nivel;
        this.descontoPercentual = descontoPercentual;
    }
    public double calcularPrecoComDesconto(double preco){
        double valorDesconto = preco*(descontoPercentual/100);
        return preco - valorDesconto;
    }

    public double getDescontoPercentual() {
        return descontoPercentual;
    }

    public int getNivel() {
        return nivel;
    }
}
