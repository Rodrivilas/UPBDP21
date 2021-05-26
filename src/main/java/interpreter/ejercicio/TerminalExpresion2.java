package interpreter.ejercicio;

public class TerminalExpresion2 extends AbstractExpresion{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("2")){
            context.output= context.output+"II ";
            context.input=context.input.substring(1);
        }
    }
}
