package interpreter.ejercicio;

public class TerminalExpresion5 extends AbstractExpresion{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("5")){
            context.output= context.output+"V ";
            context.input=context.input.substring(1);
        }
    }
}
