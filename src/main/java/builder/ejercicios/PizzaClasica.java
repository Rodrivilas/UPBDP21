package builder.ejercicios;

public class PizzaClasica extends BuilderPizza {


    @Override
    public void buildtipoMasa() {
        pizza.setTipoMasa("masa especial");
    }
    @Override
    public void buildtipoQueso() {
        pizza.setTipoQueso("doble quezo mozarella tipo2");
    }
    @Override
    public void buildingredientes() {
        pizza.setIngredientes("queso, jamón, salsa tomate, otro");
    }


}
