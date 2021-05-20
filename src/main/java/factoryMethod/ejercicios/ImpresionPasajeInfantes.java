package factoryMethod.ejercicios;

public class ImpresionPasajeInfantes extends ImpresoraDeBoletos{
    @Override
    public IPasaje create() {
        Avion avion=new Avion();
        avion.setCapacidad("1000");
        avion.setMarca("Boeing");
        avion.setModelo("Boeing 777");
        avion.setNumerodeAsientos("30");

        Destino destino=new Destino();
        destino.setCiudad("Moscú");
        destino.setAeropuerto("Aeropuerto Internacional de Moscú-Sheremétievo");
        destino.setPais("Rusia");

        Origen origen=new Origen();
        origen.setCiudad("Miami");
        origen.setAeropuerto("Miami International Airport");
        origen.setPais("Estados Uniros");

        Pasajero pasajero=new Pasajero();
        pasajero.setNombre("Santiago Patzi");
        pasajero.setCi("10564921");
        pasajero.setFechaNacimiento("14/04/2017");

        PasajeInfantes pasajeInfantes=new PasajeInfantes();
        pasajeInfantes.setNumeroVuelo("456h");
        pasajeInfantes.setDestino(destino);
        pasajeInfantes.setOrigen(origen);
        pasajeInfantes.setAvion(avion);
        pasajeInfantes.setPasajero(pasajero);
        pasajeInfantes.setNumeroAsiento("5");
        pasajeInfantes.setCostoEspecial("60 $us");

        return pasajeInfantes;
    }
}
