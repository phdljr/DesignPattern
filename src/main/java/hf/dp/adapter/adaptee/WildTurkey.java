package hf.dp.adapter.adaptee;

import hf.dp.adapter.adaptee.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance.");
    }
}
