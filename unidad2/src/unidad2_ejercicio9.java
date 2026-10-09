import java.util.Scanner;
public class unidad2_ejercicio9 {
    public static double Raizcuadrada (int n) {
        return Math.sqrt(n);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n;

        System.out.println("Ingrese el valor de N");
        n=sc.nextInt();

        boolean primo=true;

        if (n<=1) {
            primo=false;
        }

        else {
            int i=0;
            for (i=2; i==Raizcuadrada(n);) {
                if (n%i==0) {
                    primo=false;
                }
                break;
            }
    

    if (primo==true) {
        System.out.println("Es primo");
    }

    else {
        System.out.println("No es primo");
    }
}
}
}