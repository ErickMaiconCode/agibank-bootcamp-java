package TratamentodeExceções.MediaMovel;

import java.util.Scanner;

public class MediaMovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] preços = new double[n];

        for(int i = 0; i < n; i++){

            System.out.println("Qual o valor da casa " + i + 1 + " ?");
            double preçoPorCasa = scanner.nextDouble();
        }
    }
}
