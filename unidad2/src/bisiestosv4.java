import java.util.Scanner;
public class bisiestosv4 {
    public static void main(String[] args) {

        int dia;
        int mes;
        int anio;

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el dia:");
        dia=sc.nextInt();

        System.out.println("Introduzca el mes:");
        mes=sc.nextInt();

        System.out.println("Introduzca el año:");
        anio=sc.nextInt();

        switch (mes) {
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
                System.out.println("El mes introducido es numericamente correcto");
                break;
            default:
                System.out.println("El numero de mes introducido no es correcto, intente con un numero entre el 1 y el 12");
            }
                switch (dia) {
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
            case 29:
            case 30:
            case 31:
                System.out.println("El dia introducido es numericamente correcto");
                break;
            default:
                System.out.println("El numero de dia introducido no es correcto, intente con un numero entre el 1 y el 31");
            }


                if (mes==1) {
                System.out.println("Su mes es Enero");
                }
                else if (mes==2) {
                System.out.println("Su mes es Febrero");
                }
                else if (mes==3) {
                System.out.println("Su mes es Marzo");
                }
                else if (mes==4){
                System.out.println("Su mes es Abril");
                }
                else if (mes==5){
                System.out.println("Su mes es Mayo");
                }
                else if (mes==6){
                System.out.println("Su mes es Junio");
                }
                else if (mes==7){
                System.out.println("Su mes es Julio");
                }
                else if (mes==8){
                System.out.println("Su mes es Agosto");
                }
                else if (mes==9){
                System.out.println("Su mes es Septiembre");
                }
                else if (mes==10){
                System.out.println("Su mes es Octubre");
                }
                else if (mes==11){
                System.out.println("Su mes es Noviembre");
                }
                else if (mes==12){
                System.out.println("Su mes es Diciembre");
                }
            
                System.out.println("Su fecha ingresada es: "+dia+ " del mes de "+mes+" del año "+anio);
                System.out.println("Analizando...");

                if ((dia==29 && mes==2) && (anio%4==0 && anio%100!=0 || anio%400==0)) {
            System.out.println("La fecha introducida del "+dia+" del mes de "+mes+" del año "+anio+" es bisiesto");
                }

                else if ((dia==29 && mes==2) && (anio%4!=0 && anio%100==0 || anio%400!=0)) {
            System.out.println("El 29 de Febrero solo existe en los años bisiestos");
                }

                else if (dia == 31 && mes == 2 && mes == 4 && mes==6 && mes==9 && mes==11) {
            System.out.println("Los datos introducidos no coinciden");
                }

                else if (dia<=30 && mes == 1 && mes==3 && mes==5 && mes==7 && mes==8 && mes==10 && mes==12) {
            System.out.println("Los datos introducidos no coinciden");
                }

                else if  ((dia>=30 && mes==2) && (anio%4!=0 && anio%100==0 || anio%400!=0)) {
            System.out.println("Los datos introducidos no coinciden");
                }

                else if ((dia<=31) && anio%4==0 && anio%100!=0 || anio%400==0) {
            System.out.println("La fecha introducida del "+dia+" del mes de "+mes+" del año "+anio+" es bisiesto");
                }
        
                else if (dia>=32 && mes>=13) {
            System.out.println("La fecha introducida no es correcta");
                }

                else {
            System.out.println("La fecha introducida del "+dia+" del mes de "+mes+" del año "+anio+" no es bisiesto");
                }




        
       
        


    
        
    }
}