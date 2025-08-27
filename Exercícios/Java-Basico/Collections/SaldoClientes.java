package Collections;

import java.util.HashMap;
import java.util.Map;

public class SaldoClientes {

    public static void adicionarCliente(Map<String, Double> contas, String numeroConta, double saldoInicial){
        contas.put(numeroConta, saldoInicial);
    }

    public static void depositar(Map<String, Double> contas, String numeroConta, double valor){
        if(valor > 0){
            contas.put(numeroConta, contas.getOrDefault(numeroConta, 0.0) + valor);
        }
        else {
            System.out.println("Valor inválido.");
        }
    }

    public static void exibirSaldos(Map<String, Double> contas){
        contas.forEach((conta, saldo) -> System.out.println("Conta " + conta + " Saldo " + saldo));
    }

    public static void main(String[] args) {
        Map<String, Double> contas = new HashMap<>();

        depositar(contas, "12304", 1000);
        depositar(contas, "19404", 1200);
        depositar(contas, "12234", 1400);
        exibirSaldos(contas);
    }
}