package Relacion_Ejercicios.Ejercicio3;

public class Sucursal {
    int numero;
    String domicilio;
    String ciudad;

    public Sucursal() {}

    public Sucursal(int numero, String domicilio, String ciudad) {
        this.numero=numero;
        this.domicilio=domicilio;
        this.ciudad=ciudad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    //Funciones para imprimir datos

    public void ImprimirNumero() {
        System.out.println("El número es: "+getNumero());
    }

    public void ImprimirCiudad() {
        System.out.println("La ciudad donde se encuentra es: "+getCiudad());
    }

    public void ImprimirDomicilio() {
        System.out.println("Su domicilio es: "+getDomicilio());
    }
}
