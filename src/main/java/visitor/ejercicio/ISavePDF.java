package visitor.ejercicio;

public interface ISavePDF {
    void guardadoPdf(Word word);
    void guardadoPdf(Sublime sublime);
    void guardadoPdf(Notepad notepad);
}
