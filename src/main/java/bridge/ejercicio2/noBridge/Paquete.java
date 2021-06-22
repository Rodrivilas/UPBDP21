package bridge.ejercicio2.noBridge;

public class Paquete {
    private int precio;
    private String nombreDelPaquete;

    public Paquete(int precio, String nombreDelPaquete) {
        this.precio = precio;
        this.nombreDelPaquete = nombreDelPaquete;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombreDelPaquete() {
        return nombreDelPaquete;
    }

    public void setNombreDelPaquete(String nombreDelPaquete) {
        this.nombreDelPaquete = nombreDelPaquete;
    }

    public void showInfo(){
        System.out.println();
        System.out.println("Nombre del paquete: "+nombreDelPaquete);
        System.out.println("Precio: "+precio);
    }
}
