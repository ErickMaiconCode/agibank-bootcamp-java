package POO.Polimorfismo.Override;

public class EmprestimoPessoal extends Emprestimo{
    private double taxaPessoal;

    public EmprestimoPessoal(double valorEmprestimo, double taxaPessoal){
        super(valorEmprestimo);
        this.taxaPessoal = taxaPessoal;
    }

    @Override
    public double calcularParcela(int meses) {
        return valorEmprestimo*taxaPessoal*meses;
    }
}
