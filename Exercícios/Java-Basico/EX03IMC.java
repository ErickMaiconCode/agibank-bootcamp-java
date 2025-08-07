import java.util.Scanner;

public class EX03IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu peso (KG): ");
        float peso = scanner.nextFloat();

        System.out.println("Digite a sua altura (m): ");
        float altura = scanner.nextFloat();

        float imc = peso/(altura*altura);

        if(imc < 18.5){
            System.out.printf("O seu IMC(índice de Massa Corporal) é de %.2f sendo definida como abaixo do peso.", imc);
        } else if(imc >= 18.5 && imc <= 24.9){
            System.out.printf("O seu IMC(índice de Massa Corporal) é de %.2f sendo definida como peso normal.", imc);
        } else if (imc>= 25 && imc <= 29.9) {
            System.out.printf("O seu IMC(índice de Massa Corporal) é de %.2f sendo definida como peso excesso de peso.", imc);
        }else if(imc >= 30 && imc <= 35){
            System.out.printf("O seu IMC(índice de Massa Corporal) é de %.2f sendo definida como obesidade.", imc);
        } else if(imc > 35){
            System.out.printf("O seu IMC(índice de Massa Corporal) é de %.2f sendo definida como peso obesidade extrema.", imc);
        }
    }
}
