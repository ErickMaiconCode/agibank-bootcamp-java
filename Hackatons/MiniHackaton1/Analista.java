package MiniHackaton1;

public class Analista extends Funcionário {
    private double bonus;
    public Analista(String nome, double salario) {
        super(nome, salario);
        this.bonus = 1000;
    }

    public double getBonus() {
        return bonus;
    }

    //Método para acréscimo de bônus.
    public double salarioFinal(){
        return setSalario(getSalario()+bonus);
    }

}
