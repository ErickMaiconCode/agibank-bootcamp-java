package Collections;

import java.util.HashSet;
import java.util.Set;

public class ClienteConta{

    public static void adicionarConta(Set<Integer> contas, int numeroConta){
        if(contas.add(numeroConta)){
            System.out.println("Conta " + numeroConta + " adicionada.");
        }
        else{
            System.out.println("Conta já existente");
        }
    }

    public static boolean existeConta(Set<Integer> contas, int numeroConta){
        return contas.contains(numeroConta);
    }

    public static void exibirContas(Set<Integer> contas){
        System.out.println("Contas já existentes " + contas);
    }

    public static void main(String[] args) {
        Set <Integer> contas = new HashSet<>();

        adicionarConta(contas,123);
        adicionarConta(contas,232);
        adicionarConta(contas,211);
        adicionarConta(contas, 211);

        existeConta(contas, 211);
        exibirContas(contas);
    }
}
