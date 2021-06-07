package memento.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class BaseDeDatos {
    private List<Memento> stateSaved = new ArrayList<>();

    public void addMemento(Memento memento){
        stateSaved.add(memento);
    }

    public Memento getMemento(int position) {
        return stateSaved.get(position);
    }
}
