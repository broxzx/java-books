package com.project.patterns.observer;

public class FirstConsumer implements UpdateBehaviour {

    @Override
    public void update() {
        System.out.println("Temp: " + Math.random() * 40);
        System.out.println("Humidity: " + Math.random() * 100);
        System.out.println("Pressure: " + ((int) (Math.random() * 2) == 1 ? "up" : "down"));
    }

}
