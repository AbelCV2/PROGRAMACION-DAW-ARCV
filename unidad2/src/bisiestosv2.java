import java.util.Scanner;
public class bisiestosv2 {
    public static void main(String[] args) {
        int dia;
        int anio;
        int mes;

        Scanner sc=new Scanner(System.in);
       System.out.println("Introduzca el dia");
       dia=sc.nextInt();

       switch(dia) {
        case 0:
         System.out.println("El dia no puede ser 0");
         break;
        
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
        case 21:
        case 22:
        case 23:
        case 24:
        case 25:
        case 26:
        case 27:
        case 28:
            System.out.println("Los dias colocados son correctos");
            break;
        case 29:
            System.out.println("Si coloca el mes de Febrero entonces asegurese escoger un año correcto");
            break;
        case 30:
        case 31:
            System.out.println("Los dias colocados son correctos");
       }

       System.out.println("Introduzca el mes");
       mes=sc.nextInt();
       if (mes==1) {
        System.out.println("El mes que introdujo es Enero");
       }
       else if (mes==3) {
        System.out.println("El mes que introdujo es Marzo");
       }
       else if (mes==4) {
        System.out.println("El mes que introdujo es Abril");
       }
       else if (mes==5) {
        System.out.println("El mes que introdujo es Mayo");
       }
    }
}
