import java.util.Scanner;

public class CompanhiaDeSeguros {

    public static void main(String[] args) {
        String[] categorias = {
                "Categoria 1 - 17 a 20 anos - Grupo de Risco Baixo",
                "Categoria 2 - 17 a 20 anos - Grupo de Risco Médio",
                "Categoria 3 - 17 a 20 anos - Grupo de Risco Alto",
                "Categoria 2 - 21 a 24 anos - Grupo de Risco Baixo",
                "Categoria 3 - 21 a 24 anos - Grupo de Risco Médio",
                "Categoria 4 - 21 a 24 anos - Grupo de Risco Alto",
                "Categoria 3 - 25 a 34 anos - Grupo de Risco Baixo",
                "Categoria 4 - 25 a 34 anos - Grupo de Risco Médio",
                "Categoria 5 - 25 a 34 anos - Grupo de Risco Alto",
                "Categoria 4 - 35 a 64 anos - Grupo de Risco Baixo",
                "Categoria 5 - 35 a 64 anos - Grupo de Risco Médio",
                "Categoria 6 - 35 a 64 anos - Grupo de Risco Alto",
                "Categoria 7 - 65 a 70 anos - Grupo de Risco Baixo",
                "Categoria 8 - 65 a 70 anos - Grupo de Risco Médio",
                "Categoria 9 - 65 a 70 anos - Grupo de Risco Alto",
        };


        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do pretendente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade do pretendente: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o grupo de risco do pretendente (1-Baixo, 2-Médio, 3-Alto): ");
        int grupoDeRisco = scanner.nextInt();

        if (idade < 17 || idade > 70) {
            System.out.println("A idade do pretendente não está na faixa necessária.");
            return;
        }

        int indiceCategoria;
        if (idade >= 17 && idade <= 20) {
            indiceCategoria = (grupoDeRisco - 1) * 3;
        } else if (idade >= 21 && idade <= 24) {
            indiceCategoria = (grupoDeRisco - 1) * 3 + 1;
        } else if (idade >= 25 && idade <= 34) {
            indiceCategoria = 6;
        } else if (idade >= 35 && idade <= 64) {
            indiceCategoria = 7;
        } else {
            indiceCategoria = 8;
        }

        System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
                System.out.println("Categoria: " + categorias[indiceCategoria]);
                }
                }
