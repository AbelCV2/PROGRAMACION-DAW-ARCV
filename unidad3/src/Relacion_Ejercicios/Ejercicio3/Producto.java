package Relacion_Ejercicios.Ejercicio3;

public class Producto {
    int codigo;
    String descripcion;
    String color;
    double costo;
    
    Fabrica fabrica;

    public Producto() {}

    public Producto(int codigo, String descripcion, String color, double costo, Fabrica fabrica) {
        this.codigo=codigo;
        this.descripcion=descripcion;
        this.color=color;
        this.costo=costo;
        this.fabrica=fabrica;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    //Funciones para imprimir los datos

    public void ImprimirCodigo() {
        System.out.println("El codigo es: "+getCodigo());
    }

    public void ImprimirDescripcion() {
        System.out.println("Su descripcion es: "+getDescripcion());
    }

    public void ImprimirColor() {
        System.out.println("Su color es: "+getColor());
    }

    public void ImprimirCosto() {
        System.out.println("Su costo es: "+getCosto());
    }

    
    //GET Y SET DE FABRICA
    public Fabrica getFabrica() {
        return fabrica;
    }

    public void setFabrica(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

    //Imprimir

    public void ImprimirFabrica() {
        System.out.println("La fabrica donde se fabrico el producto: "+getCodigo()+" es "+fabrica.getNombre());
    }


}
