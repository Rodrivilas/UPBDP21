package Practica3erParcial.Visitor;

public class Celular implements IElectronicos {
    private String marca;
    private String nombre;
    private String memoria;

    public Celular(String marca, String nombre, String memoria) {
        this.marca = marca;
        this.nombre = nombre;
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.mantenimiento(this);
    }


}
