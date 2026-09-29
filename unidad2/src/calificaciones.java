import java.util.Scanner;
public class calificaciones {
    public static void main(String[] args) {
        // int calificacion;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Introduce la calificacion:");
        // calificacion=sc.nextInt();

        // if (calificacion<=4) {
        //     System.out.println("Usted esta suspenso");
        // }
        
        // else if (calificacion==5) {
        //     System.out.println("Usted ha aprobado");
        // }

        // else if (calificacion>=6 && calificacion<=7) {
        //     System.out.println("Usted ha salido bien");
        // }

        // else if (calificacion>=8 && calificacion<=9) {
        //     System.out.println("Usted ha sido notable");
        // }

        // else if (calificacion==10) {
        //     System.out.println("Usted ha salido sobresaliente");
        // }

        // else {
        //     System.out.println("La nota introducida es incorrecta");
        // }

        //ESTE HA SIDO HECHO CON IF ELSE

        int calificacion2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca la nota:");

        calificacion2=sc.nextInt();

        switch(calificacion2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Usted ha sido suspendido");
                break;
            case 5:
                System.out.println("Usted ha aprobado");
                break;
            case 6:
            case 7:
                System.out.println("Usted ha salido bien");
                break;
            case 8:
            case 9:
                System.out.println("Usted ha sido notable");
                break;
            case 10:
                System.out.println("Usted ha sido sobresaliente");
                break;
            
        }

        //ESTE HA SIDO CON SWITCH Y BREAK

    }
}
