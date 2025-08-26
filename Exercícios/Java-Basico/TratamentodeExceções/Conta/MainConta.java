package TratamentodeExceções.Conta;

import java.util.Scanner;

public class MainConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta[] c1 = {
                new ContaCorrente(12, "Maria"),
                new ContaCorrente(13, "João"),
                new ContaCorrente(14, "Izaque"),
                new ContaCorrente(15, "Alison"),
                new ContaCorrente(16, "Pâmela"),
                new ContaCorrente(17, "Jéssica"),
                new ContaCorrente(18, "Diana"),
                new ContaCorrente(19, "Alex"),
                new ContaCorrente(20, "Edson"),
                new ContaCorrente(21, "Alexandra"),
                new ContaCorrente(22, "Erick"),
        };


        try{
        System.out.println("Qual conta gostaria de consultar? ");
        int indice = scanner.nextInt();
        int indicereal = indice - 1;

        System.out.println("O saldo desta conta é " + c1[indicereal].getSaldo() + " | Titular: " + c1[indicereal].getTitular());
        System.out.println("Qual o valor do depósito?");
        double valor = scanner.nextDouble();
        c1[indicereal].deposito(valor);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERRO: Conta não existente.");
        }
    }
}
