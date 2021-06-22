package bridge.ejercicio2.noBridge;

public class Cliente {
    public static void main(String[] args){
        EmpresaSRL e1 = new EmpresaSRL(new Paquete(100,"Audifonos"));
        e1.envioPaqueteMar();
        e1.envioPaqueteTierra();
        e1.envioPaqueteAire();

        EmpresaSA e2 = new EmpresaSA(new Paquete(100,"Audifonos"));
        e2.envioPaqueteMar();
        e2.envioPaqueteTierra();
        e2.envioPaqueteAire();

    }
}
