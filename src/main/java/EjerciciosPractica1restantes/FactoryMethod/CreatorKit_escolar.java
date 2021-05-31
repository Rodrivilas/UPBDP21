package EjerciciosPractica1restantes.FactoryMethod;

public class CreatorKit_escolar extends CreatorKit{

    @Override
    public Kit_escolar crear() {
        Mochila mochila=new Mochila();
        mochila.setNumeroBolsillos(12);
        mochila.setTamaño("gigante");

        Cuadernos cuadernos=new Cuadernos();
        cuadernos.setTipo("Carta");
        cuadernos.setNumeroHojas(500);

        Deportivo deportivo=new Deportivo();
        deportivo.setTalla("M");
        deportivo.setColor("Azul");
        deportivo.setNumeroDePrendas(80);


        Kit_escolar kit_escolar=new Kit_escolar();
        kit_escolar.setMochila(mochila);
        kit_escolar.setCuadernos(cuadernos);
        kit_escolar.setDeportivo(deportivo);
        return kit_escolar;
    }
}
