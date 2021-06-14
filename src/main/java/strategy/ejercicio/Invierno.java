package strategy.ejercicio;

import java.util.List;

public class Invierno implements Estacion{
    @Override
    public void execute(List<Ropa> ropas) {
        System.out.println("Colección invierno");
        for(Ropa r:ropas){
            r.setPrecio(r.getPrecio()*1.1);
            r.showInfo();
        }
    }
}
