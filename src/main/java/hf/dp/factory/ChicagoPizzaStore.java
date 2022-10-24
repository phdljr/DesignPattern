package hf.dp.factory;

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
