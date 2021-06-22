package bridge.ejercicio2;

public class EnvioMar implements IEnvio{

    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("*Envío por mar");
        System.out.println("Costo total: "+(paquete.getPrecio()*1.25));
    }
}
