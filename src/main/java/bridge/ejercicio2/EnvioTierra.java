package bridge.ejercicio2;

public class EnvioTierra implements IEnvio{

    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("*Envío por tierra");
        System.out.println("Costo total: "+(paquete.getPrecio()*1.05));
    }
}
