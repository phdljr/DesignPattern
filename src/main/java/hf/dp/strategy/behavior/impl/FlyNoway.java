package hf.dp.strategy.behavior.impl;

import hf.dp.strategy.behavior.FlyBehavior;

public class FlyNoway implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
