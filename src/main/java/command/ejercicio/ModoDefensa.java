package command.ejercicio;

public class ModoDefensa implements ICommand{
    private Reciever reciever;

    public ModoDefensa(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        this.reciever.modoDefensa();
    }
}
