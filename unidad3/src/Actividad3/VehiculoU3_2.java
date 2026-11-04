package Actividad3;
public class VehiculoU3_2 {
    String marca;
    String referencia;
    int modelo;
    String placa;
    String color;
    int valor;

    public VehiculoU3_2() {}

    public VehiculoU3_2(String marca, String referencia, int modelo, String placa, String color, int valor) {
        this.marca=marca;
        this.referencia=referencia;
        this.modelo=modelo;
        this.placa=placa;
        this.color=color;
        this.valor=valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // public VehiculoU3_2(VehiculoU3_2 obejto) {
    //     this.marca=marca.getMarca();
    //     this.referencia=referencia.getReferencia();
    //     this.modelo=modelo.getModelo();
    //     this.placa=placa.getPlaca();
    //     this.color=color.getColor();
    //     this.valor=valor.getValor();
    // }

    
}
