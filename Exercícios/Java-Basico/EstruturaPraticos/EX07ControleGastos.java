package EstruturaPraticos;

import java.util.Scanner;

public class EX07ControleGastos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gastoTotal = 0.0;
        double despesa = 0.0;
        boolean alertalimite = false;

        while (true) {
            System.out.println("|-----CONTROLE DE GASTOS-------|");
            System.out.println("|----DIGITE O VALOR GASTO------|");
            System.out.println("|-- Despesa total: ------- R$ " + gastoTotal);
            System.out.println("|-- Limite: -------- R$ 5.000,00");
            System.out.println("Digite um gasto (ou valor negativo para sair): ");
            despesa = scanner.nextDouble();
            scanner.nextLine();

            if (despesa < 0) {
                break;
            }

            gastoTotal = gastoTotal + despesa;

            if (gastoTotal > 5000 && !alertalimite) {
                System.out.println("Seu gastos atingiram o valor limite de 5 mil reais");
                alertalimite = true;
            }
        }
        System.out.println("\n------------------------------");
        System.out.println("Total gasto: R$ " + String.format("%.2f", gastoTotal));
        System.out.println("------------------------------");

        scanner.close();
    }
}