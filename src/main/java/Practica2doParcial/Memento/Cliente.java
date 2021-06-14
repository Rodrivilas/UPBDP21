package Practica2doParcial.Memento;

public class Cliente {
    public static void main (String [] args){
        CareTaker careTaker=new CareTaker();
        Originator originator=new Originator();

        Versiones versionTesis;

        versionTesis=new Versiones(1,true,true,false,false,false,false,false,false,false);
        originator.setState(versionTesis);
        careTaker.addMemento(originator.createMemento());
        versionTesis=new Versiones(2,true,true,true,true,false,false,false,false,false);
        originator.setState(versionTesis);
        careTaker.addMemento(originator.createMemento());
        versionTesis=new Versiones(3,true,true,true,true,true,false,false,false,false);
        originator.setState(versionTesis);
        careTaker.addMemento(originator.createMemento());
        versionTesis=new Versiones(4,true,true,true,true,true,false,true,false,false);
        originator.setState(versionTesis);
        careTaker.addMemento(originator.createMemento());
        versionTesis=new Versiones(5,true,true,true,true,true,true,true,false,false);
        originator.setState(versionTesis);
        careTaker.addMemento(originator.createMemento());

        originator.restoreFromMemento(careTaker.getMemento(2));
    }
}
