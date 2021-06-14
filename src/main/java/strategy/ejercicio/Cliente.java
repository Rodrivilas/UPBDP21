package strategy.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main(String[]args) {
        List<Ropa> r = new ArrayList<>();
        r.add(new Ropa("camisa", 30));
        r.add(new Ropa("polera", 15));
        r.add(new Ropa("calzon", 10));
        r.add(new Ropa("saco", 60));
        r.add(new Ropa("pantalon", 50));

        ContextEstaciones tienda = new ContextEstaciones(r, "Fair play");
        tienda.setEstacion(new Invierno());
        tienda.showInfo();
    }
}
