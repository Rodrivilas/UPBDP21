package Practica3erParcial.Composite;

public abstract class Component {

    private String nombre;
    private String texto;
    private int numeroPalabras;

    public Component(String nombre, String texto)    {
        this.texto = texto;
        this.nombre=nombre;
        numeroPalabras = texto.split(" ").length;
    }

    public Component(String nombre) {
        this.nombre=nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTexto(String precio) {
        this.texto = precio;
    }

    public void setNumeroPalabras(int numeroPalabras){
        this.numeroPalabras = numeroPalabras;
    }

    public int getNumeroPalabras(){
        return numeroPalabras;
    }

    public String getTexto(){
        return this.texto;
    }

    public String getNombre(){
        return this.nombre;
    }

    public abstract void info();
    public abstract void add(Component component);
    public abstract void remove (Component component);
    public abstract void getChild(int position);
}
