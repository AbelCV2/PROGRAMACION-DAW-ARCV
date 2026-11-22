package Relacion_Ejercicios.Ejercicio3;

public class Domicilio {
    
    String ciudad;
    int numero;
    String calle;
    
    public Domicilio() {}

    public Domicilio(String ciudad, int numero, String calle) {
        this.ciudad=ciudad;
        this.numero=numero;
        this.calle=calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    
    
}
