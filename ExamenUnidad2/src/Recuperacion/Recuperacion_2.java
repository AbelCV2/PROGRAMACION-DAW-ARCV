package Recuperacion;

import java.util.Scanner;

public class Recuperacion_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroHumano;

        int numeroAleatorio;

        int contadorHumano=0;

        int contadorPC=0;

        int numeroPC;

        System.out.println("Bienvenido al juego de la adivinanza");

        System.out.println();
        
        
        do {
            numeroAleatorio=(int) (Math.random()*20)+1;

            System.out.println("El numero ha adivinar es: "+numeroAleatorio);
            
            System.out.println("Introduzca su numero (1-20):");

            numeroHumano=sc.nextInt();

            if (numeroHumano>20 || numeroHumano==0 || numeroHumano<-1) {
                System.out.println("Numero introducido incorrecto");
            }

            else if(numeroHumano==-1) {
                System.out.println("Juego terminado!");
                return;
            }
            
            else {
                System.out.println("El numero que usted ha introducido es: "+numeroHumano);

                System.out.println();
                
                System.out.println("Esperando el turno del ordenador...");

                numeroPC=(int) (Math.random()*20)+1;

                System.out.println();

                System.out.println("El ordenador ha introducido el numero: "+numeroPC);

                // COMPROBAR QUIEN HA ACERTADO O ESTA MAS CERCA

                if (numeroHumano==numeroAleatorio) {
                    System.out.println("Usted ha adivinado el numero");
                    contadorHumano++;
                }
                
                else if (numeroPC==numeroAleatorio) {
                    System.out.println("El ordenador ha adivinado el numero");
                    contadorPC++;
                } 

                else if ((numeroAleatorio-numeroHumano)<(numeroAleatorio-numeroPC)) {
                    System.out.println("Ninguno ha podido adivinar...");
                    System.out.println("Pero Usuario esta mas cerca, por lo tanto gana Usuario");
                    contadorHumano++;
                }

                else if ((numeroAleatorio-numeroHumano)>(numeroAleatorio-numeroPC)) {
                    System.out.println("Ninguno ha podido adivinar...");
                    System.out.println("Pero Ordenador esta mas cerca, por lo tanto gana Ordenador");
                    contadorPC++;
                }
            }
        }while(contadorPC<3);
    }
}