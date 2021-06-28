package Practica3erParcial.Adapter;

public class Cliente {
    public static void main(String[]args){
        Android android = new Android("Instagram","240 Mb");
        android.login();
        android.logout();
        android.reportes();

        IOS ios = new IOS("Facebook", "1.2 Gb");
        ios.login();
        ios.logout();
        ios.reportes();

        WindowsPhone windowsPhone = new WindowsPhone("Mensajes","30 Mb");
        windowsPhone.login();
        windowsPhone.logout();
        windowsPhone.reportes();

        Escritorio escritorio = new Escritorio("Discord", "460 Mb");
        escritorio.iniciarSesion();
        escritorio.cerrarSesion();
        escritorio.generacionDeDatos();

        Web web = new Web("Bit Torrent", "110 Mb" );
        web.iniciarSesion();
        web.cerrarSesion();
        web.generacionDeDatos();

        AdapterEmpresa2 adapter = new AdapterEmpresa2(android,ios,windowsPhone);
        adapter.iniciarSesion();
        adapter.cerrarSesion();
        adapter.generacionDeDatos();


    }
}
