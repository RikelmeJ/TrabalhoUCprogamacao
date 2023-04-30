import java.util.Scanner;

public class RendimentoMensal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor depositado: ");
        double valorDepositado = input.nextDouble();
        System.out.println("Escolha o tipo de rendimento:");
        System.out.println("1. Poupança (0,90% a.m.)");
        System.out.println("2. CDB (1,1% a.m.)");
        System.out.println("3. Previdência Privada (1,3% a.m.)");
        int tipoRendimento = input.nextInt();
        double rendimentoMes = 0.0;
        switch (tipoRendimento) {
            case 1:
                rendimentoMes = valorDepositado * 0.009;
                break;
            case 2:
                rendimentoMes = valorDepositado * 0.011;
                break;
            case 3:
                rendimentoMes = valorDepositado * 0.013;
                break;
            default:
                System.out.println("Tipo de rendimento inválido!");
                System.exit(0);
        }

        double valorTotalMes = valorDepositado + rendimentoMes;
        System.out.printf("O valor total após um mês é: R$ %.2f\n", valorTotalMes);
        double valorTotal = valorDepositado;

        for (int i = 1; i <= 12; ++i) {
            switch (tipoRendimento) {
                case 1:
                    valorTotal += valorTotal * 0.009;
                    break;
                case 2:
                    valorTotal += valorTotal * 0.011;
                    break;
                case 3:
                    valorTotal += valorTotal * 0.013;
                    break;
            }
        }

        System.out.printf("O valor total após 12 meses é: R$ %.2f\n", valorTotal);
        input.close();
    }
}