package design_pattern.strategy.behavior.impl;

import design_pattern.strategy.behavior.FlyBehavior;

public class FlyNoway implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
