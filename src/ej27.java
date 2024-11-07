import java.util.Scanner;

public class ej27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 0;

        while (cont < 20) {
            boolean primo = true;
            System.out.println("Escribe el numero: ");
            int numero = scan.nextInt();

            if (numero == 1) {
                primo = false;
            } else {
                int i = 2;
                while (i < numero && primo) {
                    if (numero % i == 0) {
                        primo = false;
                    }
                    i++;
                }
            }

            if (primo) {
                cont++;
            }
        }

        System.out.println("Hay " + cont);
    }
}
