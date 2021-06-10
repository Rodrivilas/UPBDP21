package state.ejercicios;

public class Apagado implements IStateComputadora{
    @Override
    public void handler(Computadora computadora) {
        computadora.setConsumoMemoriaRam(0);
        computadora.setConsumoEnCPU(0);
        System.out.println("*Apagado");
        System.out.println("Ningún programa abierto");
        computadora.showInfo();
    }
}
