package hf.dp.strategy.duck;

import hf.dp.strategy.behavior.impl.FlyNoway;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoway();
    }

    @Override
    public void display() {

    }
}
