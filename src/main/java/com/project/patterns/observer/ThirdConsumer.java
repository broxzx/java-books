package com.project.patterns.observer;

public class ThirdConsumer implements UpdateBehaviour {

    @Override
    public void update() {
        System.out.println("Temp: " + Math.random() * 40);
    }

}
