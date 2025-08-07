import java.util.Scanner;

public class EX05AproRepro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a nota do aluno? ");
        float notaAluno = scanner.nextFloat();
        scanner.nextLine();

        if(notaAluno >= 6){
            System.out.println("Aluno aprovado");
        } else if (notaAluno >= 4 && notaAluno<6) {
            System.out.println("Aluno está de recuperação");
        }else{
            System.out.println("Aluno reprovado");
        }
    }
}
