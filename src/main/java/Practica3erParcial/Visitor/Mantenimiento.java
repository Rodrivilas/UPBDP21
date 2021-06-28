package Practica3erParcial.Visitor;

import java.util.Random;

public class Mantenimiento implements IVisitor {
    @Override
    public void mantenimiento(Celular celular) {
        System.out.println("Celular*******************************");
        System.out.println("Marca: "+celular.getMarca());
        System.out.println("Nombre: "+celular.getNombre());
        System.out.println("Capacidad de memoria: "+celular.getMemoria());
        System.out.println("Mantenimiento: preventivo");
    }

    @Override
    public void mantenimiento(Computadora computadora) {
        System.out.println("Computadora*******************************");
        System.out.println("Marca: "+ computadora.getMarca());
        System.out.println("Capacidad de disco duro: "+computadora.getDiscoDuro());
        System.out.println("Capacidad de memoria RAM: "+computadora.getRam());
        System.out.println("Procesador: "+computadora.getProcesador());

        Random random = new Random();
        int numRandom= random.nextInt(100)+1;
        if(numRandom%2==0){
            System.out.println("Mantenimiento: preventivo");
        }else{
            System.out.println("Mantenimiento: correctivo");
        }
    }

    @Override
    public void mantenimiento(Televisor televisor) {
        System.out.println("Televisor*******************************");
        System.out.println("Marca: "+televisor.getMarca());
        System.out.println("Resolucion: "+televisor.getResolucion());
    }
}
