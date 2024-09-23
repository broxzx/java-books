package com.project.patterns;

import com.project.patterns.duck.RedheadDuck;
import com.project.patterns.duck.RubberDuck;

public class Main {

    public static void main(String... args) {
        System.out.println("RedheadDuck: ");
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.fly();
        redheadDuck.makeSound();

        System.out.println("RubberDuck:");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.makeSound();
    }

}
