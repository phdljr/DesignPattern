package hf.dp.decorator.decorator;

import hf.dp.decorator.component.Beverage;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }

    public double cost(){
        return .33 + beverage.cost();
    }
}