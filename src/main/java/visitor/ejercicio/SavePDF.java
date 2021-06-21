package visitor.ejercicio;

public class SavePDF implements ISavePDF{

    @Override
    public void guardadoPdf(Word word) {
        System.out.println("Generando pdf en Documentos: "+word.getNombreArchivo()+".pdf");

        word.setNumeroCaracteres(word.getContenidoDelDocumento().length());
        System.out.println("Numero caracteres: "+word.getNumeroCaracteres());
    }

    @Override
    public void guardadoPdf(Sublime sublime) {
        System.out.println("Generando pdf en Documentos: "+sublime.getNombreArchivo()+".pdf");

        sublime.setNumeroCaracteres(sublime.getContenidoDelDocumento().length());
        System.out.println("Numero caracteres: "+sublime.getNumeroCaracteres());
    }

    @Override
    public void guardadoPdf(Notepad notepad) {
        System.out.println("Generando pdf en Documentos: "+notepad.getNombreArchivo()+".pdf");

        notepad.setNumeroCaracteres(notepad.getContenidoDelDocumento().length());
        System.out.println("Numero caracteres: "+notepad.getNumeroCaracteres());
    }
}
