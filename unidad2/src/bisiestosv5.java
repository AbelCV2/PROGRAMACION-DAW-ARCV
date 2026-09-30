import java.util.Scanner;
public class bisiestosv5 {
    public static void main(String[] args) {
        int dia;
        int mes;
        int anio;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el dia:");
        dia=sc.nextInt();

        System.out.println("Ingrese el mes:");
        mes=sc.nextInt();

        System.out.println("Ingrese el año");
        anio=sc.nextInt();

        if (mes==1) {
            if (dia>31) {
                System.out.println("La fecha introducida es incorrecta");
            }
            else if ( dia<31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida de: "+dia+" "+" Enero"+anio+ " es correcta y bisiesto");
            }
            else if (dia<31 && (anio%4!=0 && anio%100==0) || anio%400!=0) {
                System.out.println("La fecha introducida de: "+dia+" "+" Enero"+anio+ " es correcta y no es bisiesto");
            }
            
        }

        else if (mes==2) {
            if (dia>29) {
                System.out.println("La fecha introducida no es correcta");
            }
            
            else if (dia==29 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida de: "+dia+" "+" Febrero"+anio+ " es correcta y bisiesto");
            }

            else if (dia==29 && (anio%4!=0 && anio%100==0) || anio%400!=0) {
                System.out.println("La fecha intoducida es incorrecta");
            }
        }

        else if (mes==3) {
            if (dia>31) {
                System.out.println("La fecha introducida es incorrecta");
            }
            else if ( dia<31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida de: "+dia+" "+" Marzo"+anio+ " es correcta y bisiesto");
            }
            else if (dia<31 && (anio%4!=0 && anio%100==0) || anio%400!=0) {
                System.out.println("La fecha introducida de: "+dia+" "+" Marzo"+anio+ " es correcta y no es bisiesto");
            }
        }
            
        else if (mes==4) {
            if (dia>30) {
                System.out.println("La fecha introducida es incorrecta");
            }
            else if ( dia<30 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida de: "+dia+" "+" Abril"+anio+ " es correcta y bisiesto");
            }
            else if (dia<30 && (anio%4!=0 && anio%100==0) || anio%400!=0) {
                System.out.println("La fecha introducida de: "+dia+" "+" Abril"+anio+ " es correcta y no es bisiesto");
            }
        }

        else if (mes==4) {
            if (dia>31) {
                System.out.println("La fecha introducida es incorrecta");
            }
            else if ( dia<31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida de: "+dia+" "+" Mayo"+anio+ " es correcta y bisiesto");
            }
            else if (dia<31 && (anio%4!=0 && anio%100==0) || anio%400!=0) {
                System.out.println("La fecha introducida de: "+dia+" "+" Mayo"+anio+ " es correcta y no es bisiesto");
            }
         }

        else if (mes==5) {
            if (dia>30) {
                System.out.println("La fecha introducida es incorrecta");
            }
            else if ( dia<31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida de: "+dia+" "+" Mayo"+anio+ " es correcta y bisiesto");
            }
            else if (dia<31 && (anio%4!=0 && anio%100==0) || anio%400!=0) {
                System.out.println("La fecha introducida de: "+dia+" "+" Mayo"+anio+ " es correcta y no es bisiesto");
            }
         }        

        
        }
}    
