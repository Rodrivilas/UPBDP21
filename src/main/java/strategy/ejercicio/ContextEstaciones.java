package strategy.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class ContextEstaciones {
    private Estacion estacion;
    private List<Ropa> ropas=new ArrayList<>();
    private String tienda;

    public ContextEstaciones(List<Ropa> ropas, String tienda) {
        this.ropas = ropas;
        this.tienda = tienda;
    }

    public Estacion getEstacion() {
        return estacion;
    }

    public void setEstacion(Estacion estacion) {
        this.estacion = estacion;
    }

    public List<Ropa> getRopas() {
        return ropas;
    }

    public void setRopas(List<Ropa> ropas) {
        this.ropas = ropas;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public void showInfo(){
        System.out.println("Tienda: "+tienda);
        estacion.execute(ropas);
    }
}
