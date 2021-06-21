package visitor.ejercicio;

public class Sublime implements IEditorDeTexto{
    private String nombreArchivo;
    private String contenidoDelDocumento;
    private int numeroCaracteres;

    public Sublime(String nombreArchivo, String contenidoDelDocumento) {
        this.nombreArchivo = nombreArchivo;
        this.contenidoDelDocumento = contenidoDelDocumento;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getContenidoDelDocumento() {
        return contenidoDelDocumento;
    }

    public void setContenidoDelDocumento(String contenidoDelDocumento) {
        this.contenidoDelDocumento = contenidoDelDocumento;
    }

    public int getNumeroCaracteres() {
        return numeroCaracteres;
    }
    public void setNumeroCaracteres(int numeroCaracteres) {
        this.numeroCaracteres = numeroCaracteres;
    }

    @Override
    public void crear() {
        System.out.println("Creando archivo: "+nombreArchivo+".txt");
    }

    @Override
    public void editar() {
        System.out.println("Editando archivo");
    }

    @Override
    public void eliminar() {
        setNombreArchivo("");
        setContenidoDelDocumento("");
        System.out.println("EL archivo se borró correctamente");
    }

    @Override
    public void accept(ISavePDF savePDF) {
        savePDF.guardadoPdf(this);
    }
}
