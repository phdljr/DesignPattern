package hf.dp.adapter;

import hf.dp.adapter.adaptee.WildTurkey;
import hf.dp.adapter.adapter.TurkeyAdapter;
import info.MyHWInfo;

public class DuckTestDriver {

    public static void main(String[] args) {
        MyHWInfo.printInfo();

        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}