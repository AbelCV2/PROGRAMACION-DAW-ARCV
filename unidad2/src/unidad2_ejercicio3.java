import java.util.Scanner;

public class unidad2_ejercicio3 {
    
    
    public static void main(String[] args) {
        
        int dia, mes, signo;

        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese el numero del dia:");

        dia=sc.nextInt(); 

        if (dia>31 || dia<=0) {
            System.out.println("Numero de dia incorrecto");
        }

        else {
            System.out.println("Ingrese el numero del mes:");
            mes=sc.nextInt();

            if (mes>12 || mes<=0) {
                System.out.println("Numero de mes incorrecto");
            }

            else if ((dia>=29 && mes==2) || (dia==31 && mes==4) || (dia==31 && mes==6) || (dia==31 && mes==9) || (dia==31 && mes==11)) {
                System.out.println("Fechas incorrectas");
            }

            else 
                if ((dia>=22 && dia<=31 && mes==12) || (dia>=1 && dia<=19 && mes==1) ) {
                    System.out.println("Capricornio");
                }

                else if ((dia>=20 && dia<=31 && mes==1) || (dia>=1 && dia<=18 && mes==2)) {
                    System.out.println("Acuario");
                }

                else if ((dia>=19 && dia<=31 && mes==2) || (dia>=1 && dia<=20 && mes==3)) {
                    System.out.println("Piscis");
                }
                
                else if ((dia>=21 && dia<=31 && mes==3) || (dia>=1 && dia<=19 && mes==4)) {
                    System.out.println("Aries");
                }

                else if ((dia>=20 && dia<=31 && mes==4) || (dia>=1 && dia<=20 && mes==5)) {
                    System.out.println("Tauro");
                }

                else if ((dia>=21 && dia<=31 && mes==5) || (dia>=1 && dia<=20 && mes==6)) {
                    System.out.println("Geminis");
                }

                else if ((dia>=21 && dia<=31 && mes==6)||(dia>=1 && dia<=22 && mes==7)) {
                    System.out.println("Cancer");
                }

                else if ((dia>=22 && dia<=31 && mes==7)||(dia>=1 && dia<=22 && mes==8)) {
                    System.out.println("Leo");
                }

                else if ((dia>=23 && dia<=31 && mes==8)||(dia>=1 && dia<=22 && mes==9)) {
                    System.out.println("Virgo");
                }

                else if ((dia>=23 && dia<=31 && mes==9)||(dia>=1 && dia<=22 && mes==10)) {
                    System.out.println("Libra");
                }

                else if ((dia>=23 && dia<=31 && mes==10)||(dia>=1 && dia<=21 && mes==11)) {
                    System.out.println("Escorpio");
                }

                else if ((dia>=22 && dia<=31 && mes==11)||(dia>=1 && dia<=21 && mes==12)) {
                    System.out.println("Sagitario");
                }
            
        }
    }
}
//TERMINADO!