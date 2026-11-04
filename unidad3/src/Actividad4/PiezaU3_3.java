package Actividad4;
public class PiezaU3_3 {
    long codigo;
    String nombre;
    String color;
    int precio;

    public PiezaU3_3() {}

    public PiezaU3_3(long codigo, String nombre, String color, int precio) {
        this.codigo=codigo;
        this.nombre=nombre;
        this.color=color;
        this.precio=precio;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // public PiezaU3_3(PiezaU3_3 obejto) {
    //     this.codigo=codigo.getCodigo();
    //     this.nombre=nombre.getNombre();
    //     this.color=color.getColor();
    //     this.precio=precio.getPrecio();
    // }

    
}
