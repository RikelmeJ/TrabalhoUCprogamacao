import java.util.Scanner;

public class QuadradosPerfeitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o númer :");
        int num = sc.nextInt();
        double sqrt = Math.sqrt(num);

        if (sqrt == (int)sqrt) {
            System.out.println("É quadrado perfeito");
        } else {
            System.out.println("Não é quadrado perfeito");
        }
    }
}
