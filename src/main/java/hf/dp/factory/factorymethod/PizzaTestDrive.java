package hf.dp.factory.factorymethod;

import hf.dp.factory.factorymethod.creator.ChicagoPizzaStore;
import hf.dp.factory.factorymethod.creator.NYPizzaStore;
import hf.dp.factory.factorymethod.creator.PizzaStore;
import hf.dp.factory.factorymethod.product.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
