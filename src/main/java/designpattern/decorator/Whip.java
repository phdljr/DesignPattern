package designpattern.decorator;

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