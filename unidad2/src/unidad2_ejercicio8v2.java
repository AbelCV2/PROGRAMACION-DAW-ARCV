import java.util.Scanner;
public class unidad2_ejercicio8v2 {
    public static void main(String[] args) {
        int n;
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese el valor de N:");

        n=sc.nextInt();
        
        int num1=0, num2=1, suma;

        if (n<=0) {
            System.out.println("Ingrese un numero mayor a 1");
        }

        else if (n==1) {
            System.out.println(num1+" , "+num2);
        }

        else if (n>1) {
            int i;
            for (i=1; i==n; i++) {
                System.out.println(num1+" , "+num2);
                suma=num1+num2;
                System.out.println(suma);

                num1=suma;
                num2=num2+suma;
                System.out.println(num2);
            }
        }

    }
}
