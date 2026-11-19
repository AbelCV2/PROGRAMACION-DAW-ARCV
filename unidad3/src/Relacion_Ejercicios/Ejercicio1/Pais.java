package Relacion_Ejercicios.Ejercicio1;

public class Pais {
    //Atributos
    String nombre;
    int poblacion;
    int pib;

    public Pais (String nombre, int poblacion, int pib) {
        this.nombre=nombre;
        this.poblacion=poblacion;
        this.pib=pib;
    }

    public Pais() {}

    public Pais(Pais otra) {
        this.nombre=otra.getNombre();
        this.poblacion=otra.getPoblacion();
        this.pib=otra.getPib();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public int getPib() {
        return pib;
    }

    public void setPib(int pib) {
        this.pib = pib;
    }

    double pibpercap;

    public double getPibpercap() {
        return (double)(pib*100000)/poblacion;
    }

    public void ImprimirPibPerCap() {
        System.out.println("El PIB Per Capita de "+nombre+" es: "+getPibpercap());
    }

    public static void main(String[] args) {
        Pais p1 = new Pais("Espana", 50000000, 670);

        //System.out.println("El PIB Per Capita de "+pais.getNombre()+" es: "+pais.getPibpercap());

        p1.ImprimirPibPerCap();

        Pais p2 = new Pais();

        p2.setNombre("Francia");
        p2.setPib(6703999);
        p2.setPoblacion(60000000);

        p2.ImprimirPibPerCap();

        Pais p3 = new Pais(p2);

        p3.setNombre("Nigeria");
        p3.setPoblacion(2500000);
        p3.setPib(9450);

        p3.ImprimirPibPerCap();
    }
}
