package Relacion_Ejercicios.Ejercicio6;

public class Jugador {
    private String nombre;
    private Carta carta;

    public Jugador() {}

    public Jugador(String nombre, Carta carta) {
        this.nombre=nombre;
        this.carta=carta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carta getCarta() {
        return carta;
    }

    public void setCarta(Carta carta) {
        this.carta = carta;
    }

    //Imprimir valores

    public void ImprimirCartaJugador() {
        System.out.println(carta.getValor()+"de "+carta.getPalo());
    }

    public void ImprimirNombreJugador() {
        System.out.println("El nombre del jugador es: "+getNombre());
    }
}

