package Practica2doParcial.Mediator;

public class Persona extends Colleague {
    private String usuario;

    public Persona(IComunicacion comunicacion, String usuario) {
        super(comunicacion);
        this.usuario=usuario;
    }
    @Override
    public void send(String mensaje, Colleague destino) {
        comunicacion.send(mensaje, destino);
    }
    @Override
    public void sendGrupo(String mensaje, String grupo) {
        comunicacion.sendGrupo(mensaje, grupo, this);
    }
    @Override
    public void mensajeRecibido(String mensaje) {
        System.out.println(usuario + " ha recibido el mensaje: ");
        System.out.println(mensaje);

    }


}
