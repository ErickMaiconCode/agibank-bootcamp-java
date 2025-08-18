package POO.ClassesObjetos;

public class FolhadePagamento {
    public String nome;
    public double SalarioBruto;
    public double descontoINSS;
    public double descontiIR;

    public double calcularSalarioLiquido(){
        return SalarioBruto - descontoINSS - descontiIR;
    }

    public void exibirDados(){
        System.out.println("|------- FOLHA DE PAGAMENTO ---------|");
        System.out.println("|Salário Bruto (R$): -------------" + this.SalarioBruto);
        System.out.println("|Desconto INSS (R$): -------------" + this.descontoINSS);
        System.out.println("|Desconto IR (R$): ---------------" + this.descontiIR);
        System.out.println("|Salário Líquido (R$): -----------" + this.calcularSalarioLiquido());
    }
}
