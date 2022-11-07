package hf.dp.decorator;

import hf.dp.decorator.component.Beverage;
import hf.dp.decorator.component.DarkRoast;
import hf.dp.decorator.component.Espresso;
import hf.dp.decorator.component.HouseBlend;
import hf.dp.decorator.decorator.Mocha;
import hf.dp.decorator.decorator.Soy;
import hf.dp.decorator.decorator.Whip;
import info.MyHWInfo;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        MyHWInfo.printInfo();

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}