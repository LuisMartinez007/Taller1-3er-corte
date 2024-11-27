package Taller1;

public class CuentaBancaria {
    String tipoCuenta;
    String numeroCuenta;
    int saldo;

    public CuentaBancaria(){
        this.tipoCuenta="normal";
        this.numeroCuenta="0000";
        this.saldo=50000;
    }

    public CuentaBancaria(String tipoCuenta,String numeroCuenta){
    this.tipoCuenta=tipoCuenta;
    this.numeroCuenta=numeroCuenta;

}
    public CuentaBancaria(String tipoCuenta, int saldo, String numeroCuenta){
        this.tipoCuenta=tipoCuenta;
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
    }

    @Override
    public String toString() { 
    return "CuentaBancaria [Número de cuenta=" + numeroCuenta + ", Saldo=" + saldo + "]";
}
}
