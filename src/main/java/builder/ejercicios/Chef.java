package builder.ejercicios;

public class Chef {
    private BuilderPizza builderPizza;
    public void setBuilderPizza(BuilderPizza builderPizza){
        this.builderPizza=builderPizza;
    }
    public Pizza getPizza(){
        return builderPizza.getPizza();
    }

    public void hornearPizza(){
        this.builderPizza.createPizza();
        this.builderPizza.buildingredientes();
        this.builderPizza.buildtipoQueso();
        this.builderPizza.buildtipoMasa();
    }

}
