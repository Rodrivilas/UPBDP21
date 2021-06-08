package chainOfResponsability.ejercicio.ejercicio2;

public class ProgramaCarnetizacion implements ISoftware {
    private ISoftware next;

    @Override
    public void setNext(ISoftware responsable) {
        this.next=responsable;
    }

    @Override
    public ISoftware next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        ResponsableCarnetizacion responsableCarnetizacion =new ResponsableCarnetizacion();
        this.setNext(responsableCarnetizacion);

        Notario notario= new Notario();
        responsableCarnetizacion.setNext(notario);

        Cajero cajero= new Cajero();
        notario.setNext(cajero);

        AyudaAlCliente ayudaAlCliente= new AyudaAlCliente();
        cajero.setNext(ayudaAlCliente);

        this.next.criteriaHandler(persona);
    }
}
