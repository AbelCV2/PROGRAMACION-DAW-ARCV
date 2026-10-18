import java.util.Scanner;

public class fibonaccifunc {
    public static int Fibo(int n) {
        int a, b, c, i;

        a=0;
        b=1;

        for (i=0; i<n; i++) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int n;

        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese el valor de N:");
        
        n=sc.nextInt();

        Fibo(n);
    }
}
