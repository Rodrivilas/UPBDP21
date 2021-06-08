package chainOfResponsability.ejercicio.ejercicio2;

public class Cliente {
    public static void main (String[] args) {
        ProgramaCarnetizacion p = new ProgramaCarnetizacion();
        p.criteriaHandler(new Persona("Rodolfo",false,true,true));
        p.criteriaHandler(new Persona("Raúl",false,true,true));
        p.criteriaHandler(new Persona("Valeria",false,true,false));
    }
}
