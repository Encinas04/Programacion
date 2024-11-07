import java.util.Scanner;
public class ej20 {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese el primer numero");
    int A=scanner.nextInt();
    System.out.println("ingrese el segundo numero");
    int B= scanner.nextInt();
    int i=0;
    if (B>A){
        while(i<=B){
            if (i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }
    }
}
