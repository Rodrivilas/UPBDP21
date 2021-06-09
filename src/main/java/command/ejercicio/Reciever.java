package command.ejercicio;

public class Reciever {
    private String nombrePersonaje;
    private int numeroVidas;
    private int danoHecho;
    private int danoCubierto;
    private int balasRestantes;

    public Reciever(String nombrePersonaje, int numeroVidas, int danoHecho, int danoCubierto, int balasRestantes) {
        this.nombrePersonaje = nombrePersonaje;
        this.numeroVidas = numeroVidas;
        this.danoHecho = danoHecho;
        this.danoCubierto = danoCubierto;
        this.balasRestantes = balasRestantes;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public int getNumeroVidas() {
        return numeroVidas;
    }

    public void setNumeroVidas(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }
    public void showInfo(){
        System.out.println("Personaje: "+nombrePersonaje);
        System.out.println("Numero de vidas: "+numeroVidas);
    }
    public void disparar(){
        System.out.println("Tu personaje ha disparado!");
        System.out.println("Te quedan: "+(balasRestantes-1)+" balas restantes.");
    }
    public void modoDefensa(){

        System.out.println("Daño soportado:"+danoCubierto + "hp");
        System.out.println("Vida restante: "+(numeroVidas-danoCubierto) + "hp");
    }
    public void atacar(){
        System.out.println("Daño hecho:"+danoHecho);
    }
}
