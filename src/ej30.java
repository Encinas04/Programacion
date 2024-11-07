import java.util.Scanner;

public class ej30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double i = 1;
        double num1;
        double num2;
        while (i == 1) {
            String signo;
            System.out.println("Escribe el numero: ");
            num1 = scan.nextDouble();
            System.out.println("Escribe el signo: ");
            signo = scan.next();
            System.out.println("Escribe el otro numero: ");
            num2 = scan.nextDouble();
            switch(signo){
                case "-":
                double resultado= num1 - num2;
                System.out.println(resultado);
                break;
                case "+":
                    resultado= num1 + num2;
                    System.out.println(resultado);
                    break;
                case "*":
                    resultado= num1 * num2;
                    System.out.println(resultado);
                    break;
                case "/":
                    resultado= num1 / num2;
                    System.out.println(resultado);
                    break;
                case "%":
                    resultado= num1 % num2;
                    System.out.println(resultado);
                    break;

            }
            System.out.println("si desea cerrar el programa escriba -222 si no escriba cualquier otro numero para continuar calculando ");
            i= scan.nextDouble();
        }
    }
}

