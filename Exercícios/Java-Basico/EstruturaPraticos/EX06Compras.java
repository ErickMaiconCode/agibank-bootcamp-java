package EstruturaPraticos;

import java.util.Scanner;

public class EX06Compras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double descontoPercentual = 0.0;
        double valorDoDesconto = 0.0;
        double valorFinal = 0.0;

        System.out.println("Qual o valor da compra? (R$) ");
        double compra = scanner.nextDouble();
        scanner.nextLine();

        if (compra >= 300) {
            if (compra <= 500) {
                descontoPercentual = 0.05;
            } else if (compra >= 501 && compra <= 1000) {
                descontoPercentual = 0.10;
            } else {
                descontoPercentual = 0.12;
            }

            valorDoDesconto = compra * descontoPercentual;
            valorFinal = compra - valorDoDesconto;

            System.out.println("\n-------------------------------------------");
            System.out.println("Valor da compra: R$ " + String.format("%.2f", compra));
            System.out.println("Desconto de: " + (descontoPercentual * 100) + "%");
            System.out.println("Valor do desconto: R$ " + String.format("%.2f", valorDoDesconto));
            System.out.println("Valor final a pagar: R$ " + String.format("%.2f", valorFinal));
            System.out.println("-------------------------------------------");
        } else {
            System.out.println("\n-------------------------------------------");
            System.out.println("Valor da compra: R$ " + String.format("%.2f", compra));
            System.out.println("Nenhum desconto aplicado. O desconto é válido para compras acima de R$ 300,00.");
            System.out.println("Valor final a pagar: R$ " + String.format("%.2f", compra));
            System.out.println("-------------------------------------------");
        }

        System.out.println("\nMuito obrigado pela compra. Volte Sempre!");
        scanner.close();
    }
}