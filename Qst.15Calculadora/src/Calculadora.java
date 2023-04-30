import java.util.Scanner;

 public class Calculadora {
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.print("Digite o valor de A: ");
         double a = input.nextDouble();

         System.out.print("Digite o valor de B: ");
         double b = input.nextDouble();

         System.out.print("Digite o operador (+, -, *, /): ");
         String calculadora = input.next();

         double resultado = 0.0;

         switch (calculadora) {

             case "+":
                 resultado = a + b;
                 break;
             case "-":
                 resultado = a - b;
                 break;
             case "*":
                 resultado = a * b;
                 break;
             case "/":
                 if (b == 0) {
                     System.out.print("Não é possível dividir por 0");
                     return;
                 } else {
                     resultado = a / b;
                     break;
                 }

             default:
                 System.out.print("Calculadora inválida.");
                 return;}

                         System.out.print("Resultado" + resultado);
                         return;

                 }
         }






