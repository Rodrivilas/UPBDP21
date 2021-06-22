package adapter.ejercicio;

public class Celular implements IElectronicoA{
    private String modelo;
    private int precio;
    private String tiempoDeVida;

    public Celular(String modelo, int precio, String tiempoDeVida) {
        this.modelo = modelo;
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTiempoDeVida() {
        return tiempoDeVida;
    }

    public void setTiempoDeVida(String tiempoDeVida) {
        this.tiempoDeVida = tiempoDeVida;
    }


    public void showInfo(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Tipo: Celular");
    }

    @Override
    public void precio() {
        showInfo();
        System.out.println(modelo+" cuesta: "+precio+"$us");
    }

    @Override
    public void tiempoDeVida() {
        showInfo();
        System.out.println("El "+modelo+" esta en el mercado desde hace: "+tiempoDeVida);
    }
}
