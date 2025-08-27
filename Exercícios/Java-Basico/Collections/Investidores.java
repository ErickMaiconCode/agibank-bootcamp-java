package Collections;

import java.util.HashSet;
import java.util.Set;

public class Investidores {

    public static void adicionarProduto(Set<String> produtos, String nomeProduto){
        if(produtos.add(nomeProduto)){
            System.out.println("Investimento adicionado " + nomeProduto);
        }
        else {
            System.out.println("Investimento já existente.");
        }
    }

    public static void exibirProdutos(Set<String> produtos){
        System.out.println("Produto: " + produtos);
    }

    public static void main(String[] args) {
        Set <String> produtos = new HashSet<>();

        adicionarProduto(produtos, "CDB");
        adicionarProduto(produtos, "LCI");
        adicionarProduto(produtos, "Tesouro Direto");

        exibirProdutos(produtos);

    }
}
