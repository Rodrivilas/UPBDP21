package abstractFactory.ejercicios;

public class PasajeStandar implements IPasaje{

    private String numeroVuelo;
    private Destino destino;
    private Origen origen;
    private Avion avion;
    private Pasajero pasajero;
    private String numeroAsiento;
    private String costoPasaje;

    public PasajeStandar(){

        
    }
    @Override
    public void create() {
        System.out.println("**************************");
        System.out.println("Numero De Vuelo: "+numeroVuelo);
        destino.showInfo();
        origen.showInfo();
        avion.showInfo();
        pasajero.showInfo();
        System.out.println("Numero De Asiento: "+numeroAsiento);
        System.out.println("Costo Del Pasaje: "+costoPasaje);
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getCostoPasaje() {
        return costoPasaje;
    }

    public void setCostoPasaje(String costoPasaje) {
        this.costoPasaje = costoPasaje;
    }
}
