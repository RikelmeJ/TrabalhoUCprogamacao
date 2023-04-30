import java.util.Scanner;

public class CalcularDesconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int carrosAte2010 = 0;
        int totalCarros = 0;
        char resposta;

        do {
            System.out.print("Digite o ano do carro: ");
            int ano = input.nextInt();
            System.out.print("Digite o valor do carro: ");
            double valor = input.nextDouble();

            double desconto;
            if (ano <= 2010) {
                desconto = valor * 0.12;
                carrosAte2010++;
            } else {
                desconto = valor * 0.07;
            }

            double valorComDesconto = valor - desconto;
            System.out.printf("Desconto: R$%.2f\n", desconto);
            System.out.printf("Valor a ser pago:  R$%.2f\n", valorComDesconto);

            totalCarros++;

            System.out.print("Deseja continuar calculando desconto? (S/N) ") ;
            resposta = input.next().charAt(0);
        } while (resposta != 'N' && resposta != 'n');

        System.out.println("Total de carros com ano até 2010: " + carrosAte2010);
        System.out.println("Total geral de carros: " + totalCarros);

        input.close();
    }
}
