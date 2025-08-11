package EstruturaPraticos;

import java.util.Scanner;

public class EX03Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 1;
        System.out.println("Digite um valor inteiro para a base da sua potência: ");
        int base = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite um valor inteiro para o expoente da sua potência:");
        int expoente = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < expoente; i++) {
            soma = soma * base;
        }

        System.out.println("O resultado final da potência é " + soma + ".");
    }
}
