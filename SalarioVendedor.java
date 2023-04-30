import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o nome do vendedor :");
        String nomevendedor = sc.nextLine();

        System.out.println("Informe o salário fixo :");
        double salario = sc.nextDouble();

        System.out.println("Total de vendas no mês em R$ :");
        double vendas = sc.nextDouble();

        double comissao = vendas * 0.15 + salario;



        System.out.println("Salário do final do mês :" + comissao);

    }
}