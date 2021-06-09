package command.ejercicio;

public class Disparar implements ICommand{
    private Reciever reciever;

    public Disparar(Reciever reciever) {
        this.reciever = reciever;
    }


    @Override
    public void execute() {
        this.reciever.disparar();
    }
}
