package com.project.patterns.factoryMethod.ex1.delivery;

import com.project.patterns.factoryMethod.ex1.factory.Logistic;
import com.project.patterns.factoryMethod.ex1.factory.Transport;

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
