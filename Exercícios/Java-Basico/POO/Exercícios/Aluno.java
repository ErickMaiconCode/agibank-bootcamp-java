package POO.Exercícios;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia(){
       // double media = (nota1 + nota2)/2;

        return (nota1+nota2)/2;
    }

    public String verificarSituacao(){

        if(calcularMedia() > 6){
            return "Aluno Aprovado";
        }
        else if(calcularMedia() > 4 && calcularMedia() < 6){
            return "Aluno de Recuperação";
        } else{
            return "Aluno Reprovado";
        }
    }

    public void exibirRelatorio(){
        System.out.println(">>>>Relatório de Aluno<<<<");
        System.out.println("Nome:--------------- " + nome);
        System.out.println("Prova 1:----------- " + nota1);
        System.out.println("Prova 2:----------- " + nota2);
    }
}
