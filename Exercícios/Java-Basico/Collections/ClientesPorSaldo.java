package Collections;

import java.util.*;

class Cliente{
    String nome;
    double saldo;

    public Cliente(String nome, double saldo){
        this.nome = nome;
         this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return nome + " R$ " + saldo;
    }
}
public class ClientesPorSaldo {

    public static void adicionarCliente(List<Cliente> clientes, String nome, double saldo){
        clientes.add(new Cliente(nome, saldo));
    }

    public static void ordenarPorSaldo(List<Cliente> clientes){
        clientes.sort((c1, c2) -> Double.compare(c2.saldo, c1.saldo));
    }

    public static void exibirClientes(List<Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List< Cliente > clientes = new ArrayList<>();
        adicionarCliente(clientes, "Erick", 2000);
        adicionarCliente(clientes, "Davi", 1000 );
        adicionarCliente(clientes, "Matheus", 500);
        adicionarCliente(clientes, "Alisson", 3000);

        ordenarPorSaldo(clientes);
        exibirClientes(clientes);
    }
}
