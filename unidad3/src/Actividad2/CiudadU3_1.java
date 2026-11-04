package Actividad2;
public class CiudadU3_1 {
    int codigo;
    String nombre;
    int indicativo;

    public CiudadU3_1() {}

    public CiudadU3_1(int codigo, String nombre, int indicativo) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.indicativo=indicativo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(int indicativo) {
        this.indicativo = indicativo;
    }

    // public CiudadU3_1 (CiudadU3_1 objeto) {
    //     this.codigo=codigo.getCodigo();
    //     this.nombre=nombre.getNombre();
    //     this.indicativo=getIndicativo();
    // }

    
}
