package bridge.ejercicio2;

public class Cliente {
    public static void main(String[] args){
        EmpresaSRL e1 =new EmpresaSRL(new Paquete(100, "Audifonos sony"),new EnvioAire());
        e1.enviarPaquete();

        EmpresaSRL e2 =new EmpresaSRL(new Paquete(250, "Parlantes philips"),new EnvioTierra());
        e2.enviarPaquete();

        EmpresaSRL e3 =new EmpresaSRL(new Paquete(30, "Papeles importantes"),new EnvioMar());
        e3.enviarPaquete();

        EmpresaSA e4 =new EmpresaSA(new Paquete(80, "Mini SD de 256gb"),new EnvioAire());
        e4.enviarPaquete();

        EmpresaSA e5 =new EmpresaSA(new Paquete(2300, "Televisor 5K"),new EnvioTierra());
        e5.enviarPaquete();

        EmpresaSA e6 =new EmpresaSA(new Paquete(50, "Caja de herramientas"),new EnvioMar());
        e6.enviarPaquete();
    }
}
