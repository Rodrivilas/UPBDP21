package abstractFactory.ejercicios;

public class Avion {
    private String marca;
    private String capacidad;
    private String modelo;
    private String numerodeAsientos;

    public Avion(String marca, String capacidad, String modelo, String numerodeAsientos) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.modelo = modelo;
        this.numerodeAsientos = numerodeAsientos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumerodeAsientos() {
        return numerodeAsientos;
    }

    public void setNumerodeAsientos(String numerodeAsientos) {
        this.numerodeAsientos = numerodeAsientos;
    }
    public void showInfo(){
        System.out.println("Marca avión: "+marca);
        System.out.println("Capacidad del avión: "+capacidad);
        System.out.println("Modelo del avión: "+modelo);
        System.out.println("Número de asientos del avión: "+numerodeAsientos);

    }
}
