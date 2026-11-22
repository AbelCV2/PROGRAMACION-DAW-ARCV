package Relacion_Ejercicios.Ejercicio2;


public class Main {

    public static void main(String[] args) {

        // Crear dos números racionales
        Racional1 r1 = new Racional1();
        Racional1 r2 = new Racional1();

        // ASIGNAR VALORS A R1
        r1.asignaNumerador(2);
        r1.asignaDenominador(3);

        // ASIGNAR VALORES A R2
        r2.asignaNumerador(1);
        r2.asignaDenominador(4);

        
        // IMPRIMIR AMBOS
        System.out.println("Primer racional:");
        r1.imprimirRacional();

        System.out.println("Segundo racional:");
        r2.imprimirRacional();

        // AHORA LAS OPERACIONES
        
        // SUMA
        System.out.println("Suma:");
        r1.suma(r2).imprimirRacional();

        // RESTA
        System.out.println("Resta:");
        r1.resta(r2).imprimirRacional(); 
        

        // MULTIPLICACION
        System.out.println("Multiplicacion:");
        r1.multiplicacion(r2).imprimirRacional();

        // DIVISION
        System.out.println("Division:");
        r1.division(r2).imprimirRacional();

        // SI SON IGUALES...¿?
        System.out.println("¿SON IGUALES? : " + r1.esIgual(r2));
    }
}
