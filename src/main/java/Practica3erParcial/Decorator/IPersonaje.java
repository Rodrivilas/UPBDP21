package Practica3erParcial.Decorator;

public interface IPersonaje {
    String nombre();
    void darNombre(String nombre);
    int nivel();
    void subirNivel(int niveles);
    String arma();
    void darArma(String arma);
    int porcentajeArmadura();
    void aumentarPorcentajeArmadura(int porcentaje);
    int puntosAtaque();
    void aumentarPuntosAtaque(int puntos);
    int puntosDefensa();
    void aumentarPuntosDefensa(int puntos);
    int puntosRegeneracion();
    void aumentarPuntosRegeneracion(int puntos);
    void operation();
}
