package Practica3erParcial.Visitor;

public class Televisor implements IElectronicos {
    private String marca;
    private String resolucion;


    public Televisor(String marca, String resolucion) {
        this.marca = marca;
        this.resolucion = resolucion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.mantenimiento(this);
    }

}
