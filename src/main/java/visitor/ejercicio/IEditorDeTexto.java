package visitor.ejercicio;

public interface IEditorDeTexto {
    void crear();
    void editar();
    void eliminar();

    void accept(ISavePDF savePDF);
}
