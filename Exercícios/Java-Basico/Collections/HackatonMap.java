package Collections;

import java.util.HashMap;
import java.util.Map;

public class HackatonMap {
    static class Produto{
        private String codigo;
        private String nome;
        private int quantidade;

        public Produto(String codigo, String nome, int quantidade) {
            this.codigo = codigo;
            this.nome = nome;
            this.quantidade = quantidade;
        }

        public String toString(){
            return "Produto:{ Código: " + codigo + " | Nome: " + nome + " | Quantidade: " + quantidade + "}";
        }
    }

    public static void main(String[] args) {
        Map< String, Produto > estoque = new HashMap<>();

        estoque.put("21", new Produto("21", "Faca", 21));
        estoque.put("22", new Produto("22", "Colher", 10));
        estoque.put("23", new Produto("23", "Prato", 18));
        estoque.put("13", new Produto("13", "Garfo", 9));
        estoque.put("20", new Produto("20", "Ovo", 12));

        System.out.println("Produtos em estoque: ");
        for(Produto p: estoque.values()) System.out.println(p);

        String codigoBusca = "21";
        Produto p = estoque.get(codigoBusca);
        if(p!= null) System.out.println("Produto encontrado: " + p);
        else System.out.println("Produto não encontrado");
    }

}
