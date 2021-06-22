package bridge.ejercicioNoBridge;

public class Cliente {
    public static void main(String[] args){
        Linux l =new Linux();
        l.arquitexturaX86();
        l.arquitexturaX64();

        Windows w = new Windows();
        w.arquitexturaX86();
        w.arquitexturaX64();
    }
}
