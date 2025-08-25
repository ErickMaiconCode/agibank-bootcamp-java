package ExercicioAplicadoVarejo;

 abstract class Produto implements OperacoesProduto{
     private int codigo;
     private String nome;
     private double preco;
     private String clienteComprador;

     public Produto(int codigo, String nome, double preco, String clienteComprador) {
         this.codigo = codigo;
         this.nome = nome;
         this.preco = preco;
         this.clienteComprador = clienteComprador;
     }

     public double getPreco() {
         return preco;
     }

     public void setPreco(double preco) {
         this.preco = preco;
     }

     public void aplicarDesconto(double percentual){
         if(this.preco > 0 && percentual > 0){
             setPreco(getPreco() - getPreco()*((percentual)/100));
             System.out.println("\nDesconto aplicado em " + percentual + " % de desconto. Preço final de R$ " + getPreco());
         }
         else {
             System.out.println("\nPreço ou desconto percentual inválido.");
         }
     }
     public void aumentarPreco(double percentual){
         if(this.preco > 0 && percentual > 0){
             setPreco(getPreco() + getPreco()*((percentual)/100));
             System.out.println("\nAumento aplicado em " + percentual + " % de desconto. Preço final de R$ " + getPreco());
         }
         else {
             System.out.println("\nPreço ou desconto percentual inválido.");
         }
     }
     public void calcularFrete(){}

}
