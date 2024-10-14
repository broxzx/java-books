package com.project.patterns.factoryMethod.delivery;

import com.project.patterns.factoryMethod.factory.Logistic;
import com.project.patterns.factoryMethod.factory.Transport;

public class RoadLogistic implements Logistic {

    @Override
    public void planDelivery() {
        System.out.println("Road logistic is planning delivery");
    }

    @Override
    public Transport createTransport() {
        return new Truck();
    }

}
