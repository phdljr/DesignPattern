package designpattern.strategy.behavior.impl;

import designpattern.strategy.behavior.FlyBehavior;

public class FlyNoway implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
