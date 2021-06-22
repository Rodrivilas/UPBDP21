package bridge.ejercicio;

public class Cliente {
    public static void main(String[] args){
        Windows w = new Windows(new ArquitecturaX64());
        w.arquitectura();

        Windows w1 = new Windows(new ArquitecturaX86());
        w1.arquitectura();

        Linux l = new Linux(new ArquitecturaX64());
        l.arquitectura();

        Linux l1 = new Linux(new ArquitecturaX86());
        l1.arquitectura();
    }
}
