package hf.dp.factory.factorymethod.product;

public class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Sauce and Cheese Pizza";
        dough = "Extra Thick crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices.");
    }
}
