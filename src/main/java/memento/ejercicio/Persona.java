package memento.ejercicio;

public class Persona {
    private String name;
    private String ci;
    private String edad;

    public Persona(String name, String ci, String edad) {
        this.name = name;
        this.ci = ci;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void showInfo(){
        System.out.println("*Name:"+name);
        System.out.println("CI:"+ci);
        System.out.println("Age:"+edad);
    }
}
