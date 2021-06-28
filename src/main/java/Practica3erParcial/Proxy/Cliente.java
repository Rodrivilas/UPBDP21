package Practica3erParcial.Proxy;

public class Cliente {
    public static void main(String[] args) {

        Proxy proxy = new Proxy(new Servidor1(), new Servidor2());
        proxy.signin(new Usuario(1,"Valeria", "abc"));
        proxy.signin(new Usuario(2,"Raul", "def"));
        proxy.signin(new Usuario(3,"Edson", "ghi"));
        proxy.signin(new Usuario(4,"Paola", "jkl"));
        proxy.signin(new Usuario(5,"Javier", "mno"));

        proxy.login(1, "absc");
        proxy.login(2, "def");
        proxy.login(3, "ghi");
        proxy.login(4, "jkl");
        proxy.login(5, "mno");
    }
}
