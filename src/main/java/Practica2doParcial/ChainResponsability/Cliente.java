package Practica2doParcial.ChainResponsability;

public class Cliente {
    public static void main (String[] args) {
        CadenaDeMando c = new CadenaDeMando();
        c.orden(new Persona("Rodolfo Almanza","10298466", "Limpiezas"));
        c.orden(new Persona("Valeria Valenciaga","12323556", "Entrevistas"));
        c.orden(new Persona("Manuel Molinos","13466434", "Desbloqueos/Manifestaciones"));
        c.orden(new Persona("Raquel Mariño","12346667", "Disciplina"));


    }
}
