// else if (mes==3) {
//             if (dia>31) {
//                 System.out.println("La fecha introducida es incorrecta");
//             }
//             else if ( dia<31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                 System.out.println("La fecha introducida de: "+dia+" "+" Marzo"+anio+ " es correcta y bisiesto");
//             }
//             else if (dia<31 && (anio%4!=0 && anio%100==0) || anio%400!=0) {
//                 System.out.println("La fecha introducida de: "+dia+" "+" Marzo"+anio+ " es correcta y no es bisiesto");
//             }
//         }

//         else if (mes==4) {
//             if (dia>30) {
//                 System.out.println("La fecha introducida es incorrecta");
//             }
//             else if ( dia<30 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                 System.out.println("La fecha introducida de: "+dia+" "+" Abril"+anio+ " es correcta y bisiesto");
//             }
//             else if (dia<30 && (anio%4!=0 && anio%100==0) || anio%400!=0) {
//                 System.out.println("La fecha introducida de: "+dia+" "+" Abril"+anio+ " es correcta y no es bisiesto");
//             }
//         }

//         else if (mes==4) {
//             if (dia>31) {
//                 System.out.println("La fecha introducida es incorrecta");
//             }
//             else if ( dia<31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                 System.out.println("La fecha introducida de: "+dia+" "+" Mayo"+anio+ " es correcta y bisiesto");
//             }
//             else if (dia<31 && (anio%4!=0 && anio%100==0) || anio%400!=0) {
//                 System.out.println("La fecha introducida de: "+dia+" "+" Mayo"+anio+ " es correcta y no es bisiesto");
//             }
//          }

//         else if (mes==5) {
//             if (dia>30) {
//                 System.out.println("La fecha introducida es incorrecta");
//             }
//             else if ( dia<31 && (anio%4==0 && anio%100!=0) || anio%400==0) {
//                 System.out.println("La fecha introducida de: "+dia+" "+" Mayo"+anio+ " es correcta y bisiesto");
//             }
//             else {
//                 System.out.println("La fecha introducida de: "+dia+" "+" Mayo"+anio+ " es correcta y no es bisiesto");
//             }
//          }

//         else if (mes==6) {
//             if (dia>31) {
//                 System.out.println("La fecha introducida es incorrecta");
//             }

//             else if ( dia<31 && (anio%4==0 && anio%100!=0)|| anio%400==0) {
//                 System.out.println("La fecha introducida de: "+dia+" "+" Junio"+anio+ " es correcta y bisiesto");
//             }

//             else if (dia<31 && (anio%4!=0 && anio%100==0) || anio%400!=0) {
//                 System.out.println("La fecha introducida de: "+dia+" "+" Junio"+anio+ " es correcta y no es bisiesto");
//             }
//         }
//         }
import java.util.Scanner;

public class bisiestosv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el dia:");
        int dia = sc.nextInt();

        System.out.println("Ingrese el mes:");
        int mes = sc.nextInt();

        System.out.println("Ingrese el año:");
        int anio = sc.nextInt();

        // 1. Guardamos los nombres de los meses en un arreglo. El espacio 0 lleva "Error" para que el 1 sea Enero.
        String[] nombresMeses = {"Error", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                                 "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        // 2. Filtro inicial: validamos rangos básicos de días y meses
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            System.out.println("La fecha introducida es incorrecta");
            return; // Termina el programa inmediatamente si la estructura básica está mal
        }

        // 3. Calculamos si es bisiesto UNA SOLA VEZ (usamos paréntesis correctos para agrupar las condiciones)
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

        // 4. Determinamos el máximo de días que tiene el mes ingresado
        int diasMaximos = 31; // La mayoría tiene 31

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasMaximos = 30; // Meses de 30 días
        } else if (mes == 2) {
            diasMaximos = esBisiesto ? 29 : 28; // Febrero tiene 29 si es bisiesto, si no, 28
        }

        // 5. Validaciones finales y salidas
        if (dia > diasMaximos) {
            if (mes == 2 && dia == 29) {
                System.out.println("La fecha introducida es incorrecta (Los dias 29 de Febrero solo existen en los años bisiestos)");
            } else {
                System.out.println("La fecha introducida es incorrecta");
            }
        } else {
            // Conseguimos el nombre del mes usando nombresMeses[mes] sin usar ningún 'if' repetitivo
            String textoBisiesto = esBisiesto ? "es bisiesto" : "no es bisiesto";
            System.out.println("La fecha introducida del: " + dia + " de " + nombresMeses[mes] + " del año " + anio + " es correcta y " + textoBisiesto);
        }
        
        sc.close();
    }
}
