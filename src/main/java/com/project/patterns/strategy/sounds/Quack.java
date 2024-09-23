package com.project.patterns.strategy.sounds;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("quack sound");
    }

}
