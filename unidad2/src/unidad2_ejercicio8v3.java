import java.util.Scanner;
public class unidad2_ejercicio8v3 {
    public static int Fibonacci(int inicio, int fin, int n, int num1, int num2 , int suma) {
        if (n>1) {
            inicio=1;
            fin=0;
            num1=0;
            num2=1;
            
            System.out.println(" ");

         
            do {
                fin++;
                System.out.println(num1);
                System.out.println(num2);
                suma=num1+num2;
                System.out.println(suma);
                num1=suma;
                num2=num2+suma;
                System.out.println(num2);
            }while(fin!=n);

        }
        return 0;
    }
    
    public static void main(String[] args) {
        int num1=0, num2=1, num3, n;

        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese el valor de N:");

        n=sc.nextInt();
        int suma=0;


        if(n>1) {
            Fibonacci(1, n, n, num1, num2, suma);
        }
    }
}
