package Practica3erParcial.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements  ICluster{
    private Servidor1 servidor1;
    private Servidor2 servidor2;
    private List<Usuario> usuarios=new ArrayList<Usuario>();

    public Proxy(Servidor1 servidor1, Servidor2 servidor2) {
        this.servidor1 = servidor1;
        this.servidor2 = servidor2;
    }
    public void signin(Usuario usuario){
        usuarios.add(usuario);
    }

    @Override
    public void login(int ticketUsuario, String contrasena) {
        for(Usuario usuario : usuarios) {
            if(usuario.getContrasena().equals(contrasena) && usuario.getNumUsuario() == ticketUsuario) {
                if(usuario.getNumUsuario() % 2 == 0) {
                    servidor1.login(ticketUsuario, contrasena);
                    usuario.showInfo();
                }else {
                    servidor2.login(ticketUsuario, contrasena);
                    usuario.showInfo();
                }
            }else if(!usuario.getContrasena().equals(contrasena) && usuario.getNumUsuario() == ticketUsuario){
                System.out.println("Error al iniciar sesión");
                System.out.println("Contraseña incorrecta: "+contrasena);
            }
        }
    }
}
