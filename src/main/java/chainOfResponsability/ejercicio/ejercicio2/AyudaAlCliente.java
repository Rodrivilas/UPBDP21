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
            System.out.println("*No podemos ayudarle, le falta sacar ficha:");
            System.out.println("*Sacando ficha...");
            persona.setFicha(true);
            if (persona.isPagoAlBanco() && persona.isCertificadoDeNacimiento() && persona.isFicha()) {
                ResponsableCarnetizacion responsableCarnetizacion = new ResponsableCarnetizacion();
                responsableCarnetizacion.criteriaHandler(persona);
            }else{
                this.next.criteriaHandler(persona);
            }
        }else{
            this.next.criteriaHandler(persona);
        }
    }
}
