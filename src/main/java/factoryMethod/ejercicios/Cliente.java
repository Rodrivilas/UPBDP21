package factoryMethod.ejercicios;

public class Cliente {
    public  static void main (String[]args){
        ImpresoraDeBoletos pasajeStandar=new ImpresionPasajeStandar();
        pasajeStandar.create().create();

        ImpresoraDeBoletos pasajeStandar2=new ImpresionPasajeStandar();
        pasajeStandar2.create().create();

        ImpresoraDeBoletos pasajeSolidario=new ImpresionPasajeSolidario();
        pasajeSolidario.create().create();

        ImpresoraDeBoletos pasajeSolidario2=new ImpresionPasajeSolidario();
        pasajeSolidario2.create().create();

        ImpresoraDeBoletos pasajeInfantes=new ImpresionPasajeInfantes();
        pasajeInfantes.create().create();

        ImpresoraDeBoletos pasajeInfantes2=new ImpresionPasajeInfantes();
        pasajeInfantes2.create().create();


    }
}
