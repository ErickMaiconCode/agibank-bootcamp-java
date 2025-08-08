package EstruturaBasica;

import java.util.Scanner;

public class EX04Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a média?");
        float media = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Qual o número para comparativo?");
        float num = scanner.nextFloat();

        float diferenca = Math.abs(num-media);
        float percentual = (diferenca/media)*100;
        System.out.printf("O valor está %.2f%% em relação à média", percentual);

    }
}
