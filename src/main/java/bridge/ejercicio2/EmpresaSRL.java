package bridge.ejercicio2;

public class EmpresaSRL implements IEmpresa{
    private Paquete paquete;
    private IEnvio envio;

    public EmpresaSRL(Paquete paquete, IEnvio envio) {
        this.paquete = paquete;
        this.envio = envio;
    }


    @Override
    public void enviarPaquete() {
        System.out.println("EmpresaSRL");
        paquete.showInfo();
        envio.enviarPaquete(paquete);
    }
}
