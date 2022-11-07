package hf.dp.factory.factorymethod.creator;

import hf.dp.factory.factorymethod.product.NYStyleCheesePizza;
import hf.dp.factory.factorymethod.product.NYStyleVeggiePizza;
import hf.dp.factory.factorymethod.product.Pizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if(type.equals("cheese"))
            pizza = new NYStyleCheesePizza();
        else if(type.equals("veggie"))
            pizza = new NYStyleVeggiePizza();
        else
            throw  new IllegalArgumentException("No Pizza");

        return pizza;
    }
}
