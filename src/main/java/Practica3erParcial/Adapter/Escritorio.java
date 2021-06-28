package Practica3erParcial.Adapter;

public class Escritorio implements IEmpresaAplicacionesComputadoras {
    private String nombre;
    private String peso;

    public Escritorio(String nombre, String peso){
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public void iniciarSesion() {
        showInfo();
        System.out.println("Iniciando sesion en "+nombre+" version de escritorio");
    }

    @Override
    public void cerrarSesion() {
        showInfo();
        System.out.println("Iniciando sesion en "+nombre+" version de escritorio");
    }

    @Override
    public void generacionDeDatos() {
        showInfo();
        System.out.println("Generando datos del programa "+ peso+" de espacio utilizado por el programa.");
    }

    public void showInfo(){
        System.out.println("Programa escritorio**********************************");
        System.out.println("Nombre del programa: "+ nombre);
        System.out.println("Peso de la aplicación en el disco duro: "+peso);
    }
}
