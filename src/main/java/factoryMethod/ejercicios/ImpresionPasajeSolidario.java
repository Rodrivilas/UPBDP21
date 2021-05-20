package factoryMethod.ejercicios;

public class ImpresionPasajeSolidario extends ImpresoraDeBoletos{
    @Override
    public IPasaje create() {
        Avion avion=new Avion();
        avion.setCapacidad("40 toneladas");
        avion.setMarca("CheinIdustries");
        avion.setModelo("T331L4PoN-DRe");
        avion.setNumerodeAsientos("20");

        Destino destino=new Destino();
        destino.setCiudad("Santiago");
        destino.setAeropuerto("Aeropuerto de Santiago du Chile");
        destino.setPais("Chile");

        Origen origen=new Origen();
        origen.setCiudad("Santa Cruz");
        origen.setAeropuerto("ViruViru");
        origen.setPais("Bolivia");

        Pasajero pasajero=new Pasajero();
        pasajero.setNombre("Luciano Risas Terceros");
        pasajero.setCi("12493788");
        pasajero.setFechaNacimiento("27/02/1992");

        PasajeSolidario pasajeSolidario=new PasajeSolidario();
        pasajeSolidario.setNumeroVuelo("333t");
        pasajeSolidario.setDestino(destino);
        pasajeSolidario.setOrigen(origen);
        pasajeSolidario.setAvion(avion);
        pasajeSolidario.setPasajero(pasajero);
        pasajeSolidario.setNumeroAsiento("20");
        pasajeSolidario.setCostoPasaje("150 $us");
        pasajeSolidario.setDescuento("40%");
        pasajeSolidario.setMotivoDescuento("Su cumpleañitos");

        return pasajeSolidario;
    }
}
