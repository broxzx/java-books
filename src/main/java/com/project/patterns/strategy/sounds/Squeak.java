package com.project.patterns.strategy.sounds;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("squeak sound");
    }

}
