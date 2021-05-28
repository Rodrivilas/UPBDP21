package EjerciciosIteratorInterpreter.Interpreter6;

public class TerminalPalabra extends AbstractExpresion{

    public TerminalPalabra(String palabra){
        this.palabra =palabra;
    }

    @Override
    public void interpreter(Context context) {
        context.output= context.output+palabra+" ";
        context.input=context.input.substring(1);
    }
}
