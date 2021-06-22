package bridge.ejercicio2.noBridge;

import bridge.ejercicio2.IEnvio;

public class EmpresaSRL implements IEmpresa {
    private Paquete paquete;

    public EmpresaSRL(Paquete paquete) {
        this.paquete = paquete;
    }


    @Override
    public void envioPaqueteTierra() {
        System.out.println("*Envío por tierra");
        System.out.println("Costo total: "+(paquete.getPrecio()*1.05));
    }

    @Override
    public void envioPaqueteAire() {
        System.out.println("*Envío por Aire");
        System.out.println("Costo total: "+(paquete.getPrecio()*1.1));
    }

    @Override
    public void envioPaqueteMar() {
        System.out.println("*Envío por mar");
        System.out.println("Costo total: "+(paquete.getPrecio()*1.25));
    }
}
