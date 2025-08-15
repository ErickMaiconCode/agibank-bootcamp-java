package POO.Exercícios;

import java.util.Scanner;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    // Método para adicionar Estoque
    public void adicionarEstoque(int quantidade){
        this.quantidade = this.quantidade + quantidade;
    }
    // Método para remover Estoque
    public void removerEstoque(int quantidade){
        this.quantidade = this.quantidade - quantidade;
    }
    // Método para exibir informações
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade + " UN");
    }
}
