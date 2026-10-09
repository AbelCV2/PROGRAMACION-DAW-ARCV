import java.util.Scanner;
public class unidad2_ejercicio7 {

    public static void main(String[] args) {
        int num, contador=0;

        Scanner sc=new Scanner(System.in);

        do {
            
            System.out.println("Introduzca un numero aleatorio:");
            num=sc.nextInt(); sc.nextLine();

            if (num==7 || num==-7) {
                contador=contador+1;
            }
        }while(num!=0);

        System.out.println("Terminando...");
        System.out.println("El numero 7 y -7 se han repetido: "+contador+" veces");

        
    }
}