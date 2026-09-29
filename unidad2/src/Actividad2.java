import java.util.Scanner;
public class Actividad2 {
    public static void main(String[] args) {
        int numero1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero:");
        numero1=sc.nextInt();

        if (numero1%2==0) {
            System.out.println("El numero introducido es divisible por 2");
        }
        else if (numero1%3==0) {
            System.out.println("El numero introducido es divisible por 3");
        }
        else if (numero1%2!=0 && numero1%3!=0) {
            System.out.println("El numero introducido no es divisible por 2 ni por 3");
        }
        else {
            System.out.println("El numero introducido es divisible por 2 y por 3");
        }
    }
}
