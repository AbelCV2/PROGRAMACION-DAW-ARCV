package Relacion_Ejercicios.Ejercicio3;


public class Vende {

    // RELACION
    
    Sucursal sucursal;
    Producto producto;
    double precioVenta;

    public Vende() {}

    public Vende(Sucursal sucursal, Producto producto, double precioVenta) {
        this.sucursal = sucursal;
        this.producto = producto;
        this.precioVenta = precioVenta;
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

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}

