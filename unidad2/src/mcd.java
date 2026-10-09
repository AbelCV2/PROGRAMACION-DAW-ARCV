import java.util.Scanner;
public class mcd {
    public static void main(String[] args) {
        int a, b, resto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        a = sc.nextInt();

        System.out.println("Ingrese el segundo numero:");
        b = sc.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);

        do {
            resto=a%b;
            a=b;
            b=resto;
        }while(b!=0);

        System.out.println("El MCD es: "+a);
    }
}
