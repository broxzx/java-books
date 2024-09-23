package com.project.patterns.strategy;

import com.project.patterns.strategy.duck.RedheadDuck;
import com.project.patterns.strategy.duck.RubberDuck;
import com.project.patterns.strategy.movements.FlyNoWay;
import com.project.patterns.strategy.sounds.Squeak;

public class Main {

    public static void main(String... args) {
        System.out.println("RedheadDuck: ");
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.fly();
        redheadDuck.makeSound();

        redheadDuck.setFlyBehaviour(new FlyNoWay());
        redheadDuck.setQuackBehaviour(new Squeak());
        redheadDuck.fly();
        redheadDuck.makeSound();

        System.out.println("RubberDuck:");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.makeSound();
    }

}
