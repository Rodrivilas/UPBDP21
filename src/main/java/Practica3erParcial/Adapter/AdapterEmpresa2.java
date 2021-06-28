package Practica3erParcial.Adapter;

public class AdapterEmpresa2 implements IEmpresaAplicacionesComputadoras {
   private Android android;
   private IOS iOS;
   private WindowsPhone windowsPhone;

    public AdapterEmpresa2(Android android, IOS iOS, WindowsPhone windowsPhone) {
        System.out.println("*******Instalando aplicaciones moviles al escritorio**************");
        this.android = android;
        this.iOS = iOS;
        this.windowsPhone = windowsPhone;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("*********************");
        System.out.println("Iniciando sesion en "+android.getNombre()+" version de escritorio");
        System.out.println("");
        System.out.println("Iniciando sesion en "+iOS.getNombre()+" version de escritorio");
        System.out.println("");
        System.out.println("Iniciando sesion en "+windowsPhone.getNombre()+" version de escritorio");
        System.out.println("*********************");
        System.out.println("Iniciando sesion en "+android.getNombre()+" version web");
        System.out.println("");
        System.out.println("Iniciando sesion en "+iOS.getNombre()+" version web");
        System.out.println("");
        System.out.println("Iniciando sesion en "+windowsPhone.getNombre()+" version web");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("*********************");
        System.out.println("Cerrando sesion en "+android.getNombre()+" version de escritorio");
        System.out.println("");
        System.out.println("Cerrando sesion en "+iOS.getNombre()+" version de escritorio");
        System.out.println("");
        System.out.println("Cerrando sesion en "+windowsPhone.getNombre()+" version de escritorio");
        System.out.println("*********************");
        System.out.println("Cerrando sesion en "+android.getNombre()+" version web");
        System.out.println("");
        System.out.println("Cerrando sesion en "+iOS.getNombre()+" version web");
        System.out.println("");
        System.out.println("Cerrando sesion en "+windowsPhone.getNombre()+" version web");
    }

    @Override
    public void generacionDeDatos() {
        System.out.println("*********************");
        System.out.println("Generando datos del programa "+android.getNombre()+", "+ android.getPeso()+" de espacio utilizado por el programa.");
        System.out.println("");
        System.out.println("Generando datos del programa "+iOS.getNombre()+", "+ iOS.getPeso()+" de espacio utilizado por el programa.");
        System.out.println("");
        System.out.println("Generando datos del programa "+windowsPhone.getNombre()+", "+ windowsPhone.getPeso()+" de espacio utilizado por el programa.");
        System.out.println("*********************");
        System.out.println("Generando datos del programa "+android.getNombre()+", "+ android.getPeso()+" de espacio utilizado en el caché.");
        System.out.println("");
        System.out.println("Generando datos del programa "+iOS.getNombre()+", "+ iOS.getPeso()+" de espacio utilizado en el caché.");
        System.out.println("");
        System.out.println("Generando datos del programa "+windowsPhone.getNombre()+", "+ windowsPhone.getPeso()+" de espacio utilizado en el caché.");

    }
}
