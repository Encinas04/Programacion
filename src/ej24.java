import java.util.Scanner;

public class ej24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota = 0;
        int suspendidos = 0;
        int aprobados = 0;

        System.out.println("Inserte la nota, si desea acabar escriba un 11:");
        nota = scan.nextDouble();

        while (nota != 11) {
            if (nota < 5) {
                suspendidos++;
            } else {
                aprobados++;
            }

            System.out.println("Inserte la nota, si desea acabar escriba un 11:");
            nota = scan.nextDouble();
        }

        System.out.println("Hay " + aprobados + " aprobados y hay " + suspendidos + " suspendidos.");
    }
}
