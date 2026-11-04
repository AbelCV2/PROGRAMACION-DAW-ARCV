package Actividad3;
public class PersonaU3_2 {
    private String docld;
    private String nombre;
    private String apellido;
    private String fechaNac;
    private char genero;

    private VehiculoU3_2 Pvehiculo;

    public PersonaU3_2() {}

    public PersonaU3_2(String docld, String nombre, String apellido, String fechaNac, char genero) {
        this.docld=docld;
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaNac=fechaNac;
        this.genero=genero;
    }

    public String getDocld() {
        return docld;
    }

    public void setDocld(String docld) {
        this.docld = docld;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public VehiculoU3_2 getPvehiculo() {
        return Pvehiculo;
    }

    public void setPvehiculo(VehiculoU3_2 pvehiculo) {
        Pvehiculo = pvehiculo;
    }

    // public PersonaU3_2(PersonaU3_2 obejto) {
    //     this.docld=docld.getDocld();
    //     this.nombre=nombre.getNombre();
    //     this.apellido=apellido.getApellido();
    //     this.fechaNac=fechaNac.getFechaNac();
    //     this.genero=genero.getGenero();

    // }


    
    
}
