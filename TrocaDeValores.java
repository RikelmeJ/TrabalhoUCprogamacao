public class TrocaDeValores {
    public static void main(String[] args) {

        int ZORO = 66;
        int SANJI= 99;

        System.out.println("Valores iniciais :");
        System.out.print("ZORO =" + ZORO);
        System.out.println("SANJI =" + SANJI);

        //Trocando  os valores

        int LUFFY = ZORO;
        ZORO = SANJI;
        SANJI = LUFFY;


        System.out.println("Valores alternados :");
        System.out.println("ZORO = " + ZORO);
        System.out.println("SANJI = " + SANJI);
    }
}