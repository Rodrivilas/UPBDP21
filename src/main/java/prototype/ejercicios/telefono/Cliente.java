package prototype.ejercicios.telefono;


public class Cliente {
    public static void main (String[] args){
        SamsungR10 celular= new SamsungR10();
        celular.setTamano("Pantalla 1920x1080p, 13x6 cm");
        celular.setCpu("4 núcleos");
        celular.setMemory("256 Gb");
        celular.setSim(new Sim("Desconocido","0000000"));
        celular.setVersionAndroid("11");
        celular.setCamara("12 MP");
        celular.setBluetooth("Si");
        celular.setCantidadDeMemoriasExternas("1");
        celular.setTipoBateria("4000 mAh");
        celular.setAcc(new Accesorios("Si","Si","Si"));

        SamsungR10 Celu1= (SamsungR10) celular.clone();
        Celu1.setMemory("32 Gb");
        Celu1.setTipoBateria("2300 mAh");
        Celu1.setAcc(new Accesorios("No","Si","No"));
        Celu1.setCamara("8 MP");
        Celu1.setCpu("2 núcleos");
        Celu1.setSim(new Sim("Viva","60131343"));

        SamsungR10 Celu2= (SamsungR10) celular.clone();
        Celu2.setSim(new Sim("Entel","70423098"));
        Celu2.setTamano("5.1 x 4");
        Celu2.setAcc(new Accesorios("Si","Si","No"));;
        Celu2.setTipoBateria("3500 mAh");

        SamsungR10 Celu3= (SamsungR10) celular.clone();
        Celu3.setTamano("Pantalla 4k, 15x6.7 cm");
        Celu3.setMemory("512 Gb");
        Celu3.setCantidadDeMemoriasExternas("2");
        Celu3.setCamara("20 MP doble camara");
        Celu3.setCpu("8 núcleos");
        Celu3.setSim(new Sim("Tigo","65509967"));
        Celu3.setVersionAndroid("12");

        Celu1.showInformation();
        Celu2.showInformation();
        Celu3.showInformation();

    }
}
