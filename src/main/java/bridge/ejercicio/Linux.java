package bridge.ejercicio;

public class Linux implements IPlataforma{
    private IArquitectura arquitectura;

    public Linux(IArquitectura arquitectura) {
        this.arquitectura = arquitectura;
    }

    @Override
    public void arquitectura() {
        System.out.println();
        System.out.println("Sistema: Linux");
        arquitectura.arquitectura();
    }
}
