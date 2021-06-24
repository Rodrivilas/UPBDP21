package proxy.ejercicio;

public class Cliente {
    public static void main (String[] args){
        TarjetaDeDebito tarjetaDeDebito = new TarjetaDeDebito();
        CuentaBanco cuentaBanco = new CuentaBanco(40531334,"Fernando Alvarado Jr", 6000);
        tarjetaDeDebito.pago(cuentaBanco,"Pelota de futbo",300,"Bolivianos");
        tarjetaDeDebito.pago(cuentaBanco,"Masajeadora para pies de lujo",200,"Dolares");
        tarjetaDeDebito.pago(cuentaBanco,"Polera firmada por el bicho",100,"Euros");
        tarjetaDeDebito.pago(cuentaBanco,"Tarjeta pokemon rara",150,"Libras");
        tarjetaDeDebito.pago(cuentaBanco,"Bayoneta militar",600,"Libras");
    }
}
