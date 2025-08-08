package EstruturaBasica;

import java.util.Scanner;

public class EX01PosOuNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if(num <0){
            System.out.println("Número digitado é negativo");
        } else if(num == 0) {
            System.out.println("Numero digitado é igual a 0");
        } else{
            System.out.println("Número digitado é positivo");
        }
    }
}

