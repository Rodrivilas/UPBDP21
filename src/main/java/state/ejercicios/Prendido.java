package state.ejercicios;
import java.util.Random;
public class Prendido implements IStateComputadora{
    Random r=new Random();
    int v= r.nextInt(20);
    String[] arrayProgramas= new String[]{"Chrome","Whatsapp","UPBNet","Discord","Firefox","Spotify","Quickviewer","Explorer","Eclipse","Discord"
            ,"Adobe Illustrator","Photoshop","Reloj","Calendario","Panel de Control","Steam","Counter Strike","Team fortress 2","Goolgle Drive","Maicra"};

    @Override
    public void handler(Computadora computadora) {
        System.out.println("*Computadora encendida");
        System.out.println("*Programas abiertos:");
        printArray(v);

        computadora.setConsumoMemoriaRam(v);
        computadora.setConsumoEnCPU(v);
        computadora.showInfo();
    }

    public void printArray(int n){
        for(int i=0; i<n ;i++){
            System.out.println(arrayProgramas[(int)(Math.random()*n+1)]);
        }
    }
}
