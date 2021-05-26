package interpreter.ejercicio;

public class TerminalExpresion7 extends AbstractExpresion{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("7")){
            context.output= context.output+"VII ";
            context.input=context.input.substring(1);
        }
    }
}
