package bridge.ejercicio;

public class Windows implements IPlataforma{
    private IArquitectura arquitectura;

    public Windows(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void arquitectura() {
        System.out.println();
        System.out.println("Sistema: Windows");
        arquitectura.arquitectura();
    }
}
