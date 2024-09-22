package com.project.patterns.duck;

import com.project.patterns.movements.FlyBehaviour;
import com.project.patterns.sounds.QuackBehaviour;

public abstract class Duck {

    private final FlyBehaviour flyBehaviour;
    private final QuackBehaviour quackBehaviour;

    public void makeSound() {
        quackBehaviour.quack();
    }

    public void fly() {
        flyBehaviour.fly();
    }


    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

}
