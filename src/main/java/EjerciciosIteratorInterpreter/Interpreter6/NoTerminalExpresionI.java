package EjerciciosIteratorInterpreter.Interpreter6;

import java.util.ArrayList;
import java.util.List;

public class NoTerminalExpresionI extends  AbstractExpresion{

    private List<AbstractExpresion> parseTree= new ArrayList<>();
    private Context context;

    public NoTerminalExpresionI(String word){
        this.interpretecion(word);
    }
    public void interpretecion(String words) {
        String input = words;
        context= new Context(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                case "Como":
                    parseTree.add(new TerminalComo(word));
                    break;
                case "Quiero":
                    parseTree.add(new TerminalQuiero(word));
                    break;
                case "Para":
                    parseTree.add(new TerminalPara(word));
                    break;
                default:
                    parseTree.add(new TerminalPalabra(word));
                    break;
            }

        }
    }

    public String interpretar(){
        for (AbstractExpresion terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return  context.output;
    }
    @Override
    public void interpreter(Context context) {

    }
}
