package composite.ejercicio;

public class Cliente {
    public static void main(String[] args){
        Composite computadora1 = new Composite("Computadora 1",1500);
        computadora1.add(new Componente("SSD 1Tb",120));
        computadora1.add(new Componente("Tarjeta gráfica ",1100));
        computadora1.add(new Componente("Motherboard",300));
        computadora1.add(new Componente("Refrijeración",150));
        computadora1.add(new Componente("Memoria RAM",80));

        Composite computadora2 = new Composite("Computadora 2",500);
        computadora2.add(new Componente("HDD 250Gb",40));
        computadora2.add(new Componente("Tarjeta gráfica",400));
        computadora2.add(new Componente("Motherboard",130));
        computadora2.add(new Componente("Ventilación",50));
        computadora2.add(new Componente("RAM",40));

        Composite computadora3 = new Composite("Computadora 3",1300);
        computadora3.add(new Componente("SDD 250 Gb",100));
        computadora3.add(new Componente("Tarjeta Grafica",890));
        computadora3.add(new Componente("Motherboard",200));
        computadora3.add(new Componente("Ventilacion",140));
        computadora3.add(new Componente("RAM",160));

        Composite laboratorio1 = new Composite("Laboratorio 1",1000);
        laboratorio1.add(computadora1);
        laboratorio1.add(computadora2);

        Composite laboratorio2 = new Composite("laboratorio 2",1200);
        laboratorio2.add(computadora1);
        laboratorio2.add(computadora2);
        laboratorio2.add(computadora3);

        Composite contenedorDeComputadoras= new Composite("Contenedor de computadoras",20000);
        contenedorDeComputadoras.add(laboratorio1);
        contenedorDeComputadoras.add(laboratorio2);

        contenedorDeComputadoras.operation();
    }
}
