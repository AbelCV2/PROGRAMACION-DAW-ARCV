import java.util.Scanner;


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
            sc.nextLine();
            recuperacion=sc.nextLine();

            if (recuperacion.equalsIgnoreCase("apto")) {  //.equals() es para comparar el contenido (distingue entre mayusculas y minusculas) | .equalsIgnoreCase() es para comparar el contenido (no distingue entre mayuculas y minusculas)
                System.out.println("Usted ha aprobado con 5");
            }

            else if (recuperacion.equalsIgnoreCase("no apto")) {
                System.out.println("Usted ha sido suspenso");
            }
            
            else {
                System.out.println("Nota incorrecta");
            }

        }

    
        }

    }
}

//TERMINADO!
