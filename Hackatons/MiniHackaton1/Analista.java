package MiniHackaton1;

public class Analista extends Funcionário {
    private double bonus;
    public Analista(String nome, double salario) {
        super(nome, salario);
        this.bonus = 1000;
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(salario);
    }

    public double getBonus() {
        return bonus;
    }

    //Método para acréscimo de bônus.
    public void salarioFinal(){
        setSalario(getSalario()+bonus);
    }

}
