package factoryMethod.ejercicios;

public class ImpresionPasajeStandar extends ImpresoraDeBoletos{
    @Override
    public IPasaje create() {
        Avion avion=new Avion();
        avion.setCapacidad("50 toneladas");
        avion.setMarca("pana");
        avion.setModelo("miguelF55718");
        avion.setNumerodeAsientos("60 asientos");

        Destino destino=new Destino();
        destino.setCiudad("El Alto");
        destino.setAeropuerto("El Alto");
        destino.setPais("Bolivia");

        Origen origen=new Origen();
        origen.setCiudad("Quito");
        origen.setAeropuerto("Quito");
        origen.setPais("Ecuador");

        Pasajero pasajero=new Pasajero();
        pasajero.setNombre("Ian Quinteros");
        pasajero.setCi("10235044");
        pasajero.setFechaNacimiento("6/12/2001");

        PasajeStandar pasajeStandar=new PasajeStandar();
        pasajeStandar.setNumeroVuelo("544b");
        pasajeStandar.setDestino(destino);
        pasajeStandar.setOrigen(origen);
        pasajeStandar.setAvion(avion);
        pasajeStandar.setPasajero(pasajero);
        pasajeStandar.setNumeroAsiento("14");
        pasajeStandar.setCostoPasaje("700 $us");

        return pasajeStandar;
    }
}
