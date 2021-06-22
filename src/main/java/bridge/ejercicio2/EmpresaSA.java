package bridge.ejercicio2;

public class EmpresaSA implements IEmpresa{
    private Paquete paquete;
    private IEnvio envio;

    public EmpresaSA(Paquete paquete, IEnvio envio) {
        this.paquete = paquete;
        this.envio = envio;
    }


    @Override
    public void enviarPaquete() {
        System.out.println("EmpresaSA");
        paquete.showInfo();
        envio.enviarPaquete(paquete);
    }
}
