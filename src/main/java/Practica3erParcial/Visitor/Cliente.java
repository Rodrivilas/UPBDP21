package Practica3erParcial.Visitor;

public class Cliente {
    public static void main(String[] args){
        Mantenimiento mantenimiento = new Mantenimiento();

        Celular celular = new Celular("Sony", "Xperia I M3","64 Gb");
        Computadora computadora = new Computadora("Razer","1Tb","64 Gb","Intel I9");
        Televisor televisor = new Televisor("LG", "4K");

        celular.accept(mantenimiento);
        computadora.accept(mantenimiento);
        televisor.accept(mantenimiento);
    }
}
