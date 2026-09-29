import java.util.Scanner;
public class bisiestos {
    public static void main(String[] args) {
        int dia;
        String mes;
        int anio;
        boolean bisiesto;

       Scanner sc=new Scanner(System.in);
       System.out.println("Introduzca el dia");
       dia=sc.nextInt();


       System.out.println("Introduzca el mes");
       mes=sc.next();
       if (dia==29) {
        System.out.println("El unico mes que corresponde es Febrero");
       }


       System.out.println("Introduzca el año:");
       anio=sc.nextInt();


       if ((anio%4==0 && anio%100!=0) || anio%400==0) {
        bisiesto=true;
        System.out.println("El año introducido es bisiesto");
       }
       else {
        System.out.println("El año no es bisiesto");
        bisiesto=false;
       }

       if ((dia==29) && bisiesto==true)  {
        System.out.println("El mes que corresponde es Febrero");
       }
     
    }
}