package EjerciciosIteratorInterpreter.Interpreter6;

public class Cliente {
    public static void main (String []args){
        String interpretar="Para Para";

       NoTerminalExpresionI parser = new NoTerminalExpresionI(interpretar);
        String interpretado=parser.interpretar();
        System.out.println(" Interpretar: "+interpretar);
        System.out.println(" Interpretado: "+interpretado);

    }
}
