import java.util.Arrays;

public class Valoresinteiros {
    public static int[] ordenar(int a, int b, int c) {

    int[] valores = {a,b,c};
    Arrays.sort(valores);
    return valores;
    }

    public static void main(String[] args){

        int a = 20;
        int b = 15;
        int c = 11;

        Valoresinteiros OrdenadorInteiros = null;
        int[] valoresOrdenados = OrdenadorInteiros.ordenar(a,b,c);

        System.out.println(valoresOrdenados[0]);
        System.out.println(valoresOrdenados[1]);
        System.out.println(valoresOrdenados[2]);
    }
}