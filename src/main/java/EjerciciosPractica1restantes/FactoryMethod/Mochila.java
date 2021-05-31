package EjerciciosPractica1restantes.FactoryMethod;

public class Mochila {
    private int numeroBolsillos;
    private String tamaño;

    public Mochila() {
    }

    public int getNumeroBolsillos() {
        return numeroBolsillos;
    }

    public void setNumeroBolsillos(int numeroBolsillos) {
        this.numeroBolsillos = numeroBolsillos;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void ShowInformation(){
        System.out.println("Mochila:");
        System.out.println("Número de bolsillos"+numeroBolsillos);
        System.out.println("Tamaño:"+tamaño);
    }
}
