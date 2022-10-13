package designpattern.strategy.duck;

import designpattern.strategy.behavior.impl.FlyNoway;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoway();
    }

    @Override
    public void display() {

    }
}
