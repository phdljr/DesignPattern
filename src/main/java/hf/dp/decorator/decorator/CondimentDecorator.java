package hf.dp.decorator.decorator;

import hf.dp.decorator.component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}