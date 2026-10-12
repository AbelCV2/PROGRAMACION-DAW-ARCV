import java.util.Scanner;
public class unidad2_ejercicio5 {
    

public static int Cursos (int dia) {
        if (dia==1) {
            System.out.println("LUNES");
            System.out.println("Entorno de desarrollo");
            System.out.println("Lenguajes de marcas");
            System.out.println("Sistemas informaticos");
            System.out.println("Programacion");
            return 1;
        }

        else if (dia==2) {
            System.out.println("MARTES");
            System.out.println("Entorno de desarrollo");
            System.out.println("Lenguajes de marcas");
            System.out.println("Sistemas informaticos");
            System.out.println("Programacion");
            return 2;
        }

        else if (dia==3) {
            System.out.println("MIERCOLES");
            System.out.println("Entorno de desarrollo");
            System.out.println("Lenguajes de marcas");
            System.out.println("Sistemas informaticos");
            System.out.println("Programacion");
            return 3;
        }

        else if (dia==4) {
            System.out.println("JUEVES");
            System.out.println("Entorno de desarrollo");
            System.out.println("Lenguajes de marcas");
            System.out.println("Sistemas informaticos");
            System.out.println("Programacion");
            return 4;
        }

        else if (dia==5) {
            System.out.println("VIERNES");
            System.out.println("Entorno de desarrollo");
            System.out.println("Lenguajes de marcas");
            System.out.println("Sistemas informaticos");
            System.out.println("Programacion");
            return 5;
        }

        else if (dia==6) {

            Cursos(1);
            System.out.println("---------------------------------------------------");
            Cursos(2);
            System.out.println("---------------------------------------------------");
            Cursos(3);
            System.out.println("---------------------------------------------------");
            Cursos(4);
            System.out.println("---------------------------------------------------");
            Cursos(5);
            System.out.println("---------------------------------------------------");

            return 6;

        }

        else if (dia==7) {
            System.out.println("Apagando...");
            return 7;
        }

        else {
            return 0;
        }
    }

    // public static int Dias (int dia) {
    //     if (dia==6){
    //         System.out.println("Tu horario completo es:");
    //         System.out.println(Dias(dia));
    //         return 0;
    //     } 

    //     else {
    //         System.out.println("Numero incorrecto");
    //         return 1;
    //     }
    // }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int dia;
        System.out.println("Ingrese el dia para darle su horario: (1 Lunes, 2 Martes, 3 Miercoles, 4 Jueves, 5 Viernes)");
        
        dia=sc.nextInt();

        if (dia==1) {
            System.out.println(Cursos(dia));
        }

        else if (dia==2) {
            System.out.println(Cursos(dia));
        }

        else if (dia==3) {
            System.out.println(Cursos(dia));
        }

        else if (dia==4) {
            System.out.println(Cursos(dia));
        }

        else if (dia==5) {
            System.out.println(Cursos(dia));
        }

        else if (dia==6) {
            System.out.println(Cursos(dia));
        }

        else if (dia==7) {
            System.out.println(Cursos(dia));
        }

        else {
            System.out.println("Dia incorrecto");
        }

 
    }
}
//TERMINADO!