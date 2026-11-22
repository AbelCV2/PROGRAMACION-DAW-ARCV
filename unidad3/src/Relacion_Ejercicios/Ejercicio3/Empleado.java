package Relacion_Ejercicios.Ejercicio3;

public class Empleado {
    String legajo;
    String dni;
    String nombre;
    int telefonos;
    Domicilio domicilio;

    public Empleado() {}

    public Empleado(String legajo, String dni, String nombre, int telefonos, Domicilio domicilio) {
        this.legajo=legajo;
        this.dni=dni;
        this.nombre=nombre;
        this.telefonos=telefonos;
        this.domicilio=domicilio;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(int telefonos) {
        this.telefonos = telefonos;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

}