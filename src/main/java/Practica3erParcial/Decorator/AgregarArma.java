package Practica3erParcial.Decorator;

public class AgregarArma implements IPersonaje {
    private IPersonaje personaje;
    private String arma;

    public AgregarArma(IPersonaje personaje, String arma) {
        this.personaje = personaje;
        this.darArma(arma);
        this.arma=arma;
    }

    @Override
    public String nombre() {
        return personaje.nombre();
    }

    @Override
    public void darNombre(String nombre) {
        personaje.darNombre(nombre);
    }

    @Override
    public int nivel() {
        return personaje.nivel();
    }

    @Override
    public void subirNivel(int niveles) {
        personaje.subirNivel(niveles);
    }

    @Override
    public String arma() {
        return personaje.arma();
    }

    @Override
    public void darArma(String arma) {
        personaje.darArma(arma);
        personaje.aumentarPuntosAtaque(30);
        personaje.subirNivel(personaje.nivel()*2);
    }

    @Override
    public int porcentajeArmadura() {
        return personaje.porcentajeArmadura();
    }

    @Override
    public void aumentarPorcentajeArmadura(int porcentaje) {
        personaje.aumentarPorcentajeArmadura(porcentaje);
    }

    @Override
    public int puntosAtaque() {
        return personaje.puntosAtaque();
    }

    @Override
    public void aumentarPuntosAtaque(int puntos) {
        personaje.aumentarPuntosAtaque(puntos);
    }

    @Override
    public int puntosDefensa() {
        return personaje.puntosDefensa();
    }

    @Override
    public void aumentarPuntosDefensa(int puntos) {
        personaje.aumentarPuntosDefensa(puntos);
    }

    @Override
    public int puntosRegeneracion() {
        return personaje.puntosRegeneracion();
    }

    @Override
    public void aumentarPuntosRegeneracion(int puntos) {
        personaje.aumentarPuntosRegeneracion(puntos);
    }

    @Override
    public void operation() {

        System.out.println(arma +" agregada");

        personaje.operation();
    }
}
