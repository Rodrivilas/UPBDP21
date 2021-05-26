package interpreter.ejercicio;

public class Client {

    public static void main (String []args){
        String interpretar="1 2 3 4 5 6 7 8 9 10";

        NoTerminalExpresion parser = new NoTerminalExpresion(interpretar);
        String interpretado=parser.interpretar();
        System.out.println(" Interpretar: "+interpretar);
        System.out.println(" Interpretado: "+interpretado);

    }
}
