
import java.util.Scanner;
public class funcionmaximo {
public static int maximo(int a, int b) {
    return Math.max(a, b);
}
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        a=sc.nextInt();

        System.out.println("Ingrese el segundo numero:");
        b=sc.nextInt();

        System.out.println("Ingrese el tercer numero:");
        c=sc.nextInt();

        int max;
        max=maximo(maximo(a, b), c);

        System.out.println("El numero mayor es: "+max);

    }
}

