package com.project.patterns.duck;

import com.project.patterns.movements.FlyBehaviour;
import com.project.patterns.sounds.QuackBehaviour;
import lombok.Setter;

@Setter
public abstract class Duck {

    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

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
