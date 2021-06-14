package Practica2doParcial.ChainResponsability;


public interface ICuerpoEjercito {
    void setNext(ICuerpoEjercito handler);
    ICuerpoEjercito next();
    void orden(Persona persona);
}
