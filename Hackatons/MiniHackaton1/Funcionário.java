package MiniHackaton1;

/*
Erick Maicon Lima de Almeida - 25/08
 */

public class Funcionário {
    private String nome;
    private double salario;

    //Construtor
    public Funcionário(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Método para exibir dados
    public void exibirDados(){
        System.out.println("\n|-------------------- HOLERITE - FOLHA DE PAGAMENTO--------------|");
        System.out.println("|Nome do Funcionário: --------------------------------" + getNome());
        System.out.println("|Salário Líquido (R$): -------------------------------" + getSalario());
        System.out.println("|-- Salário Líquido com bônus de acréscimo do cargo referente.---|");
    }
}


