package EstruturaCondicional;

import java.util.Scanner;

public class EX01Investimentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem vindo ao seu banco de investimentos");
        System.out.println("--------------------------------------------");
        System.out.println("Qual investimento você gostaria de aplicar?");
        System.out.println("1 - CDB");
        System.out.println("2 - CDI");
        System.out.println("3 - FII");
        System.out.println("4 - Tesouro direto");
        System.out.println("5 - SAIR");
        int opção = scanner.nextInt();

        scanner.nextLine();

        switch (opção){
            case 1:
                System.out.println("Investimento escolhido foi CDB");
                break;

            case 2:
                System.out.println("Investimento escolhido foi CDI");
                break;

            case 3:
                System.out.println("Investimento escolhido foi FII");
                break;

            case 4:
                System.out.println("Investimento escolhido foi Tesouro Direto");
                break;

            case 5:
                System.out.println("Transação Encerrada");
                break;

            default:
                System.out.println("Opção Inválida");
                break;
        }
        scanner.close();
    }


}
