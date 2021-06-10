package state.ejercicios;

public class Reiniciar implements IStateComputadora{
    @Override
    public void handler(Computadora computadora) {
        computadora.setConsumoMemoriaRam(0);
        computadora.setConsumoEnCPU(0);
        System.out.println("*Reiniciando");
        System.out.println("Ningún programa abierto");
        computadora.showInfo();
    }
}
