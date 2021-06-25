package composite.ejercicio;

public class Componente extends ComponenteElectronico {

    public Componente(String nombre, int pago) {
        super(nombre, pago);
    }

    @Override
    public void operation() {
         System.out.println("Nombre: "+this.getNombre());
         System.out.println("Precio: "+this.getPrecio());
    }

    @Override
    public void add(ComponenteElectronico component) {
       System.out.println("no es posible agregar nuevos componentes, esta en el componente mas pequenio");
    }

    @Override
    public void remove(ComponenteElectronico component) {
        System.out.println("no es posible remover componentes, esta en el componente mas pequenio");
    }

    @Override
    public void getChild(int position) {
        System.out.println("no es posible obtener componentes, esta en el componente mas pequenio");
    }
}
