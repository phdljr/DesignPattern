package design_pattern.strategy;

import design_pattern.strategy.behavior.impl.FlyRocketPowered;
import design_pattern.strategy.duck.Duck;
import design_pattern.strategy.duck.MallardDuck;
import design_pattern.strategy.duck.ModelDuck;

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
