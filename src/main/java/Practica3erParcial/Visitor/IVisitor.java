package Practica3erParcial.Visitor;

public interface IVisitor {
    void mantenimiento(Celular celular);
    void mantenimiento(Computadora computadora);
    void mantenimiento(Televisor televisor);
}
