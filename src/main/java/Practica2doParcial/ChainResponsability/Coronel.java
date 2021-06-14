package Practica2doParcial.ChainResponsability;

public class Coronel implements ICuerpoEjercito{
    private ICuerpoEjercito next;

    @Override
    public void setNext(ICuerpoEjercito handler) {
        this.next=handler;
    }

    @Override
    public ICuerpoEjercito next() {
        return this.next;
    }

    @Override
    public void orden(Persona persona) {
        if(persona.getOrden().equals("Desbloqueos/Manifestaciones")){
            System.out.println("Coronel - Control de Bloqueos/Manifestaciones");
            persona.showInfo();
        }else{
            this.next.orden(persona);
        }
    }
}
