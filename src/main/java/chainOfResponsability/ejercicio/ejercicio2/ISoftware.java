package chainOfResponsability.ejercicio.ejercicio2;


public interface ISoftware {
    void setNext(ISoftware responsable); //---> saber el siguiente responsable
    ISoftware next(); //--> ir al siguient responsable
    void criteriaHandler(Persona persona); // resolver el problema o moverse al siguinete responsable

}
