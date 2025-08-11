import java.util.Scanner;

public class CaixaCidadao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000;
        int menu = 0;

        while (menu !=4){
            System.out.println("SEJA BEM VINDO AO SEU CAIXA CIDADÃO");
            System.out.println("|---------------------------------|");
            System.out.println("Escolha dentre as opçoes abaixo:");
            System.out.println("1 - Saque.");
            System.out.println("2 - Simulador de dívidas.");
            System.out.println("3 - Metas de economia.");
            System.out.println("4 - Sair.");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Seu saldo atual é de R$ " + saldo);
                    System.out.println("Qual valor gostaria de sacar? ");
                    double saque = scanner.nextDouble();
                    scanner.nextLine();

                    if (saque <= 0 || saque > saldo ) {
                        System.out.println("Valor inválido. Digite um valor válido para concluir a transação.");
                    } else {
                        saldo = saldo - saque;
                        System.out.println("Saque de R$ " + saque + " realizado com sucesso. Seu saldo atual é de R$ " + saldo);
                    }
                    break;
                case 2:
                    System.out.println("Qual o valor da dívida? ");
                    double divida = scanner.nextDouble();
                    scanner.nextLine();

                    if(divida <= 0){
                        System.out.println("Valor inválido. Digite um valor válido para concluir a transação.");
                    }
                    int contador = 1;
                    while (divida > 0){
                        System.out.println("Qual valor deseja pagar esse mês? ");
                        System.out.println("Sua divida atual é de R$ " + divida);
                        double pagamento = scanner.nextDouble();
                        scanner.nextLine();

                        if(pagamento <= 0 || pagamento > divida){
                            System.out.println("Valor inválido. Digite um valor positivo e menor ou igual à dívida atual.");
                        } else {
                            divida = divida - pagamento;
                            System.out.println("Pagamento do mês " + contador + " feito com sucesso. Sua dívida atual é de R$ " + divida);
                            contador++;
                        }
                    }
                    System.out.println("Pagamento quitado com sucesso.");
                    break;
                case 3:
                    System.out.println("Qual sua meta de economia? ");
                    double economia = scanner.nextDouble();
                    scanner.nextLine();

                    if(economia <= 0){
                        System.out.println("Valor inválido. A meta de economia deve ser maior que zero.");
                    } else {
                        System.out.println("Quanto você consegue economizar por mês? ");
                        double econoMes = scanner.nextDouble();
                        scanner.nextLine();

                        if(econoMes <= 0){
                            System.out.println("Valor inválido. O valor a ser economizado por mês deve ser maior que zero.");
                        } else {
                            double parcelas = economia / econoMes;
                            int meses = (int) parcelas;
                            if (parcelas > meses) {
                                meses++;
                            }
                            System.out.println("Sua meta de R$ " + economia + " será batida em " + meses + " meses, se você economizar R$ " + econoMes + " por mês.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Encerrando login....");
                    break;
            }
        }
        System.out.println("Muito obrigado por utilizar os serviços Agibank");
        scanner.close();
    }
}
