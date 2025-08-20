package POO.Polimorfismo.Override;

public class MainEmprestimo {
    public static void main(String[] args) {
        Emprestimo[] emp = {
                new EmprestimoPessoal(1000, 0.02), new EmprestimoEmpresarial(1000, 0.01)
        };

        for(Emprestimo em: emp)
            System.out.println("Valor de juros em R$ é de " + (em.calcularParcela(12)));
    }
}
