package prototype.ejercicios.telefono;

public class Accesorios {
    private String audifono;
    private String cargador;
    private String estuche;

    public Accesorios(String audifono, String cargador, String estuche) {
        this.audifono = audifono;
        this.cargador = cargador;
        this.estuche = estuche;
    }

    public String getAudifono() {
        return audifono;
    }

    public void setAudifono(String audifono) {
        this.audifono = audifono;
    }

    public String getCargador() {
        return cargador;
    }

    public void setCargador(String cargador) {
        this.cargador = cargador;
    }

    public String getEstuche() {
        return estuche;
    }

    public void setEstuche(String estuche) {
        this.estuche = estuche;
    }
}
