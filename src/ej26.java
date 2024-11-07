import java.util.Scanner;

public class ej26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escribe el numero: ");
        int numero = scan.nextInt();
        boolean primo = true;
        int i = 2;

        if (numero == 1) {
            primo = false;
        } else {
            while (i < numero && primo) {
                if (numero % i == 0) {
                    primo = false;
                }
                i++;
            }
        }

        if (primo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}
