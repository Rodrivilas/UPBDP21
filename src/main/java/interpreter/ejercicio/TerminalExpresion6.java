package interpreter.ejercicio;

public class TerminalExpresion6 extends AbstractExpresion{

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("6")){
            context.output= context.output+"VI ";
            context.input=context.input.substring(1);
        }
    }
}
