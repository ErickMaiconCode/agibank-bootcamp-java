package POO.Polimorfismo.Override;

public class Emprestimo {
    protected double valorEmprestimo;

    public Emprestimo(double valorEmprestimo){
        this.valorEmprestimo = valorEmprestimo;
    }

    public double calcularParcela(int meses){
        return valorEmprestimo/meses;
    }
}
