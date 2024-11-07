import java.util.Scanner;

public class ej23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int suma = 0;
        int contador = 0;

        System.out.println("Inserte un número entero (un número negativo para salir):");
        num = scan.nextInt();

        while (num >= 0) {
            suma += num;
            contador++;

            System.out.println("Inserte un número entero (un número negativo para salir):");
            num = scan.nextInt();
        }


            System.out.println("La media de los números es: " + suma / contador);

    }
}
