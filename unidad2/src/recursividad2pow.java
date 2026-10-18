import java.util.InputMismatchException;
import java.util.Scanner;

public class recursividad2pow {
    public static int Pot (int a, int b){
        
        Math.pow(a, b);

        if (b==0) {
            return 1;
        }

        else {
            return a*Pot(a, b-1);
        }
    }

    public static void main(String[] args) {
        int a, b;
        
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Ingrese el primero numero (base):");
            a=sc.nextInt();
            System.out.println("Ingrese el segundo numero (potencia):");
            b=sc.nextInt();
            System.out.println(Pot(a,b));
        }catch(InputMismatchException e) {
            System.out.println("TIENES QUE INGRESAR NUMEROS, NO LETRAS");
        }
    }
}
