package EstruturaPraticos;

import java.util.Scanner;

public class EX10ConversãoMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limite = 1000;
        double dolar = 5;

        while (true) {
            System.out.println("Qual valor deseja converter de reais em dolares? ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            if (valor < 0) {
                System.out.println("Valor inválido. Transação encerrada. ");
                break;
            } else if (valor > limite) {
                System.out.println("Valor limite diário de R$ 1000,00 atingido. Transação encerrada.");
                break;
            } else {
                limite = limite - valor;
                double conversão = valor / dolar;
                System.out.println("Conversão feita com sucesso. O valor convertido em dólares foi de U$ " + conversão + ". Seu limite atual é de: R$ " + limite);
            }
            if (limite <= 0) {
                System.out.println("Valor limite diário de R$ 1000,00 atingido. Transação encerrada.");
                break;
            }
            System.out.println("Muito obrigado por utilizar os serviços Agibank.");
            scanner.close();
        }
    }
}
