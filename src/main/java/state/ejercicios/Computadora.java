package state.ejercicios;


public class Computadora {
    private IStateComputadora state;
    private int consumoMemoriaRam;
    private int consumoEnCPU;


    public IStateComputadora getState(){
        return state;
    }

    public void setState(IStateComputadora state){
        this.state = state;
    }
    public void request(){
        this.state.handler(this);
    }

    public int getConsumoMemoriaRam() {
        return consumoMemoriaRam;
    }

    public void setConsumoMemoriaRam(int consumoMemoriaRam) {
        this.consumoMemoriaRam = consumoMemoriaRam;
    }

    public int getConsumoEnCPU() {
        return consumoEnCPU;
    }

    public void setConsumoEnCPU(int consumoEnCPU) {
        this.consumoEnCPU = consumoEnCPU;
    }

    public void showInfo(){
        System.out.println("Consumo en memoria RAM: "+consumoMemoriaRam+"%");
        System.out.println("Consumo en CPU: "+consumoEnCPU+"%");
    }
}
