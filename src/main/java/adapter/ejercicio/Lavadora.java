package adapter.ejercicio;

public class Lavadora implements IElectronicosB{
    private String modelo;
    private int costo;
    private String tiempoDeGarantia;

    public Lavadora(String modelo, int costo, String tiempoDeGarantia) {
        this.modelo = modelo;
        this.costo = costo;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTiempoDeGarantia() {
        return tiempoDeGarantia;
    }

    public void setTiempoDeGarantia(String tiempoDeGarantia) {
        this.tiempoDeGarantia = tiempoDeGarantia;
    }


    public void showInfo(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Tipo: Celular");
    }

    @Override
    public void costo() {
        showInfo();
        System.out.println(modelo+" cuesta: "+ costo +"$us");
    }

    @Override
    public void tiempoDeGarantia() {
        showInfo();
        System.out.println("El "+modelo+" esta en el mercado desde hace: "+ tiempoDeGarantia);
    }
}
