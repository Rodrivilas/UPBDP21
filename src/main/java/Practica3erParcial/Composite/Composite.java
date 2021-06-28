package Practica3erParcial.Composite;

import java.util.List;
import java.util.ArrayList;


public class Composite extends Component {

    private List<Component> listaArchivos = new ArrayList<>();


    public Composite(String nombre) {
        super(nombre);
    }

    @Override
    public void info() {
        for (Component component : listaArchivos){
            component.info();
        }
        System.out.println("*Nombre: "+ getNombre());
        System.out.println("*Numero de palabras: "+ getNumeroPalabras());

    }

    @Override
    public void add(Component component) {
        listaArchivos.add(component);
        this.setNumeroPalabras(getNumeroPalabras()+component.getNumeroPalabras());
    }

    @Override
    public void remove(Component component) {
        listaArchivos.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(listaArchivos.get(position).getNumeroPalabras()+" "+ listaArchivos.get(position).getNombre());
    }
}
