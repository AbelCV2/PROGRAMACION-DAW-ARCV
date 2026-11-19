package Relacion_Ejercicios.Ejercicio3;

public class Cliente {
    
    String codigo, nombre, ciudad, dni, fechaNac;

    Sucursal sucursal;

    public Cliente() {}

    public Cliente(String codigo, String nombre, String ciudad, String dni, String fechaNac, Sucursal sucursal) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.ciudad=ciudad;
        this.dni=dni;
        this.fechaNac=fechaNac;
        this.sucursal=sucursal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    //Funciones para imprimir los datos

    public void ImprimirCodigo() {
        System.out.println("El código es: "+getCodigo());
    }

    public void ImprimirNombre() {
        System.out.println("El nombre es: "+getNombre());
    }

    public void ImprimirCiudad() {
        System.out.println("La ciudad es: "+getCiudad());
    }

    public void ImprimirDni() {
        System.out.println("El DNI es: "+getDni());
    }

    public void ImprimirFechaNac() {
        System.out.println("Su fecha de nacimiento es: "+getFechaNac());
    }

    
    //GET Y SET DE SUCURSAL

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }


    
}
