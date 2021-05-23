package abstractFactory.ejercicios;

public class Pasajero {
    private String nombre;
    private String ci;
    private String fechaNacimiento;

    public Pasajero() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void showInfo(){
        System.out.println("Nombre pasajero: "+nombre);
        System.out.println("CI: "+ci);
        System.out.println("Fecha De Nacimiento Pasajero: "+fechaNacimiento);


    }
}
