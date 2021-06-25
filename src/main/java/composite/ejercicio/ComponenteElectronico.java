package composite.ejercicio;

public abstract class ComponenteElectronico {
    private String nombre;
    private int precio;

    public ComponenteElectronico(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract void operation();

    public abstract void add(ComponenteElectronico component);
    public abstract void remove(ComponenteElectronico component);
    public abstract void getChild(int position);
}
