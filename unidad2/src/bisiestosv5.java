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

        System.out.println("Ingrese el año:");
        anio=sc.nextInt();

        if (dia>31 || dia<1) {
            System.out.println("La fecha introducida es incorrecta");
        }

        else if (mes>12 || mes<1) {
            System.out.println("La fecha introducida es incorrecta");
        }
        
        else {
            if (mes==1) {
                if (dia>31) {
                System.out.println("La fecha introducida es incorrecta");
                }
                else if ( dia<=31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida del: "+dia+" de Enero del año "+anio+" es correcta y es bisiesto");
                }
                else {
                System.out.println("La fecha introducida del: "+dia+" de Enero del año "+anio+" es correcta y no es bisiesto");
                }
            
            }

            else if (mes==2) {
                if (dia>29) {
                System.out.println("La fecha introducida no es correcta");
                }
            
                else if (dia==29 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                    System.out.println("La fecha introducida del: "+dia+" de Febrero del año "+anio+" es correcta y es bisiesto");
                }

                else if (dia==29 && ((anio%4!=0 && anio%100==0) || anio%400!=0)) {
                    System.out.println("La fecha introducida es incorrecta (Los dias 29 de Febrero solo existen en los años bisiestos)");
                }
                
                else if (dia<29 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                    System.out.println("La fecha introducida del: "+dia+" de Febrero del año "+anio+" es correcta y no es bisiesto");
                }
                else {
                    System.out.println("La fecha introducida del: "+dia+" de Febrero del año "+anio+" es correcta y no es bisiesto");
                }

            }
//HECHO HASTA AQUI, TERMINAR EN CASA
            else if (mes==3) {
                if (dia>31) {
                System.out.println("La fecha introducida es incorrecta");
                }
                else if ( dia<=31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida del: "+dia+" de Marzo del año "+anio+" es correcta y es bisiesto");
                }
                else {
                System.out.println("La fecha introducida del: "+dia+" de Marzo del año "+anio+" es correcta y no es bisiesto");
                }
            
            }

            else if (mes==4) {
                if (dia>30) {
                System.out.println("La fecha introducida es incorrecta");
                }
                else if ( dia<=30 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida del: "+dia+" de Abril del año "+anio+" es correcta y es bisiesto");
                }
                else {
                System.out.println("La fecha introducida del: "+dia+" de Abril del año "+anio+" es correcta y no es bisiesto");
                }
            
            }

            else if (mes==5) {
                if (dia>31) {
                System.out.println("La fecha introducida es incorrecta");
                }
                else if ( dia<=31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida del: "+dia+" de Mayo del año "+anio+" es correcta y es bisiesto");
                }
                else {
                System.out.println("La fecha introducida del: "+dia+" de Mayo del año "+anio+" es correcta y no es bisiesto");
                }
            
            }

            else if (mes==6) {
                if (dia>30) {
                System.out.println("La fecha introducida es incorrecta");
                }
                else if ( dia<=30 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida del: "+dia+" de Junio del año "+anio+" es correcta y es bisiesto");
                }
                else {
                System.out.println("La fecha introducida del: "+dia+" de Junio del año "+anio+" es correcta y no es bisiesto");
                }
            
            }

            else if (mes==7) {
                if (dia>31) {
                System.out.println("La fecha introducida es incorrecta");
                }
                else if ( dia<=31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida del: "+dia+" de Julio del año "+anio+" es correcta y es bisiesto");
                }
                else {
                System.out.println("La fecha introducida del: "+dia+" de Julio del año "+anio+" es correcta y no es bisiesto");
                }
            
            }

            else if (mes==8) {
                if (dia>31) {
                System.out.println("La fecha introducida es incorrecta");
                }
                else if ( dia<=31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida del: "+dia+" de Agosto del año "+anio+" es correcta y es bisiesto");
                }
                else {
                System.out.println("La fecha introducida del: "+dia+" de Agosto del año "+anio+" es correcta y no es bisiesto");
                }
            
            }

            else if (mes==9) {
                if (dia>30) {
                System.out.println("La fecha introducida es incorrecta");
                }
                else if ( dia<=30 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida del: "+dia+" de Septiembre del año "+anio+" es correcta y es bisiesto");
                }
                else {
                System.out.println("La fecha introducida del: "+dia+" de Septiembre del año "+anio+" es correcta y no es bisiesto");
                }
            
            }

            else if (mes==10) {
                if (dia>31) {
                System.out.println("La fecha introducida es incorrecta");
                }
                else if ( dia<=31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida del: "+dia+" de Octubre del año "+anio+" es correcta y es bisiesto");
                }
                else {
                System.out.println("La fecha introducida del: "+dia+" de Octubre del año "+anio+" es correcta y no es bisiesto");
                }
            
            }

            else if (mes==11) {
                if (dia>30) {
                System.out.println("La fecha introducida es incorrecta");
                }
                else if ( dia<=30 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida del: "+dia+" de Noviembre del año "+anio+" es correcta y es bisiesto");
                }
                else {
                System.out.println("La fecha introducida del: "+dia+" de Noviembre del año "+anio+" es correcta y no es bisiesto");
                }
            
            }

            else if (mes==12) {
                if (dia>31) {
                System.out.println("La fecha introducida es incorrecta");
                }
                else if ( dia<=31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
                System.out.println("La fecha introducida del: "+dia+" de Diciembre del año "+anio+" es correcta y es bisiesto");
                }
                else {
                System.out.println("La fecha introducida del: "+dia+" de Diciembre del año "+anio+" es correcta y no es bisiesto");
                }
            
            }

            else {
                System.out.println("La fecha introducida es incorrecta");
            }


        } //TERMINADO
    }
}         
