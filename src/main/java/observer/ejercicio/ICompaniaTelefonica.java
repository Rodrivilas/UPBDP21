package observer.ejercicio;

public interface ICompaniaTelefonica {
    void attach(IClientes observer);
    void deattach(IClientes observer);
    void notifyObserver(Notificaciones notificaciones);
}
