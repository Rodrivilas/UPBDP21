package Practica3erParcial.Bridge;

public class InstalacionDeAgua implements IEmpresa{
    private int numeroTicket;
    private String nombreCliente;
    private String trabajadorDesignado;
    private int precio;
    private IMetodoPago metodoPago;

    public InstalacionDeAgua(int numeroTicket, String nombreCliente, String trabajadorDesignado, int precio, IMetodoPago metodoPago) {
        this.numeroTicket = numeroTicket;
        this.nombreCliente = nombreCliente;
        this.trabajadorDesignado = trabajadorDesignado;
        this.precio = precio;
        this.metodoPago = metodoPago;
    }

    @Override
    public void instalacion() {
        System.out.println("******************");
        System.out.println("Numero ticket: "+numeroTicket);
        System.out.println("Nombre cliente: "+nombreCliente);
        System.out.println("Personal asignado: "+trabajadorDesignado);
        metodoPago.realizacionPago(precio);
    }
}
