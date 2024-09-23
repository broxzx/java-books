package com.project.patterns.strategy.duck;

import com.project.patterns.strategy.movements.FlyBehaviour;
import com.project.patterns.strategy.sounds.QuackBehaviour;
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
