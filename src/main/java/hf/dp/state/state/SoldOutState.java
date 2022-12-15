package hf.dp.state.state;

import hf.dp.state.context.GumballMachine;

public class SoldOutState implements State {
    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Oops, out of gumballs!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Oops, out of gumballs!");
    }

    @Override
    public void turnCrank() {
        System.out.println("Oops, out of gumballs!");
    }

    @Override
    public void dispense() {
        System.out.println("Oops, out of gumballs!");
    }
}
