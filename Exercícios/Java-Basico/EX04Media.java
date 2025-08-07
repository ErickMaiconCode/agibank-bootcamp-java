import java.util.Scanner;

public class EX04Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a média?");
        float media = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Qual o número para comparativo?");
        float num = scanner.nextFloat();

        float diferenca = (num/media)*100;
        System.out.println("O valor está " + diferenca + "% próximo da média ");
    }
}
