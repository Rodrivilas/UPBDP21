package Practica2doParcial.ChainResponsability;

public class Persona {
    private String nombre;
    private String ci;

    private String orden;

    public Persona(String nombre, String ci,  String orden) {
        this.nombre = nombre;
        this.ci = ci;

        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }



    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public void showInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("CI: "+ci);
    }
}
