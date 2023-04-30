import java.util.Scanner;
public class XelevadoY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de X :");
        double X= input.nextDouble();
        System.out.println("Digite o valor de Y :");
        double Y= input.nextDouble();

        double resultado = Math.pow(X,Y);
        System.out.println("O resultado dos Valores  de X elevado a Y é:" + resultado);
    }
}