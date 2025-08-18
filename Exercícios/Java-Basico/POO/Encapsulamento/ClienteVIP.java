package POO.Encapsulamento;

public class ClienteVIP {
    private String nome;
    private String CPF;
    private double limiteCredito;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setcpf(String CPF){
        this.CPF = CPF;
    }
    public String getcpf(){
        return this.CPF;
    }
    public void setLimiteCredito(double lim){
        if(lim < 1000 || lim > 100000){
            System.out.println("Limite não está dentro dos valores pré-estabelecidos");
        } else{
            this.limiteCredito = lim;
        }
    }
    public void exibirCliente(){
        System.out.println("Nome Do Cliente: ---------- " + getNome());
        System.out.println("CPF: ---------------------- " + getcpf());
        System.out.println("Limite de Crédito: -------- " + this.limiteCredito);
    }
}
