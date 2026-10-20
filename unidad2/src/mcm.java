import java.util.Scanner;
public class mcm {
    public static void main(String[] args) {

        int a, b, mayor, mcm;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        a = sc.nextInt();
        System.out.println("Ingrese el segundo numero:");
        b = sc.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);


    mayor=Math.max(a, b);
    mcm=mayor;

    do {
        mcm=mcm+mayor;
    }while(mcm%a!=0 || mcm%b!=0);

    System.out.println("El MCM es: "+mcm);
    }
}
