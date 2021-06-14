package Practica2doParcial.Memento;

public class Memento {
    private Versiones state;

    public Memento(Versiones stateSaved){
        this.state=stateSaved;
    }

    public Versiones getState() {
        return state;
    }
}
