package Relacion_Ejercicios.Ejercicio3;

public class Trabaja {
    
    Sucursal sucursal;
    Empleado empleado;

    public Trabaja() {}

    public Trabaja(Sucursal sucursal, Empleado empleado) {
        this.sucursal=sucursal;
        this.empleado=empleado;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    
}
