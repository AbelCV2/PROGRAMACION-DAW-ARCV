package Actividad1.CuentaCorriente;
public class CuentaCorriente {
    private String numeroCuenta;
    private double saldo;
    

    public CuentaCorriente (String numeroCuenta , double saldo) {
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
    }

    public String getNumeroC() {
        return numeroCuenta;
    }

    public void setNumeroC(String numeroCuenta) {
        this.numeroCuenta=numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo=saldo;
    }
}
