package hf.dp.factory.abstractfactory.factory;

import hf.dp.factory.abstractfactory.product.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String item);
}
