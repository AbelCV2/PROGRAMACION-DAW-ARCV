package Relacion_Ejercicios.Ejercicio3;

public class Tarjeta {
    int numero;
    String nombre;
    String codigo;
    String fechaVenc;
    Cliente cliente;

    public Tarjeta() {}

    public Tarjeta(int numero, String nombre, String codigo, String fechaVenc, Cliente cliente) {
        this.numero=numero;
        this.nombre=nombre;
        this.codigo=codigo;
        this.fechaVenc=fechaVenc;
        
        this.cliente=cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(String fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    

    //Funciones para imprimir los datos

    public void ImprimirNumero() {
        System.out.println("El numero es: "+getNumero());
    }

    public void ImprimirNombre() {
        System.out.println("El nombre es: "+getNombre());
    }

    public void ImprimirCodigo() {
        System.out.println("Su codigo es: "+getCodigo());
    }

    public void ImprimirFechaVenc() {
        System.out.println("Su fecha de vencimiento es: "+getFechaVenc());
    }

    //Funciones para Cliente
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //Funciones para imprimir Cliente
    @Override
    public String toString() {
        return "Tarjeta [cliente=" + cliente + ", getCliente()=" + getCliente() + "]";
    }

    
    
}
