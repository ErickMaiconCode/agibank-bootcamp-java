package EstruturaCondicional;

import java.util.Scanner;

public class EX02NotaDeSatisfação {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Seu atendimento foi encerrado.");
                System.out.println("--------------------------------------------");
                System.out.println("Para avaliar nosso atendimento escolha uma das notas abaixo: ");
                System.out.println("1 - Péssima");
                System.out.println("2 - Ruim");
                System.out.println("3 - Satisfeito");
                System.out.println("4 - Ótimo");
                System.out.println("5 - Excelente");
                int opção = scanner.nextInt();

                scanner.nextLine();

                switch (opção){
                    case 1:
                        System.out.println("Lamentamos que sua experiência foi péssima, estamos trabalhando para melhorar nosso atendimento.");
                        break;

                    case 2:
                        System.out.println("Lamentamos que sua experiência foi ruim, estamos trabalhando para melhorar nosso atendimento.");
                        break;

                    case 3:
                        System.out.println("Agradecemos que você tenha tido uma experiência satisfatório. Estamos contantemente avaliando nossos atendimento para melhorá-los a cada dia.");
                        break;

                    case 4:
                        System.out.println("Agradecemos que você tenha tido uma experiência ótima. Estamos contantemente avaliando nossos atendimento para melhorá-los a cada dia.");
                        break;

                    case 5:
                        System.out.println("Agradecemos que você tenha tido uma experiência excelente. Ficamos felizes que nosso atendimento conseguiu entregar um nível de excelência a você");
                        break;

                    default:
                        System.out.println("Opção Inválida");
                        break;
                }
                scanner.close();
    }


}
