package EjerciciosPractica1restantes.FactoryMethod;

public class Cuadernos {
    private String tipo;
    private int numeroHojas;

    public Cuadernos() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroHojas() {
        return numeroHojas;
    }

    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    public void ShowInformation(){
        System.out.println("Cuaderno:");
        System.out.println("Tipo:"+tipo);
        System.out.println("Número de hojas:"+numeroHojas);
    }
}
