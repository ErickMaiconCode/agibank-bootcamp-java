package POO.Polimorfismo.Override;

public class EmprestimoEmpresarial extends Emprestimo{
    private double taxaEmpresarial;

    public EmprestimoEmpresarial(double valorEmprestimo, double taxaEmpresarial){
        super(valorEmprestimo);
        this.taxaEmpresarial = taxaEmpresarial;
    }

    @Override
    public double calcularParcela(int meses) {
        return valorEmprestimo*taxaEmpresarial*meses+100;
    }
}
