import java.util.Scanner;

public class caixaeletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoConta = 1000.0;
        int transacao;
        double valorTransacao;
        String continuar = "s";
        double totalDeposito = 0.0;
        double totalSaque = 0.0;

        while(continuar.equals("s")) {
            System.out.println("|---------- SEJA BEM VINDO AO SERVIÇOS DIGITAIS AGIBANK---------|");
            System.out.println("|O saldo atual da sua conta é no valor de: R$ " + String.format("%.2f", saldoConta) + "-----------|");
            System.out.println("|-----------Qual transação deseja efetuar?----------------------|");
            System.out.println("| 1 - Depósito");
            System.out.println("| 2 - Saque");
            System.out.println("| 3 - Encerrar transação");
            transacao = scanner.nextInt();

            scanner.nextLine();

            if (transacao == 1) {
                    System.out.println("Qual o valor desejado para depósito?");
                    valorTransacao = scanner.nextDouble();
                    scanner.nextLine();

                    if (valorTransacao <= 0) {
                        System.out.println("Valor inválido. Transação cancelada");
                    } else {
                        saldoConta = saldoConta + valorTransacao;
                        totalDeposito = totalDeposito + valorTransacao;
                        System.out.println("Transação Concluida com Sucesso. Seu saldo atual é de R$ " + String.format("%.2f", saldoConta));
                    }
                } else if (transacao == 2) {
                    System.out.println("Qual o valor desejado para saque?");
                    valorTransacao = scanner.nextDouble();
                    scanner.nextLine();

                    if (valorTransacao <= 0) {
                        System.out.println("Valor inválido. Transação cancelada");
                    } else if (valorTransacao > saldoConta) {
                        System.out.println("Saldo Insuficiente. Transação cancelada");
                    } else {
                        saldoConta = saldoConta - valorTransacao;
                        totalSaque = totalSaque + valorTransacao;
                        System.out.println("Transação Concluida com Sucesso. Seu saldo atual é de R$ " + String.format("%.2f", saldoConta));
                    }
                } else if (transacao == 3) {
                    continuar = "n";
                    System.out.println("Transação encerrada");
                } else {
                    System.out.println("Opção inválida. Escolha dentre as opções descritas acima.");
                }

                if (continuar.equals("s")) {
                    System.out.println("\nDeseja realizar outra transação? (s/n)");
                    continuar = scanner.nextLine();
                }

        }


        System.out.println("|---------------- EXTRATO BANCÁRIO-----------------|");
        System.out.println("|Total Depósitos: -----------------------" + String.format("%.2f", totalDeposito) + "------|");
        System.out.println("|Total Saques: --------------------------" + String.format("%.2f", totalSaque) + "------|");
        System.out.println("|Saldo Total: ---------------------------" + String.format("%.2f", saldoConta) + "---|");
        System.out.println("Muito obrigado por utilizar os serviços digitais do Agibank. Volte sempre!");

        scanner.close();
    }
}
