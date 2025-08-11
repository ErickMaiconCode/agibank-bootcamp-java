package EstruturaPraticos;

import java.util.Scanner;

public class EX01Tabuada {
    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver sua tabuada:");
        int num = scanner.nextInt();

        scanner.nextLine();

        for(i=0; i <= 10; i++){
            int tabuada = i*num;
            System.out.println(i + "X" + num + "=" + tabuada);
        }
    }
}
