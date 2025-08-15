package POO.Exercícios;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Erick Maicon";
        aluno1.nota1 = 9.5;
        aluno1.nota2 = 9.6;

        aluno1.exibirRelatorio();
        System.out.println(">>>>Situação Aluno<<<<<");
        aluno1.calcularMedia();
        System.out.println(aluno1.verificarSituacao());

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Pamela Ferreira";
        aluno2.nota1 = 4.5;
        aluno2.nota2 = 5;

        aluno2.exibirRelatorio();
        System.out.println(">>>>Situação Aluno<<<<<");
        aluno2.calcularMedia();
        System.out.println(aluno2.verificarSituacao());
    }
}