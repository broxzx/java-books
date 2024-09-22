package com.project.patterns;

import com.project.patterns.duck.RedheadDuck;
import com.project.patterns.duck.RubberDuck;
import com.project.patterns.movements.FlyNoWay;
import com.project.patterns.movements.FlyWithWings;
import com.project.patterns.sounds.Quack;
import com.project.patterns.sounds.Squeak;

public class Main {

    public static void main(String... args) {
        System.out.println("RedheadDuck: ");
        RedheadDuck redheadDuck = new RedheadDuck(new FlyWithWings(), new Quack());
        redheadDuck.fly();
        redheadDuck.makeSound();

        System.out.println("RubberDuck:");
        RubberDuck rubberDuck = new RubberDuck(new FlyNoWay(), new Squeak());
        rubberDuck.fly();
        rubberDuck.makeSound();
    }

}
