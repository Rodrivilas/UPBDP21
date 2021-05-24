package builder.ejercicios;

public class PizzaHawaiana extends BuilderPizza {

    @Override
    public void buildtipoQueso() {
        pizza.setTipoQueso("quezo mozarella tipo2");
    }
    @Override
    public void buildingredientes() {
        pizza.setIngredientes("piña, salsa de tomate, otros");
    }
    @Override
    public void buildtipoMasa() {
        pizza.setTipoMasa("masa normal");
    }
}
