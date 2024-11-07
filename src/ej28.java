import java.util.Scanner;
import java.util.Random;
public class ej28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        for (int cont = 0; cont <= 5; cont++) {
            int random = rand.nextInt(99999) + 1;

            System.out.println("Inserta el numero: ");
            int numero= scan.nextInt();
            if (random==numero){
                System.out.println("!Acertaste!");
            }else{
                System.out.println("Fallaste");
            }
        }
    }
}