package interpreter.ejercicio;

public class TerminalExpresion10 extends AbstractExpresion{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("10")){
            context.output= context.output+"X ";
            context.input=context.input.substring(1);
        }
    }
}
