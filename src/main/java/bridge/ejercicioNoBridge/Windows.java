package bridge.ejercicioNoBridge;

public class Windows implements IPlataforma{

    public void showInfo(){
        System.out.println();
        System.out.println("Sistema: Windows");
    }
    @Override
    public void arquitexturaX86() {
        showInfo();
        System.out.println("Arquitectura x86");
    }

    @Override
    public void arquitexturaX64() {
        showInfo();
        System.out.println("Arquitectura x64");
    }
}
