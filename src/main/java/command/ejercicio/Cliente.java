package command.ejercicio;

public class Cliente {
    public static void main (String []ass){
        Reciever reciever1=new Reciever("Macaco mata chanchos",120,30,12,24);
        reciever1.showInfo();
        Disparar disparar=new Disparar(reciever1);
        ModoDefensa modoDefensa=new ModoDefensa(reciever1);
        Atacar atacar=new Atacar(reciever1);

        Invoker acciones=new Invoker();
        acciones.addCommand(disparar);
        acciones.addCommand(modoDefensa);
        acciones.addCommand(atacar);

        acciones.executeCommands();
    }
}
