package hf.dp.strategy.context;

import hf.dp.strategy.stragegy.fly.FlyNoway;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoway();
    }

    @Override
    public void display() {

    }
}
