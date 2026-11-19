package Relacion_Ejercicios.Ejercicio7;

public class Monstruo {
    String nombreM;
    int vidaM;
    int ataqueM;
    Heroe ataqueH;

    public Monstruo() {}

    public Monstruo(String nombreM, int vidaM, int ataqueM) {
        this.vidaM=vidaM;
        this.nombreM=nombreM;
        this.ataqueM=ataqueM;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public int getVidaM() {
        return vidaM;
    }

    public void setVidaM(int vidaM) {
        this.vidaM = vidaM;
    }

    public int getAtaqueM() {
        return ataqueM;
    }

    public void setAtaqueM(int ataqueM) {
        this.ataqueM = ataqueM;
    }


    //Imprimir

    public void ImprimirVidaM() {
        System.out.println("Vida del Monstruo: "+getVidaM());
    }
    
    public void ImprimirAtaqueM() {
        System.out.println("Su capacidad de ataque es de: "+getAtaqueM());
    }

    public void ImprimirNombreM() {
        System.out.println("El nombre del Monstruo es: "+getNombreM());
    }

    public int RecibirDanoM(int dano) {
        vidaM = vidaM-dano;
        return vidaM;
    }

    public void ImprimirDanoRecibidoM() {
        System.out.println("Vida restante del monstruo: "+getVidaM());
    }
}
