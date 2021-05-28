package EjerciciosIteratorInterpreter.Interpreter6;

public class TerminalPara extends AbstractExpresion{
    public TerminalPara(String palabra){
        this.palabra =palabra;
    }
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Para")){
            context.output= context.output+"Then ";
            context.input=context.input.substring(1);
        }
    }
}
