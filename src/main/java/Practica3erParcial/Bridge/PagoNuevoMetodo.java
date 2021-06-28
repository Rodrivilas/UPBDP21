package Practica3erParcial.Bridge;

public class PagoNuevoMetodo implements IMetodoPago{
    private String nombreNuevoMetodo;
    private double descuento;

    public PagoNuevoMetodo(String nombreNuevoMetodo, double descuento) {
        this.nombreNuevoMetodo = nombreNuevoMetodo;
        this.descuento = descuento;
    }

    @Override
    public void realizacionPago(int precio) {
        System.out.println("Metodo de pago: "+nombreNuevoMetodo);
        System.out.println("Precio total del servicio: "+ (int)(precio-(precio*descuento)));
    }
}
