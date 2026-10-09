import java.util.Scanner;
public class mcm {
    public static void main(String[] args) {
        // int a, b, resto;

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Ingrese el primer numero:");
        // a = sc.nextInt();
        // System.out.println("Ingrese el segundo numero:");
        // b = sc.nextInt();

        // if (a>0 && b>0) {
        //     do {
        //         resto=a%b;
        //         a=b;
        //         b=resto;
        //     }while(b!=0);

        //     System.out.println("El MCD es: "+a);
        // }
        // else {
        //     System.out.println("Ingrese numeros positivos");
        // }
        int a, b, mayor, mcm;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        a = sc.nextInt();
        System.out.println("Ingrese el segundo numero:");
        b = sc.nextInt();

        a=Math.abs(a);
        b=Math.abs(b);

    //     if (a>0 && b>0) {
    //         mayor= Math.max(a, b);
    //         mcm=mayor;

    //         do {
    //             mcm=mcm+mayor;
    //         }while(mcm%a!=0 || mcm%b!=0);

    //     System.out.println("El MCM es: "+mcm);
    // }
    //    else {
    //     System.out.println("Ingrese numeros positivos");
    //    }

    mayor=Math.max(a, b);
    mcm=mayor;

    do {
        mcm=mcm+mayor;
    }while(mcm%a!=0 || mcm%b!=0);

    System.out.println("El MCM es: "+mcm);
    }
}
