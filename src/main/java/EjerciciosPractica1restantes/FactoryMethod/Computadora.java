package EjerciciosPractica1restantes.FactoryMethod;

public class Computadora {
    private String marca;
    private String os;

    public Computadora() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
    public void ShowInformation(){
        System.out.println("Computadora:");
        System.out.println("Marca:"+marca);
        System.out.println("Sistema operativo:"+os);
    }
}
