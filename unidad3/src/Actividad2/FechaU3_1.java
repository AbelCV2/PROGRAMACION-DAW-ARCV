package Actividad2;
public class FechaU3_1 {
    int dia;
    int mes;
    int anio;

    
    //Constructor por defecto
    public FechaU3_1() {}
    
    //Constructor por parametros
    public FechaU3_1 (int dia, int mes, int anio) {
        this.dia=dia; 
        this.mes=mes;  //Cambiar parametros
        this.anio=anio;
    }

    
    //Constructor copia
    // public FechaU3_1 (FechaU3_1 objeto) {
    //     this.dia=dia.getDia;
    //     this.mes=mes.getMes;
    //     this.anio=anio.getAnio;
    // }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    
}
