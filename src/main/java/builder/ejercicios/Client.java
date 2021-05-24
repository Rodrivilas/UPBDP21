package builder.ejercicios;

public class Client {
    public static void main(String []args){
        Chef chef = new Chef();
        PizzaCarnivora pizzaCarnivora = new PizzaCarnivora();
        PizzaHawaiana pizzaHawaiana = new PizzaHawaiana();
        PizzaClasica pizzaClasica = new PizzaClasica();

        chef.setBuilderPizza(pizzaCarnivora);
        chef.hornearPizza();

        Pizza pCarnivora = chef.getPizza();
        System.out.println("Pizza carnivora **********");
        pCarnivora.showData();

        chef.setBuilderPizza(pizzaHawaiana);
        chef.hornearPizza();

        Pizza pHawaiana = chef.getPizza();
        System.out.println("Pizza Hawaiana **********");
        pHawaiana.showData();

        chef.setBuilderPizza(pizzaClasica);
        chef.hornearPizza();

        Pizza pClasica = chef.getPizza();
        System.out.println("Pizza Clásica **********");
        pClasica.showData();
    }
}
