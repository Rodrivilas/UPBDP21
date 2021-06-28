package Practica3erParcial.Composite;

public class Cliente {
    public static void main(String []args){
        Composite carpeta1 = new Composite("ApuntesProgra");
        carpeta1.add(new Archivo("ApuntesProgra1","System out prinln para imprimir lineas"));
        carpeta1.add(new Archivo("ApuntesProgra2","For para bucles"));
        carpeta1.add(new Archivo("ApuntesProgra3","Hello world"));

        Composite carpeta2 = new Composite("ApuntesPatrones");
        carpeta2.add(new Archivo("ApuntesPatrones1","El singleton permite instanciar un objeto una sola vez"));
        carpeta2.add(new Archivo("ApuntesPatrones2","Composite es como un bosque que tiene arboles ramas y hojas"));
        carpeta2.add(new Archivo("ApuntesPatrones3","Existen patrones para distintos fines como los creacionales"));

        Composite disco1 = new Composite("DiscoUniversidad");
        disco1.add(carpeta1);
        disco1.add(carpeta2);

        disco1.info();
    }
}
