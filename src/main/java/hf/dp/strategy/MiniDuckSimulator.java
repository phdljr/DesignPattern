package hf.dp.strategy;

import hf.dp.strategy.behavior.impl.FlyRocketPowered;
import hf.dp.strategy.duck.Duck;
import hf.dp.strategy.duck.MallardDuck;
import hf.dp.strategy.duck.ModelDuck;

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
