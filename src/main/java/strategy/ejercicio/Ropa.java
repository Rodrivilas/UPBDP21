package strategy.ejercicio;

public class Ropa {
private String tipo;
private double precio;

    public Ropa(String tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void showInfo(){
        System.out.println("Tipo: "+tipo);
        System.out.println("Precio "+precio);
    }
}
