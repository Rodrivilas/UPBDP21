package composite.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Composite extends ComponenteElectronico {

    private List<ComponenteElectronico> componentList = new ArrayList<>();

    public Composite(String nombre, int pago) {
        super(nombre, pago);
    }

    @Override
    public void operation() {
        System.out.println("----- Composite ----- : "+this.getNombre());
        for (ComponenteElectronico component :componentList ) {
            component.operation();
            int total= component.getPrecio()+this.getPrecio();
            this.setPrecio(total);
        }
        System.out.println("----- Precio total "+this.getNombre()+" "+this.getPrecio());
    }

    @Override
    public void add(ComponenteElectronico component) {
        componentList.add(component);
    }

    @Override
    public void remove(ComponenteElectronico component) {
        componentList.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println("attribute1: "+componentList.get(position).getNombre());
        System.out.println("attribute2: "+componentList.get(position).getPrecio());
    }
}
