import java.util.Scanner;
public class diagrama {
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        int discriminante;
        int x1;
        int x2;

        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese el valor de a:");
        a=sc.nextInt();

        System.out.println("Ingrese el valor de b:");
        b=sc.nextInt();

        System.out.println("Ingrese el valor de c:");
        c=sc.nextInt();

        discriminante=(int)(Math.pow(b, 2)) - 4*a*c;


        if (discriminante<0) {
            System.out.println("No hay soluciones");
        }

        else {
            if (discriminante==0) {
                x1=-b/2*a;
                System.out.println("La unica solicion es: "+x1);
            }

            else {
                x1=(-b + (int) Math.sqrt(discriminante)/2*a);
                x2=(-b - (int) Math.sqrt(discriminante)/2*a);

                System.out.println("La primera solucion es: "+x1);
                System.out.println("La segunda solucion es: "+x2);
            }
        }





    }
}
