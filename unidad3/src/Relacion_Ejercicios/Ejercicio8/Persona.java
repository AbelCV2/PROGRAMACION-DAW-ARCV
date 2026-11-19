package Relacion_Ejercicios.Ejercicio8;

public class Persona {
    
    String nombre, telefono, poblacion;
    int edad;
    
    public Persona() {}

    public Persona(String nombre, int edad, String telefono, String poblacion) {
        this.nombre=nombre;
        this.edad=edad;
        this.telefono=telefono;
        this.poblacion=poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    

    
}
