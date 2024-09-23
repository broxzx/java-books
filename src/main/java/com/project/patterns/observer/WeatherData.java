package com.project.patterns.observer;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class WeatherData {

    private final List<UpdateBehaviour> consumers = new ArrayList<>();

    public void addConsumer(UpdateBehaviour updateBehaviour) {
        consumers.add(updateBehaviour);
    }

    public void removeConsumer(UpdateBehaviour updateBehaviour) {
        consumers
                .stream()
                .filter(consumer -> consumer.equals(updateBehaviour))
                .findFirst()
                .ifPresent(consumers::remove);
    }

    public void notifyConsumers() {
        this.consumers
                .forEach(consumer -> {
                    consumer.update();
                    System.out.print("\n");
                });
    }

}
