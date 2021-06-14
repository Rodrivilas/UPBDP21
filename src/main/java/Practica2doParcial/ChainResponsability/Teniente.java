package Practica2doParcial.ChainResponsability;

public class Teniente implements ICuerpoEjercito{
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
        if(persona.getOrden().equals("Disciplina")){
            System.out.println("Teniente - Encargado de disciplina");
            persona.showInfo();
        }else{
            this.next.orden(persona);
        }
    }
}
