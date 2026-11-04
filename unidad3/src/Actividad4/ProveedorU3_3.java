package Actividad4;
public class ProveedorU3_3 {
    long codigo;
    String direccion;
    String ciudad;
    String provincia;

    public ProveedorU3_3() {}
    
    public ProveedorU3_3(long codigo, String direccion, String ciudad, String provincia) {
        this.codigo=codigo;
        this.direccion=direccion;
        this.ciudad=ciudad;
        this.provincia=provincia;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    // public ProveedorU3_3(ProveedorU3_3 objeto) {
    //     this.codigo=codigo.getCodigo();
    //     this.direccion=direccion.getDireccion();
    //     this.ciudad=ciudad.getCiudad();
    //     this.provincia=provincia.getProvincia;
    // }

    
}
