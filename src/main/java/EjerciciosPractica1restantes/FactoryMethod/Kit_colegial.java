package EjerciciosPractica1restantes.FactoryMethod;


public class Kit_colegial implements Kit{
    private Mochila mochila;
    private Libros libros;
    private Computadora computadora;

    public Kit_colegial() {
        mochila=new Mochila();
        libros=new Libros();
        computadora=new Computadora();

    }

    @Override
    public void crear() {
        System.out.println("Kit colegial*******************");
        mochila.ShowInformation();
        libros.ShowInformation();
        computadora.ShowInformation();
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }
}
