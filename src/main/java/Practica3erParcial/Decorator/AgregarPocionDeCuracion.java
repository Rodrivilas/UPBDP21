package Practica3erParcial.Decorator;

public class AgregarPocionDeCuracion implements IPersonaje {
    private IPersonaje personaje;

    public AgregarPocionDeCuracion(IPersonaje personaje) {
        this.personaje = personaje;
        this.aumentarPuntosRegeneracion(80);
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
        personaje.subirNivel(personaje.nivel());
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
        System.out.println("Pocion de salud tomada");
        personaje.operation();
    }
}
