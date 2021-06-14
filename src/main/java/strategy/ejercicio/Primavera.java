package strategy.ejercicio;

import java.util.List;

public class Primavera implements Estacion{
    @Override
    public void execute(List<Ropa> ropas) {
        System.out.println("Colección primavera");
        for(Ropa r:ropas){
            r.showInfo();
        }
    }
}
