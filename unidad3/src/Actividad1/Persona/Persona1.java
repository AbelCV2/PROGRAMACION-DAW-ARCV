package Actividad1.Persona;
public class Persona1 {
    
    //PERSONA
    private String nombre;
    private String dni;
    private int fechaN;
    private String direccion;
    private String genero;
    private String estadocivil;
    
    
    //CONSTRUCTOR
    public Persona1 (String nombre , String dni , int fechaN , String direccion , String genero , String estadocivil ) {
        this.nombre=nombre;
        this.dni=dni;
        this.fechaN=fechaN;
        this.direccion=direccion;
        this.genero=genero;
        this.estadocivil=estadocivil;
    }

    public Persona1 () {
        this.nombre="Abel";
        this.dni="Z2722291Q";
        this.fechaN=2004;
        this.direccion="Huercal-Overa";
        this.genero="Masculino";
        this.estadocivil="Soltero";

    }

    
    //DAR Y MOSTRAR ATRIBUTOS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getDNI() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni=dni;
    }

    public int getFecha() {
        return fechaN;
    }

    public void setFecha(int fechaN) {
        this.fechaN=fechaN;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion=direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero=genero;
    }

    public String getEstado() {
        return estadocivil;
    }

    public void setEstado(String estadocivil) {
        this.estadocivil=estadocivil;
    }
    
    public static void main(String[] args) {
        
    }
}
