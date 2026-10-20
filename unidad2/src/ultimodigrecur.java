import java.util.Scanner;
public class ultimodigrecur {
    
    public static int cantDigitos(int num) {

        if (num<10) {
            return 1;
        } else {
            return 1+cantDigitos(num/10);
        }
    }

    public static void main(String[] args) {

        int num;
        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese su numero:");
        num=sc.nextInt();

        System.out.println("Su numero tiene "+cantDigitos(num)+" digitos");

    }
}

