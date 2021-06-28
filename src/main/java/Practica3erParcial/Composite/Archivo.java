package Practica3erParcial.Composite;

public class Archivo extends Component {

    public Archivo(String nombre, String texto) {
        super(nombre, texto);
    }

    @Override
    public void info(){
        System.out.println("**************************");
        System.out.println("Nombre : "+ getNombre()+ ".txt");
        System.out.println("Documento: " + getTexto());
        System.out.println("Numero de palabras: " + getNumeroPalabras());
    }

    @Override
    public void add(Component component) {
        System.out.println("No se pueden añadir elementos a este archivo (Menor)");
    }

    @Override
    public void remove(Component component) {
        System.out.println("No se pueden remover elementos de un archivo (Menor)");
    }

    @Override
    public void getChild(int position) {
        System.out.println(getNombre()+" Palabras: "+ getNumeroPalabras());
    }

}
