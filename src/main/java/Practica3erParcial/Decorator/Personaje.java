package Practica3erParcial.Decorator;

public class Personaje implements IPersonaje {
    private String nombre;
    private int nivel;
    private String arma;
    private int porcentajeArmadura;
    private int puntosAtaque;
    private int puntosDefensa;
    private int puntosRegeneracionDeVida;

    public Personaje(String nombre){
        this.nombre=nombre;
        this.nivel=1;
        this.arma ="No tienes arma";
        this.porcentajeArmadura=1;
        this.puntosAtaque=1;
        this.puntosDefensa =1;
        this.puntosRegeneracionDeVida =1;
    }


    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public void darNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public int nivel() {
        return nivel;
    }

    @Override
    public void subirNivel(int niveles) {
        nivel=nivel+niveles;
    }

    @Override
    public String arma() {
        return arma;
    }

    @Override
    public void darArma(String arma) {
        this.arma =arma;
    }

    @Override
    public int porcentajeArmadura() {
        return porcentajeArmadura;
    }

    @Override
    public void aumentarPorcentajeArmadura(int porcentaje) {
        porcentajeArmadura=porcentajeArmadura+porcentaje;
    }

    @Override
    public int puntosAtaque() {
        return puntosAtaque;
    }

    @Override
    public void aumentarPuntosAtaque(int puntos) {
        puntosAtaque=puntosAtaque+puntos;
    }

    @Override
    public int puntosDefensa() {
        return puntosDefensa;
    }

    @Override
    public void aumentarPuntosDefensa(int puntos) {
        puntosDefensa = puntosDefensa +puntos;
    }

    @Override
    public int puntosRegeneracion() {
        return puntosRegeneracionDeVida;
    }

    @Override
    public void aumentarPuntosRegeneracion(int puntos) {
        puntosRegeneracionDeVida = puntosRegeneracionDeVida +puntos;
    }

    @Override
    public void operation() {
        System.out.println("Personaje****************************");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Arma: " + arma);
        System.out.println("Porcentaje de armadura: " + porcentajeArmadura);
        System.out.println("Puntos defensa: " + puntosDefensa);
        System.out.println("Puntos ataque: " + puntosAtaque);
        System.out.println("Puntos regeneracion: " + puntosRegeneracionDeVida);
    }
}
