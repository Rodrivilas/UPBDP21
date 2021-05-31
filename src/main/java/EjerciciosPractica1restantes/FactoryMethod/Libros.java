package EjerciciosPractica1restantes.FactoryMethod;

public class Libros {
    private String tipo;
    private String autor;

    public Libros() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void ShowInformation(){
        System.out.println("Libro:");
        System.out.println("Tipo:"+tipo);
        System.out.println("Autor:"+autor);
    }
}
