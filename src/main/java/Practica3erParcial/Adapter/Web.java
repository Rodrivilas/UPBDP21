package Practica3erParcial.Adapter;

public class Web implements IEmpresaAplicacionesComputadoras {
    private String nombre;
    private String peso;

    public Web(String nombre, String peso){
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public void iniciarSesion() {
        showInfo();
        System.out.println("Iniciando sesion en "+nombre+" version web");
    }

    @Override
    public void cerrarSesion() {
        showInfo();
        System.out.println("Iniciando sesion en "+nombre+" version web");
    }

    @Override
    public void generacionDeDatos() {
        showInfo();
        System.out.println("Generando datos del programa "+ peso+" de espacio guardado en el caché del navegador.");
    }

    public void showInfo(){
        System.out.println("Aplicacion Web**********************************");
        System.out.println("Nombre del programa: "+ nombre);
        System.out.println("Peso de la aplicación en el caché: "+peso);
    }
}
