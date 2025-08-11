package EstruturaPraticos;

import java.util.Scanner;

public class EX02NumQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int imparAtual = 1;
        int imparesSomados = 0;
        System.out.println("Digite um número para que seja cálculado o valor do seu quadrado: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for(imparesSomados = 0; imparesSomados < num; imparesSomados++){
            soma = soma + imparAtual;

            imparAtual = imparAtual + 2;
        }
        System.out.println("O quadrado do número é: " + soma);
    }
}
