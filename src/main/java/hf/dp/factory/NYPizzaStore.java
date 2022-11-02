package hf.dp.factory;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if(type.equals("cheese"))
            pizza = new NYStyleCheesePizza();
        else if(type.equals("veggie"))
            pizza = new NyStyleVeggiePizza();
        else
            throw  new IllegalArgumentException("No Pizza");

        return pizza;
    }
}
