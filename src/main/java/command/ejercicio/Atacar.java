package command.ejercicio;

public class Atacar implements ICommand{
    private Reciever reciever;

    public Atacar(Reciever reciever) {
        this.reciever = reciever;
    }


    @Override
    public void execute() {
        this.reciever.atacar();
    }
}
