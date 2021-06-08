package chainOfResponsability.ejercicio.ejercicio2;

public class Cajero implements ISoftware{
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
        if(!persona.isPagoAlBanco()){
            System.out.println("*Realizando transacción...");
            System.out.println("*Transacción realizada con exito.");
            persona.setPagoAlBanco(true);
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
