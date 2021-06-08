package chainOfResponsability.ejercicio.ejercicio2;

public class AyudaAlCliente implements ISoftware{
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
        if(!persona.isFicha()){
            System.out.println("*No podemos ayudarle, le faltan requisitos:");
            persona.showInfo();
        }else{
            this.next.criteriaHandler(persona);
        }
    }
}
