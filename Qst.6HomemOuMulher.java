import java.util.Scanner;

public class HomemOuMulher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h = 0;
        int m = 0;

        for (int i = 1; i <= 30; i++) {
            System.out.print("Digite o nome: ");
            String nome = input.nextLine();

            System.out.print("H - Homem ou M - Mulher: ");
            String sexo = input.nextLine().toUpperCase();

            switch (sexo) {
                case "H":
                    System.out.println(nome + " é Homem");
                    h++;
                    break;
                case "M":
                    System.out.println(nome + " é Mulher");
                    m++;
                    break;
                default:
                    System.out.println("Sexo só pode ser H ou M");
            }
        }

        System.out.println("Foram inseridos " + h + " Homens");
        System.out.println("Foram inseridos " + m + " Mulheres");

        input.close();
    }
}
