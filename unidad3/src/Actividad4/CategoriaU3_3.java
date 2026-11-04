package Actividad4;
public class CategoriaU3_3 {
    long codigo;
    String nombre;

    public CategoriaU3_3() {}

    public CategoriaU3_3(long codigo, String nombre) {
        this.codigo=codigo;
        this.nombre=nombre;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // public CategoriaU3_3(CategoriaU3_3 obejto) {
    //     this.codigo=codigo.getCodigo();
    //     this.nombre=nombre.getNombre();
    // }

    
}
