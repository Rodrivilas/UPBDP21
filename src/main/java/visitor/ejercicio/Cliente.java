package visitor.ejercicio;

public class Cliente {
    public static void main (String[]args){
        Word word=new Word("Tesis","Introducción: A que se debe la personalidad de las personas");
        Sublime sublime=new Sublime("Index","html version <h1>holamundo<>");
        Notepad notepad=new Notepad("ApuntesPatrones","Visitor, patron de diseño");

        SavePDF savePDF=new SavePDF();

        word.accept(savePDF);
        sublime.accept(savePDF);
        notepad.accept(savePDF);
    }
}
