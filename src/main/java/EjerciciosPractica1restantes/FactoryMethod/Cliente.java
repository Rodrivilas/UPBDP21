package EjerciciosPractica1restantes.FactoryMethod;

public class Cliente {
    public static void main (String[] args) {
        CreatorKit kit_colegial=new CreatorKit_colegial();
        kit_colegial.crear().crear();
        CreatorKit kit_escolar=new CreatorKit_escolar();
        kit_escolar.crear().crear();
    }
}
