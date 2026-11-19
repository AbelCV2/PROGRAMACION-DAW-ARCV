package Relacion_Ejercicios.Ejercicio7;

public class Heroe {
    String nombre;
    int vida;
    int ataque;
    Monstruo ataqueM;

    public Heroe() {}

    public Heroe(String nombre, int vida, int ataque) {
        this.nombre=nombre;
        this.vida=vida;
        this.ataque=ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int RecibirDanoH(int dano) {
        vida = vida - dano;
        return vida;
    }

    public void ImprimirDanoRecibidoH() {
        System.out.println("Vida restante del monstruo: "+getVida());
    }
    
    public void ImprimirVidaH() {
        System.out.println("Vida restante del Humano: "+getVida());
    }

    public void ImprimirAtaqueH() {
        System.out.println("Capacida de ataque del Humano es: "+getAtaque());
    }

    public void ImprimirNombreH() {
        System.out.println("El nombre del Humano es: "+getNombre());
    }
}
