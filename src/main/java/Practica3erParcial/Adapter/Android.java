package Practica3erParcial.Adapter;

public class Android implements IEmpresaAplicacionesMoviles {
    private String nombre;
    private String peso;

    public Android(String nombre, String peso){
        this.nombre = nombre;
        this.peso = peso;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public void login() {
        showInfo();
        System.out.println("Login in into "+nombre+" Android Version");
    }

    @Override
    public void logout() {
        showInfo();
        System.out.println("Login out into "+nombre+" Android Version");
    }

    @Override
    public void reportes() {
        showInfo();
        System.out.println("Reportando error "+nombre+", Android ,"+ peso +" ocupando la version actual.");
    }

    public void showInfo(){
        System.out.println("Android**********************************");
        System.out.println("Nombre de la aplicación: "+ nombre);
        System.out.println("Peso de la aplicación: "+peso);
    }
}
