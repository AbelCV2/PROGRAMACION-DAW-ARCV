package Relacion_Ejercicios.Ejercicio2;


public class Racional1 {

    private int numerador;
    private int denominador;

    public void asignaNumerador(int x) {
        numerador=x;
    }

    public void asignaDenominador(int y) {
        
        if (y != 0) {
            denominador=y;
        } 
        
        else {
            System.out.println("El denominador no puede ser cero");
        }
    }

    public void imprimirRacional() {
        System.out.println(numerador+"/"+denominador);
    }

    // SUMA
    public Racional1 suma(Racional1 b) {
        Racional1 resultado = new Racional1();

        resultado.numerador = (numerador*b.denominador) + (b.numerador*denominador);

        resultado.denominador = (denominador*b.denominador);

        return resultado;
    }

    // RESTA
    public Racional1 resta(Racional1 b) {
        Racional1 resultado = new Racional1();

        resultado.numerador = (numerador*b.denominador) - (b.numerador*denominador);
        resultado.denominador = (denominador*b.denominador);

        return resultado;
    }

    // MULTIPLICACION
    public Racional1 multiplicacion(Racional1 b) {
        Racional1 resultado = new Racional1();

        resultado.numerador = (numerador*b.numerador);
        resultado.denominador = (denominador*b.denominador);

        return resultado;
    }

    // DIVISION
    public Racional1 division(Racional1 b) {
        Racional1 resultado = new Racional1();

        if (b.numerador != 0) {
            resultado.numerador = (numerador*b.denominador);
            resultado.denominador = (denominador*b.numerador);
        } 
        
        else {
            System.out.println("No se puede dividir entre cero");
        }

        return resultado;
    }

    // COMPROBAR SI SON IGUALES
    public boolean esIgual(Racional1 b) {
        return (numerador*b.denominador)==(denominador*b.numerador);
    }
}
