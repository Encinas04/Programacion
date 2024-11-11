import java.util.Scanner;
public class ej25 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int numero=0;
        //int numero1=1;
        int conteo=1;
        System.out.println("inserte el numero:");
        numero= scan.nextInt();
        for (int numero1=1;numero>=numero1;numero1++){
            conteo=conteo*numero1;
        }
        /*while(numero>=numero1){
            conteo=conteo*numero1;
            numero1++;

        }*/
        System.out.println("El numero factorial es:"+ conteo);
    }
}
