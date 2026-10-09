import java.util.Scanner;

import javax.print.attribute.standard.Media;
public class unidad2_ejercicio4 {
    public static boolean Media(int nota1, int nota2) {
        double notamedia=(nota1+nota2)/2;
        if (notamedia>=5) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean Recuperacion(int notamedia) {
        if (notamedia<5) {
            return true;
        }

        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int nota1, nota2;
        double notamedia;
        String recuperacion;

        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese su primera nota:");
        nota1=sc.nextInt();

        System.out.println("Ingrese su segunda nota:");
        nota2=sc.nextInt();

        if (nota1>10 || nota2>10) {
            System.out.println("Nota incorrecta");
        }

        else {
            notamedia=(nota1+nota2)/2;

        if (Media(nota1, nota2)==true) {
            System.out.println("Usted ha aprobado con la nota media de: "+notamedia);
        }

        else {
            System.out.println("Usted requiere recuperacion...");

            System.out.println("Cual fue su calificacion en el examen de recuperacion (APTO/NO APTO):");
            recuperacion=sc.next();

            if (recuperacion=="APTO") {
                System.out.println("Usted ha aprobado con 5");
            }

            else if (recuperacion=="NO APTO") {
                System.out.println("Usted ha sido suspenso");
            }

            else {
                System.out.println("Nota incorrecta");
            }

        }

    
        }

    }
}
