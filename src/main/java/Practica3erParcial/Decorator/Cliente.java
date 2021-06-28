package Practica3erParcial.Decorator;

public class Cliente {
    public static void main(String[] args) {
        IPersonaje personajeCaballero = new Personaje("Caballero humano Juan el destructor de chanchos");
        personajeCaballero.operation();

        personajeCaballero = new AgregarArma(personajeCaballero, "Escopeta");
        personajeCaballero.operation();

        personajeCaballero = new AgregarEscudo(personajeCaballero);
        personajeCaballero.operation();

        personajeCaballero = new AgregarEscudo(personajeCaballero);
        personajeCaballero.operation();

        personajeCaballero = new AgregarPocionDeCuracion(personajeCaballero);
        personajeCaballero.operation();

        personajeCaballero = new AgregarPocionDeCuracion(personajeCaballero);
        personajeCaballero.operation();

        personajeCaballero = new AgregarPocionDeCuracion(personajeCaballero);
        personajeCaballero.operation();
    }
}
