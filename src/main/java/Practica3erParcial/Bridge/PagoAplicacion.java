package Practica3erParcial.Bridge;

public class PagoAplicacion implements IMetodoPago{
    @Override
    public void realizacionPago(int precio) {
        System.out.println("Metodo de pago: Aplicación móvil");
        System.out.println("Precio total del servicio: "+ (int)(precio-(precio*0.1)));
    }
}
