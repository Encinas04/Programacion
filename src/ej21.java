public class ej21 {
    public static void main(String[]args){
        int i=1;
        int par=0;
        while(i<=1000){
            if (i%2==0){
                par=par+i;
            }
            i=i+1;
        }
        System.out.println("La suma de los numeros pares es:"+par);
    }
}
