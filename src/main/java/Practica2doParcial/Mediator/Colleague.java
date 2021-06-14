package Practica2doParcial.Mediator;

public abstract class Colleague {
    protected IComunicacion comunicacion;

    public Colleague(IComunicacion comunicacion) {
        this.comunicacion = comunicacion;
    }

    public abstract void send(String message,Colleague colleague);

    public abstract void sendGrupo(String mensaje,String grupo);

    public abstract void mensajeRecibido(String mensaje);
}
