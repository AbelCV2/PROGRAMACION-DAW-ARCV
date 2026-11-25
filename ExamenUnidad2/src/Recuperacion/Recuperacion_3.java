package Recuperacion;

import java.util.Scanner;

public class Recuperacion_3 {
    public static void main(String[] args) {
        int numero;
        int contador=0;
        int suma=0; 
        
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Intoduzca un numero aleatorio (Positivo o Negativo):");

        
        numero=sc.nextInt();
        
        
        // BUCLE PARA INTRODUCIR NUMERO MIENTRAS SEAN DIFERENTES DE 0
        do{
            numero=sc.nextInt();

            contador++;

            // if (numero%2!=0 && numero%3==0 && numero%5==0) {
            //     suma=numero+suma;

            //     System.out.println("La suma de los impares multiplos de 3 y 5 es: "+suma);
            // }

        }while(numero!=0);

       
       // CONDICIONALES PARA HACER LAS OPERACIONES PEDIDAS
        
       // NUMERO IMPAR MULTIPLO DE 3 Y DE 5
       if (numero%2!=0 && (numero%3==0 && numero%5==0)) {
                suma=numero+suma;

                System.out.println("La suma de los impares multiplos de 3 y 5 es: "+suma);
            }

        // NUMERO PAR PARA LA MEDIA Y FALTA RESTAR EL MENOR NEGATIVO
        if (numero%2==0) {
                suma=numero+suma;
                int mediasuma = suma/contador;
                System.out.println("La media de los numeros pares positivos es: "+mediasuma);
            }

        // SI NO HAY IMPARES NI PARES POSITIVOS NI NEGATIVOS    
        if (numero%2==0 && (numero%2!=0 && numero<0) && numero>0) {
                System.out.println("No ha introducido Impares, Pares Positivos, Negativos");
                System.out.println("Hay 0 valores");
            }
    }
}
