package com.project.patterns.observer.consumers;

import com.project.patterns.observer.weather.UpdateBehaviour;

public class ThirdConsumer implements UpdateBehaviour {

    @Override
    public void update() {
        System.out.println("Temp: " + Math.random() * 40);
    }

}
