import java.util.Scanner;

public class ej22 {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Inserte el numero entero: ");
        int entero=scan.nextInt();

        int cont=0;
        while(entero>0){
            entero=entero/10;
            cont++;
        }
        System.out.println(cont);

    }
}
