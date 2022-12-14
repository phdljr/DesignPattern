package hf.dp.factory.abstractfactory.product;

import hf.dp.factory.abstractfactory.product.ingredient.*;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Clams clams;
    Pepperoni pepperoni;

    abstract public void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350.");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
