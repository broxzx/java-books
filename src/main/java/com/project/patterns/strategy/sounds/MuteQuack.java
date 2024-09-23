package com.project.patterns.strategy.sounds;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("mute quack sound");
    }

}
