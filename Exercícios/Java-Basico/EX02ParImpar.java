import java.util.Scanner;

public class EX02ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Digite um número: ");
        num = scanner.nextInt();
        scanner.nextLine();

        if(num % 2 == 0){
            System.out.println("Número digitado é par");
        } else{
            System.out.println("Número digitado é ímpar");
        }
    }
}
