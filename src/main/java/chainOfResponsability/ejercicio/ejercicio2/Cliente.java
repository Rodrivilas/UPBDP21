package chainOfResponsability.ejercicio.ejercicio2;

public class Cliente {
    public static void main (String[] args) {
        ProgramaCarnetizacion p = new ProgramaCarnetizacion();

        p.criteriaHandler(new Persona("Valeria Valentino",true,false,false));
    }
}
