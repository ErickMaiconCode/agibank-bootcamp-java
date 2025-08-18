package POO.ClassesObjetos;

public class MainFolhadePagamento {
    public static void main(String[] args) {
        FolhadePagamento funcionario1 = new FolhadePagamento();
        funcionario1.nome = "Edson";
        funcionario1.SalarioBruto = 3458.00;
        funcionario1.descontiIR = 123.46;
        funcionario1.descontoINSS = 149.45;

        funcionario1.calcularSalarioLiquido();
        funcionario1.exibirDados();
    }
}
