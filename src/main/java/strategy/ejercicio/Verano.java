package strategy.ejercicio;

import java.util.List;

public class Verano implements Estacion{
    @Override
    public void execute(List<Ropa> ropas) {
        System.out.println("Colección verano");
        for(Ropa r:ropas){
            r.setPrecio(r.getPrecio()*0.1);
            r.showInfo();
        }
    }
}
