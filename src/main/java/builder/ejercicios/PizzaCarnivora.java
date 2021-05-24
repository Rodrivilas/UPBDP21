package builder.ejercicios;

public class PizzaCarnivora extends BuilderPizza {

    @Override
    public void buildtipoQueso() {
        pizza.setTipoQueso("quezo mozarella");

    }
    @Override
    public void buildingredientes() {
        pizza.setIngredientes("carne, salsa tomate, otro");
    }

    @Override
    public void buildtipoMasa() {
        pizza.setTipoMasa("masa especial");
    }
}
