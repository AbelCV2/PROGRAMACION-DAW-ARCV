package Relacion_Ejercicios.Ejercicio6;

public class Carta {
    int valor;
    String palo;

    public Carta() {}

    public Carta(int valor, String palo) {
        this.valor=valor;
        this.palo=palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public void ImprimirCarta() {
        System.out.println("Carta: "+getValor()+" "+getPalo());
    }

    // public Carta(int valor, Palos tipopalo) {
    //     this.valor=valor;
    //     this.tipopalo=tipopalo;
    // }

    // public int getValor() {
    //     return valor;
    // }

    // public void setValor(int valor) {
    //     this.valor = valor;
    // }

    // public Palos getTipopalo() {
    //     return tipopalo;
    // }

    // public void setTipopalo(Palos tipopalo) {
    //     this.tipopalo = tipopalo;
    // }

    // //Imprimir valores

    // public void ImprimirCartaValor() {
    //     System.out.println(getValor());
    // }

    // public void ImprimirCartaPalo() {
    //     System.out.println(getTipopalo());
    // }
}
