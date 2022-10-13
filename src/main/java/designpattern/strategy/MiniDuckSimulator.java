package designpattern.strategy;

import designpattern.strategy.behavior.impl.FlyRocketPowered;
import designpattern.strategy.duck.Duck;
import designpattern.strategy.duck.MallardDuck;
import designpattern.strategy.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
