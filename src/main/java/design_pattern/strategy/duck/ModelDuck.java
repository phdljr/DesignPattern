package design_pattern.strategy.duck;

import design_pattern.strategy.behavior.impl.FlyNoway;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoway();
    }

    @Override
    public void display() {

    }
}
