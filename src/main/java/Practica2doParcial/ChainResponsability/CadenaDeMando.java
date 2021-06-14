package Practica2doParcial.ChainResponsability;

public class CadenaDeMando implements ICuerpoEjercito{
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
        General general=new General();
        this.setNext(general);

        Teniente teniente=new Teniente();
        general.setNext(teniente);

        Coronel coronel=new Coronel();
        teniente.setNext(coronel);

        Cabo cabo=new Cabo();
        coronel.setNext(cabo);

        this.next.orden(persona);
    }
}
