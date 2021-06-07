package memento.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static void main (String []argsss ) {
        BaseDeDatos bd = new BaseDeDatos();
        Originator o = new Originator();
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Joel", "54431237", "22"));
        listaPersonas.add(new Persona("Juan", "64321237", "33"));
        listaPersonas.add(new Persona("Rodrogas", "15832338", "28"));
        listaPersonas.add(new Persona("Anuel", "52034987", "19"));
        listaPersonas.add(new Persona("Ana", "32679802", "23"));

        Backup backup;

        backup= new Backup("BackupJunio",listaPersonas);
        o.setState(backup);
        listaPersonas.add(new Persona("Ian", "47238122", "21"));

        backup= new Backup("BackupJulio",listaPersonas);
        o.setState(backup);
        bd.addMemento(o.createMemento());
        listaPersonas.add(new Persona("Lucianito", "403882881", "17"));
        listaPersonas.add(new Persona("Manuela", "95483828", "21"));

        backup= new Backup("BackupAgosto",listaPersonas);
        o.setState(backup);
        listaPersonas.add(new Persona("Samuel", "68953433", "25"));

        backup= new Backup("BackupSeptiembre",listaPersonas);
        o.setState(backup);
        listaPersonas.add(new Persona("Antonio", "943827711", "52"));

        backup= new Backup("BackupOctubre",listaPersonas);
        o.setState(backup);
        listaPersonas.add(new Persona("Javier", "10298344", "29"));

        o.restoreFromMemento(bd.getMemento(0));

    }
}
