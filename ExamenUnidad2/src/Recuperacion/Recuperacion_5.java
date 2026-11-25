package Recuperacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Recuperacion_5 {
    public static void contarNumeros() {
        int numeros;

        Scanner sc = new Scanner (System.in);

        System.out.println("Introduzca los numeros a contabilizar (Ingrese -1 para terminar):");

        numeros=sc.nextInt();

        do{
            System.out.println("Introduzca el siguiente numero:");

            numeros=sc.nextInt();
        }while(numeros!=-1);
    }
    public static void main(String[] args) {
        try {
            contarNumeros();
            } catch (InputMismatchException e) {
        System.out.println("Error: Ha introducido una letra, debe introducir un numero");
        }
    }
}
