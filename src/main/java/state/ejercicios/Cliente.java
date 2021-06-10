package state.ejercicios;

public class Cliente {
    public static void main(String []args){
        IStateComputadora stateComputadora=new Prendido();
        Computadora computadora=new Computadora();
        computadora.setState(stateComputadora);
        computadora.request();
    }
}
