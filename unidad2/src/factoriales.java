import java.util.Scanner;

public class factoriales {
    public static void main(String[] args) {
        int n;
        int i;

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el numero N:");
        
        n=sc.nextInt();

        int factorial=1;

        for (i=1; i<=n; i++) {
            factorial=factorial*i;
        }

        System.out.println("El factorial es: "+factorial);
    }
}
