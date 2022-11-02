package hf.dp.factory.factorymethod.creator;

import hf.dp.factory.factorymethod.product.ChicagoStyleCheesePizza;
import hf.dp.factory.factorymethod.product.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if(type.equals("cheese"))
            pizza = new ChicagoStyleCheesePizza();
        else if(type.equals("veggie"))
            pizza = new ChicagoStyleCheesePizza();
        else
            throw  new IllegalArgumentException("No Pizza");

        return pizza;
    }
}
