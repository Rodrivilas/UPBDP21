package Practica2doParcial.Mediator;

public interface IComunicacion {
    void send( String message, Colleague colleague);
    void sendGrupo(String message, String nombre, Colleague colleague);
}
