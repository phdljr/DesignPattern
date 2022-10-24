package hf.dp.strategy;

import hf.dp.strategy.stragegy.fly.FlyRocketPowered;
import hf.dp.strategy.context.Duck;
import hf.dp.strategy.context.MallardDuck;
import hf.dp.strategy.context.ModelDuck;
import info.MyHWInfo;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MyHWInfo.printInfo();

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
