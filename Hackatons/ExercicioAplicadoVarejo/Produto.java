package ExercicioAplicadoVarejo;

public abstract class Produto implements OperaçõesProduto{
    private int codigo;
    private String nome;
    private String ClienteComprador;
    private double preco;

    public Produto(int codigo, String nome, String clienteComprador, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.ClienteComprador = clienteComprador;
        this.preco = preco;
    }

    public double getPreco(){
        return preco;
    }

    protected void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void aplicarDesconto(double percentual){
        if(preco > 0){
            setPreco(getPreco()+getPreco()*percentual);
        }
        else{
            System.out.println("Valor de produto inválido.");
        }
    }

    public void aumentarPreco(double percentual){
        if(preco > 0){
            setPreco(getPreco()+getPreco()+percentual);
        }
        else{
            System.out.println("Valor de produto inválido.");
        }
    }

}
