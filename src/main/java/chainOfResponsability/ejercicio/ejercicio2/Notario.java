package chainOfResponsability.ejercicio.ejercicio2;

public class Notario implements ISoftware{
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
        if(!persona.isCertificadoDeNacimiento()){
            System.out.println("*Solicitando certificado de nacimiento...");
            System.out.println("*Certificado encontrado.");
            persona.setCertificadoDeNacimiento(true);
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
