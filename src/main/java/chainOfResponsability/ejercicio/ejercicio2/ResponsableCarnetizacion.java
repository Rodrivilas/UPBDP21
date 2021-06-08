package chainOfResponsability.ejercicio.ejercicio2;

public class ResponsableCarnetizacion implements ISoftware{
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
        if(persona.isPagoAlBanco() && persona.isCertificadoDeNacimiento() && persona.isFicha()){
            System.out.println("*Nuevo carnet registrado");
            persona.showInfo();
        }else{
            this.next.criteriaHandler(persona);
        }
    }
}
