package interpreter.ejercicio;

public class TerminalExpresion3 extends AbstractExpresion{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("3")){
            context.output= context.output+"III ";
            context.input=context.input.substring(1);
        }
    }
}
