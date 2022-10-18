package hf.dp.strategy.context;


import hf.dp.strategy.stragegy.fly.FlyWithWings;
import hf.dp.strategy.stragegy.quack.Quack;

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
