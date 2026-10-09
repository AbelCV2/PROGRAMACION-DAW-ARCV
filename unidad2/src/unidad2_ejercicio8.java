import java.util.Scanner;
public class unidad2_ejercicio8 {
    public static int Fibonacci(int n) {
        int serie1, serie2, contador;
            serie1=0;
            serie2=1;
        while(n>0) {
            
            contador=serie1+serie2;
            serie1=contador;
            serie2=contador+serie1;
            System.out.print("0 "); System.out.print("1 "); System.out.print(contador); System.out.print(serie1); System.out.print(serie2);
        }
        return 0;

    }
    
    public static void main(String[] args) {
        int n;
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese el numero de N:");

        n=sc.nextInt();

        while (n>0) {
            Fibonacci(n);
        }


    }
}
