package EjerciciosPractica1restantes.FactoryMethod;

public class Kit_escolar implements Kit{
    private Mochila mochila;
    private Deportivo deportivo;
    private Cuadernos cuadernos;

    public Kit_escolar() {
        mochila = new Mochila();
        deportivo= new Deportivo();
        cuadernos = new Cuadernos();
    }

    @Override
    public void crear() {
        System.out.println("Kit escolar*******************");
        mochila.ShowInformation();
        deportivo.ShowInformation();
        cuadernos.ShowInformation();
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuadernos getCuadernos() {
        return cuadernos;
    }

    public void setCuadernos(Cuadernos cuadernos) {
        this.cuadernos = cuadernos;
    }
}
