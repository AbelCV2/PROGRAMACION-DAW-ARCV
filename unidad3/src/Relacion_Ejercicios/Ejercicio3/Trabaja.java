package Relacion_Ejercicios.Ejercicio3;


public class Trabaja {

    Sucursal sucursal;
    Empleado empleado;
    String horario;
    String dia;

    public Trabaja() {}

    public Trabaja(Sucursal sucursal, Empleado empleado, String horario, String dia) {
        this.sucursal = sucursal;
        this.empleado = empleado;
        this.horario = horario;
        this.dia = dia;
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
