package hf.dp.decorator.decorator;

import hf.dp.decorator.component.Beverage;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Soy";
    }

    public double cost(){
        return .11 + beverage.cost();
    }
}