import java.util.Scanner;public class ConsumoDoCarro {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia percorrida pelo veiculo(KM): ");
        double distancia = sc.nextDouble();

        System.out.print("Quantidade de combustível gasto (Litros): ");
        double combustivel = sc.nextDouble();

        double consumoMedio = distancia / combustivel;
        System.out.println("O consumo médio do Veículo é de: " + consumoMedio + " km/l");

        sc.close();
    }
}
