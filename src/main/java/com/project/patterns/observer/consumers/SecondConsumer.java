package com.project.patterns.observer.consumers;

import com.project.patterns.observer.weather.UpdateBehaviour;

public class SecondConsumer implements UpdateBehaviour {

    @Override
    public void update() {
        System.out.println("Temp: " + Math.random() * 40);
        System.out.println("Humidity: " + Math.random() * 100);
    }

}
