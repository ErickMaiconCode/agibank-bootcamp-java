package EstruturaPraticos;

import java.util.Scanner;

public class EX04Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatorial = 1;
        System.out.println("Digite um numero para calcular seu fatorial: ");
        int num = scanner.nextInt();

        for(int i = 1; i<=num; i++){

            fatorial *= i;
        }
        System.out.println("O resultado final é: " + fatorial);
    }
}
