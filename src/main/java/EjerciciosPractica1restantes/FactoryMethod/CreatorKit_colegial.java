package EjerciciosPractica1restantes.FactoryMethod;

public class CreatorKit_colegial extends CreatorKit{
    @Override
    public Kit_colegial crear() {
        Mochila mochila=new Mochila();
        mochila.setNumeroBolsillos(8);
        mochila.setTamaño("grande");

        Libros libros=new Libros();
        libros.setTipo("Horror");
        libros.setAutor("Edgar Allan Poe");

        Computadora computadora=new Computadora();
        computadora.setMarca("hp");
        computadora.setOs("Windows");


        Kit_colegial kit_colegial=new Kit_colegial();
        kit_colegial.setMochila(mochila);
        kit_colegial.setLibros(libros);
        kit_colegial.setComputadora(computadora);
        return kit_colegial;
    }
}
