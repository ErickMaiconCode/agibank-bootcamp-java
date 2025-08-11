package EstruturaPraticos;

import java.util.Scanner;

public class EX09CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saque = 0.0;

        System.out.println("Qual o saldo incial? (R$)");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        while(true){
            System.out.println("Qual valor gostaria de efetuar o saque?");
            System.out.println("Seu saldo atual é de R$ " + saldo);
            saque = scanner.nextDouble();
            scanner.nextLine();

            if(saque < 0){
                System.out.println("Saque cancelado. Obrigado!");
                break;
            } else if(saque > saldo){
                System.out.println("Saldo insuficiente para realizar transação.");
            } else {
                saldo = saldo - saque;
                System.out.println("Saque realizado com sucesso. Seu saldo atual é de R$ " + saldo);
            }
                if(saldo <= 0){
                    System.out.println("Saldo zerado! Conta vazia");
                    break;
            }
        }
        System.out.println("Obrigado por utilizar os serviços Agibank");
        scanner.close();
    }
}
