package strategy.ejercicio;

import java.util.List;

public class Otoño implements Estacion{
    @Override
    public void execute(List<Ropa> ropas) {
        System.out.println("Colección otoño");
        for(Ropa r:ropas){
            r.setPrecio(r.getPrecio()*0.5);
            r.showInfo();
        }
    }
}
