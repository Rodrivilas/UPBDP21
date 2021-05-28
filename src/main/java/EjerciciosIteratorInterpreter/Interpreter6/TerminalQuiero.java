package EjerciciosIteratorInterpreter.Interpreter6;

public class TerminalQuiero extends AbstractExpresion{
    public TerminalQuiero(String palabra){
        this.palabra =palabra;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Quiero")){
            context.output= context.output+"When ";
            context.input=context.input.substring(1);
        }
    }
}
