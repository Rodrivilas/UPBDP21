package abstractFactory.ejercicios;

import abstractFactory.ejemplos.browser.Chrome;
import abstractFactory.ejemplos.browser.Edge;
import abstractFactory.ejemplos.browser.FireFox;
import abstractFactory.ejemplos.browser.Safari;

public class FactoryPasaje {
    enum Pasajes{
        PASAJESTANDAR,
        PASAJESOLIDARIO,
        PASAJEINFANTE;
    }

    public static IPasaje make(Pasajes type){
        IPasaje pasaje;
        switch (type){
            case PASAJESTANDAR:
                pasaje= new PasajeStandar();
                ((PasajeStandar)pasaje).setAvion(new Avion("32","32","23","23"));
                break;
            case PASAJESOLIDARIO:
                pasaje= new PasajeSolidario();
                break;
            case PASAJEINFANTE:
                pasaje= new PasajeInfantes();
                break;
            default:
                pasaje= new PasajeStandar();
                break;
        }
        return pasaje;
        }

}
