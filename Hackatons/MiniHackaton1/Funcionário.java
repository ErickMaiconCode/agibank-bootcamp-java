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

    public double setSalario(double salario) {
        this.salario = salario;
        return salario;
    }

    //Método para exibir dados
    public void exibirDados(){
        System.out.println("\n|-------------------- HOLERITE - FOLHA DE PAGAMENTO--------------|");
        System.out.println("|Nome do Funcionário: --------------------------------" + getNome());
        System.out.println("|Salário Líquido (R$): -------------------------------" + getSalario());
        System.out.println("|-- Salário Líquido com bônus de acréscimo do cargo referente.---|");
    }
}
//Grade Correção:
// 1) 20 - top
// 2) 20 - só um detalhe que Setter normalmente não tem retorno, mas não tirei ponto :)
// 3) 10 - top
// 4) 20 - top
// 5) 20 - Tirei um teco pq tu usou BONUS como atributo, permite que...
// ...o User/dev altere o valor do bonus, mas é fixo :(, tinha que ter um getBonus com valor fixo de 1000 e 2000
//6) 10 - top

// Total : 100 ;)

