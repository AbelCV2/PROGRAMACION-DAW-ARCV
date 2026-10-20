import java.util.Scanner;

public class ultimodig {
    public static int cantDigitos(int num, int contador) {
        if (num<10) {
            return 1;
        }

        else {
            do {
                int ultimodig;
                ultimodig=num%10;
                contador++;
                num=Math.divideExact(num, 10);

            }while(num!=0);
            return contador;
        }
    }

    public static void main(String[] args) {
        int num;
        int contador=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su numero:");

        num=sc.nextInt();

        if (num<10) {
            System.out.println("Su numero tiene un solo digito");
        }

        else {
        System.out.println("Su numero tiene "+cantDigitos(num, contador)+" digitos");
        }
        
    }
}
