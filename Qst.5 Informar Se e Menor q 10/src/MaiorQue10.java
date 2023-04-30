import java.util.Scanner;

public class MaiorQue10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int J= sc.nextInt();

        if (J > 10) {
            System.out.println("Número de J maio que 10");
        }

    }
}