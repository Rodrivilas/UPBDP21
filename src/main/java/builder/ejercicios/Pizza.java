package builder.ejercicios;

public class Pizza {

    private String tipoQueso;
    private String ingredientes;
    private String tipoMasa;

    public Pizza(){}

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public void showData() {
        System.out.println("Tipo De Queso : "+tipoQueso);
        System.out.println("Ingredientes : "+ingredientes);
        System.out.println("Tipo De Masa : "+tipoMasa);
    }
}
