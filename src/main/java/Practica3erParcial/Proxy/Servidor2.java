package Practica3erParcial.Proxy;

public class Servidor2 implements ICluster{

    @Override
    public void login(int ticketUsuario, String contrasena) {
        System.out.println("*********Console***********");
        System.out.println("Server2...");
        System.out.println("Numero de usuario: "+ticketUsuario);
        System.out.println("Credencial: "+contrasena);
        System.out.println("Credencial correcta");
        System.out.println("*******************************");
        System.out.println("Iniciando sesión...");
    }
}
