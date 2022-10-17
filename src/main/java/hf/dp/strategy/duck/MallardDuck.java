package hf.dp.strategy.duck;


import hf.dp.strategy.behavior.impl.FlyWithWings;
import hf.dp.strategy.behavior.impl.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm mallard duck");
    }
}
