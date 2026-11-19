package Relacion_Ejercicios.Ejercicio2;

//OPERACIONES CON FRACCIONES...

public class Racional {
    int numerador;
    int denominador; 

    public Racional(int numerador, int denominador) {
        this.numerador=numerador;
        this.denominador=denominador;

        if (denominador==0) {
            System.out.println("El denominador no puede ser 0");
            return;
        }
    }

    public int Suma() {
        return numerador+denominador;
    }

    public int Resta() {
        return numerador-denominador;
    }

    public int Multiplicacion() {
        return numerador*denominador;
    }

    public double Division() {
        return (double)numerador/denominador;
    }

    public void asignaNumerador(int numerador) {
        this.numerador=numerador;
    }

    public void asignaDenominador(int denominador) {
        this.denominador=denominador;
    }

    public void esIgual(Racional denominador) {}



    public static void main(String[] args) {
        Racional r1 = new Racional(24, 0);

        System.out.println("La division es: "+r1.Division());
    }
}
