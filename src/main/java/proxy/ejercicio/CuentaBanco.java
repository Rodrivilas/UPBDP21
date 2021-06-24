package proxy.ejercicio;

public class CuentaBanco implements ICuentaBanco{

    private int numeroCuenta;
    private String titular;
    private int cajaDeAhorros;

    public CuentaBanco(int numeroCuenta, String titular, int cajaDeAhorros) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.cajaDeAhorros = cajaDeAhorros;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getCajaDeAhorros() {
        return cajaDeAhorros;
    }

    public void setCajaDeAhorros(int cajaDeAhorros) {
        this.cajaDeAhorros = cajaDeAhorros;
    }

    public void showInfo(){
        System.out.println();
        System.out.println("Número de cuenta: "+ numeroCuenta);
        System.out.println("Titular de cuenta: "+ titular);
        System.out.println("Saldo de cuenta: "+ cajaDeAhorros+ " Bolivianos");
    }


    @Override
    public void pago(CuentaBanco cuentaBanco, String glosa, int monto, String moneda) {
        if (monto<=cajaDeAhorros){
            setCajaDeAhorros(cajaDeAhorros-monto);
            System.out.println("$ Transacción realizada con exito");
            System.out.println("Saldo actual: "+ cajaDeAhorros+ " Bolivianos");
        }else{
            System.out.println("X Transacción cancelada, fondos insuficientes.");
        }
    }
}
