import java.util.Scanner;
import java.util.Random;
public class ej29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        boolean acertado=false;
        int random = rand.nextInt(10+1);
        for (int i = 0; acertado==false; i++) {
            System.out.println("Inserta el numero: ");
            int numero= scan.nextInt();

            if (random==numero){
                System.out.println("!Acertaste!");
                    acertado=true;
            }else{
                if (numero>random){
                    System.out.println("el numero secreto es menor");
                }else{
                    System.out.println("El numero secreto es mayor");
                }

            }
        }
    }
}