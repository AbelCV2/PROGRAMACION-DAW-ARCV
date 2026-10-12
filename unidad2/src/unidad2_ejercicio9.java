import java.util.Scanner;
public class unidad2_ejercicio9 {
    public static double Raizcuadrada (int n) {
        return Math.sqrt(n);
    }
    public static void Primos (int n) {
        
        boolean primo=false;
        
        if (n<=1) {
            primo=false;
        }

        else {
            int i=0;
            for (i=2; i<=Raizcuadrada(n); i++) {
                if (n%i==0) {
                    primo=false;
                    break;
                }
                
                else {
                    primo=true;
                }
            }
    

    if (primo==true) {
        System.out.println("Es primo");
    }

    else {
        System.out.println("No es primo");
    }
}
 }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        for (int i=0; i<=100; i++) {
           System.out.print(i+" ");
           Primos(i); 
        }

        
}
}

//TERMINADO!