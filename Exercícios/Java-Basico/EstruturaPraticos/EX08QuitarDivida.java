package EstruturaPraticos;

import java.util.Scanner;

public class EX08QuitarDivida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int parcela = 1;
        double pagamentoTotal = 0.0;

        System.out.println("Digite o valor da dívida: (R$)");
        double divida = scanner.nextDouble();
        scanner.nextLine();

        while (divida > 0){
            System.out.println("Qual valor deseja pagar esse mês?");
            System.out.println("Parcela atual mês: " + parcela);
            System.out.println("Sua divida atual é de R$ " + divida);
            double pagamento = scanner.nextDouble();
            scanner.nextLine();

            divida = divida - pagamento;

            System.out.println("Parcela mês " + parcela + " paga com sucesso. Saldo restante de de R$ "+ divida);

            parcela++;
        }
        System.out.println("Sua divida foi quitada com sucesso!");
    }
}
