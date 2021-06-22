package bridge.ejercicio2;

public class EnvioAire implements IEnvio{

    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("*Envío por Aire");
        System.out.println("Costo total: "+(paquete.getPrecio()*1.1));
    }
}
