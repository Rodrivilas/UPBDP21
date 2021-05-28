package EjerciciosIteratorInterpreter.Interpreter6;

public class TerminalComo extends AbstractExpresion{

    public TerminalComo(String palabra){
        this.palabra =palabra;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Como")){
            context.output= context.output+"Given ";
            context.input=context.input.substring(1);
        }
    }
}
