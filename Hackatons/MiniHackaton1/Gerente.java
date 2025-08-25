package MiniHackaton1;

public class Gerente extends Funcionário {
    private final double bonus;

    public Gerente(String nome, double salario) {
        super(nome, salario);
        this.bonus = 2000;
    }

    public double getBonus() {
        return bonus;
    }

    //Método para acréscimo de bônus.
    public double salarioFinal() {
        return setSalario(getSalario() + bonus);
    }

}
