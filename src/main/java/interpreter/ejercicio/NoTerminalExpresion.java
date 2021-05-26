package interpreter.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class NoTerminalExpresion extends  AbstractExpresion {

    private List<AbstractExpresion> parseTree= new ArrayList<>();
    private Context context;

    public NoTerminalExpresion(String word){
        this.interpretecion(word);
    }

    public void interpretecion(String words) {
        String input = words;
        context= new Context(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                case "1":
                    parseTree.add(new TerminalExpresion1());
                    break;
                case "2":
                    parseTree.add(new TerminalExpresion2());
                    break;
                case "3":
                    parseTree.add(new TerminalExpresion3());
                    break;
                case "4":
                    parseTree.add(new TerminalExpresion4());
                    break;
                case "5":
                    parseTree.add(new TerminalExpresion5());
                    break;
                case "6":
                    parseTree.add(new TerminalExpresion6());
                    break;
                case "7":
                    parseTree.add(new TerminalExpresion7());
                    break;
                case "8":
                    parseTree.add(new TerminalExpresion8());
                    break;
                case "9":
                    parseTree.add(new TerminalExpresion9());
                    break;
                case "10":
                    parseTree.add(new TerminalExpresion10());
                    break;
                default:
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
