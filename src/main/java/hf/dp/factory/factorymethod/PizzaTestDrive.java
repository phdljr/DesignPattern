package hf.dp.factory.factorymethod;

import hf.dp.factory.factorymethod.creator.ChicagoPizzaStore;
import hf.dp.factory.factorymethod.creator.NYPizzaStore;
import hf.dp.factory.factorymethod.creator.PizzaStore;
import hf.dp.factory.factorymethod.product.Pizza;
import info.MyHWInfo;

public class PizzaTestDrive {
    public static void main(String[] args) {
        MyHWInfo.printInfo();

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
