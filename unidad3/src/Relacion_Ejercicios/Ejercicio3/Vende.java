package Relacion_Ejercicios.Ejercicio3;

public class Vende {
    //RELACION ENTRE SUCURSAL --- PRODUCTO
    Sucursal sucursal;
    Producto producto;


    public Vende() {}

    public Vende(Sucursal sucursal, Producto producto) {
        this.sucursal=sucursal;
        this.producto=producto;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    
}
