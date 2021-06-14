package Practica2doParcial.ChainResponsability;

public class General implements ICuerpoEjercito{
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
        if(persona.getOrden().equals("Entrevistas")){
            System.out.println("General - Entrevistando");
            persona.showInfo();
        }else{
            this.next.orden(persona);
        }
    }
}
