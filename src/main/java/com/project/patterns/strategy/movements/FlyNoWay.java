package com.project.patterns.strategy.movements;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I can't fly");
        // implement logic
    }

}
