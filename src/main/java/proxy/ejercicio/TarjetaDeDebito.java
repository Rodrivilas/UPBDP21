package proxy.ejercicio;

public class TarjetaDeDebito implements ICuentaBanco{

    @Override
    public void pago(CuentaBanco cuentaBanco,String glosa ,int monto, String moneda) {
        cuentaBanco.showInfo();
        System.out.println("Compra de: "+ glosa);
        System.out.println("Costo: "+ monto +" "+ moneda);
        if(moneda.equals("Bolivianos")){
            cuentaBanco.pago(cuentaBanco,glosa,monto,moneda);
        }else if(moneda.equals("Dolares")){
            int cambio= (int) (monto*6.96);
            cuentaBanco.pago(cuentaBanco,glosa,cambio,moneda);
        }else if(moneda.equals("Euros")){
            int cambio= (int) (monto*8.25);
            cuentaBanco.pago(cuentaBanco,glosa,cambio,moneda);
        }else if(moneda.equals("Libras")){
            int cambio= (int) (monto*9.66);
            cuentaBanco.pago(cuentaBanco,glosa,cambio,moneda);
        }else{
            System.out.println("*ERROR* La moneda con la que intenta pagar no puede cancelarse a no ser que se comuniquen con el banco.");
        }
    }
}
