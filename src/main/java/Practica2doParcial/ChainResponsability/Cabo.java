package Practica2doParcial.ChainResponsability;

public class Cabo implements ICuerpoEjercito{
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
        if(persona.getOrden().equals("Limpiezas")){
            System.out.println("Cabo - Lavando el piso");
            persona.showInfo();
        }else{
            this.next.orden(persona);
        }
    }
}
