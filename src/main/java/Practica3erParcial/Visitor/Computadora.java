package Practica3erParcial.Visitor;

public class Computadora implements IElectronicos {
    private String marca;
    private String discoDuro;
    private String ram;
    private String procesador;

    public Computadora(String marca, String discoDuro, String ram, String procesador) {
        this.marca = marca;
        this.discoDuro = discoDuro;
        this.ram = ram;
        this.procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.mantenimiento(this);
    }
}
