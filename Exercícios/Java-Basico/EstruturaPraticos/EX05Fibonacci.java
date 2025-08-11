package EstruturaPraticos;

import java.util.Scanner;

public class EX05Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor limite para os termos de Fibonacci: ");
        int limite = scanner.nextInt();
        scanner.nextLine();

        int a = 0;
        int b = 1;

        if(limite > 0){
            System.out.print(a);
        }
        while (b<limite){
            System.out.print(", " + b);
            int proximotermo = a + b;
            a = b;
            b = proximotermo;
        }
        scanner.close();
    }
}