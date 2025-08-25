package MiniHackaton1;

public class  MainFuncionário {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Ricardo Salles", 4000);
        Analista a1 = new Analista("Fernanda Batista", 2000);

        g1.salarioFinal();
        g1.exibirDados();
        System.out.println("*Bônus para o cargo incluído no valor de R$" + g1.getBonus());

        a1.salarioFinal();
        a1.exibirDados();
        System.out.println("*Bônus para o cargo incluído no valor de R$" + a1.getBonus());
    }
}
