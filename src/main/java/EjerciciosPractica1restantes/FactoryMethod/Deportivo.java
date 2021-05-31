package EjerciciosPractica1restantes.FactoryMethod;

public class Deportivo {
    private String  talla;
    private String color;
    private int numeroDePrendas;

    public Deportivo() {
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeroDePrendas() {
        return numeroDePrendas;
    }

    public void setNumeroDePrendas(int numeroDePrendas) {
        this.numeroDePrendas = numeroDePrendas;
    }

    public void ShowInformation(){
        System.out.println("Deportivo:");
        System.out.println("Talla:"+talla);
        System.out.println("Color:"+color);
        System.out.println("Numero de prendas:"+numeroDePrendas);
    }
}
